package leetcode;

import Backtracking.arrass;

public class zerooneproblem {
      /// to u sing buble sort n*n time 
      public static void buble(int arra[]){
            for(int i=0; i<arra.length; i++){
                  for(int j=0; j<arra.length-1; j++){
                        if (arra[j]>arra[j+1]) {
                              int temp =arra[j];
                              arra[j]=arra[j+1];
                              arra[j+1]=temp;
                          }
                  }
            }
            for(int i=0; i<arra.length; i++){
                  System.out.print(" "+arra[i]);
              }
      
      }
         
            public static void main(String[] args) {
                  int arra[] ={0,1,2,1,1,2,2,0,0};
                  int zz=0;
                  int on=0;
                  int tw=0;
            for(int i=0; i<arra.length; i++){
                  if (arra[i]==0) {
                        zz++;    
                  }
                  if (arra[i]==1) {
                        on++;
                        
                  } else {
                        tw++; 
                  }

            }
         int idx=0; 
         for(int i=0; i<zz; i++){
            arra[idx++]=0;
         }
         for(int i=0; i<on; i++){
            arra[idx++]=1;
         }
         for(int i=0; i<tw; i++){
            arra[idx++]=2;
         }
      for(int i=0; i<arra.length; i++){
            System.out.println(arra[i]);
      }
}
      
}