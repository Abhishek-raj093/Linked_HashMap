public class MirrorBST {
    static class Node {
        int data;
        Node left;
        Node right;
        
        //Now we create a constructor
        public Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static Node createdMirror(Node root) {//O(n) because in this we are going on each node recursively
        if(root == null) {
            return null;
        }

        Node leftMirror = createdMirror(root.left);
        Node rightMirror = createdMirror(root.right);

        root.left = rightMirror;
        root.right = leftMirror;
        return root;
    }
    
    //we create a preorder to tally that our answer is correct or not because after creating a mirror image of our node the final answer we get it will be its root but we want to print each node so we print print order after that we tally it to check the answer which we got is correct or not
    public static void preorder(Node root) {
        if(root == null) {
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String args[]) {
        /*
                  8
                 / \
                5   10
               / \    \
              3   6    11 
         */
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(11);

        /* 
                8
               / \
              10  5
             /   / \
            11  6   3
            Mirror BST
         */

         root = createdMirror(root);
         preorder(root);
    }
    
}
