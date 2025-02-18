package recursion;

//// friends pair problems ask goldman saals company ;

public class friendspairingproblem {

    public static int friendspro(int n){

        // best case
        if (n==1 || n==2) {
           return n;
            
        }

        //// to calculate firt pair 
        int wb=friendspro(n-1);

        //// to calcuale second pair 
        int wb1= friendspro(n-2);
        /// than multiply first / second 

        int totalpair = (n-1)*wb1;

        int total = totalpair+wb;
        /// than return 

        return total ;






    }

    public static void main(String[] args) {
        int n=4;
        System.out.println(friendspro(n));
        
    }
    
}
