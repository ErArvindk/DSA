package array;

/**
 * pairsinarr
 */
public class pairsinarr {

    public static void pairs(int arr[]){

        int total=0;
        int onebyone=0;

        for(int i=0; i<arr.length; i++){
            onebyone=0;
            int current =arr[i];
            for(int j=i+1; j<arr.length; j++){
                System.out.print("( "+current  +","+arr[j]+" )");
                total ++ ;
                onebyone++;
                
            }
            System.out.println("\nsum of first pais  = "+onebyone);
            System.out.println();
        }
        System.out.println("Total number of pairs = "+total);
    }

    public static void main(String[] args) {
        int arr[] ={2,3,4,5,6,7,8};
        pairs(arr);
    }
}
