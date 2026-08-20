//import java.util.ArrayList;
//
//public class FlattenABT {
//    static ArrayList<Integer> al1 = new ArrayList<>();
//
//    public static void flatten(Node root) {
//        // code here
//        flattenBT(root);
//        for(int i = 0; i<al1.size()-1; i++){
//            Node curr = new Node(al1.get(i));
//            Node next = new Node(al1.get(i+1));
//            curr.right = next;
//            curr.left = null;
//        }
//        Node last = new Node(al1.get(al1.size() - 1));
//
//        last.left = null;
//        last.right = null;
//    }
//    public static void flattenBT(Node root) {
//        // code here
//        if(root==null) return;
//        al1.add(root.data);
//        flatten(root.left);
//        flatten(root.right);
//    }
//}
