/**
 *Arya Kulkarni
 *Sieve Lab
 *Octber 25, 2016
 */
 
import java.util.Scanner;
class PrimeSieve{
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Maximum Number? ");
        int n = sc.nextInt();
	
        // initially assume all integers are prime
        boolean[] isPrime = new boolean[n+1];
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        // mark non-primes <= n using Sieve of Eratosthenes
        for (int factor = 2; factor*factor <= n; factor++) {

            // if factor is prime, then mark multiples of factor as nonprime
            // suffices to consider mutiples factor, factor+1, ...,  n/factor
            if (isPrime[factor]) {
                for (int j = factor; factor*j <= n; j++) {
                    isPrime[factor*j] = false;
                }
            }
        }

        // count primes
        int primes = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) primes++;
        }
        for(int i = 0; i < isPrime.length; i++){
        	if(isPrime[i]){
        		System.out.print(i + ", ");
        	}
        }
        System.out.println("\nThe number of primes <= " + n + " is " + primes);
    }
}

