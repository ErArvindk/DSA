package TREE;
import java.util.*;

import Linklist.recursivesearch;

/**
 * Basictree
 */
public class Basictree {

     static class Node{
            int data;
            Node left;
            Node right;

            Node(int data){
                  this.data=data;
                  this.left=null;
                  this.right=right;
            }
      }
      static class Binarytree{
            static int idx = -1;
      public static Node buildtree(int nodes []){
            idx++;
            if (nodes[idx]==-1) {
                  return null;
            }
            Node newnode =new Node(nodes[idx]);
            newnode.left=buildtree(nodes);
            newnode.right=buildtree(nodes);

            return newnode;

      }
////// to traverse preorder .
      public static void preordertra(Node root){
            // 1.root
            // lefttree
            // righttree
            if (root==null) {
                  return ;
                  
            }
            System.out.print(root.data+" ");
            preordertra(root.left);
            preordertra(root.right);
      }
      ///// to traverse inorder ....
      public static void inordertra(Node root){
            // lefttree
            //root
            // righttree
            if (root==null) {
                  return ;
                  
            }
            
            inordertra(root.left);
            System.out.print(root.data+" ");
            inordertra(root.right);
      }
      //// to traverse post order .....
      public static void postordertra(Node root){
            // lefttree
            // righttree
            //root
            if (root==null) {
                  return ;
            }
            postordertra(root.left);
            postordertra(root.right);
            System.out.print(root.data+" ");

      }

      /////level order traverse.........//////
      public static void levelOrder(Node root) {
            if (root == null) {
                return;
            }
        
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
        
            while (!q.isEmpty()) {
                Node currentNode = q.remove();
        
                if (currentNode == null) {
                    System.out.println(); 
                    if (q.isEmpty()) {
                        break; 
                    } else {
                        q.add(null); 
                    }
                } else {
                    System.out.print(currentNode.data + " "); 
        
                    if (currentNode.left != null) {
                        q.add(currentNode.left); 
                    }
        
                    if (currentNode.right != null) {
                        q.add(currentNode.right); 
                    }
                }
                } 
            }

            ///// height of tree 
            public static int heights(Node root){
                  if (root == null) {
                       return -1;
                        
                  }
                  int ll=heights(root.left);
                  int rr=heights(root.right);
                  return Math.max(ll, rr)+1;           
            }

            //// count of nodes 
            public static int count(Node root){
                  if (root==null) {
                        return 0;
                  }
               int lcount= count(root.left);
               int rcount =count(root.right);
               int Treecount =(lcount+rcount)+1 ;
               return Treecount;
                  

            }


            //// sum all of nodes 

            public static int sums(Node root){
                  if (root==null) {
                        return 0;
                        
                  }
                  int lsums=sums(root.left);
                  int rsums=sums(root.right);
                  int sum =(lsums+rsums+root.data);
                  return sum;
            }
        }
        

      public static void main(String[] args) {
         int nodes [] ={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
         Binarytree tree =new Binarytree();
         Node root =tree.buildtree(nodes);
      //    System.out.println(root.data);
      //    tree.preordertra(root);
      //    System.out.println();
      //    tree.inordertra(root);
      //    System.out.println();
      //    tree.postordertra(root);
            // tree.levelOrder(root);
            // int s =tree.heights(root);
            // System.out.println("heights of your tree = "+s);
            // System.out.println( "the count of node = "+tree.count(root));
            System.out.println( "the total sum  of node = "+tree.sums(root));
      }
}
   
