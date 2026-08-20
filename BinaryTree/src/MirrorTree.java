//class Node
//{
//    int data;
//    Node left, right;
//    Node(int item)
//    {
//        data = item;
//        left = right = null;
//    }
//}

class MirrorTree {
    void mirror(Node root) {
        // code here
        helper(root);
    }
    void helper(Node root){
        if(root==null) return;
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
        helper(root.left);
        helper(root.right);
    }
}