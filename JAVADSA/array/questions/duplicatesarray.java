package array.questions;

public class duplicatesarray {
    public static void main(String[] args) {
        
    
    int array []={1,2,2,3,3,4,5};
    for(int i=0; i<array.length; i++){
        for(int j=i+1; j<array.length; j++){
            if (array[i]==array[j]) {
                System.out.println("Duplicates number of array  = "+array[i]);
                
            }
            }
        }
        

    }
    }
    

