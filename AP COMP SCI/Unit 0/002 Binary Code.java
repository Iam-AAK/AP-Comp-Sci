/**
 * Created by Dave on 8/28/16.
 */
import java.util.Scanner;
 
class Binary
{
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
     
        System.out.println("Please enter integer");
        String str = scanner.nextLine();
           
     	System.out.println("Please enter Binary number");
     	String s = scanner.nextLine();
  	
  		int i = Integer.valueOf(str);
 		
       
       	System.out.println(i +" as a binary is "+toBin(i));  
        System.out.println(s +" as a decimal is "+toDec(s));
   
    }
 
    public static String toBin(int dec)
    {
       String binaryNum="";
       while (dec > 0){
        	int mod = dec%2;
        	binaryNum += mod;
        	
        	dec /= 2;
        }
        String reverse = new StringBuffer(binaryNum).reverse().toString();
        return reverse;
    }
 
    public static int toDec(String bin)
    {
        //provide code here to convert bin into an int and return it!
        //toDec("110") should return 6
       
        int dec_num=0;
        int j=bin.length()-1;
        int k=0; // Power
     	while (j>=0){
     		dec_num += Character.getNumericValue(bin.charAt(j)) * Math.pow(2,k);
     		j--;
     		k++;
     		
     	}
     	
        return dec_num;
    }
}