/**
 *Arya Kulkarni
 *Stretch
 *October 27, 2016
 */
 
 class Stretch{
 	public static void main (String [] args){
 		int [] input = {18, 7, 4, 24, 11};
 		// create an output array
 		int [] output = new int[10];
 	
 	// divide the number by 2, print that number and add it to the array
 	// if its odd then add/minus the 1 (using mod) to the half number
 	for(int i = 0; i < input.length; i++){
 			output[2*i]=input[i]%2+input[i]/2;  // 2*i = the value at position i * 2
			output[2*i+1]=input[i]/2;  // 2*i+1 = the value at position i*2 add 1 to the lower number of the pair
 		}
 
	for (int i = 0;i<output.length;i++) { 
			System.out.print(output[i] + ". "); 
	} 
		
 }
}
