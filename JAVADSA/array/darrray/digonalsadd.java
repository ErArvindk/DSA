package array.darrray;
 // sum of diagonaal matrix first and second 
public class digonalsadd {
    public static void add(int arr [] []){
        int x=arr[0].length;
        int sum =0; 

        // // to time complexty is the o(n*2)/
        // for(int i=0; i<arr.length; i++){
        //     for(int j=0; j<x; j++){
        //         if (i==j) {
        //             sum += arr[i][j];
                    
        //         }                
        //         else if (i+j==arr.length-1) {
        //             sum+=arr[i][j];
                    
        //         }
        //     }
        // }

        // // to print liner time complexity O(n);    
        for(int i=0; i<arr.length; i++){
            sum+=arr[i][i];
            if (i!=arr.length-1-i) {
                sum+=arr[i][arr.length-1-i];
                
            }
        }
        System.out.println(sum);

    }
    public static void main(String[] args) {
        int arr [] []={{1,2,3,4},{  5,6,7,8 },{9,10,11,12 },{13,14,15,16}};
        add(arr);
    }
    
}
