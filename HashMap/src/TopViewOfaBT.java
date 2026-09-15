import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class TopViewOfaBT {
    class Node {
        int data;
        Node left, right;

        Node(int val) {
            this.data = val;
            this.left = null;
            this.right = null;
        }
    }
    class Pair{
        Node node;
        int dis;
        Pair(Node node,int dis){
            this.node = node;
            this.dis = dis;
        }
    }
    public ArrayList<Integer> topView(Node root) {

        Queue<Pair> q = new LinkedList<>();
        ArrayList<Integer> al1 = new ArrayList<>();
        HashMap<Integer,Integer> hm1 = new HashMap<>();

        q.add(new Pair(root,0));
        int minDist = Integer.MAX_VALUE, maxDist = Integer.MIN_VALUE;

        while(q.size()>0){
            Pair front = q.remove();
            Node node = front.node;
            int dist = front.dis;

            minDist = Math.min(dist,minDist);
            maxDist = Math.max(dist,maxDist);
            if(!hm1.containsKey(dist)) hm1.put(dist,node.data); // add only for the first time --> don't replicate
            if(node.left!=null) q.add(new Pair(node.left,dist-1));
            if(node.right!=null) q.add(new Pair(node.right,dist+1));
        }
        for(int i = minDist; i<=maxDist; i++){
            al1.add(hm1.get(i));
        }
        return al1;
    }
}
