package Linklist;

import java.util.LinkedList;
/**
 * InnerinPutlist
 */
import java.util.Scanner;

public class inPutlist {
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;

        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void headss(int data){
        Node nd =new Node(data);
        size ++;
        if(head == null){
            head =nd;
            return;
        }
        nd.next =head;
        head =nd;
}
 public void toprint(){
    Node temp =head;
    while (temp != null) {
        System.out.print(temp.data +" ---> ");
        temp =temp.next;
        
    }
    System.out.print("NUll");
 }


public static void main(String[] args) {
    LinkedList <Integer> ld =new LinkedList<>();
    inPutlist list =new inPutlist();
    Scanner input =new Scanner(System.in);
    System.out.print("Enter your linkedlist size = ");
    int s =input.nextInt();

//     for(int i=0; i<s; i++){
//     int a=input.nextInt();
//     ld.add(a);

//    }
//    System.out.println(ld);
      for(int i=0; i<s; i++){
       int n=input.nextInt();
       list.headss(n);
      }
      list.toprint();
}

}