class delNode {
    class Node {
        public int data;
        public Node left;
        public Node right;

        public Node(int val) {
            data = val;
            left = right = null;
        }
    };
    public Node delNode(Node root, int x) {
        // code here
        if(root==null) return null;
        if(root.data>x){
            root.left = delNode(root.left,x);
        }
        else if(root.data<x){
            root.right = delNode(root.right,x);
        }
        else{
            if(root.left==null) return root.right;
            else if(root.right==null) return root.left;
            Node pre = root.left;
            while(pre.right!=null) pre = pre.right;
            root.left = delNode(root.left,pre.data);
            pre.right = root.right;
            pre.left = root.left;
            return pre;
        }
        return root;
    }
}