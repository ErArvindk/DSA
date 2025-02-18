package arraylist;

import java.util.ArrayList;

/**
 * basicofarraylist
 */
public class basicofarraylist {

    public static void main(String[] args) {
        // t start basic of arraylist 
    //     ArrayList <Integer> list =new ArrayList<>();
    //     ArrayList  list1 =new ArrayList<>();
    //     ArrayList <Float> list2 =new ArrayList<>();
    //     ArrayList <Boolean> list3 =new ArrayList<>();
    //     ArrayList <String> list4 =new ArrayList<>();
    //     list.add(12);
    //     list2.add(12.4f);
    //     list3.add(false);
    //     list4.add("adkdhfk");
    //  System.out.println(list+" "+list1+" "+list2+" "+list3+" "+list4);
        
    ArrayList listt =new ArrayList<>();
    listt.add(1);
    listt.add(2);
    listt.add(3);
    listt.add(41);
    listt.add(56);

    // //// print arraylist//

    // for(int i=0; i<=listt.size(); i++){
    //     System.out.print(listt.get(i));
    // }
    // System.out.println();
    //// to reverse arraylist
    // for(int i=listt.size()-1 ; i>=0;i--){
    //     System.out.println(listt.get(i));
    //     //// linear time complexity 
    // }
    /// to find max elemet in arraylist

       //// to reverse list 

    for(int i=listt.size()-1; i>0; i--){
        System.out.print(listt.get(i)+" ");
        }
        System.out.println();
    }
    }