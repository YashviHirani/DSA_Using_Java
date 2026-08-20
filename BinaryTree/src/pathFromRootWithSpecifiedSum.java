//import java.util.ArrayList;
//class Node {
//    int key;
//    Node left, right;
//
//    Node(int x) {
//        left = right = null;
//        key = x;
//    }
//}
//public class pathFromRootWithSpecifiedSum {
//
//    static ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
//    public static ArrayList<ArrayList<Integer>> printPaths(Node root, int sum) {
//        // code here
//        Traverse(root,new ArrayList<>(),0,sum);
//        return ans;
//    }
//
//    public static void Traverse(Node root,ArrayList<Integer> al1,int currentSum,int target) {
//        if (root == null)
//            return;
//
//        // add current node
//        al1.add(root.key);
//        currentSum += root.key;
//        if(currentSum==target) {
//            ArrayList<Integer> al2 = new ArrayList<>(al1);
//            ans.add(al2);
//        }
//
//        // leaf node
//        if (root.left == null && root.right == null) {
//            currentSum-= root.key;
//            al1.removeLast();
//            return;
//        } else {
//            Traverse(root.left, al1,currentSum,target);
//            Traverse(root.right, al1,currentSum,target);
//        }
//
//        // backtracking
//        currentSum-= root.key;
//        al1.removeLast(); // al1.remove(al1.size() - 1);
//    }
//    public static void main(String[] args) {
//
//        /*
//                  3
//                 /
//                3
//               / \
//             -7   -3
//               \   /
//               -8 2
//                   / \
//                 -1  -9
//        */
//
//        Node root = new Node(3);
//
//        root.left = new Node(3);
//
//        root.left.left = new Node(-7);
//        root.left.right = new Node(-3);
//
//        root.left.left.right = new Node(-8);
//
//        root.left.right.left = new Node(2);
//
//        root.left.right.left.left = new Node(-1);
//        root.left.right.left.right = new Node(-9);
//
//        System.out.println(printPaths(root,3));
//    }
//}
