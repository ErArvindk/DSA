package array.arrrlist;
import java.util.*;
public class arraylist {
    /*
     * to used arraylist in java collections 
     * Arraylist is stored to homogeneus + hatrogenuos type of data 
     * it is dynamic changeble 
     * it is add method add two Arraylist + any object 
     * to store any type of data in single Arraylist 
     */
    public static void main(String[] args) {
        ArrayList aa=new ArrayList();
        aa.add(100);
        aa.add(200);
        aa.add(300);
        System.out.println(aa);

        System.out.println("***************************************");

        // to create a new arraylist 

        ArrayList ab=new ArrayList();
        ab.add("arvind kumar ");
        ab.add(10);
        ab.add(12.56);
        ab.add('a');
        System.out.println(ab);
        ab.add(100);
        System.out.println(ab);

        System.out.println("********************************************");
    
        ArrayList ac=new ArrayList();

        ac.addAll(aa);
        ac.addAll(ab);
        System.out.println(ac);






    }
    
}
