import java.util.ArrayList;
import java.util.Stack;

class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
class Solution {
    ArrayList<Integer> al1 = new ArrayList<>();
    ArrayList<Integer> boundaryTraversal(Node root) {
        // code here
        if(root==null) return al1;

        al1.add(root.data);
        Node temp = root.left;

        while(temp!=null){
            if(temp.left!=null && temp.right!=null)  al1.add(temp.data);
            if(temp.left!=null) temp = temp.left;
            else temp = temp.right;
        }

        temp = root;
        leafNodes(temp.left);
        leafNodes(temp.right);
        temp = root.right;
        Stack<Integer> st1 = new Stack<>();

        while(temp!=null){
            if(temp.left!=null && temp.right!=null){
                st1.push(temp.data);
            }
            if(temp.right!=null) temp = temp.right;
            else temp = temp.left;
        }
        while (!st1.isEmpty()){
            al1.add(st1.pop());
        }
        return al1;
    }
    public void leafNodes(Node root){
        if(root==null) return;
        if(root.left==null && root.right==null){
            al1.add(root.data);
        }
        leafNodes(root.left);
        leafNodes(root.right);
    }
    public static void main(String[] args) {

//        /*
//                    1
//                  /   \
//                 2     3
//                / \   / \
//               4   5 6   7
//                  / \
//                 8   9
//        */
//
//        Node root = new Node(1);
//
//        root.left = new Node(2);
//        root.right = new Node(3);
//
//        root.left.left = new Node(4);
//        root.left.right = new Node(5);
//
//        root.right.left = new Node(6);
//        root.right.right = new Node(7);
//
//        root.left.right.left = new Node(8);
//        root.left.right.right = new Node(9);
//             /*
//                1
//               / \
//              2   3
//                 /
//                4
//               /
//              5
//        */
//
//        Node root = new Node(1);
//
//        root.left = new Node(2);
//        root.right = new Node(3);
//
//        root.right.left = new Node(4);
//
//        root.right.left.left = new Node(5);

                /*
                1
                 \
                  2
                 / \
                3   4
        */

        Node root = new Node(1);

        root.right = new Node(2);

        root.right.left = new Node(3);
        root.right.right = new Node(4);

        Solution s1 = new Solution();
        System.out.println(s1.boundaryTraversal(root));
    }
}