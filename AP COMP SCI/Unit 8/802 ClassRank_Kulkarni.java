/**
 *Arya Kulkarni
 *Class Rank
 */
 import java.util.*;
 class Rank{
 	
 	private String name;
 	private int ID;
 	private double GPA;
 	
 	// constructor
 	Rank(String name, int ID, double GPA){
 		this.name = name;
 		this.ID = ID;
 		this.GPA = GPA;
 	}
 	
 	
 	public String getName(){
 		return name;
 	}
 	
 	public int getID(){
 		return ID;
 	}
 	
 	public double getGPA(){
 		return GPA;
 	}
 	
 	public String toString(){
 		return "Name: " + this.name + "  -----  ID: " + this.ID + "  ----  GPA: " + this.GPA;
 	}
 	
 	public static TreeSet getSort (ArrayList list){
       TreeSet set =new TreeSet(list);
       return set;
    }
 	
 	
 }
 
 class Tester{	
 	public static void main(String[] args){
 		
 		ArrayList<Rank> list1 = new ArrayList<Rank>();
 		ArrayList<Rank> list2 = new ArrayList<Rank>();
 		
 		list1.add(new Rank("Arya", 1234, 2.3));
 		list2.add(new Rank("Alex", 3212, 3.5));
 		list1.add(new Rank("Andrew", 2342, 3.6));
 		list2.add(new Rank("Annalee", 3212, 3.4));
 		
 		System.out.println("Original List");
 		for (int i = 0; i < list1.size(); i++) {
			System.out.println( list1.get(i).getName() + ", " + list1.get(i).getID()  + ", " +  list1.get(i).getGPA());
		}
		for (int i = 0; i < list2.size(); i++) {
			System.out.println( list2.get(i).getName() + ", " + list2.get(i).getID()  + ", " +  list2.get(i).getGPA());
		}
		
 		// add person 
 		System.out.println("\nNew List");
 		list1.add(new Rank("Ani", 1231, 2.4));
 		for (int i = 0; i < list1.size(); i++) {
			System.out.println( list1.get(i).getName() + ", " + list1.get(i).getID()  + ", " +  list1.get(i).getGPA());
		}
		for (int i = 0; i < list2.size(); i++) {
			System.out.println( list2.get(i).getName() + ", " + list2.get(i).getID()  + ", " +  list2.get(i).getGPA());
		}
 		
 		// remove person
 		System.out.println("\nNewer List");
 		list1.remove(1);
 		for (int i = 0; i < list1.size(); i++) {
			System.out.println( list1.get(i).getName() + ", " + list1.get(i).getID()  + ", " +  list1.get(i).getGPA());
		}
		for (int i = 0; i < list2.size(); i++) {
			System.out.println( list2.get(i).getName() + ", " + list2.get(i).getID()  + ", " +  list2.get(i).getGPA());
		}
 		
 		
 		// rank by GPA
 		System.out.println("\nSorted List");
 		TreeSet<Rank> set = new TreeSet<Rank>(new GPAComp());
 		set.add(new Rank("Arya", 1234, 3.8));
 		set.add(new Rank("Alex", 3212, 3.8));
 		set.add(new Rank("Ani", 2342, 3.6));
 		set.add(new Rank("Annalee", 3212, 3.612));
 		
 		for(Rank e:set){
            System.out.println(e);
        }
 		 			
 	}
 }
 
 class GPAComp implements Comparator<Rank>{
 
    @Override
    public int compare(Rank e1, Rank e2) {
        if(e1.getGPA() > e2.getGPA()){
            return 1;
        } else {
            return -1;
        }
    }
}

 