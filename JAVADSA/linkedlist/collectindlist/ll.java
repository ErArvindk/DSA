package Linklist.collectindlist;

import java.util.LinkedList;

public class ll {
    public static void main(String[] args) {
        /// to use collection class  Linkedlist  in java inbuild  framework;

        LinkedList <Integer> ld =new LinkedList<>();
        ld.add(12);
        ld.add(14);
        ld.add(16);
        ld.add(18);
        ld.add(20);
        System.out.println(ld);
        ld.addFirst(35);
        System.out.println(ld);
        ld.removeFirst();
        ld.addLast(24);
        System.out.println(ld);
        ld.removeLast();
        System.out.println(ld);
    }
    
}
