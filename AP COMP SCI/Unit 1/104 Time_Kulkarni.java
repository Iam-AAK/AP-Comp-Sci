/**
 *Arya Kulkarni
 *Time
 */
 
 class myClock{
 	private int min;
 	private int hour;
 	
 	public myClock(){
 		this.min = 0;
 		this.hour = 0;
 	}
 	
 	// get time (get hour and get min)
 	public int getMin(){
 		return min;
 	}
 	public int getHour(){
 		return hour;
 	}
 	
 	// set time (set hour and set min) ---- Validation
 	public void setMin(int min){
 		if(min >= 0 && min <= 59){
 			this.min = min;
 		}
 	}
 	public void setHour(int hour){
 		if(hour >= 0 && hour <= 24){
 			this.hour = hour;
 		}	
 	}
 	
 	// toString - time format
 	String printTime(){
 		if(this.min < 9){
 			System.out.println("Time is " + this.hour + ":0" + this.min);
 		}else {
 			System.out.println("Time is " + this.hour + ":" + this.min);
 		}
 		return null;
 	}
 	
 	
 }
 
 class Tester{
 	
 	public static void main(String [] args){
 
 	
 	myClock clock1 = new myClock();
 	clock1.setHour(2);
 	clock1.setMin(3); 
 	clock1.printTime();	
 	

 	
 	System.out.println("\nSpring forward: ");
	clock1.setHour(clock1.getHour() + 1);
	clock1.printTime();
 	
	System.out.println("Reset Clock: ");
 	clock1.setHour(clock1.getHour() - 1);
    clock1.printTime();
 	
 	System.out.println("Clone Clock: ");
 	myClock clock2 = new myClock();
	clock2.setHour(2);
 	clock2.setMin(3); 
 	clock2.printTime();	
 	}
 	
 }