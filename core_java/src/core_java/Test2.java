package core_java;

public class Test2 {
     public static void main(String[] args) {
    	 int l = 3, c = 3;
         
         // Declare the two multidimensional arrays
         int[][] A = { {1, 5, 3}, {2, 4, 1} , {9, 6, 0}};
         int[][] B = { {2, 7, 3}, {0, 9, 3} , {8, 2, 7} };
         
         // Declare the sum matrix
         int[][] S = new int[l][c];
         for(int i = 0; i < l; i++) {
             for (int j = 0; j < c; j++) {
                 S[i][j] = A[i][j] + B[i][j];
             }
         }
         // Print the sum matrix
         System.out.println("The sum of the given matrices is: ");
         for(int i = 0; i < l; i++) {
             for (int j = 0; j < c; j++) {
                 System.out.print(S[i][j] + "   ");
             }
             System.out.println();
         }
	}
}
