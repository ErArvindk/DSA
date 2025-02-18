package collectons.arrrlist;

import java.util.ArrayList;
import java.util.ListIterator;

import javax.swing.text.html.HTMLDocument.Iterator;

public class iteratorss {
    public static void main(String[] args) {
        ArrayList as=new ArrayList<>(); //<> its symbol of generic tops dec
        as.add(12);
        as.add(112);
        as.add(122);
        System.out.println(as);

        // // for loops

        // for(int i=0; i<as.size(); i++){
        // //    Object o =  as.get(i);
        // //    System.out.println(o);
        // // System.out.println(as.get(i));
        // }

        // //  foreach loops
        // for (Object o : as) {
        //     System.out.println(as.get(0));
            
        // }

        // using iterator methods 
        ListIterator ltr =as.listIterator(as.size());

        while (ltr.previous()) {
           System.out.println( ltr.previous());
            
        }
           
   




    }
    
}
