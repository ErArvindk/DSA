package array.questions;

public class palindromics {
    public static void main(String[] args) {
        int array []={1,2,3,2,1};  
        int cheak=0;
        for(int i=0; i<array.length/2; i++){
            if(array[i]!=array[array.length-i-1]){
                cheak=1;
                System.out.println("NOT A PALINDROMIC ARRAY ");
                break;
            }
        }
        if (cheak==0) {
            System.out.println("Palindromic array ");
            
        }
        
    }
    
}
