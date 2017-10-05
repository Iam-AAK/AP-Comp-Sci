/**
 *Arya Kulkarni
 *September 27, 2016
 *Natural Number
 */
 
 import java.util.Scanner; 
 	
 	class NaturalNumber{
 		
 		private int num;
 		private int math;
 		private int math1;
 		
 		// Default Constructor
 		public NaturalNumber(){
 			this.num = 0;
 		}
 		
 		// One argument constructor...checks if the number (num) is an intger
 		public int Valid( int num ){
 			if (num < 0){
 				return 0;
 			}else {
 			//	this.num = num;
 				return num;
 			}
 		}
 		
 		// one String argument constuctor
 		public String Num(int num){
 			String Num = String.valueOf(num);
 			return Num;
 		}
 		
 		// increment 
 		public int math(int num){
 			num++;
 			System.out.println(num);
 			return num;
 		}
 			
 		// decrement
 		public int math1(int num){
 			num--;
 			System.out.println(num);
 			return num;
 		}
 		
 		// toString
 		public String num1(int num){
 			String num1 = Integer.toString(num);
 			return num1;
 		}
 		
 	}
 	
 	class Tester{
 		
 		public static void main(String [] args){
 			
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter a number: ");
			int num = scanner.nextInt();
			
			// check if it is an Integer
			 NaturalNumber Tester = new NaturalNumber();
			 // NaturalNumber.Valid();
			 if (num < 0){
 				System.out.println("Not an Integer.");
 			}else {
 			//	this.num = num;
 				System.out.println("Integer: " + num);
 			}
			

 			
 		}
 	}