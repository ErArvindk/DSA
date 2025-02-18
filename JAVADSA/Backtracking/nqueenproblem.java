package Backtracking;

import string.solutionsstrin;

public class nqueenproblem {

    static int  count =0;

    public static void nqueen(char bb [][] , int row ){
        /// base case 
        if (row == bb.length) {
            printbb(bb);
            count++;
            return;
            
        }

        /// colums shift to the backtracking 
        for(int j=0; j<bb.length ; j++){
            bb[row][j]='Q';    // shift to this row 
            nqueen(bb, row+1);
            bb[row][j]='.';
        }

    }

    public static void printbb(char bb[][]){
        System.out.println("------------------");
        for(int i=0; i<bb.length; i++){
            for(int j=0; j<bb.length; j++){
                System.out.print(bb[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=2;
        char bb [][]= new char[n][n];


        for (int i=0; i<n; i++){
            for(int j =0 ; j<n ; j++){
                bb[i][j]='.';
            }
        }
        nqueen(bb, 0);
        System.out.println(count);
    }
    
}
