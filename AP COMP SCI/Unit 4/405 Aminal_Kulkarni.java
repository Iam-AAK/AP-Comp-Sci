/**
 *Arya Kulkarni
 */
 
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class Animal {

	private String name;
	private int topSpeed;
	
	Animal (String n, int top) {
		setName(n);
		setTopSpeed(top);
	}
	
	//for the setter associated with topSpeed make sure the values are between 0 and 70
	public String getName () {
		return name;
	}
	
	public int getTopSpeed () {
		return topSpeed;
	}
	
	public void setName (String n) {
		name = n;
	}
	
	public void setTopSpeed (int top) {
		if (top > 0 && top < 70)
			topSpeed = top;
		else
			System.out.println("Exception: Speed not within boundries");
	}
	
	public boolean equals (Animal other) {
		if ((getTopSpeed() - 2 <= other.getTopSpeed() && getTopSpeed() + 2 >= other.getTopSpeed()))
				return true;
		else
			return false;
	}
	
	public String toString () { 
		return "Name: " + name + "     Top Speed: " + topSpeed;
	}
	
        // Raise an exception if topSpeed is not within these values.
			
	
	//create the getters and setters, there is a shortcut by hovering over the variable names
		
	//create a constructor that takes in a String for the name and an int for the topSpeed
	//use only the setters initialize the instance variables


        //create an equals(Object other) method that returns True if two Animal's top speeds are 
	//within 2 mph of each other

	
	// Create a toString method
	// Sample String to return for this toString method
	// Name: elephant     Top Speed: 25
	
}

class GuinnessBook {

	private ArrayList<Animal> landAnimals;

	public GuinnessBook(String filename) throws FileNotFoundException{

		landAnimals = new ArrayList<Animal>();

		File animalFile = new File(filename);
		Scanner scan = new Scanner(animalFile);
		
		while(scan.hasNextLine()){
			String[] animalInfo = scan.nextLine().split(" ");
			String animalName = "";
			
			for(int i = 0; i < (animalInfo.length-1); i++){
				animalName += animalInfo[i] + " ";
			}
			animalName = animalName.trim();
			Integer topSpeed = Integer.parseInt(animalInfo[animalInfo.length-1]);

			//insert the animal into the arraylist here, don't change any of the above code
			landAnimals.add(new Animal(animalName, topSpeed));
			
		}
		scan.close();
	}


	public String toString(){
		String s = "";
		
		for (Animal a: landAnimals) {
			s += "Name: " + a.getName() + "  Top Speed: " + a.getTopSpeed() + "\n";
		}
		
		return s;
	}

	private void testGuinnessBook() throws FileNotFoundException {

        // uncomment to test the method for finding animals with a given speed
        // Is there an animal whose speed is close to x (i.e. within 2mph)?

        // System.out.println("Is there an animal whose speed is around 70mph? " + landAnimals.contains(new Animal("fast animal", 70)));
        // System.out.println("Is there an animal whose speed is around 35mph? " + landAnimals.contains(new Animal("slow animal", 35)));

        //If we would like to know which animal it is:
        // System.out.println(landAnimals.get(landAnimals.indexOf(new Animal("fast animal", 70))));
        // System.out.println(landAnimals.get(landAnimals.indexOf(new Animal("slow animal", 35))));

        //Now print all the animals whose speed is around 50mph
		System.out.print("Animals whose speeds are around 50mph: ");
		
		for (int i = 0; i < landAnimals.size(); i++) {
			if (48 <= landAnimals.get(i).getTopSpeed() && 52 >= landAnimals.get(i).getTopSpeed()) {
				System.out.print(landAnimals.get(i).getName() + ", ");
			}
		}
		
    }

    public static void main(String args[]) throws FileNotFoundException {
        //UNCOMMENT TO TEST THE constructor
        GuinnessBook records = new GuinnessBook("AnimalList.txt");
        System.out.println(records);
        records.testGuinnessBook();
    }

}

