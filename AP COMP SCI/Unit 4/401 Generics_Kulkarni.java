/**
 *Arya Kulkarni
 *Jan 4, 2017
 */
 class Pair <F, S>{
 	
 	F first;
 	S second;
 	
 	// constructor
 	public Pair(F first, S second){
 		this.first = first;
 		this.second = second;
 	}
 	
 	// setters and getters
 	public void setFirst(F first){
 		this.first = first;
 	}
 	
 	public void setSecond(S second){
 		this.second = second;
 	}
 	
 	public F first(){
 		return first;
 	}
 	
 	public S second(){
 		return second;
 	}
 	
 	// toString
 	public String toString(){
 		return first + " and " + second;
 	}
 	
 }
 
 class Tester{
 	public static void main(String[] args){
 		
 		// pair of strings
 		String s = "Tom";
 		String j = "Jerry";
 	
 		Pair<String, String> strs = new Pair<String, String>(s, j);	
 		System.out.println("Pair of Strings - " + strs.toString());
 		
 		// pair of string (s) and integer
 		int num = 5;
 		
 		Pair<String, Integer> strs1 = new Pair<String, Integer>(s, num);
 		System.out.println("Pair of String and Integer - " + strs1.toString());
 		
 		// pair of double and string(s)
 		double num2 = 2.3;
 		Pair<Double, String> strs2 = new Pair<Double, String>(num2, s);
 		System.out.println("Pair of Double and String - " + strs2.toString());
 		
 		
 		// single elements
 		System.out.println("\n" + strs.first());
 		System.out.println(strs1.first());
 		System.out.println(strs2.first());
 	}
 }