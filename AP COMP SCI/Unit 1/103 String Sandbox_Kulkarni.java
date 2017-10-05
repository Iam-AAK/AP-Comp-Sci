/**
 *Arya Kulkarni
 *String Sandbox
 *October 4, 2016
 */

import java.lang.*;
class StringSandbox{
    //counts the number of times ‘a’ or ‘A’ appears in input o public int countA(String input)
     int countA(String word){
        // String a = "Arya";
        int count = 0;
        for(int i = 0; i < word.length(); i++){
        	// System.out.println("i = " + i + "char = " + word.charAt(i));
            if(word.charAt(i) == 'a' || word.charAt(i) == 'A'){ // String is an array
             count++;
             }
        }
       
         System.out.println(count);
         return count;
    }

//counts the number of times ‘a’ or ‘A’ appears in input ?after ?begin o public int countA(String input, int begin)
	int countB(String word, int begin){
		int count = 0;
        for(int i = begin; i < word.length(); i++){
        	// System.out.println("i = " + i + "char = " + word.charAt(i));
            if(word.charAt(i) == 'a' || word.charAt(i) == 'A'){ // String is an array
             count++;
             }
        }
       
         System.out.println(count);
         return count;
	}

//returns the input with the word “matey” added at the end o public String matey(String input)
	 String matey(String input){
		System.out.println(input + " " + "matey");
		return null;
	}

//returns the last alphabetical letter in the input
// example    ?“rootbeer”  -> ‘t’
// example    ?“Adam”      -> ‘mmmmmmm’ o public char lastLetter(String input)
	void last_Letter(String lastLetter1){
		
		char last_letter = lastLetter1.charAt(0);
		
		String allAlphabets = "abcdefghijklmnopqrstuvwxyz";
		
		for(int i = 1; i < lastLetter1.length(); i++)
			{
			int j = allAlphabets.indexOf(last_letter);
			int k = allAlphabets.indexOf(lastLetter1.charAt(i));
			
			if(k > j){
				last_letter = lastLetter1.charAt(i);
			}
			
			// System.out.println(j + " "+k);
		}
		
		System.out.println(last_letter);
	}

//like prior, but allows capitals to be ignored
// example    ?“Trig”,true  -> ‘r’
// example    ?“Trig”,false -> ‘T’ o public char lastLetter(String input, boolean skipCaps)
	void last_Letter2(String lastLetter1){
		lastLetter1 = lastLetter1.toLowerCase();
		
		char last_letter = lastLetter1.charAt(0);
		
		String allAlphabets = "abcdefghijklmnopqrstuvwxyz";
		
		for(int i = 1; i < lastLetter1.length(); i++)
			{
			int j = allAlphabets.indexOf(last_letter);
			int k = allAlphabets.indexOf(lastLetter1.charAt(i));
			
			if(k > j){
				last_letter = lastLetter1.charAt(i);
			}
			
			// System.out.println(j + " "+k);
		}
		
		System.out.println(last_letter);
	}


}

class Tester{

    public static void main(String [] args){
        // call methods and declare any relevant variables
        StringSandbox word = new StringSandbox();
        word.countA("ArmadiAAaallo");
        
        StringSandbox begin = new StringSandbox();
        begin.countB("ArmadiAAaallo", 10);
        
        StringSandbox input = new StringSandbox();
        input.matey("ArmadiAAaallo");
        
        StringSandbox lastLetter1 = new StringSandbox();
        lastLetter1.last_Letter("ArmadiAAaallo");
        
        // StringSandbox lastLetter1 = new StringSandbox();
        lastLetter1.last_Letter2("ArmadiAAaallo");
    }

}