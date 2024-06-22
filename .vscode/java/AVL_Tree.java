import java.util.*;
public class AVL_Tree {
    static class Node {
        int data, height;//we use height here so that each node can store its height so that usaa pata raha ki uss ki height kya ha
        Node left, right;

        Node(int data) {
            this.data = data;
            height = 1;
        }
    }

    public static Node root;

    public static int height(Node root) {//this height function will return height for any node
        if (root == null)
        return 0;

        return root.height;
    }

    static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    //Right rotate subtree rooted with Y
    public static Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        // Perform rotation
        x.right = y;
        y.left = T2;

        //Update heights
        y.height = max(height(y.left), height(y.right)) + 1;
        x.height = max(height(x.left), height(x.right)) + 1;

        //Return new root
        return x;
    }

     //Left rotate subtree rooted with x
     public static Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 =  y.left;

        // Perform rotation
        y.left = x;
        x.right = T2;

        //Update heights
        x.height = max(height(x.left), height(x.right)) + 1;
        y.height = max(height(y.left), height(y.right)) + 1;

        //Return new root
        return y;
     }   

    //Get Balance factor of node
    public static int getBalance(Node root) {
        if (root == null)
           return 0;

        return height(root.left) - height(root.right);
    }

    public static Node insert(Node root, int key) {
        if (root == null)
           return new Node(key);

        if (key < root.data)
           root.left = insert(root.left, key);
        else if (key > root.data)
           root.right = insert(root.right, key);
        else
            return root;//Duplicate keys not alloe=werd

        //Update root height
        root.height = 1 + Math.max(height(root.left), height(root.right));

        //Get root's balance factor
        int bf = getBalance(root);

        //left left case
        if (bf > 1  && key < root.left.data)
           return rightRotate(root);

        //Right Right case
        if (bf < -1  && key > root.right.data)
           return leftRotate(root);

        //Left Right Case
        if(bf > 1 && key > root.left.data) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        //Right left Case;
        if(bf < -1 && key < root.right.data) {
            root.right = rightRotate(root.right);
            return leftRotate(root); 
    }

    return root;//returned if AVL balanced

}
public static void preorder(Node root) {//this preorder function we use it in last when we create our BST then we print it in preorder form
    if(root == null) {
        return;
    }

    System.out.print(root.data+" ");
    preorder(root.left);
    preorder(root.right);
}

    public static void main(String[] args) {
        root = insert(root, 10);
        root = insert(root, 20);
        root = insert(root, 30);
        root = insert(root, 40);
        root = insert(root, 50);
        root = insert(root, 25);

        /*
                 AVL Tree

                    30
                   /  \
                  20   40
                 /  \    \
                10   25   50    
         */
        preorder(root);
    }
}
