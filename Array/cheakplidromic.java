package Array;

public class cheakplidromic {
    public static void main(String[] args) {
        int arr [] ={1,2,3,2,1};
        int cheak =0;
        for(int i=0; i<arr.length/2; i++){
            if (arr[i]!= arr[arr.length-i-1]) {
                cheak=1;
                System.out.println("not palindromic array ");
                
            }
        }
        if (cheak==0) {
            System.out.println("palindromic array ");
            
        }

    }
    
}
