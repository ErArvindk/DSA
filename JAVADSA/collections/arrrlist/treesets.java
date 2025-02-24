package collectons.arrrlist;

/**
 * treesets
 */
import java.util.*;
public class treesets {

    public static void main(String[] args) {
        TreeSet ts =new TreeSet();
        ts.add(100);        
        ts.add(40);        
        ts.add(200);  
        ts.add(28);      
        ts.add(120);        
        ts.add(125);   
        System.out.println(ts);   
        System.out.println(ts.floor(200));  
        System.out.println(ts.lower(40));  
        System.out.println(ts.higher(80));  
        System.out.println(ts.ceiling(100));
        System.out.println(ts.floor(40));  



    }
}