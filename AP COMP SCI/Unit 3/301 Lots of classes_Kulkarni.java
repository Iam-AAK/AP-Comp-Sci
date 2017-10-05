 /**
 *Arya Kulkarni
 *INTERNATIONAL NINJA DAY
 *Lots of Classes
 *Unit 3 Lab 1
 */


// *** super class "person" *** 
 class Person{	
	String name; 
 	String address;
 	String phoneNum;
 	String email;
 	
 	// name method
 	public void name(String name){
 		this.name = name;
 	}
 	
 	// getter methods
 	public String getName(){
 		return name;
 	}
 	
 	public String getAddress(){
 		return address;
 	}
 	
 	public String getPhoneNum(){
 		return phoneNum;
 	}
 	
 	public String getEmail(){
 		return email;
 	}
 	
 	// get class name
 	public String getClassName(){
 		return this.getClass().getSimpleName();
 	}
 	
 	// setter method
 	public void setName(String name){
 		this.name = name;
 	}
 	
 }


// *** sub class "student" *** 
 
 class Student extends Person{
 	private String status;
 	
 	// constructor
 	public Student(String name, String address, String phoneNum, String email, String status){
 		this.name = name;
 		this.address = address;
 		this.phoneNum = phoneNum;
 		this.email = email;
 		this.status = status;
 	}
 	
 	// status
	public String getStatus(){
		return status;
	}
	
 }

// *** sub class "employee" ***  
 class Employee extends Person{
 	int office;
 	int salary;
 	String datehired;
 	
 	//constructor
 	public Employee(String name, String address, String phoneNum, String email, int office, int salary, String datehired){
 		this.name = name;
 		this.address = address;
 		this.phoneNum = phoneNum;
 		this.email = email;
 		this.office = office;
 		this.salary = salary;
 		this.datehired = datehired;
 	}
 		
 }

// *** sub-sub-class "Faculty" ***   
 class Faculty extends Employee{
 	int officehours;
 	int rank;
 	
 	// constructor
 	public Faculty(String name, String address, String phoneNum, String email, int office, int salary, String datehired, int officehours, int rank){
 		super(name, address, phoneNum, email, office, salary, datehired);
 		this.officehours = officehours;
 		this.rank = rank;
 	}
 	
 }
 
 // *** sub-sub-class "Staff" *** 
 class Staff extends Employee{
 // String title is a constant
 	
 	String title = "Admin assistant";
 	
 	public Staff(String name, String address, String phoneNum, String email, int office, int salary, String datehired, String title){
		super(name, address, phoneNum, email, office, salary, datehired);
 		this.title = title;
 	}
 	
 }
 
// ***** TESTER CLASS *****

 class Tester{
 	public static void main(String[] args){
 		// call the toString methods from each class
 		
 		// student
 		Student student = new Student("Mr. Jenkins", "123 School Street", "123-456-7890", "jenkins@school.com", "Senior");
 		System.out.println("Class name: " + student.getClassName());
 		System.out.println("Name: " + student.getName() + "\n");
 		
 		// employee
 		Employee emp = new Employee("Mr. Whatsittoya", "456 School Street", "222-456-7890", "Whatsittoya@school.com", 1, 6500, "07/23/2011");
 		System.out.println("Class name: " + emp.getClassName());
 		System.out.println("Name: " + emp.getName() + "\n");
 		
 		// faculty
 		Faculty fac = new Faculty("Dirty Bubble", "1122 School Street", "431-456-7890", "DirtyBubble@school.com", 2, 5433, "08/23/1221", 12, 4);
 		System.out.println("Class name: " + fac.getClassName());
 		System.out.println("Name: " + fac.getName() + "\n");
 		
 		// staff
 		Staff stf = new Staff("Mermaid Man", "325 School Street", "726-456-7890", "M&M@school.com", 3, 23443, "09/23/2013", "Assistant");
 		System.out.println("Class name: " + stf.getClassName());
 		System.out.println("Name: " + stf.getName() + "\n");
 		
 	}
 }