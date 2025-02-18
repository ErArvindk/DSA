package string;

/**
 * cheakpalidrome
 */
public class cheakpalidrome {

    public static String cheakp(String str){
        String a="yes";
        for(int i=0; i<str.length()/2; i++){
           int n=str.length();
           if (str.charAt(i) != str.charAt(n-i-1) ) {
            a="No";
        }
        }
         return a;

    }

    public static void main(String[] args) {
        String str ="radar";
        System.out.println("your string is = "+ cheakp(str));

    }
}