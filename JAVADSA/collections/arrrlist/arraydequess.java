package arrrlist;

import java.util.ArrayDeque;

public class arraydequess {
    public static void main(String[] args) {
        
        ArrayDeque dq=new ArrayDeque();
        dq.add(100);
        dq.addFirst(56);
        dq.add(57);
        dq.addLast(5000);
        System.out.println(dq);
        dq.offer(1);
        dq.offerFirst(100);
        dq.offerLast(500); // add or not add its used this methods in java
        System.out.println(dq);
    }
}
