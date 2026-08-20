//import java.util.ArrayList;
//
//class Node
//{
//    int data;
//    Node left;
//    Node right;
//
//    Node(int val)
//    {
//        this.data = val;
//        left = null;
//        right = null;
//    }
//}

//class rootToLeafPaths {
//        static ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
//    public static ArrayList<ArrayList<Integer>> Paths(Node root) {
//        // code here
//        Traverse(root,new ArrayList<Integer>());
//        return ans;
//    }
//
//    public static void Traverse(Node root,ArrayList<Integer> al1){
//        if (root == null)
//            return;
//
//        // add current node
//        al1.add(root.data);
//
//        // leaf node
//        if (root.left == null && root.right == null) {
//            ans.add(new ArrayList<>(al1));
//        }
//        else {
//            Traverse(root.left, al1);
//            Traverse(root.right, al1);
//        }
//
//        // backtracking
//        al1.removeLast(); // al1.remove(al1.size() - 1);
//    }
//
//    public static void main(String[] args) {
//
//        // Creating nodes
//        Node root = new Node(1);
//
//        root.left = new Node(2);
//        root.right = new Node(3);
//
//        root.left.left = new Node(4);
//        root.left.right = new Node(5);
//
//        /*
//                1
//               / \
//              2   3
//             / \
//            4   5
//        */
//        Paths(root);
//        System.out.println(ans);
//    }
//}
