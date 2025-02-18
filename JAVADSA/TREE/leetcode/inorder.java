package TREE.leetcode;

/**
 * inorder
 */
import java.util.*;
public class inorder {
 
 // Definition for a binary tree node.
     public class TreeNode {
         int val;
    TreeNode left;
         TreeNode right;
         TreeNode() {}
         TreeNode(int val) { this.val = val; }
         TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
             this.left = left;
         this.right = right;
         }
     }
     
class Solution {
      public List<Integer> inorderTraversal(TreeNode root) {
          List<Integer> ll= new ArrayList<>();
  
          inorder(root, ll);
          return ll;        
      }
  
      private void inorder(TreeNode node, List<Integer> ll) {
          if (node == null) {
              return;
          }
          inorder(node.left, ll);
          ll.add(node.val);
          inorder(node.right, ll);
      }    
  }
  public static void main(String[] args) {
      
  }
}
