/**
 *Arya Kulkarni
 *Array Max
 */
 
 // create a program to get the largest element from an int or a string array using recursion
 import java.util.*;
 class ArrayMax{
 	// comparable interface
 	public <E extends Comparable<E>> E max(List<E> data, int begin, int end) {
    E max = data.get(begin);
    for (int i = begin + 1; i < end; i++) {
        if (data.get(i).compareTo(max) > 0) {
            max = data.get(i);
        }
    }
    return max;

}
 	
 }
 
 class Tester{
 	public static void main(String [] args){
 		
 		// hard code String and Integer Array
 		ArrayList <Integer> a = new ArrayList<Integer>();
 		a.add(1);
 		a.add(2);
 		a.add(7);
 		a.add(4);
 		a.add(5);
 		
 		ArrayMax n = new ArrayMax();
 		System.out.print(n.max(a, 1, 5));
 	}
 }