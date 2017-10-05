/**
 *Arya Kulkarni
 *September 14, 2016
 *File Data
 */

 import java.io.File; 
 import java.util.Scanner;
 class FileDate{
 	public static void main(String [] args){
 		
		  try {
            
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the file name with extention : ");
            File NumbersOne = new File(input.nextLine());

            input = new Scanner(NumbersOne);
            
			double sum=0;	// this will store sum of all #s in the file
			int lineCounter=0;	// this store count of numbers in the file
			double avg=0;			// this is the mean of all #s in the file
			int numbers=0;
			
			String fileLine="";
            
            //calculate average
            
            while (input.hasNextLine()) {
             	fileLine= input.next();
              //  System.out.println("file line is: " + fileLine);
                numbers = Integer.parseInt(fileLine);
                sum += numbers;
                lineCounter++;
 			//	System.out.println("numbers: " + numbers); 		
 			}
            
            input.close();
            
            avg = sum / lineCounter;
         //   System.out.println("Line count is: " + lineCounter);
         //   System.out.println("Sum is: " + sum);
         //   System.out.println("Average is: " + avg);
            
            
            // run another loop to find variance
            sum=0;
            numbers=0;
             input = new Scanner(NumbersOne);
            while (input.hasNextLine()) {
             	fileLine= input.next();
                //System.out.println("file line is: " + fileLine);
                numbers = Integer.parseInt(fileLine);
                sum = sum + Math.pow((numbers-avg),2);
 				//System.out.println("numbers: " + numbers); 		
 			}
            
            input.close();
            avg = sum / lineCounter;
         //   System.out.println("Line count is: " + lineCounter);
         //   System.out.println("Sum is: " + sum);
         //   System.out.println("Variance is: " + avg);
            System.out.println("Std. deviation is: " + Math.pow(avg, 0.5));
            
			//System.out.println("file line is: " + fileLine);
		  }
         catch (Exception ex) {  // catch gives the user a second chance - usually solves the problem
            ex.printStackTrace();
            System.out.println("Error: File Not Found");
        }
 	
 	
 	
 	
 	
 	}
 	
 }