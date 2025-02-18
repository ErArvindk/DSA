package array;

/**
 * bublesort
 */
public class bublesort {



    public static void main(String[] args) {
        int arr[]={9,6,4,8,2,1,5};
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1; j++){
                if (arr[j]>arr[j+1]) {
                    int temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        
        for(int i=0; i<arr.length; i++){
            System.out.print(" "+arr[i]);
        }
    }
}

