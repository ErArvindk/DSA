package recursion;

/**
 * firstoccurence
 */
public class firstoccurence {

//     public static int firstoccura(int arr [],int key,int i ){
// //// best case of recursions 
//         if (i==arr.length) {
//             return -1;
            
//         }
//   //// cheak conditions  of firstoccurence in array
//         if (arr[i] == key) {
//             return i;
            
//         }


//          return firstoccura(arr, key, i+1);


//     }

    public static int lastoccura(int arr[],int key ,int i){
        if (i==arr.length) {
            return -1;
            
        }
        int isfound=lastoccura(arr, key, i+1);
        if (isfound ==-1 && arr[i]==key ) {
            return i;
            
        }
        return isfound;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,87,7,5,8};
    //    System.out.println("Index no of = "+firstoccura(arr, 5,0));
       System.out.println("Index no of = "+lastoccura(arr, 5,0));
        
    }
    
}
