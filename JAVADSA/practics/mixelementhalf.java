package practics;

public class mixelementhalf {

      public static void main(String[] args) {
            int arr[]={1,2,3,4,5,6,7,8,9,10};
            System.out.print("Your input  =  ");
            for(int i=0; i<arr.length; i++){
                  System.out.print(arr[i]+" ");
            }
            System.out.println();
            System.out.print("Your output   = ");
            for(int i=0; i<arr.length/2; i++){
                  int x =arr[i];
                  int y=arr.length/2+arr[i];
                  System.out.print(x+" "+ y+" ");
            }
            
      }
      
}
