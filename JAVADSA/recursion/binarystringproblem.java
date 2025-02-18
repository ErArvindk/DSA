package recursion;

/**
 * binarystringproblem
 */
public class binarystringproblem {
    public static void printbinary(int  n, int lastplace,String str){

        // base case 
        if (n==0) {
           System.out.println(str);     
           return ; 
        }

       printbinary(n-1,0, str+"0");
        if (lastplace ==0) {
            
        printbinary(n-1,1, str+"1");
           
            
        }

    }

    public static void main(String[] args) {
        printbinary(3,0,"");
        



    }
}