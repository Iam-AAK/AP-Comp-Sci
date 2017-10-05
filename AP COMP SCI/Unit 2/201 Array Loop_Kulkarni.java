/**
 *Arya Kulkarni
 *October 21, 2016
 *Array Loop
 */
 
 class ArrayLoop{

 	public static void main(String [] args){
 		
 		// max and min value 
 		// (Number range between 1 - 10 ----> math.random()*max_number+min_number)
 		int max = 5;
 		int min = 1;
 		
 		int[] array = new int[11]; 
 		// How to add values in the array -----> a[0] = 2;
   		 for(int i=0; i < array.length; i++)
    		{
       		 array[i] = (int) (Math.random()* max + min);
       		 System.out.print(array[i] + " ");
   		 }
 		
 		// sum of all numbers
 		double total = 0;
 		for(int i = 0; i < array.length ; i++){
 			total += array[i];
 		}
 		System.out.println("\nTotal is " + total);
 		
 		// Average of all the values
 		double avg = (total/(array.length));
 		System.out.println("\nAverage is " + avg);
 		
 		// The count of the number times 2 appears
 		int counter = 0;
 		for(int i = 0; i < array.length; i++){
 			if( array[i] == 2 ){
 				counter++;
 			}	
 		}
 		System.out.println("\n2 appears " + counter + " time(s).");
 	}
 	
 }