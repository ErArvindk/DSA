package array.questions;
import java.util.*;

public class missingnum {
    public static void main(String[] args) {
        // int array []={1,2,3,5,6,7};
        // int n=array.length;
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter your size of n = ");
        int n=sc.nextInt();
        int array []=new int[n];
        for(int j=0; j<n; j++){
            array[j]=sc.nextInt();
        }
        // constant work 
        int sumofnaturalnumner=((n+1)*(n+2))/2;
        int sum=0;
        // time complexity =O(N)
        for (int i=0; i<array.length; i++){
            sum+=array[i];
        }

        
        int missing=sumofnaturalnumner -sum;
        System.out.print("misiing number of array is = "+missing);

    }
    
}
