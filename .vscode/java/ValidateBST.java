import java.util.*;

public class ValidateBST {
     static class Node {
            int data;
            Node left;
            Node right;
            Node(int data) {
                this.data = data;
            }
        }
    
        public static Node insert(Node root, int val){
            if(root == null) {
                root = new Node(val);
                return root;
            }
            if (root.data > val) {
                root.left = insert(root.left, val);
            }else{
                root.right = insert(root.right, val);
            }
            return root;
        }
        public static void inorder(Node root) {
            if(root == null) {
                return;
            }
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }

        public static boolean isValidBST(Node root, Node min, Node max) { //at the starting both min and max are null
            if(root == null) {
                return true;
            }
    
        //Now we do comparison
        if(min != null && root.data <= min.data) {
            return false;
        }

        else if(max != null && root.data >= max.data) {
            return false;
        }
        //if our current node will satisfy our both condition then we do this we analyse for our both subtrees nodes
        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);//here for left the min is our data and max is root and for rigth subtree min value is root and max val is our current max   
    }
        public static void main(String args[]){
          int values[] = {8, 5, 3, 6, 10, 11, 14};
          Node root = null;
    
          for (int i=0; i<values.length; i++){
            root = insert(root, values[i]);
          }
    
          inorder(root);
          System.out.println();
    
          if(isValidBST(root, null, null)) {
            System.out.println("valid");
          } else {
            System.out.println("Not valid");
          }
        }
    }
    
