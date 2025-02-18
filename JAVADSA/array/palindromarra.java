package array;
public class palindromarra {

    public static void strcheak( int arr[]){
        int cheak =0;
        for(int i=0; i<arr.length/2; i++){
            if (arr[i]!= arr[arr.length -i-1]) {
                cheak =1;
                System.out.print("not palindromoc array ");
                break;
                
            }
        }
        if (cheak == 0) {
            System.out.println("palindromic array ");
        }

    }
    public static void strcheak( char arr[]){
        int cheak =0;
        for(int i=0; i<arr.length/2; i++){
            if (arr[i]!= arr[arr.length -i-1]) {
                cheak =1;
                System.out.print("not palindromoc array ");
                break;
                
            }
        }
        if (cheak == 0) {
            System.out.println("palindromic array ");
        }

    }
    public static void main(String[] args) {
        int arr [] ={1,2,3,2,1};
        strcheak(arr);
        char ar []={'a','b','b','a'};
        strcheak( ar);

    }
    
}
