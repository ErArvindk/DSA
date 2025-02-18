package Backtracking;

/**
 * subsetstostr
 */
public class subsetstostr {

    public static void tosubsets(String str ,String ans ,int i){

        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
                
            }
            else{
                System.out.println(ans);
            }

            /// backtrakings 
           tosubsets(str, ans+str.charAt(i), i+1); // yes 
           tosubsets(str, ans, i+1);  /// no 
        }


    }
    public static void main(String[] args) {
        String str ="abc";
       tosubsets(str,"",0);
    }
}