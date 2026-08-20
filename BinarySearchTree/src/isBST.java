import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}

class isBST {
    public boolean isBST(Node root) {
        // code here
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int max = 0;
        int min = 0;
        if(root.left!=null) {
            findLeaves(root.left, pq);
            max = pq.poll();
        }
        if(root.right!=null) {
            pq = new PriorityQueue<>();
            findLeaves(root.right, pq);
            min = pq.poll();
        }
        return root.data > max && root.data < min;
    }
    public void findLeaves(Node root, PriorityQueue<Integer> pq){
        if(root==null) return;
        if(root.left==null && root.right==null) pq.add(root.data);
        findLeaves(root.left,pq);
        findLeaves(root.right,pq);
    }
}