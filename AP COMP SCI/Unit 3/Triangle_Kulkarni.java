/**
 *Arya Kulkarni
 *OBAMA IS STILL THE PRESIDENT YAY (TRUMP IS PRESIDENT ELECT)
 *Triangle Lab (Extra)
 */
 
 class Triangle //extends GeometricObject
 {
 	double side1 = 1.0;
 	double side2 = 1.0;
 	double side3 = 1.0;
 	double Area;
 	double Perimeter;
 	
 	// Default constuctor
 	Triangle(){
 		this.side1 = side1;
 		this.side2 = side2;
 		this.side3 = side3;
 	}
 	
 	// Area Method
 	String Area(double side1, double side2, double side3){
 		double s = (side1 + side2 + side3)/2;
 		double w = s*(s - side1)*(s - side2)*(s - side3);
 		double Area = Math.pow(w,0.5);
 		System.out.println("Area: " + Area);
 		return "Area: " + Area;
 	}
 	
 	// Get area
 	double getArea(){
 		return Area;
 	}
	
	// Perimeter area
	String Perimeter(double side1, double side2, double side3){
		double Perimeter = (double)(side1 + side2 + side3);
		System.out.println("Perimeter: " + Perimeter);
		return "Perimeter: " + Perimeter;
	}

	// Get perimeter
	double getPerimeter(){
		return Perimeter;
	}
	
	// toString()
	String anstoString(){
		return "Triangle: side 1 = " + side1 + " side 2 = " + side2 + " side 3 = " + side3; 
	}
 }
 
 class Tester{
 	public static void main(String[] args){
 		
 		Triangle pm = new Triangle();
 		pm.Perimeter(1,1,1);
 		
 		Triangle area = new Triangle();
 		area.Area(1,1,1);
 		
}}