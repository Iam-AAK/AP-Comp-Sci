/**
 *Arya Kulkarni
 *Maximum Divisors
 *September 11, 2016
 */
 
import java.util.Scanner;
class DivisorTester
{
   public static void main (String [] args){
		System.out.println("Please enter number");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();	// this is ending number
		int j;	// this is the backward counter starting from n until 1
		int k;	// this is also backward counter starting from a "j" until 1 to calucalate how many divisors are there for the "j"
		int divisor; // number of divisors for a "j"
		int num_divisor, num; // num_divisor is max no. of divisors and the num is the corresponding "j"
		num_divisor=0;
		num=0;
		for(j=n; j>0; j--){
			divisor = 0;
			
			for(k=j;k>0;k--){
				if((j%k) == 0){
					divisor +=1;
				}
			}
			
			if (divisor > num_divisor){
				
				num_divisor = divisor;
				num = j;
				
			}
			
		}
		
		System.out.println("Number: " + num + " " +  "number of divisors: " + num_divisor);
		
	}
}