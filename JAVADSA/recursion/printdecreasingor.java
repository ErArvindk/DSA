package recursion;

/**
 * printdecreasingor
 */
public class printdecreasingor {

    // to print increasing order 
    public static void increasing(int n){
        if (n==1) {
            System.out.print(n+" ");
            return ;
            
        }
        
        increasing(n-1);
        System.out.print(n+" "); 
        
    }

    // to print decreasing order 
    public static void callback(int n){
        if (n==1 ) {
            System.out.println(n);
            return ;
            
        }
        System.out.print(n+" ");
        callback(n-1);


    }


    public static void main(String[] args) {
        int n=5;
        // by recursions 
        // increasing call functions
        increasing(n);

        // decreasing call function 
        // callback(n);





      // //  through of loops 
        // for(int i=n; i>0; i--){
        //     System.out.println(i);

        // }

        

    }
}
