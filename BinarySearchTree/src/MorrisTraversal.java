import java.util.ArrayList;

class Solution {
class Node {
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
}
    public ArrayList<Integer> inOrder(Node root) {
        // code here
        ArrayList<Integer> al1 = new ArrayList();

        Node curr = root;

        while(curr!=null){
            // link
            if(curr.left!=null){
                Node pre = curr.left;
                while(pre.right!=null && pre.right!=curr)   pre = pre.right;

                if(pre.right==null){
                    pre.right = curr;
                    curr = curr.left;
                }
                else{
                    pre.right = null;
                    al1.add(curr.data);
                    curr = curr.right;
                }
            }
            else{
                // unlink
                al1.add(curr.data);
                curr = curr.right;
            }

        }
        return al1;
    }
}