package recursion;

/**
 * factorialn
 */
public class factorialn {

  public static int facts(int n){
        if (n==0) {
            return 1;
            
        }
        
        int fam1=facts(n-1);
        int fn=n*facts(n-1);
       
        return fn;

    }
    
    public static void main(String[] args) {
        int n=5;
        System.out.println(facts(n));

    }
}
