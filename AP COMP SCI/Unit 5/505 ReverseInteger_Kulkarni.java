/**
 *Arya Kulkarni
 *Reverse Int
 */
 
 class ReverseInteger{
 	public String reverseString(String s){
   		if (s.length() == 0) 
   	      return s;
   	    return reverseString(s.substring(1)) + s.charAt(0);
	}
	
	public static void reverseint(int number) {
    	
    	//number = 12345;
    	
    	if (number < 10) {
        	System.out.println(number);
        	return;
    	}
    	else {
        	System.out.println(number % 10);
        	reverseint(number/10);
    	}
	}	
 }
 
 class Tester{
 	public static void main(String [] args){
 		
 		ReverseInteger c = new ReverseInteger();
 		
 		System.out.println(c.reverseString("arya"));
 		c.reverseint(123);
 		
 	}
 }