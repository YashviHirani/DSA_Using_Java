///*
//class Node{
//    int data;
//    Node left, right;
//    Node(int d){
//        data=d;
//        left=right=null;
//    }
//}
//*/
//
//class IdenticalTrees {
//    public boolean isIdentical(Node r1, Node r2) {
//        // code here
//        return compare(r1,r2);
//    }
//    public boolean compare(Node r1, Node r2){
//        if(r1==null && r2==null) return true;
//        if (r1 != null && r2!=null && r1.data == r2.data) {
//            return compare(r1.left, r2.left) & compare(r1.right, r2.right);
//        }
//        else return false;
//    }
//}