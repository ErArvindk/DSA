package array;

public class mergetwoarray {

      public static void main(String[] args) {
            int ar[]={1,2,3,4};
            int br[]={5,6,7,8,9};

            int array []=new int[ar.length+br.length];

            for(int i=0; i<ar.length; i++){
                  array[i]=ar[i];
            }
            for(int i=0; i<br.length; i++){
                  array[ar.length+i]=br[i];
            }
            for(int i=0; i<array.length; i++){
                  System.out.print(array[i]+" ");
            }
      }
      
}
