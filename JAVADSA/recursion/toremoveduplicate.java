package recursion;

import java.util.Scanner;

// to remove the duplicate alimante in the strings by recursion 
public class toremoveduplicate {

    public  static void cheak(String str , int idx ,StringBuilder newstr , boolean map []){
        if (idx==str.length() ) {
            System.out.println(newstr);
            return;

            //  to the work of dupicate remove in string
        }
            char currchar = str.charAt(idx);

            if (map[currchar-'a'] == true) {
                cheak(str, idx+1, newstr, map);
                
            }else {
                map[currchar -'a'] = true;
                cheak(str, idx, newstr.append(currchar), map);
            }
            
        }
       
      public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Input your duplicate string  = ");
        String str = input.nextLine();

        // call to the functions 
        cheak(str,0, new StringBuilder(""),new boolean[26]);

        
    }
    
}
