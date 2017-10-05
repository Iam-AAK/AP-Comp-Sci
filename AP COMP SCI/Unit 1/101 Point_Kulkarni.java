/**
 *Arya Kulkarni
 *September 23, 2016
 *Point
 */

import java.util.Scanner;


 class Point { 
    private double x;
    private double y;
 	
    public Point()                          // (0, 0)
    { 
        this.x = 0;
        this.y = 0;	
   	}
 
    public Point(double x, double y)
    {
    	this.x = x;
    	this.y = y;
    }
 
    public double getX()                       // return field values
    {
    	return x;
    
    }
    public double getY()
    {
    	return y;
    
    }
 
    // Use the distance formula to find the distance of this point from the origin (0,0)
    public double distanceFromOrigin()
    {
    	double distanceX = Math.pow(x,2);
    	double distanceY = Math.pow(y,2);
    	double csquared = distanceX + distanceY;
    	double distanceFromOrigin = Math.pow(csquared,0.5);
    	return distanceFromOrigin;
    	
    }
 	 
    private double x1, y1;
 	
 	public void PointOther (){
 		x1 = 1;
 		y1 = 1;
 	}
 	
 	public double getX1()                       // return field values
    {
    
    	return x1;
    	
    }
    public double getY1()
    {
    
    	return y1;
    
    }
 	
 	
 	
    // Find the "manhattan" distance between current point and other. ITs the change in y plus the change in x (take absolute value)
    //  You can look at http://x...content-available-to-author-only...t.gov/dads//HTML/manhattanDistance.html for help
    public void distance()
    {
    	double x1 = 1.0;
    	double y1 = 1.0;
    	double distance;
    	distance = x1 + y1;
    	System.out.println("Manhattan Distance is: " + distance);
    //	return distance;
   	}
 
    // Changes the coordinate to new values
    public void setLocation(int x, int y)
    {   
    	 x = 1;
    	 y = 1;	
    
    }
 
    //Shift the point by the translation T<x+h,y+k>
    public void translate(int h, int k)
    {
     this.x = x + h;
     this.y = y + k;
     }
 
    //Displays the instance variables as a coordinate e.g. "(4, -7)" ----------------------- fix it
    public String coord()
    {
    	System.out.println("(" + " " + x + ", " + y + ")" );
    	return null;
    }
          
}


// Tester class is used to call methods from the class above
class PointTester{
	public static void main(String [] args){
	
	// call for methods
	
	Scanner scanner = new Scanner(System.in);
	// declare varibles and ask for user input
	double x = 0;
	double y = 0; // origin
	
	

	double x1 = 1.0; // new point
	System.out.println("y coordinate: 1 ");
	double y1 = 1.0;
	System.out.println("x coordinate: 1");
		
		
	Point PointTester = new Point(x1, y1);
	
	
	// distance formula
		System.out.println("Distance from origin: " + PointTester.distanceFromOrigin());
    	
    	
	// manhatten distance
		double manhattendistance = x1 + y1;
		PointTester.distance();
	//	System.out.println("Manhatten Distance: " + PointTester.distance());
	
	// print everything
	
	// translation	
		System.out.println("Enter the value for h (horizontal translation) ");
		double h = scanner.nextInt();
		System.out.println("Enter the value for k (vertical translation) ");
		double k = scanner.nextInt();
		
		System.out.println("New point after translation: (" + (x1 + h) + "," + (y1 + k) + ")");
	}
}
