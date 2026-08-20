

class LCA {
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        this.data = val;
        left = right = null;
    }
}
    Node lca(Node root, int n1, int n2) {
        // code here
        if(root==null) return null;
        if(root.data==n1||root.data==n2) return root;
        if(exists(root.left,n1) && exists(root.right,n2)) return root;
        else if(exists(root.left,n2) && exists(root.right,n1)) return root;
        else if(exists(root.left,n1) && exists(root.left,n2)) return lca(root.left,n1,n2);
        else return lca(root.right,n1,n2);
    }
    boolean exists(Node root,int n1){
        if(root==null) return false;
        if(root.data==n1) return true;
        return exists(root.left,n1) || exists(root.right,n1);
    }
}