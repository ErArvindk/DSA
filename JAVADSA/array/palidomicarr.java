package array;
import java.util.Scanner;

public class palidomicarr { // palindromic array is like  {1,2,3,2,1}
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter your size of n = ");
        int n=sc.nextInt();
        int array []=new int[n];
        for(int j=0; j<n; j++){
            array[j]=sc.nextInt();
        }
        int cheak=0;
        for(int i=0 ; i<n/2; i++){
            if (array[i]!=array[n-i-1]) {
                cheak=1;
                System.out.println("not palindramic array ");
                break;
                
            }
        }
        if (cheak==0) {
            System.out.println("It is a palindromic array ");
            
        }
    }

    
}
