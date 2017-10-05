/**
 *Arya Kulkarni
 *Fibonacci Numbers
 */
 
 class Fibonacci{
 
 	public static int count = 0;
 	public int fib(int n){
 		count++;
 		System.out.println("Count: " + (count - 1));
 		// method for fib
 		if(n == 0)
 			return 0;
 		if(n == 1)
 			return 1;
 		else
 			return (fib(n-1) + fib(n-2));
 	}
 	
 }
 
 class Tester{
 	public static void main(String[] args){
 		Fibonacci n = new Fibonacci();
 		System.out.println("Fibonacci number: " + n.fib(3));
 	//	System.out.println("Number of times fib is called " + count);
 	}
 }