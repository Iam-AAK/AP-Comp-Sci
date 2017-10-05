/**
 *Arya Kulkarni
 *Euler
 *September 11, 2016
 */
 
  import java.util.Scanner;
 
 // Euler class with properties and methods
 
 
 class TesterEuler{
 	public static void main (String [] args){
 		Scanner sc = new Scanner(System.in);
 		
 		double sum = 0;
 		double j = 0;
 		//double randNum;		
 		//System.out.println(randNum);
 		
 		//double randNum_b = Math.random();
 		//System.out.println(randNum_b);
 		
 		//sum = randNum + randNum_b;
 		double counter=0;
 		double random_num=0;
		for (int k=0; k<10;k++){
			System.out.println("k is: " + k); 	
			while(sum < 1) {
				random_num = Math.random();
				//System.out.println("Random: " + random_num);
 				sum += random_num;
 				random_num=0;
 				j++; 			
 			}	
 		//	System.out.println("Sum is: " + sum); 	
 			counter += j;
 			
 		//	System.out.println("j is: " + j); 	
 			j=0;
 			sum=0;
		} 	
 			
 		System.out.println("Counter is: " + counter); 	
 		//System.out.println("e is: " + counter/10); 	
		System.out.println("e is: " + counter/10); 	
 		//System.out.println("Count is: " + j + " Sum is: " + sum);
 	}
 	
 }
 