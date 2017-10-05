/**
 *Arya Kulkarni
 *Phonebook
 */
 import java.util.*;
 class Phonebook{
 	
 	private int number;
 	private String email;
 	private int cell;
 	private String address;
 	
 	// constructor
 	Phonebook(int number, String email, int cell, String address){
 		this.number = number;
 		this.email = email;
 		this.cell = cell;
 		this.address = address;
 	}
 	
 	public int getNumber(){
 		return number;
 	}
 	
 	public String getEmail(){
 		return email;
 	}
 	
 	public int getCell(){
 		return cell;
 	}
 	
 	public String getAddress(){
 		return address;
 	}
 	
 }
 
 class Tester{
 	public static void main(String[] args){
 		
 		//int number, String email, int cell, String address
 		
 
 		ArrayList<Phonebook> list = new ArrayList<Phonebook>();
 		
 		System.out.println("Original List");
 		list.add(new Phonebook(1234567, "person0@gmail.com", 1987654, "123 qwerty lane"));
 		list.add(new Phonebook(1987654, "person1@gmail.com", 1994560, "098 qwerty lane"));
 		
 		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getNumber() + ", " + list.get(i).getEmail()  + ", " +  list.get(i).getCell() + ", " + list.get(i).getAddress());
		}
		
		System.out.println("\nNew List");
		list.add(new Phonebook(2341234, "person2@gmail.com", 3241563, "122 qwerty lane"));
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getNumber() + ", " + list.get(i).getEmail()  + ", " +  list.get(i).getCell() + ", " + list.get(i).getAddress());
		}
		
		System.out.println("\nNewer List ");
		list.remove(1);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getNumber() + ", " + list.get(i).getEmail()  + ", " +  list.get(i).getCell() + ", " + list.get(i).getAddress());
		}
		
		
 	}
 		
 }