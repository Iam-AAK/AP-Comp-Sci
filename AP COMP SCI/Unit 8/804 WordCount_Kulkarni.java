/**
 *Arya Kulkarni
 *Word Count
 */
import java.util.*;

class Counter{
	//constructor
    public Counter(){}
    
    //methods
    public void count(String s){
         
        String[] strings = s.split(" ");
        TreeMap<String, Integer> words = new TreeMap<String, Integer>();
         
        for(int i = 0; i < strings.length; i++){
            if(!words.containsKey(strings[i])){
                words.put(strings[i], 1);
            }
            else{
                int j = words.get(strings[i]);
                words.remove(strings[i]);
                words.put(strings[i], j+1);
            }
        }
         
        String result = "";
        Set<String> wordKeys = words.keySet();
        for(String word : wordKeys){
            result += new String(word + ": " + words.get(word) + "\n");
        }
        System.out.print(result);
    }
    
    public static void main(String[] args) {
		 Counter c = new Counter();
	        Scanner input = new Scanner(System.in);
	        System.out.println("Input a String: ");
	        String s = input.nextLine();
	        c.count(s);
	}
}
