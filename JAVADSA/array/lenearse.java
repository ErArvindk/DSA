package array;

/**
 * lenearse
 */
public class lenearse {
    public static void main(String[] args) {
        int arra[]={1,2,3,5,6};
        for(int i=0; i<arra.length/2; i++){
        
            int temp = arra[i];
            arra[i]=arra[arra.length-i-1];
            arra[arra.length-i-1]=temp;
   
        }
        

        for(int i=0; i<arra.length; i++){
            System.out.print(arra[i]);
        }
        System.out.println();
    }
    
}
