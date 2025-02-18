package array.darrray;

public class spiralproblem {


    public static void printshow(int arr [][]){
        int startrow = 0; 
        int startcol =0;
        int endrow =arr.length;
        int endcol= arr[0].length;

        while (startrow <= endrow && startcol <= endcol) {
            //top
            for(int j=startcol; j<=endcol; j++){
                System.out.print(arr[startrow] [j]+" ");
            }
            // right 
            for(int i=startrow+1; i<endrow; i++){
                    System.out.print(arr[i] [endrow]+" ");

            }
            //buttom 
            for(int j=endcol-1; j>=startcol; j--){
                if (startrow == endrow) {
                    break ;
                    
                }
            }

            // left
            for(int i=endrow-1; i>=startrow+1; i--){
                System.out.print(arr[i][startcol]+ " ");
            }
            startcol++;
            startrow++;
            endcol--;
            endrow--;


            
        }
        System.out.println();

    }

    public static void main(String[] args) {
        int [][] arr = {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
    printshow(arr);
        



    }
    
}
