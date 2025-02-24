public class poweroftwo {

    //// faast expontial
    public static int fastexpo(int a, int n){
        int ans =1;

        while (n > 0) {
            if ((n & 1) != 0) { //// check LSB
            ans =ans*a;                
            }
            a=a*a;
            n =n>>1;
            
        }
        return ans;
    }

    ////  to cheak power of two
    public static boolean ishpower(int n ){
        return (n&(n-1))==0;
    }

    ///// count set bits in a number.
    public static  int countsetBits(int n){
        int count =0;
        while (n > 0) {
            if ((n & 1) != 0) {
                count++; /// cheak our LSB
            }
           n = n>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(ishpower(16));
        System.out.println(countsetBits(15));
        System.out.println(fastexpo(3, 5));
    }
}