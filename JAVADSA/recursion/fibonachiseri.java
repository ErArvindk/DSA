package recursion;

/**
 * fibonachiseri
 */
public class fibonachiseri {

    public static int  fibona(int n){
        int result=0;
//// conditions
        if (n==0|| n==1) {
            return n;
            
        }
        int fm1=fibona(n-1);
        int fm2=fibona(n-2);
        return fm1+fm2;
        
        // if (n<=1) {
        //     return n ;
            
        // }
        // else{
        //      result= fibona(n-1)+fibona(n-2);
        //     return result;
    

        // }
        
       




    }
    public static void main(String[] args) {

        int n=4;
        int pri =fibona(n);
        System.out.println("Print your fibonachi no value  = "+pri);

       
    }
    
}
