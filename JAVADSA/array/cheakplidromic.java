package array;

public class cheakplidromic {

        public static boolean isPalindrome(int x) {
            int org = x;
            int rev = 0;
            
            while(org > 0){
                int unit = org%10;
                rev = 10*rev+unit;
                org/=10;
            }
            
            return rev == x;
        }

    

    
    public static void main(String[] args) {
        int x=1941;
        System.out.println(isPalindrome(x));
    }
    
}
