package Backtracking;

public class gridbacktracking {

    public static int findgrid(int i,int j, int n,int m){

        // base case
        if (i == n-1 && j==m-1) {     //// last cells 
            return 1;
            
        }else if (i == n || j==n) {    /// boundry cells
            return 0;
            
        }

        /// cont right and down than add
        int w1 =findgrid(i+1, j, n, m);
        int w2 =findgrid(i, j+1, n, m);
        return w1+w2;
    }
    public static void main(String[] args) {
        int n=3 ,m=3 ;
        System.out.println(findgrid(0, 0, n, m));
    }
    
}
