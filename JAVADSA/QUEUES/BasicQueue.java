import java.util.*;

import Linklist.recursivesearch;
import implimentlist.Queue;
/**
 * BasicQueue
 * 
 * to impliment 0(1)
 */
public class BasicQueue {

//       static class Queue{
//             static int arr[]; 
//             static int size;
//             static int rear;
//       Queue(int n){
//                 arr = new int[n];
//                 size =n;
//                 rear =-1;
//              }
//     public static boolean isempty(){
//       return rear==-1;
//     }

//     // add
//     public static void add(int data){
//       if (rear ==size-1) {
//             System.out.println("queue is full");
//             return ;
            
//       }
//       rear =rear+1;    /// real ko hmesa age badha rha hai
//       arr[rear] =data;
//     }

//     //// remove
//     public static int remove(){
//       if (isempty()) {
//             System.out.println("empty queue");
//             return -1;
            
//       }

//       int front =arr[0];   /// front  me  hm stiore kr rhe hai  arr[0] 

//       for(int i=0; i<rear; i++ ){
//             arr[i]=arr[i+1];   /// yah hmesa next value ko shift kr rha hai or ek ek remove ho rha hai 
//       }
//       rear =rear-1;  /// means hm start ko -1 kr rhe hai 
//       return front;
//     }

//     //// peek 
 
//     public static int peek(){
//       if (isempty()) {

//             System.out.println("empty queue");
//             return -1;
            
//       }
//       return arr[0];
//     }

//       }
//       public static void main(String[] args) {
//             Queue q =new Queue(3);
//             q.add(1);   /// but add me o(1)/ constatnt time lga hai 
//             q.add(2);
//             q.add(3);
//             // 1,2,3
//             while (!q.isempty()) {
//                   System.out.println(q.peek());
//                   q.remove();   //// time -c - o(n)
                  
//             }
            

//       }






//// to implimentwd circular queue in array 

//   static class Queue{
//       static int arr[];
//       static int size;
//       static int rear;
//       static int front;

//       Queue(int n){
//             arr=new int[n];
//             size=n;
//             rear=-1;
//             front=-1;

//       }
//       public static boolean isempty(){
//             return rear ==-1 && front ==-1;
//       }

//       /// to return thre front 

//       public static boolean isfull(){
//          return (rear+1)%size ==front;
//       }

//       public static void toadd(int data){
//             if (isfull()) {
//                   System.out.println("queue is full ");
//                   return;
//             }
//             if (front == -1) {
//                 front =0;
                  
//             }
            
//             rear =(rear+1)%size;
//             arr[rear]=data;

//       }

//       public static int toremove(){

//             if (isempty()) {
//                   System.out.println("queue is empty ");
//                   return -1;
                  
//             }
//             // int front =arr[0];
            
//             // /// left sift
//             // for(int i=0; i<rear; i++){
//             //       arr[i]=arr[i+1];
//             // }

//             int result = arr[front];
//             front =(front+1)%size; 

//             /// last el delete

//             if (rear == front) {
//                   rear =front =-1;
//             }else{
//                   front =(front+1)%size;
//             }
//             return result;

//       }

//       public static int peek(){
//             if (isempty()) {
//                   System.out.println("queue is empty ");
//                   return -1;
                  
//             }
//             return arr[front];
//       }
//   }
//   public static void main(String[] args) {
//       Queue q =new Queue(3);
//       q.toadd(1);
//       q.toadd(2);
//       q.toadd(3);
      

//       //// to work circular queue 

//       System.out.println(q.toremove());
//       q.toadd(4);
//       System.out.println(q.toremove());
//       q.toadd(5);
//       q.toadd(6);

//       /// to print 
//       while (!q.isempty()) {
//             System.out.println(q.peek());
//             q.toremove();     
//       }   
//   }

/////// impliment list ....................

//       static class Queue{
//             static int arr[]; 
//             static int size;
//             static int rear;
//       Queue(int n){
//                 arr = new int[n];
//                 size =n;
//                 rear =-1;
//              }
//     public static boolean isempty(){
//       return rear==-1;
//     }

//     // add
//     public static void add(int data){
//       if (rear ==size-1) {
//             System.out.println("queue is full");
//             return ;
            
//       }
//       rear =rear+1;    /// real ko hmesa age badha rha hai
//       arr[rear] =data;
//     }

//     //// remove
//     public static int remove(){
//       if (isempty()) {
//             System.out.println("empty queue");
//             return -1;
            
//       }

//       int front =arr[0];   /// front  me  hm stiore kr rhe hai  arr[0] 

//       for(int i=0; i<rear; i++ ){
//             arr[i]=arr[i+1];   /// yah hmesa next value ko shift kr rha hai or ek ek remove ho rha hai 
//       }
//       rear =rear-1;  /// means hm start ko -1 kr rhe hai 
//       return front;
//     }

//     //// peek 
 
//     public static int peek(){
//       if (isempty()) {

//             System.out.println("empty queue");
//             return -1;
            
//       }
//       return arr[0];
//     }

//       }
//       public static void main(String[] args) {
//             Queue q =new Queue(3);
//             q.add(1);   /// but add me o(1)/ constatnt time lga hai 
//             q.add(2);
//             q.add(3);
//             // 1,2,3
//             while (!q.isempty()) {
//                   System.out.println(q.peek());
//                   q.remove();   //// time -c - o(n)
                  
//             }
            

//       }






// //// to implimentwd circular queue in array 

//   /// to create a node 
//   static class Node{
//       int data;
//       Node next;
//       Node(int data){
//             this.data=data;
//             this.next=null;
//       }
//   }
    
//   /// to create queue 
//   static class Queue{
//       static Node head =null;
//       static Node tail =null;

//       public static boolean isempty(){
//             return head==null & tail==null;
//       }

//       public static void toadd(int data){
//             Node nd =new Node(data);
//             if (head ==null) {
//                   head=tail=nd;
//                   return;
                  
//             }

//             tail.next =nd;
//             tail=nd;
//       }


//       public static int toremove(){
//             if (isempty()) {
//                   System.out.println("queue is empty ");
//                   return -1;
                  
//             }
//             int front = head.data;

//             if (head==tail) {
//                   head =tail=null;
                  
//             }else{
//                  head= head.next;
//             }
//             return front;

//       }

//       public static int  topeek(){
//             if (isempty()) {
//                   System.out.println("queue is empty ");
//                   return -1;
                  
//             }
//             return head.data;

//       }
//   }

//   public static void main(String[] args) {
//       Queue q =new Queue();
//       q.toadd(1);
//       q.toadd(2);
//       q.toadd(3);
//       q.toadd(4);


//       while (!q.isempty()) {
//             System.out.println(q.topeek());
//             q.toremove();
//       }
//   }

////// to using collections 

// public static void main(String[] args) {
//       // Queue q = new LinkedList<>();   /// arrayDequee
//       Queue q =new ArrayDeque<>();
//        q.add(1);
//        q.add(2);
//        q.add(3);
//        System.out.println(q);
//        System.out.println(q.remove());
//        System.out.println(q.isEmpty());
// }



   // /////// Q.  Queue using  2 -stack 


   // ////  queue using  2 stack 
   // static class  Queue{
   //    static Stack<Integer> s1 =new Stack<>();
   //    static Stack<Integer> s2 =new Stack<>();

   //    public static boolean isempty(){
   //          return s1.isEmpty();
   //    }

   //    public static void toadd(int data){
   //          while (!s1.isEmpty()) {
   //                s2.push(s1.pop());
   //          }
   //                s1.push(data);

   //                while(!s2.isEmpty()){
   //                   s1.push(s2.pop());

   //                }
                  
   //          }

   //     public static int toremove(){

   //             if (isempty()) {
   //                System.out.println("queue is empty ");
   //                return -1;
                  
   //             }
   //             return s1.pop();
   //          }

   //    public static int topeek(){
   //             if (isempty()) {
   //                System.out.println("queue is empty ");
   //                return -1;
                  
   //             }
   //             return s1.peek();
   //          }
   //    }

   //    public static void main(String[] args) {
   //       Queue   q = new Queue();
   //       q.toadd(1);
   //       q.toadd(2);
   //       q.toadd(3);

   //       while (!q.isempty()) {
   //          System.out.println(q.topeek());
   //          q.toremove();
   //       }
   //    }


//    ////Q. stack using to queue .................

//    static class Stack{
//       static Queue <Integer> q1 = new LinkedList<>();
//       static Queue <Integer> q2 =new LinkedList<>();

//       public static boolean isEmpty(){
//          return q1.isEmpty() && q2.isEmpty();
//       }

//       public static void push (int data){
//          if (!q1.isEmpty()) {
//             q1.add(data);   
//          }else{
//             q2.add(data);
//          }
//       }

//       public static int pop(){
//          if (q1.isEmpty()) {
//             System.out.println("empty statck");
//             return -1;
            
//          }
//          int top =-1;

//          /// cheak case 1
//         if(!q1.isEmpty()) {
//          while (!q1.isEmpty()) {

//             top =q1.remove();
//             if (q1.isEmpty()) {
//                break;
//             }
//             q2.add(top);
//          }
//       }  //// case 2 
//       else{
//             while (!q2.isEmpty()) {

//                top=q2.remove();
//                if (q2.isEmpty()) {
//                   break;   
//                }
//                q1.add(top);   
//          }
//       }
//          return top;   
//       }

//       public static int peek(){
//          if (q1.isEmpty()) {
//             System.out.println("empty statck");
//             return -1;
            
//          }
//          int top =-1;

//          /// cheak case 1
//         if(!q1.isEmpty()) {
//          while (!q1.isEmpty()) {

//             top =q1.remove();
//             q2.add(top);
//          }
//       } /// case 2 ..
//       else{
//             while (!q2.isEmpty()) {

//                top=q2.remove();
//                q1.add(top);   
//          }
//       }
//          return top;   
         
//    }
// }

//    public static void main(String[] args) {

//       Stack s =new Stack();
//       s.push(1);
//       s.push(2);
//       s.push(3);

//       while (!s.isEmpty()) {
//          System.out.println(s.peek());
//          s.pop();
//       }

      
//    }
// }

/////////////// Q.  first non repeacting letter 
// public static void printnonrepeacting(String str){
//    int freq [] =new int[26]; /// a-z
//    Queue <Character> q =new  LinkedList<>();


//    for(int i=0; i<str.length(); i++){
//       char ch= str.charAt(i);
//       q.add(ch);
//       freq[ch -'a']++;

//       while (!q.isEmpty() && freq[q.peek() - 'a' ]>1) {
//          q.remove();
         
//       }

//       if (q.isEmpty()) {
//          System.out.print(-1+" ");
         
//       }else{
//          System.out.print(q.peek()+" ");
//       }
//    }
//    System.out.println();
// }
// public static void main(String[] args) {
//    String str ="aabccxb";
//    printnonrepeacting(str);
// }

// }

// // ////Q.5  interleave 2 halves of a queue (even length )

// public static void interleave(Queue<Integer> q){

//    Queue <Integer> fhalf =new LinkedList<>();

//    int size =q.size();

//    for(int i=0; i<size/2; i++){
//       fhalf.add(q.remove());
//    }

//    while (!fhalf.isEmpty()) {
//       q.add(fhalf.remove());
//       q.add(q.remove());
      
//    }
// }
// public static void main(String[] args) {
//    Queue <Integer> q =new LinkedList<>();
//    q.add(1);
//    q.add(2);
//    q.add(3);
//    q.add(4);
//    q.add(5);
//    q.add(6);
//    q.add(7);
//    q.add(8);
//    q.add(9);
//    q.add(10);
//    interleave(q);

//    while (!q.isEmpty()) {
//       System.out.print(q.remove()+" ");
      
//    }
//    System.out.println();
// }
// }

// ////// Q . reverse queue 
// /// 12345

// public static void toreverse(Queue<Integer> q){
//    Stack <Integer> s =new Stack<>();
//    int size=q.size();
//    while (!q.isEmpty()) {
//       s.push(q.remove());
//    }

//    while (!s.empty()) {
//       q.add(s.pop());
//    }
// }

// public static void main(String[] args) {
//    Queue <Integer> q =new LinkedList<>();
//    q.add(1);
//    q.add(2);
//    q.add(3);
//    q.add(4);
//    q.add(5);
//    toreverse(q);

//    //// to print 

//    while (!q.isEmpty()) {
//       System.out.print(q.remove()+" ");
      
//    }
//    System.out.println();
// }

// }

// //// double ended queue
// ///// using java collection framework 
// public static void main(String[] args) {
//    Deque<Integer> deque =new LinkedList<>();
//    deque.addFirst(1);
//    deque.addFirst(2);
//    deque.addLast(3);
//    deque.addLast(4);
//    System.out.println(deque);
//    // deque.removeFirst();
//    // System.out.println(deque);
//    deque.removeLast();
//    System.out.println(deque);
//    System.out.println(deque.getFirst());
//    System.out.println(deque.getLast());

// }
// }

// ////// to impliment  queue  using dequeue

// static class stack{
//    Deque<Integer> deque =new LinkedList<>();

//    public void push(int data){
//       deque.addLast(data);
//    }
//    public int pop(){
//       return deque.removeLast();
//    }

//    public int peek(){
//       return deque.removeLast();
//    }

// }
// public static void main(String[] args) {
//    stack s =new stack();
//    s.push(1);
//    s.push(2);
//    s.push(3);

//    System.out.println("peek = "+s.peek());
//    System.out.println(s.pop());
//    System.out.println(s.pop());
// }
// }