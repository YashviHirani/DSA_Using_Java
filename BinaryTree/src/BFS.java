import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    static class Node{
        Node left;
        Node right;
        int val;
        Node(int val){
            this.val = val;
        }
    }
    public static void BreadthFirstSearch(Node root){

        Queue<Node> queue = new LinkedList<>();

        queue.add(root);
        Node front;
        while (queue.size()>0){
            front = queue.remove();
            System.out.println(front.val);
            if(front.left!=null) queue.add(front.left);
            if(front.right!=null) queue.add(front.right);
        }
    }

    static class Pair{
        Node node;
        int level;
        Pair(Node root,int val){
            this.node = root;
            this.level = val;
        }
    }

    public static void BFS_Pair(Node root){

        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(root,0));
        Pair front;
        int currentLevel = 0;
        while (queue.size()>0){
            front = queue.remove();
            Node node = front.node;
            int val = front.node.val;
            if(front.level!=currentLevel){
                currentLevel++;
                System.out.println();
            }
            System.out.print(val+" ");
            if(node.left!=null) queue.add(new Pair(node.left,front.level+1));
            if(node.right!=null) queue.add(new Pair(node.right,front.level+1));
        }
    }

    public static void BFS_Pair_List(Node root){

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> al1 = new ArrayList<>();
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(root,0));
        Pair front;
        int currentLevel = 0;
        while (queue.size()>0){
            front = queue.remove();
            Node node = front.node;
            int val = front.node.val;
            if(front.level!=currentLevel){
                currentLevel++;
                ans.add(al1);
                al1 = new ArrayList<>();
                System.out.println();
            }
            al1.add(val);
            if(node.left!=null) {
                queue.add(new Pair(node.left,front.level+1));
            }
            if(node.right!=null){
                queue.add(new Pair(node.right,front.level+1));
            }
        }
        ans.add(al1);
        System.out.println(ans);
    }
    public static void callKthLevelNodes(Node root){
        int size = 7;
        for(int i = 1; i<=size; i++){
            kthLevelNodes(root,1,i);
            System.out.println();
        }
    }
    public static void kthLevelNodes(Node root, int level, int k){
        if(root==null) return;
        if(level==k) System.out.print(root.val+" ");
        kthLevelNodes(root.left,level+1,k);
        kthLevelNodes(root.right,level+1,k);
    }
    public static void main(String[] args) {
        Node root = new Node(10);

        root.left = new Node(5);
        root.right = new Node(15);

        root.left.left = new Node(3);
        root.left.right = new Node(7);

        root.right.left = new Node(12);
        root.right.right = new Node(18);
        BreadthFirstSearch(root);
        BFS_Pair(root);
        BFS_Pair_List(root);
        callKthLevelNodes(root);
    }
}
