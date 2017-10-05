/**
 *Arya Kulkarni
 *National Candy Day
 *Platoon
 */
 
 // make a class which holds 50 but try it with 3 soliders
 // Platoon extends soldier

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Soldier {
	// declare properties
    private String name;
    private String order;
    public int age;
    public int rank;

    // constructor

    public Soldier(String name, String order, int age, int rank)
    {
        this.name = name;
        this.order = order;
        this.age = age;
        this.rank = rank;
    }

    // method to print properties
    public void printSoldier()
    {
        System.out.println("*** Start printing soldier ***");
        System.out.println("Name: " + name);
        System.out.println("Order: " + order);
        System.out.println("Age: " + age);
        System.out.println("Rank: " + rank);
        System.out.println("--- --- --- --- ---");
    }
}

class Platoon {
    // declare list of soldiers
    public List<Soldier> soldiers = new ArrayList<Soldier>();
    
    // method to print soldiers
    public void PrintSoldier()
    {
        
        if (soldiers.size() > 0) {
            System.out.println("*** Start printing platoon ***");
            for (int i = 0; i < soldiers.size(); i++)
            {
            	System.out.println("Soldier #" + (i+1) + ":");
                soldiers.get(i).printSoldier();
                
            }
            System.out.println("--- --- --- --- ---");
        }
        else
        {
        	System.out.println("*** Nothing to print ***");
        }
        
    }
}


class Tester {
	public static void main(String[] args)
    {
        // this is main method in tester class

		System.out.println("Pochahontas: " + " Order 3" + " Age: 19" + " Rank: 3");
        System.out.println("Grandmother Willow: " + " Order 4" + " Age: 100000" + " Rank: 3");
        System.out.println("John Smith: " + " Order 66" + " Age: 27" + " Rank: 3");
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nEnter an order number: (Format: Order #)");
        // create 3 soldiers
        String order1 = sc.next();
        String order2 = sc.next();
        String order3 = sc.next();

        Soldier soldier1 = new Soldier("Pochahontas", order1,19,5);
        Soldier soldier2 = new Soldier("Grandmother Willow", order2, 100000, 2000);
        Soldier soldier3 = new Soldier("John Smith", order3, 27, 4);

        // create a platoon and add these soldiers to the platoon

        Platoon platoon1 = new Platoon();
        platoon1.soldiers.add(soldier1);
        platoon1.soldiers.add(soldier2);
        platoon1.soldiers.add(soldier3);

        // print Platoon
        platoon1.PrintSoldier();
    }
}