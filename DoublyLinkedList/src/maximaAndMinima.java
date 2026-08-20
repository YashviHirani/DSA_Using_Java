import java.util.Arrays;
public class maximaAndMinima{
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static int[] nodesBetweenCriticalPoints(ListNode head) {
        if(head==null) return new int[]{-1,-1};
        ListNode a = head;
        ListNode b = head.next;
        if(b==null) return new int[]{-1,-1};
        ListNode c = head.next.next;
        if(c==null) return new int[]{-1,-1};
        int prev = 0;
        int curr = -1;
        int count = 1;
        int min = -1;
        int max = -1;
        int m1 = 0;

        while (c!=null){
            if((b.val<a.val && b.val<c.val) || (b.val>a.val && b.val>c.val)){ // minima & maxima

                if(curr==-1){
                    min = Integer.MAX_VALUE;
                    curr = count;
                    m1 = count;
                }
                else{
                    prev = curr;
                    curr = count;
                    min = Math.min((curr-prev),min);
                }
            }
            count++;
            a = a.next;
            b = b.next;
            c = c.next;
        }
        max = curr-m1;
        if(prev==0) return new int[]{-1,-1};
        return new int[]{min,max};
    }

    public static void main(String[] args) {

        ListNode l1 = new ListNode(5);
        ListNode l2 = new ListNode(3);
        ListNode l3 = new ListNode(1);
        ListNode l4 = new ListNode(2);
        ListNode l5 = new ListNode(5);
        ListNode l6 = new ListNode(1);
        ListNode l7 = new ListNode(2);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        l6.next = l7;
        System.out.println(Arrays.toString(nodesBetweenCriticalPoints(l1)));
    }
}
