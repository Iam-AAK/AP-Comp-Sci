/**
 *Arya Kulkarni
 *Lunch Line
 */
import java.util.*;
class Line{
	private ArrayList<Tray> customers;
	
	public Line(){
		// nothing
	}
	
	public Line(ArrayList<Tray> customers){
		this.customers = customers;
	}
	
	public void checkOutFirst(){
		System.out.println("Attemtping checkout");
		if (this.customers!=null) {
		//	System.out.println("array list size: " + this.customers.size());
			if (this.customers.size()>0){
				customers.remove(0);
				System.out.println("Checkout completed");
			} else {
			System.out.println("No customers to checkout!");
			}
		} else {
			System.out.println("No customers to checkout!");
		}
			
	}
	
	public String toString(){
		String string;
		string="***PRINTING LINE***\n";
		for (int i=0; i < customers.size(); i++){
			string = string + customers.get(i).toString();
		}
		return string + "\n***LINE PRINTING COMPLETED***";
	}
	
}

class Tray{
	
	// tray can hold up to 5 items
//	private ArrayList food;
	ArrayList<String> food = new ArrayList<String>(5);
	private double cost;
	
	// constructor 
	public Tray(){
		cost = 0.0;
	}
	
	public Tray(List<String> food){
		cost=0.0;
		for(int i=0; i < food.size(); i++){
			this.food.add(food.get(i));
		}
	}
	
	
	
	public double getCost(){
		return cost;
	}
	
	public boolean addItem(String fooditem, double cost){
		food.add(fooditem);
		this.cost += cost;
		return true;
	}
	
	public String toString(){
		return "\n###PRINTING TRAY###" + "\n" + food + " " + "$" + cost + "\n###TRAY PRINTING COMPLETED###"; 
	}
}
 
class Tester{
 	public static void main(String [] args){
 		// first tray
 		Tray Tray1 = new Tray();
 		if(Tray1.addItem("Pizza",15.00)){
 			System.out.println("Item added successfully");
 		}
 		
 		if(Tray1.addItem("Tea",1.50)){
 			System.out.println("Item added successfully");
 		}
 		
 		if(Tray1.addItem("Muffin",5.50)){
 			System.out.println("Item added successfully");
 		}
 		
 		System.out.println(Tray1.toString());
 		
 		// second tray
 		Tray Tray2 = new Tray();
 		if(Tray2.addItem("Donut",5.00)){
 			System.out.println("Item added successfully");
 		}
 		
 		if(Tray2.addItem("Salad",10.50)){
 			System.out.println("Item added successfully");
 		}
 		
 		if(Tray2.addItem("Coffee",5.75)){
 			System.out.println("Item added successfully");
 		}
 		
 		System.out.println(Tray2.toString());
 		
 		// add 2 trays to an array list
 		ArrayList <Tray> TrayList = new ArrayList<Tray>();   
 		TrayList.add(Tray1);
 		TrayList.add(Tray2);
 		
 		// line object
 		Line Line1 = new Line(TrayList);
 		System.out.println(Line1.toString());
 		Line1.checkOutFirst();
 		System.out.println(Line1.toString());
 		Line1.checkOutFirst();
 		System.out.println(Line1.toString());
 		Line1.checkOutFirst();
 		Line Line2 = new Line();
 		Line2.checkOutFirst();
 	}
 }