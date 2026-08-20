public class MinDisBet2NodesOfBT {
    class Node {
        int data;
        Node left;
        Node right;

        Node(int val) {
            this.data = val;
            left = right = null;
        }
    }
    int a1;
    int b1;
    public int findDist(Node root, int a, int b) {
        // code here
        return a+b;
    }
    public void findLevel(Node root,int a, int b, int level){
        if(root==null) return;
        if(root.data==a) a1 = level;
        if(root.data==b) b1 = level;
        findLevel(root.left,a,b,level+1);
        findLevel(root.right,a,b,level+1);
    }
}
