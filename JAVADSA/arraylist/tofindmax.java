package arraylist;

import java.util.ArrayList;

public class tofindmax {

    public static void main(String[] args) {
        ArrayList <Integer> ar =new ArrayList<>();
        ar.add(12);
        ar.add(13);
        ar.add(14);
        ar.add(122);
        ar.add(1);
        ar.add(187);
        ar.add(19);

        /// to findmax in arraylist
        int max =Integer.MIN_VALUE;
        int min =Integer.MAX_VALUE;
        for(int i=0; i<ar.size(); i++){
            // if (max < ar.get(i)) {
            //     max =ar.get(i); 
            // }

            /// to another way 
            max =Math.max(max, ar.get(i));   /// to find max
            min =Math.min(min,ar.get(i));     /// to findmin
        }
        System.out.println("");
        System.out.println(max);
        System.out.println(min);
    }
    
}
