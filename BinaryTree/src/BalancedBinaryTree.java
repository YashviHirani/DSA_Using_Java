//class Node {
//    int data;
//    Node left, right;
//
//    Node(int d)
//    {
//        data = d;
//        left = right = null;
//    }
//}
//
//
//class BalancedBinaryTree {
//    public static boolean isBalanced(Node root) {
//
//        // Empty tree
//        if (root == null)
//            return true;
//
//        int leftHeight = height(root.left);
//        int rightHeight = height(root.right);
//
//        // Check current node balance
//        if (Math.abs(leftHeight - rightHeight) > 1)
//            return false;
//
//        // Check subtrees
//        return isBalanced(root.left) &&
//                isBalanced(root.right);
//    }
//
//    public static int height(Node root) {
//
//        if (root == null)
//            return 0;
//
//        return 1 + Math.max(height(root.left),
//                height(root.right));
//    }
//
//
//    public static void main(String[] args) {
//        // 6 7 10 3 N N 7 1 N 4
//        Node root = new Node(6);
//
//        root.left = new Node(7);
//        root.right = new Node(10);
//
//        root.left.left = new Node(3);
//
//        root.right.right = new Node(7);
//
//        root.left.left.left = new Node(1);
//
//        root.left.left.left.right = new Node(4);
//
//        System.out.println(isBalanced(root));
//    }
//}