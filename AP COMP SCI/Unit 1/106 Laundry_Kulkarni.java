/**
 *Arya Kulkarni
 *Laundry
 */
 
 class LaundryOrder{
 	// name of the customer
 	// number of items to be cleaned	
 	// Boolean --- whether the order is ready
 	
 	private String name;
 	private int items;
  	private boolean ready = false;
  	
  	void Laundry(String name, int items){
  		this.name = name;
  		this.items = items;
  	}
  	
  	// set and get name
  	public void setName(String name){
  		this.name = name;
  	}
  	public String getName(){
  		return name;	
  	}
  	// set and get items
  	public void setItems(int items){
  		this.items = items;
  	}
  	public int getItems(){
  		return items;
  	}
  	// boolean set to 
  	 void setReady(){
  		ready = true;
  		System.out.println("\nOrder status set to Ready!");
  	}
  	public Boolean getReady(){
  		return ready;
  	}
 }
 
 class Tester{
 	public static void main(String [] args){
 		
 		LaundryOrder laundry = new LaundryOrder();
 		laundry.Laundry("Pat", 4);
 		System.out.println("Customer Name: " + laundry.getName());
 		System.out.println("Number of Items: " + laundry.getItems());
 		System.out.println("Order Status: " + laundry.getReady());
 		laundry.setReady();
 		System.out.println("Customer Name: " + laundry.getName());
 		System.out.println("Number of Items: " + laundry.getItems());
 		System.out.println("Order Status: " + laundry.getReady());
 			
 	}
 }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
