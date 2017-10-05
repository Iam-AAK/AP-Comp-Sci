
/**
 *Arya
 */
 
 class Factorial{
 	private int value;
 	
 	// base case is with 1
 	public int factorial(int value){
 		if(value == 1)
 			return 1;
 		else
 			return (value * factorial(value-1));
 	}
 	
 	// GCD (a > b)
 	public int GCD(int a, int b){
 		// GCD(a,b) = GCD(b, (a % b));
 		 if(b == 0){
         	return a;
        }
     	return GCD(b, a%b);         
   	}
 	
 	
 	//main method
 	public static void main(String[] args){
 		int y = 5;
 		Factorial ba = new Factorial();
 		System.out.println("Factorial of " + y + " is " + ba.factorial(y));
 		
 		
 		int a = 4;
 		int b = 24;
 		Factorial eh = new Factorial();
 		System.out.println("GCD of " + a + " & " + b + " is " + eh.GCD(a,b));
 	}
 	
 }