/**
 *Arya Kulkarni
 *Charity
 */
 
 class Charity{
 	
 	private int donated;
 	private String date; // MM/DD/YYYY
 	private String name;
 	
 	// constructor
 	public void Charity(int donated, String date, String name){
 		this.donated = donated;
 		this.date = date;
 		this.name = name;
 	}
 	
 	public int getDonates(){
 		return donated;
 	}
 	
 	public String getDate(){
 		return date;
 	}
 	
 	public String getName(){
 		return name;
 	}
 	
 }
 
 class Log{
	  public static void selectionSort(String[] arr){
	  	for (int i = 0; i < arr.length - 1; ++i){
     		int minIndex = i;
      		for (int j = i + 1; j < arr.length; ++j){
        		if (arr[j].compareTo(arr[minIndex]) < 0){
          			minIndex = j;
        	}
      	}
      	String temp = arr[i];
      	arr[i] = arr[minIndex];
    	arr[minIndex] = temp;
    	System.out.print(arr[i] + ", ");
    	}
  	} 
  	
  	public boolean check(String [] b){
  		for(int i = 0; i < b.length; i++){
  			if(b[i].equals("07")){
  				System.out.println("\nHave donated during this month " + b[i]);
  				return true;
  			} else if(b[i].equals("02")){
  				System.out.println("\nHave donated during this month " + b[i]);
  				return true;
  			} else if(b[i].equals("11")){
  				System.out.println("\nHave donated during this month " + b[i]);
  			}else{
  				System.out.println("No donations during this month");
  				return false;
  			}
  		}
  		
  		return true;
  	}	
  		
 		
 }
 
 class Tester{
 	public static void main(String[] args){
 		// print charities
 		String[] a = new String[]{"Salvation Army", "Unicef", "United Way"};
 		String[] b = {"07", "02", "11", "12", "03"};
 		
 		Log n = new Log();
 		n.selectionSort(a);
 		System.out.println("United Way");
 		n.check(b);
 	}
 }