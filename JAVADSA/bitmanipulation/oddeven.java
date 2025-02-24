package Bitmanipulation;

public class oddeven {
    static void oddeven(int n){
        int bitmask=1;
        if ((n&bitmask)==0) {
            System.out.println("even number = "+n);
        }else{
            System.out.println("odd number = "+n);
        }
    }

/// to get int bit 
 static int getint(int n , int i){
    int bitmask =1<<i;
    if ((n&bitmask)==0) {
        return 0;
    }else{
        return 1;
    }
 }

 /// set bit 
static int setbit(int n,int i){
    int bitmask =1<<i;
   return n| bitmask;
  }  
  /// clear ithbit 
 public static int clearithbit(int n, int i){
    int bitmask =~(1<<i);
    return n&bitmask;
  }
  static int updatesbit(int n ,int i,int newBit){
    // if (newBit ==0) {
    //     return clearithbit(n,i);
    // }else{
    //     return setbit(n,i);
    // }
    n = clearithbit(n, i);
    int bitmask =newBit << i;
    return n | bitmask;
  }

  static int clearlastbit(int n ,int i){
    int bitmask =(~0)<<i;
    return n & bitmask;
  }

  static int clearbitrange(int n,int i, int j){
    int a =((~0)<<(j+1));
    int b=(1<<i)-1;
    int bitmask =a | b;
    return n & bitmask;
    
  }

    public static void main(String[] args) {
        // oddeven(3);
        // oddeven(9);
        // oddeven(16);
        // System.out.println("to bit = "+getint(10, 2));
        System.out.println("to setbit = "+setbit(10, 2));
        System.out.println("to clearbit = "+clearithbit(10, 1));
        System.out.println("to updatebit = "+updatesbit(10,2,1));
        System.out.println("Clearlastbit ith = "+clearlastbit(15, 2));
        System.out.println("clear bit manipulation = "+clearbitrange(10, 2, 4));
    }
    
}
