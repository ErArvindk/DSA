package string;
import java.util.*;
public class stringreverse {
    public static void toprint(String A){
         for(int i=0; i<A.length(); i++){
             System.out.print(A[i]);
         }
    }
    public static void reversestr(String A){
        
        for(int i=0; i<A.length()/2; i++){
            int temp = A[i];
            A[i] =A[A.length()-1-i];
            A[A.length()-1-i] = temp;
        }
    }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
    }
}




