//class Node {
//    public int data;
//    public Node left, right;
//
//    public Node(int val) {
//        data = val;
//        left = right = null;
//    }
//};

class PerfectBinaryTree {

    // Find depth of leftmost node
    static int findDepth(Node root) {
        int depth = 0;

        while (root != null) {
            depth++;
            root = root.left;
        }

        return depth;
    }

    static boolean isPerfect(Node root) {

        int depth = findDepth(root);
        System.out.println(depth);
        return check(root, depth, 1);
    }

    static boolean check(Node root, int depth, int level) {

        // Empty tree
        if (root == null)
            return true;

        // Leaf node
        if (root.left == null && root.right == null)
            return depth == level;

        // One child missing
        if (root.left == null || root.right == null)
            return false;

        return check(root.left, depth, level + 1) &&
                check(root.right, depth, level + 1);
    }

    public static void main(String[] args) {
        Node root = new Node(10);

        root.left = new Node(5);
        root.right = new Node(15);
//
        root.left.left = new Node(3);
        root.left.right = new Node(7);

        root.right.left = new Node(12);
        root.right.right = new Node(18);
        System.out.println(isPerfect(root));
    }
};
