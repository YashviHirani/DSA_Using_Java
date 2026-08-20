///*
//class Node{
//    int data;
//    Node left;
//    Node right;
//    Node(int data){
//        this.data = data;
//        left=null;
//        right=null;
//    }
//}
//*/
//
//class isSymmetric {
//    public boolean isSymmetric(Node root) {
//        // code here
//        return isIdentical(root.left, root.right);
//    }
//    public boolean isIdentical(Node r1, Node r2) {
//        // code here
//        return compare(r1,r2);
//    }
//    public boolean compare(Node r1, Node r2){
//        if(r1==null && r2==null) return true;
//        if (r1 != null && r2!=null && r1.data == r2.data) {
//            return compare(r1.left, r2.right) & compare(r1.right, r2.left);
//        }
//        else return false;
//    }
//}