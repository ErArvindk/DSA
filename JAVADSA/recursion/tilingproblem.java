package recursion;
public class tilingproblem {

// ask by amazon again and again 

//// to solve tiling problem using recursion 
    public static int tilin(int n){

        if (n==0 || n==1) {
            return 1;
            
        }

        int f1=tilin(n-1);
        int f2=tilin(n-2);
        int result=f1+f2;


        return result;



    }

    public static void main(String[] args) {
        int n=4;
        System.out.println(tilin(n));
        
    }

    
}
