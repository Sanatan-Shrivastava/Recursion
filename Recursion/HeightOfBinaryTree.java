package Recursion;
class HeightOfBinaryTree {
    class Node {
        Node left;
        Node right;
        int data;
    
        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }
    /*
    class Node 
        int data;
        Node left;
        Node right;
    */

    /*.  *** HYPOTHESIS ***
        height(root) --> returns the height of the tree
        height(root.left) --> returns the height of the left childs of the tree.
        height(root.right) --> returns the height of the right childs of the tree.
        *** INDUCTION ***
        return 1 + max(left, right);

        *** BASE CONDITION ***
        smallest condition - null => return 0;
    */
    public static int height(Node root) {
        if(root == null){
            return -1;
        }

        int left = height(root.left);
        int right = height(root.right);

        return 1 + Math.max(left, right);
    }
}