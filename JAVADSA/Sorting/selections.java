package Sorting;

public class selections {


    public static void select(int arr[]){

        for(int i =0; i<arr.length-1; i++){
            int minvalue=i;
            for(int j=i+1; j<arr.length; j++){
                if (arr[minvalue]> arr[j]) {
                    minvalue =j;
                    
                }
            }

            // swpping 
            int temp =arr[minvalue];
            arr[minvalue] =arr[i];
            arr[i]=temp;
        }
    }

    public static void printss(int arr[]){
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+" , ");
    }
}

    public static void main(String[] args) {
        int arr[]={9,2,3,4,7,6,5,1};
        select(arr);
        printss(arr);

    }
    
}
