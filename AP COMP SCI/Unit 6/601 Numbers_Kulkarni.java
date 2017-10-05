/**
 *Arya Kulkarni
 *Numbers
 */
 import java.util.*;
 class Numbers{
 	
 	// returns the first occurance location
 	public int findFirst(int[] arr, int value){
 		int first = 0;
 		for(int i = 0; i < arr.length; i++){
 			if(value == arr[i]){
				first = i;
				break; 				
 			}			
 		}
 		return first;
 	}
 	
 	// returns the last occurance
 	public int findLast(int[] arr, int value){
 		int last = 0;
 		for(int j = arr.length - 1; j >= 0; j--){
 			if(value == arr[j]){
 				last = j;
 				break;
 			}
 		}
 		return last;
 	}
 	
 	// prints all the locations
 	public void findAll(int[] arr, int value){
 		System.out.print("All occurances: ");
 		for(int i = 0; i < arr.length; i++){
 			if(value == arr[i]){
 				System.out.print(i + " ");
 			}
 		}
 	}
 	
 	 	// returns the number of times the value appears in an array
 	public int count(int[] arr, int value){
 		int count = 0;
 		for(int i = 0; i < arr.length; i++){
 			if(value == arr[i]){
 				count++;
 			}
 		}
 		return count;
 	}
 	
 	 	// reutnrs how many items are greater then the value
 	public int greater(int[] arr, int value){
 		int count = 0;
 		for(int i = 0; i < arr.length; i++){
 			if(value > arr[i]){
 				count++;
 			}
 		}
 		return count;
 	}


 
 	// main method
 	public static void main(String[] args){
 		int[] a = new int[100];
 		for(int i = 0; i < a.length; i++){
 			a[i] = (int)(Math.random() * 20 +  1);
 			System.out.print(a[i]+ " ");
 		}
 		
 		
 		Numbers n = new Numbers();
 		System.out.println("\nFirst occurance: " + n.findFirst(a, 10));
 		System.out.println("Last occurance: " + n.findLast(a, 10));
 		n.findAll(a, 10);
 		System.out.println("\nCount: " + n.count(a, 10));
 		System.out.println("Numbers Greater than value: " + n.greater(a, 10));
 		
 	}
 }