/**
 *Arya Kulkarni
 *NATIONAL COTTON CANDY DAY
 *Police
 */
 
 import java.text.*;
 
 // abstract class Policeman *****
 
abstract class Policeman
{
	// declare fields
	String firstName;
	String lastName;
	int yearsOfService;
	
	DecimalFormat dos = new DecimalFormat("#.00");
	
	// constrctor
	public Policeman(String first, String last, int y)
	{
		firstName = first;
		lastName = last;
		yearsOfService = y;
	}
	
	// getter methods (just in case)
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public int getYearsOfService()
	{
		return yearsOfService;
	}
	
	public String toString()
	{
		return firstName +" " + lastName + "\n" +"years of service = " +yearsOfService;
	}
	
	// abstract methods
	
	abstract double earnings();
	
	abstract int benefitLevel();
	
}	// end class Policeman

// super class Patrolman *****
class Patrolman extends Policeman{
	protected static double basePatrolPay = 3600;
	int benefitLvl;
	
	// constructor
	public Patrolman(String first, String last, int y){
		super(first, last, y);
	}

	// benefit level
	int benefitLevel(){
		benefitLvl = 1;
		return benefitLvl;
	}
	
	// public double getBasePatrolPay();

	// earnings
	double earnings(){
		double earnings = (.85)*(basePatrolPay) + (.06)*(Math.pow(basePatrolPay, .5))*(yearsOfService);
		return earnings;
	}
	
	// method to print data
	public void printData() {
		String className = this.getClass().getSimpleName(); 
		System.out.println(className + ": " + firstName + " " + lastName);					// print name
		System.out.println("Years of service = " + yearsOfService);							// print years of service
		System.out.println("Earnings = $" + dos.format(earnings()));						// print earnings
		System.out.println("Benefits level = " + Integer.toString(benefitLevel()) + "\n");	// print bene level
	}
	
}


// sub class Sergant *****
class Sergeant extends Patrolman{
	protected static double baseSgtPay = 4700;
	
	// constructor
	public Sergeant(String first, String last, int y){
		super(first, last, y);
	}
	
	// benefit level
	int benefitLevel(){
		super.benefitLevel();
		benefitLvl = 3;
		return benefitLvl;
	}
	
	// earnings
	double earnings(){
		double earnings = (.82)*(baseSgtPay) + (1.2)*(Math.pow(baseSgtPay, .5))*(yearsOfService);
		return earnings;
	}
	
}

// sub class Lieutenant *****
class Lieutenant extends Sergeant{
	protected static double baseLieutenantPay = 5900;
	
	// constructor
	public Lieutenant(String first, String last, int y){
		super(first, last, y);
	}
	
	// benefit level
	int benefitLevel(){
		super.benefitLevel();
		benefitLvl = 6;
		return benefitLvl;
	}
	
	// earnings
	double earnings(){
		double earnings = (.8)*(baseLieutenantPay) + (1.3)*(Math.pow(baseLieutenantPay, .5))*(yearsOfService);
		return earnings;
	}
}

class Tester{
	public static void main (String [] args){
		
		// Patrolman
		Patrolman ptr = new Patrolman("Road", "Runner", 5);
		ptr.printData();
		
		// Sergeant
		Sergeant sergeant = new Sergeant("Elmer", "Fudd", 12);
		sergeant.printData();
		
		
		// Lieutenant
		Lieutenant lieutenant = new Lieutenant("Daffy", "Duck", 14);
		lieutenant.printData();
		
		
	}
}