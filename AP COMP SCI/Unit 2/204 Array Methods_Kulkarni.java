/**
 *Arya Kulkarni
 *Halloween!!!
 *Array Methods
 */
 
 class ArrayMethods{
 	static void vowelCount(String str){
 		// a[0] = A's
 		// a[1] = E's
 		// a[2] = I's
		// a[3] = O's
 		// a[4] = U's
 		int count=0;
 		int[] countArray = new int[] {0,0,0,0,0};
 		char[] vowels = new char[] {'a','e','i','o','u'};
 		for(int i = 0; i < str.length(); i++){
 			// count number of vowels (count++)
 		/*	if(str.indexOf('a')){
 				input[i+1] = i; 
 			}*/
 			
 			char letter=str.charAt(i);
 			switch (letter) {
		         case 'a':
		             countArray[0]++;
		             break;
		         case 'e':
		             countArray[1]++;
		             break;
		         case 'i':
		             countArray[2]++;
		             break;
		         case 'o':
		             countArray[3]++;
		             break;
		         case 'u':
		             countArray[4]++;
		             break;
     	}
 			
 		}
 		System.out.print("Number of vowels are: {");
 		for (int j=0;j<countArray.length;j++) {
 			System.out.print(countArray[j] + ", ");
 		}
 		System.out.print("}");
 		
 		
 	}
 
 }	
 
 class Tester{
 	public static void main(String [] args){
 		
 		ArrayMethods str = new ArrayMethods();
 		str.vowelCount("arya is better than alex!!!");
 		
 	}
 }