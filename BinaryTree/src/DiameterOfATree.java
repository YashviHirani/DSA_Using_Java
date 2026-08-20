

class DiameterOfATree {
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = right = null;
    }
}
int max;
    public int diameter(Node root) {
        // code here
        levels(root);
        System.out.println(max);
        return max;
    }
    public int levels(Node root){
        if(root==null) return 0;

        int left = levels(root.left);
        int right = levels(root.right);
        max = Math.max(max,(left+right));
        return 1+Math.max(left,right);
    }
}
