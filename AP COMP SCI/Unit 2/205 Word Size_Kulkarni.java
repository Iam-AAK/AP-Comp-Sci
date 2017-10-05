 /**
 *Arya
 *
 */

import java.io.File;
import java.util.Scanner;
import java.util.Arrays;

class Main {
  public static void main(String[] arg) throws Exception {
	int[] counter = new int[14];
	// initialize counter array
	for (int z=0; z < counter.length; z++) {
		counter[z]=0;
	}
	
	boolean flag=false;
	
    String delims = "[ +\\-*/\\^//., ]+";
    
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the file name with extention : ");
            File file = new File(input.nextLine());

            input = new Scanner(file);


            while (input.hasNextLine()) {
                String line = input.nextLine();
                //System.out.println(line);
                
                // process each line here
              //  String[] result = line.split(", *");
              String[] result = line.split(delims);
				//System.out.println("Split at commas: ");
				//System.out.println(Arrays.toString(result));
				//System.out.println(result.length);
			    for (int j=0; j <result.length; j++) {
			    	    //System.out.println(j + " : " + result[j]);
			    	    if (result[j].length()<14) {
			    	    	counter[result[j].length()]++;
			    	    } else
			    	    {
			    	    	if (!flag){
			    	    		flag=true;
			    	    	}
			    	    }
			    	    
			    }
                
            }
            input.close();
            
            // now that file is closed, print word counts
		    System.out.println("Printing counter...");
		    for (int k=0; k <counter.length; k++) {
		    	System.out.println(counter[k]);
		    }
    
            // now print bar chart
            
		    System.out.println("Printing bar chart...");
		    for (int p=1; p<counter.length; p++) {
		    	if (p<10) {
		    		System.out.print(" " + p + " words ");
		    	} else {
		    		System.out.print(p + " words ");
		    	}
		    	
		    	
		    	// loop for printing bar
		    	for (int q=0; q <counter[p]; q++) {
		    		System.out.print("*");
		    	}
		    	System.out.print("\n");
		    }
		    
		    if (flag) {
		    	System.out.println("*** there are words longer than 14 characters and were not counted ***");
		    }
		    

        } catch (Exception ex) {
            ex.printStackTrace();
        }
  }
}