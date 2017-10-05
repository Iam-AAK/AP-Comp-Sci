/**
 *Arya Kulkarni
 *National Take a Hike Day
 *Matrix
 */
 import java.util.Scanner;
 class Matrix{
 	
 	// Random Matrix
   public static double[][] random(int m, int n) {
        double[][] a = new double[m][n];
        System.out.println(" -- MATRIX  -- ");
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                a[i][j] = (int)((Math.random()* 5) + 1);
                System.out.print(a[i][j] + " ");
            }
           System.out.println("\n");
        } 
        return a;
    }
	// Identity (all values 1) matrix
	public static double[][] identity(int n) {
        double[][] b = new double[n][n];
        System.out.println(" -- IDENTITY MATRIX  -- ");
        for (int i = 0; i < n; i++){
        	for(int j = 0; j < n; j++){
        	b[i][i] = 1;
            System.out.print(b[i][i] + " ");
        	}
        	System.out.println("\n");
        }
           
        return b;
    }
	
	// add
	public double [][] add(double[][] a, double[][] b, int m, int n){
		double[][] add = new double[m][n];
		
		System.out.println("-- ADDING MATRICES --");
		
		for(int i = 0; i < n; i ++){
			for(int j = 0; j < n; j++){
				add[i][j] = a[i][j] + b[i][i];
				System.out.print(add[i][j] + " ");
			}
			System.out.println("\n");
		}
		return add;
	}
	
	// subtract
		public double [][] subtract(double[][] a, double[][] b, int m, int n){
		double[][] subtract = new double[m][n];
		
		System.out.println("-- SUBTRACTING MATRICES --");
		
		for(int i = 0; i < n; i ++){
			for(int j = 0; j < n; j++){
				subtract[i][j] = a[i][j] - b[i][i];
				System.out.print(subtract[i][j] + " ");
			}
			System.out.println("\n");
		}
		return subtract;
	}
	
	// multiply
	public double [][] multiply(double[][] a, double[][] b, int m, int n){
		double[][] multiplication = new double[m][n];
		
		System.out.println("-- MULTIPLYING MATRICES --");

		for(int row = 0; row < n; row++){
			for(int col = 0; col < n; col++){
				for (int i=0; i < n; i++) {
					multiplication[row][col] += a[row][i] * b[i][col];
				}
				
				System.out.print(multiplication[row][col] + " ");
			}

			System.out.println("\n");
		}
		return multiplication;
	}
	
	// add diagonally
		public void addDiag(double[][] a, int m){
		int sum=0;
		
		for (int i = 0; i < m; i++) {
			sum += a[i][i];
		}
		
		System.out.println("Sum of the Diagonal: " + sum);
		}
	// sum column and Sum row
		public double[] sumCol(double[][]a, int m){
			double[] colSum =new double[a[0].length];
			int sum = 0;
			for (int i = 0; i < a.length; i++){   
    			for (int j = 0; j < a[i].length; j++){                
       				 sum += a[i][j];
       				 colSum[j] += a[i][j];
    			}
    			System.out.println("Print the sum of rows =" + sum);
			}  

			for(int k=0;k<colSum.length;k++){
    				System.out.println("Print the sum of columns =" + colSum[k]);
			} 
			
		return colSum;  
	}

	
	// transpose (switch rows and columns) 
	 public static double[][] transpose(double [][] a){
        double[][] tran = new double[a[0].length][a.length];
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[0].length; j++){
                tran[j][i] = a[i][j];
                System.out.print(tran[j][i] + ", ");
            }
            System.out.print("\n");
        }
        return tran;
    }
		
 
	}

 
 class Tester{
 	public static void main(String [] args){
 		
 		Scanner sc = new Scanner(System.in);
 		
 		System.out.println("Type in the number of rows and columns \n(Number entered represents a square matrix)");
 		int m = sc.nextInt();
 		int n = m;
 		Matrix random = new Matrix();
 	//	random.random(m, n);
 		
 		System.out.println("\nType in the number of rows and columns for a second matrix \n(Number entered represents a square matrix)");
 		int n1 = sc.nextInt();
 		Matrix b = new Matrix();
 	//	b.identity(n1);
 		
 		Matrix add = new Matrix();
 		add.add(random.random(m, n), b.identity(n1), m, n);
 		
 		Matrix subtract = new Matrix();
 		subtract.subtract(random.random(m, n), b.identity(n1), m, n);
 		
 		Matrix multiply = new Matrix();
 		multiply.multiply(random.random(m, n), b.identity(n1), m, n);
 		
 		
 		Matrix addDiag = new Matrix();
 		addDiag.addDiag(random.random(m, n), m);
 		
 		Matrix sumCol = new Matrix();
 		sumCol.sumCol(random.random(m, n), m);
 		
 		Matrix transpose = new Matrix();
 		transpose.transpose(random.random(m,n));
 	}
 }