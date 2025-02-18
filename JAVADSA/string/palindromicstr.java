package string;

import array.questions.revelrsar;

public class palindromicstr {
    public static String show(String str){
        String a ="Yes";
        for (int i=0; i<str.length()/2; i++){
            int n=str.length();
            if (str.charAt(i) != str.charAt(n-i-1) ) {
                a="No";
            }
        }
        return a;
    }
    public static void main(String[] args) {
        String str="racecar";
        show(str);
        String str1="noon";
        show(str1);
        String str2="mada";
        System.out.println(show(str2));
      
        }
        
    }
    
