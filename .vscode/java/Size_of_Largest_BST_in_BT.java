public class Size_of_Largest_BST_in_BT {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    static class Info {//here we calculate the information of each node
        boolean isBST;
        int size;
        int min;
        int max;

        public Info(boolean isBST, int size, int min, int max) {
            this.isBST = isBST;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }

    public static int maxBST = 0;//here we inalisilize it with zero which means there is not any BST present right Now, it will track the largest size

    public static Info largestBST(Node root) {//in this each node will return its information here the root node is the node of our binary tree
        if(root == null) {
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }
        Info leftInfo = largestBST(root.left);
        Info rightInfo = largestBST(root.right);
        int size = leftInfo.size + rightInfo.size + 1;
        int min = Math.min(root.data, Math.min(leftInfo.min, rightInfo.min));
        int max = Math.max(root.data, Math.max(leftInfo.max, rightInfo.max));

        if(root.data <= leftInfo.max || root.data >= rightInfo.min) {//this is our flase condition and if this condition is true then it means our root node is making a valid tree and after that we check that the our left subtree and right subtree is making a valid BST or Not
            return new Info(false, size, min, max);
        }
        if(leftInfo.isBST && rightInfo.isBST) {//here we check that the our left subterr and right sub tree is making a valid BST or Not
          maxBST = Math.max(maxBST, size);//here we update our maxBST 
          return new Info(true, size, min, max);
        }

        return new Info(false, size, min, max);//when the above condition will be false then we return this
    }

    public static void main(String args[]) {
        /*
                        50
                      /    \
                    30      60
                   /  \    /  \
                  5   20  45   70
                              /  \
                             65   80
                    given BT  
         */
        Node root = new Node(50);
        root.left = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(20);

        root.right = new Node(60);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);

        /*
                      60
                    /    \
                   45     70
                         /  \
                        65   80
                expected BST :size = 5   
         */
 
         Info info = largestBST(root);
         System.out.println("largest BST size = " +maxBST);
    }

}
