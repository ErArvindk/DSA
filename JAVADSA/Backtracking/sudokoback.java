package Backtracking;

/**
 * sudokoback
 */
public class sudokoback {

    public static Boolean issafe(int sudduko ,int row ,int col,int digit)
    {
        ///columns
        for(int i=0 ; i<=8; i++){
            if (sudduko[i][col] == digit) {
                return false;

                
            }

        }
        // row base cheaks 
        for(int j=0; j<=8; j++){
            if (sudduko[row][j] == digit) {
                return false;
                
            }
        }
        /// grid base work

        int sr =(row/3)*3;
        int sc =(col/3)*3;

        for(int i=sr; i< sr+3; i++){
            for(int j=sc; j<sc+3; j++){
                if (sudduko[i][j] == digit) {
                    return false;
                    
                }
            }
        }
        return true;

    }

    public static boolean findsuduko(int sudduko [][] ,int row,int col){
         
        // base case
        if (row ==9 && col ==9) {
            return true;
            
        }else if (row == 9) {
           return false; 
        }

        //recursion
        int nextrow =row ,nextcol =col+1;
        if (col+1 == 9) {
            nextrow = row+1;
            nextcol = 0;
            
        }
        if (sudduko[row][col]!=0) {
            return findsuduko(sudduko, nextrow, nextcol);
            
        }

        for(int digit=1; digit<=9; digit++){
            if (issafe(sudduko,nextrow ,nextcol)) {
                sudduko[row][col] =digit;
                if (findsuduko(sudduko, nextrow, nextcol)){
                    return true;
                } 
                sudduko[row][col]=0;

                    
                }
                
            }
        }
        public static void main(String[] args) {
            int sudduko [][]={

            }
        }
    

    }
