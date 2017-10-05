/**
 *Arya Kulkarni
 *9/1/16
 *File Size
 */
 
import java.util.Scanner;
class FileSize {
	public static void main (String [] args){
		System.out.println("Enter a file size (in byte(s))");
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		
		if(i>=0 && i<1024){
			System.out.println( i + " " + "byte(s)");
		} else if( i>=1024 && i<(1024*1024) ){
			 i = i /(1024);
			System.out.println( i + " " + "kilobyte(s)");
		} else if(i>= (1024*1024) && i<(1024*1024*1024)){
			i = i /(1024*1024);
			System.out.println( i + " " +  "megabyte(s)");
		} else if( i>= (1024*10241024) && i<=(1024*1024*1024*1024)){
			i = i /(1024*1024*1024);
			System.out.println( i + " " +  "gigabyte(s)");
		}
		
	}
}