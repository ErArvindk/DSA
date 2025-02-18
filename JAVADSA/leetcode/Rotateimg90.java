public class Rotateimg90 {
      ///// brudeforce  solutions 
      public static int[][] rotatematrix(int [][]matrix){
            int n=matrix.length;
            int rotate [][] = new int[n][n];
            for(int i=0; i<n; i++){
                  for(int j=0; j<n; j++){
                        rotate[j][n-i-1] =matrix[i][j];
                  }
            }
            return rotate;

      }
      /// otimal solutions
      /// class Solution {
    public void rotatess(int[][] matrix) {
      int n = matrix.length;
      for (int i = 0; i < n; i++) {
          for (int j = i; j < n; j++) {
              int temp = matrix[i][j];
              matrix[i][j] = matrix[j][i];
              matrix[j][i] = temp;
          }
      }
      for (int i = 0; i < n; i++) {
          for (int j = 0; j < n / 2; j++) {
              int temp = matrix[i][j];
              matrix[i][j] = matrix[i][n - j - 1];
              matrix[i][n - j - 1] = temp;
          }
      }
}

      public static void main(String[] args) {
            int [][]matrix ={{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
      //      rotatematrix(matrix);
           Rotateimg90 r =new Rotateimg90();
           r.rotatess(matrix);
           for(int i=0; i<matrix.length; i++){
            System.out.print(matrix[i]+" ");
           }
      }
}