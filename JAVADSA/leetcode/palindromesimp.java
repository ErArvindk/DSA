class palindromesmp{
      public static boolean  cheak(int x){
            if (x==0) {
                  return false;
                  
            }
            int reverse=0;
            int copy=x;
            while(x>0){
                  reverse =(reverse*10)+(reverse % 10);
                  x/=10;
            }
            return reverse==copy;
      }
      public static void main(String[] args) {
            int x=121;
            System.out.println(cheak(x));
            
      }
}