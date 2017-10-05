/**
 *Arya Kulkarni
 *Square Roots
 */
 
 class SquareRoots{
 	// recursive method double calculate(double guess)
 	// provide an answer that is within .00001 of the answer
 	
 	// base case
 	public double basecase(double i){
 		double e = (Math.pow(i, 0.5));
 		return e;
 	}
 	
 	// recursive method
 	double test(double x, double g) {
   		if (closeEnough(x/g, g))
   		 return g;
		else
		 return test(x, betterGuess(x, g));
	}
 	
 	double sqrt(double x) {
   		return test(x, 1);
	}	
	
	
	boolean closeEnough(double a, double b) {
   		return (Math.abs(a - b) < .0001);
	}
	
	double betterGuess(double x, double g) {
  		return ((g + x/g) / 2);
	}
	
 }
 
 class Tester{
 	public static void main(String[] args){
 		SquareRoots n = new SquareRoots();
 		System.out.println("Guessed answer is " + n.basecase(4));
 	//	System.out.println(n.test(2.0, 1.0));
 	//	System.out.println(n.sqrt(1.0));
 	//	System.out.println(n.closeEnough(3.0, 1.0));
 		System.out.println("Answer from the recursive method is " + n.test(4.0, 2.0));
 		
 	}
 }