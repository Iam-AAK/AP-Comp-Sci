/**
 *Arya Kulkarni
 *Generic Methods
 */
 import java.util.*;
 class GenericMethods{
 	
 	// returns the max element in a 2D array
 	public static <E extends Comparable<E>> E Max(E[][] list){
 		
	  E max = list[0][0];
        for (E[] row : list) {
            for (E elt : row) {
                if (elt.compareTo(max) > 0) {
                    max = elt;
                }
            }
        }
        return max;
    }
 	
 	// shuffles an ArrayList
 	public static void shuffleList(List<Integer> a) {
                int n = a.size();
                Random random = new Random();
                random.nextInt();
                for (int i = 0; i < n; i++) {
                        int change = i + random.nextInt(n - i);
                        swap(a, i, change);
                }
        }

        private static void swap(List<Integer> a, int i, int change) {
                int helper = a.get(i);
                a.set(i, a.get(change));
                a.set(change, helper);
        }

	// Main Method
    public static void main(String[] args) {
        	
        	Integer[][] eh = new Integer[2][2];
 		for(int i = 0; i < eh.length; i++){
 			for(int j = 0; j < eh.length; j++){
 				eh[i][j] = (int)(Math.random()*5);
 				System.out.print(eh[i][j] + ", ");
 			}
 		 
 		}
 		//GenericMethods wow = new GenericMethods();
 		System.out.println("\n" + GenericMethods.Max(eh) + "\n");

        	
                List<Integer> list = new ArrayList<Integer>();
                list.add(1);
                list.add(2);
                list.add(3);
                list.add(4);
                list.add(5);
                list.add(6);
                list.add(7);
                System.out.println("Original list: \n" + list);
                System.out.print("\nRearranged list: \n");
                shuffleList(list);
                for (int i : list) {
                        System.out.print(i + ", ");
                }
                
  }
 }
 