package array;

public class reversh {


    public static void toprint(int arr[]){

        for(int j=0; j<arr.length; j++){
            System.out.print(arr[j]+" ");
        }
    }

    public static void reversh(int arr[]){

        for(int i=0; i<arr.length/2; i++){

            int temp =arr[i];
            arr[i] =arr[arr.length-1-i];
            arr[arr.length-1-i] =temp;
        }
    }
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,6,7,8};
        System.out.print("Print the original array  = ");
        toprint(arr);
        reversh(arr);
        System.out.print(" \nPrint the reverse  array  = ");
        toprint(arr);

    }
    
}
