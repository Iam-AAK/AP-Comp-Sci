/**
 *Arya Kulkarni
 *Pantry
 */
 
 import java.util.Scanner;
 class Jam{
 	
 	int oz;
 	
 	// type of jam
 	String type;
 	
 	// date it was canned
 	String date;
 	
	// constructor 
 	public Jam(String type, String date, int oz){
 		this.type = type;
 		this.date = date;
 		this.oz = oz;
 	}
 	
 
 	// boolean Empty() retuns if jar is empty
 	Boolean empty(){
 		if(this.oz == 0){
 			return true;
 		}else {
 			return false;
 		}
 	}
 	
 	// Spread(int ounces of spread) ... shows if jar is empty
 	void spread(int oz){
 		if(this.oz > oz){
 			System.out.println("Spreading " + oz + " oz");
 			this.oz = this.oz - oz;
 		}else {
 			System.out.println("Not enough Jam!");
 		}
 	}
 	
 }
 
 class Pantry{
 	
 	// 3 Jam Objects (jar1, jar2, jar3)

 	
 	Jam jar1;
 	Jam jar2;
 	Jam jar3;
 	
 	// 4th var will store the selected jam
 	private int selected;
 	
 	Pantry(Jam jar1, Jam jar2, Jam jar3){
 		this.jar1 = jar1;
 		this.jar2 = jar2;
 		this.jar3 = jar3;
 	}
 	
 	// setSelected(int jar#)
	Boolean setSelected(int selected){
		if(selected > 0 && selected < 4){
			this.selected = selected;
			System.out.println("Jar # " + selected + " selected");
			return true;
		}else {
			System.out.println("Invalid Jar #!");
			return false;
		}
	} 
 
 
 	// spreadJam(int # of ounces)
 	void spread(int selected, int oz){
 		if(setSelected(selected)){
			
			switch (selected) {
           	 case 1:  jar1.spread(oz);
                      break;
          	 case 2:  jar2.spread(oz);
                      break;
           	 case 3:  jar3.spread(oz);
                      break;
        }		
 	}
 	}
 	
 	
 	// replace(int jar#)
 	void replace(int selected, String date, int oz){
 			if(setSelected(selected)){
			
			switch (selected) {
           	 case 1:  jar1.date = date;
           			  jar1.oz = oz;
                      break;
          	 case 2:  jar2.date = date;
           			  jar2.oz = oz;
                      break;
           	 case 3:  jar3.date = date;
           			  jar3.oz = oz;
                      break;
        }	
		}	
 	}
 
 	void DisplayPantry(){
 		
 		System.out.println("Jar 1 = " + jar1.type + " canned date = " + jar1.date + " Oz = " + jar1.oz );
 		System.out.println("Jar 2 = " + jar2.type + " canned date = " + jar2.date + " Oz = " + jar2.oz );
 		System.out.println("Jar 3 = " + jar3.type + " canned date = " + jar3.date + " Oz = " + jar3.oz );
 		
 	}
	
 }  
 
 class Tester{
 	public static void main(String [] args){
 	Jam jar1 = new Jam("Gooseberry" , "7/4/86" , 12);
 	Jam jar2 = new Jam("Crab Apple" , "9/30/99" , 8);
 	Jam jar3 = new Jam("Rhurbarb" , "10/31/99" , 3);
 	
 	Pantry pantry = new Pantry(jar1, jar2, jar3);
 

 	// Display Pantry
 	pantry.DisplayPantry();
 	
 	// ask user for jar number to spread
	System.out.println("Please enter jar number (1, 2, 3) : ");
	
	Scanner scanner = new Scanner(System.in);
	int n = scanner.nextInt();	
 	
 	pantry.setSelected(n);
 	
 	// ask user for amount to spread
 	// select the correct Jam and call spread
 	System.out.println("Please enter the amount of spread: ");	
 	int s = scanner.nextInt();
 	
 	pantry.spread(n, s);
 	
 	pantry.DisplayPantry();
 	
 	pantry.replace(n, "10/16/16" , s);
 	
 	pantry.DisplayPantry();
 	}
 }