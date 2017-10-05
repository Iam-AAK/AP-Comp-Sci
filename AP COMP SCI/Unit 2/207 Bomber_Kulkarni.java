
 /**
 *Arya
 */
 

class matrixClass {

		// declare an int matrix 4 x 4
		int [][] matrix = new int[4][4];
		
		// declare and populate blast matrix
		int [][] blast = new int [3][3];
		
		// construcotr to populate the matrix
		matrixClass(){
			// System.out.println("constructor called...");
			// populate main matrix
			for (int col=0; col < 4; col++) {
				for (int row=0; row < 4; row++) {
					matrix[row][col] = 10;
				}
			}
			
			// populate blast matrix
			// row #1
			blast[0][0] = 0;
			blast[0][1] = 1;
			blast[0][2] = 2;
			
			// row #2
			blast[1][0] = 0;
			blast[1][1] = 1;
			blast[1][2] = 1;
			
			// row #3
			blast[2][0] = 0;
			blast[2][1] = 0;
			blast[2][2] = 0;
			
			System.out.println("Main and blast matrix created");
		}

		// method to print matrix
		public void printMatrix(int [][]matrix){
			System.out.println("Printing matrix");
			for (int row=0; row < matrix.length; row++) {
				for (int col=0; col < matrix[0].length; col++) {
					System.out.print(matrix[row][col] + "\t");
				}
				System.out.print("\n");
			}	
		}

		
		// blast method
		public void blast(int clickRow, int clickCol) {
			// subtract 1 to get the element id of the blast center
			clickRow--;
			clickCol--;
			
			System.out.println("Click row: " + clickRow);
			System.out.println("Click col: " + clickCol);
			
			// if either clickRow or clickCol are negative OR > 3, stop processing
			if (clickRow < 0 || clickCol < 0 || clickRow > 3 || clickCol > 3) {
				System.out.println("*****Invalid blast center, matrix not changed*****");
			} else {
				System.out.println("Valid blast center, processing blast...");
				int r = 0;
				int c = 2;
				for (int row = clickRow; row < 3; row++){
					for (int col = clickCol; col >= 0; col--) {
						matrix[row][col] = matrix[row][col] - blast[r][c];
						c--;
						if (c < 0) {
							break;
						}
					}
					c = 2;
					r++;
					if (r > 2) {
						break;
					}
				}
			}
		}

}

class Tester {
   public static void main(String[] args) {
		
		// create testMatrix object
		matrixClass testMatrix = new matrixClass();
		
		// print main and blast matrix
		testMatrix.printMatrix(testMatrix.matrix);
		testMatrix.printMatrix(testMatrix.blast);
		
		// blast
		testMatrix.blast(1,1);
		
		// print main matrix
		testMatrix.printMatrix(testMatrix.matrix);
   }
}