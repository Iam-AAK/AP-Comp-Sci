/**
 *Arya Kulkarni
 */
 

import java.util.*;

// class Book (super class)

class Book {
	
	// fields
	private String Author;
	private String Title;
	private String ISBN;
	
	// null constructor

    public Book() {
    	this.Author = "";
    	this.Title = "";
    	this.ISBN = "";
    }
    
    // constructor with 3 parameters
    public Book(String author, String title, String isbn) {
    	this.Author = author;
    	this.Title = title;
    	this.ISBN = isbn;
    }

	// getters and setters
	
	// author
	public void setAuthor(String author){
		this.Author = author;
	}
	
	public String getAuthor(){
		return this.Author;
	}
	
	
	// title
	public void setTitle(String title){
		this.Title = title;
	}
	
	public String getTitle(){
		return this.Title;
	}
	
	// ISBN
	public void setISBN(String isbn){
		this.ISBN = isbn;
	}
	
	public String getISBN(){
		return this.ISBN;
	}

    
    // toString() method
    public String toString() {
    	return 	"*** Printing  book ***\nBook title: " + this.Title + 
    			"\nBook author: " + this.Author + 
    			"\nISBN: " + this.ISBN + "\n";
    }
    
}

// subclass LibraryBook
//class Fruit implements Comparable<Fruit>{
abstract class LibraryBook extends Book implements Comparable<LibraryBook> {
//class LibraryBook extends Book{
	// additional fields
	int callNumber;
	String circulationStatus;
	String dueDate;
	
	// constructor
	public LibraryBook(String author, String title, String isbn, int callNum){
		super(author, title, isbn);
		this.callNumber = callNum;
		this.circulationStatus = "";
	}
	
	// getters and setters
		
	// CallNumber
	public void setCallNumber(int callNum){
		this.callNumber = callNum;
	}
	
	public int getCallNumber(){
		return this.callNumber;
	}
	
	public void setCirculationStatus(String circulationStatus){
		this.circulationStatus = circulationStatus;
	}
	
	public String getcirculationStatus(){
		return this.circulationStatus;
	}
	
	// checkout method
	abstract void checkout(String patron, String dueDt);
	
	// returned method
	abstract void returned();
	
	// cirsulationStatus method
	abstract String circulationStatus();
	
    // toString() method
    public String toString() {
    	return 	"*** Printing library book ***\nBook title: " + this.getTitle() 		+ 
    			"\nBook author: " + this.getAuthor() 	+ 
    			"\nISBN: " + this.getISBN()				+
    			"\nCall number: " + this.callNumber	+
    			"\nCirsulation status: " + this.circulationStatus + "\n";
    }
    
    public int compareTo(LibraryBook compareLibraryBook) {

		int compareQuantity = ((LibraryBook) compareLibraryBook).getCallNumber();

		//ascending order
		return this.callNumber - compareQuantity;

		//descending order
		//return compareQuantity - this.quantity;

	}

}

// class ReferenceBook
class ReferenceBook extends LibraryBook{
	String collection;
	
	// constructor
	public ReferenceBook(String author, String title, String isbn, int callNum, String coll){
		super(author, title, isbn, callNum);
		this.collection = coll;
	}
	
	// getter and setter
	public String getCollection(){
		return this.collection;
	}
	
	public void setCollection(String coll){
		this.collection = coll;
	}
	
	// checkout method
	public void checkout(String patron, String dueDt){
		System.out.println("cannot check out a reference book");
	}
	
	// returned method
	public void returned(){
		System.out.println("reference book could not have been checked out -- return impossible");
	}
	
	// cirsulationStatus method
	public String circulationStatus(){
		return "non-circulating reference book";
	}
	
	    // toString() method
    public String toString() {
    	return 	"*** Printing reference book ***\nBook title: " + this.getTitle() 	+ 
    			"\nBook author: " + this.getAuthor() 								+ 
    			"\nISBN: " + this.getISBN()											+
    			"\nCall number: " + this.callNumber									+
    			"\nCirsulation status: " + this.circulationStatus 					+
    			"\nCollection: " + this.collection + "\n";
    }
}

// class CirculatingBook

class CirculatingBook extends LibraryBook{
	String currentHolder;
	String dueDate;
	
	public CirculatingBook(String author, String title, String isbn, int callNum, String coll, String currHolder, String dueDt){
		super(author, title, isbn, callNum);
		this.currentHolder = currHolder;
		this.dueDate = dueDt;
	}
	
	// getters and setters
	
	public String getCurrentHolder(){
		return this.currentHolder;
	}
	
	public void setCurrentHolder(String currHolder){
		this.currentHolder = currHolder;
	}
	
	public String getDueDate(){
		return this.dueDate;
	}
	
	public void setDueDate(String dueDt){
		this.dueDate = dueDt;
	}
	
	// checkout method
	public void checkout(String patron, String dueDt){
		setCurrentHolder(patron);
		setDueDate(dueDt);
		setCirculationStatus("checked out");
		System.out.println("Book checked out successfully...");		
	}
	
	// returned method
	public void returned(){
		setCurrentHolder("");
		setDueDate("");
		setCirculationStatus("");
		System.out.println("Book returned successfully...");
	}
	
	// circulationStatus method
	public String circulationStatus(){
		if (this.circulationStatus == "checked out") {
			return (this.currentHolder + " - " + this.dueDate);
		} else {
			return "book available on shelves";
		}
	}
	
	    // toString() method
    public String toString() {
    	return 	"*** Printing circulating book ***\nBook title: " + this.getTitle() + 
    			"\nBook author: " + this.getAuthor() 							+ 
    			"\nISBN: " + this.getISBN()										+
    			"\nCall number: " + this.callNumber								+
    			"\nCirsulation status: " + this.circulationStatus				+
    			"\nCurrent holder: " + this.currentHolder						+
    			"\nDue date: " + this.dueDate;
    }
}


 
// *** tester class ***
class BookTester{
	public static void main (String[] args) {
	
	// Book object
	Book javaBook = new Book("John Doe", "Learn Java","1234ABC");
	System.out.println(javaBook.toString());

	// ReferenceBook object & methods
	ReferenceBook refBook = new ReferenceBook("Bob Smith", "Learn ASP.NET", "ISBN123", 123, "Star office");
	System.out.println(refBook.toString());
	refBook.checkout("James Bond","2/25/2017");
	refBook.returned();
	System.out.println(refBook.circulationStatus() + "\n");
	
	// Circulating book & methods
	CirculatingBook cirBook = new CirculatingBook("Tim Doe", "XL in 1 day", "ISBN334", 223, "Moon office","Eli Manning","04/15/2017");
	System.out.println(cirBook.toString());
	cirBook.returned();
	cirBook.checkout("Jim Roe","06/11/2017");
	System.out.println(cirBook.circulationStatus() + "\n");
	
	
	// order books by call num
	System.out.println("*** Ordering books by call number ***");
	CirculatingBook[] cirBooks = new CirculatingBook[4];

	CirculatingBook java = new CirculatingBook("Java Author", "Java", "ISBN334", 555, "Moon office","Eli Manning","04/15/2017");
	CirculatingBook cSharp = new CirculatingBook(".NET Author", "Learn C Sharp", "ISBN334", 111, "Moon office","Eli Manning","04/15/2017");
	CirculatingBook fortran = new CirculatingBook("Fortran Author", "Fortran", "ISBN334", 999, "Moon office","Eli Manning","04/15/2017");
	CirculatingBook cobol = new CirculatingBook("COBOL Author", "COBOL", "ISBN334", 223, "Moon office","Eli Manning","04/15/2017");

	cirBooks[0]=java;
	cirBooks[1]=cSharp;
	cirBooks[2]=fortran;
	cirBooks[3]=cobol;

	Arrays.sort(cirBooks);

	int i=0;
	for(CirculatingBook temp: cirBooks){
	   System.out.println("Book " + ++i + " : " + temp.getTitle() +
		", Call number: " + temp.getCallNumber());
	}
	
	}
}
