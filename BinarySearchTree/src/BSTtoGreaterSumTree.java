public class BSTtoGreaterSumTree {
    class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            left=null;
            right=null;
        }
    }
    static int sum = 0;
    public static void revInorder(Node root){
        if(root==null) return;
        revInorder(root.right);
        int val = root.data;
        root.data = sum;
        sum +=val;
        revInorder(root.left);
    }
    public static void transformTree(Node root) {
        // code here
        revInorder(root);
    }
}
