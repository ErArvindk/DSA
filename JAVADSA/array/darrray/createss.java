package array.darrray;

import java.util.Scanner;

public class createss {
    public static void main(String[] args) {
        // int [][] arr  ={{12,34,65,76,98},
        // {13,24,55,66,78}};
        Scanner sc =new Scanner(System.in);

        int [][] arr =new int[4][5];

        // to input in 2-d array

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                arr[i][j]=sc.nextInt();
            }
            System.out.println();
        }
            
        // to print the array 
        int n=arr.length;
        int x=arr[0].length;
        for(int i=0; i<n; i++){
            for(int j=0; j<x; j++){
                System.out.print(arr[i][j]+ "  ");
            }
            System.out.println();
        }


  
    }

    
}
