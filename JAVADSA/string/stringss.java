package string;

import java.util.Scanner;

public class stringss {
    public static void main(String[] args) {
        // strings defainds 
        // char str [] ={'a' , 'b', 'c', 'd'};
        // String str1 ="abcd";
        // String str2=new String("arvind");
        // System.out.println(str1 + " "+str2);
        // for (char c : str) {
        //     System.out.println(c);
            
        // }
        // Scanner sc =new Scanner(System.in);
        // System.out.print("Enter your strings = ");
        // String str3=sc.nextLine();
        // System.out.println(str3);

        String fullname ="Arvind";
        String lastnaem ="kumar";
        String str4=fullname+" "+lastnaem;
        System.out.println(fullname.length());
        System.out.println(fullname.charAt(3));

        for (int i = 0; i <str4.length(); i++) {
            System.out.print(str4.charAt(i));
            
        }
        System.out.println();


    }
    
}
