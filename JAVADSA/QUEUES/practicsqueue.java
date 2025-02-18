/**
 * practicsqueue
 */
public class practicsqueue {

      static class Queue{
            static int []arr;
            static int size;
            static int rear;

              Queue(int n){
                  arr =new int[n];
                  size=n;
                  rear=-1;
            }

       public static boolean isempty(){
                  return rear==-1;
                }

                //// add
            public static void toadd(int data){

                  if (rear==size-1) {
                        System.out.println("empty queue");
                        return ;
                        
                  }
                  rear =rear+1;
                  arr[rear]=data;
            }

            //// remove
            public static int remove(){
                  if (isempty()) {
                        System.out.println("empty queue ");
                        return -1;
                        
                  }

                 int front =arr[0];

                 for(int i=0; i<rear; i++){
                  arr[i] = arr[i+1];
                 }
                 rear =rear-1;
                 return front;
            }

            ////peek

            public static int peek(){
                  if (isempty()) {
                        System.out.println("empty queue");
                        return-1;
                        
                  }
                  return  arr[0];
            }
            
      }
      public static void main(String[] args) {
            Queue q =new Queue(3);
            q.toadd(1);
            q.toadd(2);
            q.toadd(3);

            while (!q.isempty()) {
                  System.out.println(q.peek());
                  q.remove();

                  
            }
      }
}
