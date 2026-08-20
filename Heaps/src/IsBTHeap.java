import java.util.ArrayList;
import java.util.Collections;

public class IsBTHeap {
    static class Node {
        int data;
        Node left,right;
        Node(int d){
            data=d;
            left=right=null;
        }
    }
    static ArrayList<Integer> al1 = new ArrayList<>();
    public static boolean isHeap(Node tree) {
        isHeapSizeCheck(tree,1);
        Collections.sort(al1);
        boolean check = al1.size()==al1.getLast();
        return check && isHeapCompare(tree);
    }
    public static boolean isHeapCompare(Node tree){
        if(tree.left==null && tree.right==null) return true;
        if (tree.left!=null && tree.right!=null && tree.data > tree.left.data && tree.data > tree.right.data) {
            return isHeapCompare(tree.left) && isHeapCompare(tree.right);
        } else if(tree.left!=null && tree.right==null && tree.data>tree.left.data){
            return isHeapCompare(tree.left);
        }
        else return false;
    }
    public static void isHeapSizeCheck(Node tree,int num) {
        if(tree==null) return;
        al1.add(num);
        isHeapSizeCheck(tree.left,num*2);
        isHeapSizeCheck(tree.right,num*2+1);
    }

    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(2);
        System.out.println(isHeap(root));
    }
}
