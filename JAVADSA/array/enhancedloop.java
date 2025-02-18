package array;

public class enhancedloop {
    public static void main(String[] args) {
    //     // used to for enhanced loops in 1-D array 
    // int arr[]={2,3,4,5,6};
    // for(int b:arr){
    //     System.out.println(b);
    // }

    int array [][]={
        {12,3,45,54,6},
        {8,6,8,432},
        {2,76,7}
    };

    for(int a[]:array){
        for(int b:a){
            System.out.print(b);

        }
        System.out.println();
    }
} 
}
