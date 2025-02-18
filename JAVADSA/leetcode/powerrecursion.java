package leetcode;
/*
 * Q -  Given an integer n, return true if it is a power of    two. Otherwise, return false.

An integer n is a power of two, if there exists an integer x such that n == 2x.
 */
public class powerrecursion {
            public boolean isPowerOfTwo(int n) {
               
                return n > 0 && (n & (n - 1)) == 0;
            }
        
            public static void main(String[] args) {
               powerrecursion solution = new powerrecursion();
                
                int n1 = 16; 
                int n2 = 18; 
                
                System.out.println(n1 + " is a power of two: " + solution.isPowerOfTwo(n1));
                System.out.println(n2 + " is a power of two: " + solution.isPowerOfTwo(n2)); // Output: false
            }
        }
        