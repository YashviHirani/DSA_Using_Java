//class Node {
//    int data;
//    Node left;
//    Node right;
//
//    Node(int val) {
//        data = val;
//        left = right = null;
//    }
//};

class FullBinaryTree {
    public static boolean isFullTree(Node root) {
        // code here
        return helper(root);
    }
    public static boolean helper(Node root){
        if(root.left==null && root.right==null) return true;
        if(root.left==null || root.right==null) return false;
        return helper(root.left) && helper(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(10);

        root.left = new Node(5);
        root.right = new Node(15);

        root.left.left = new Node(3);
        root.left.right = new Node(7);

        root.right.left = new Node(12);
        root.right.right = new Node(18);
        System.out.println(isFullTree(root));
    }
};
