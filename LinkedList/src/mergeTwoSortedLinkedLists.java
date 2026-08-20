public class mergeTwoSortedLinkedLists {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    // TC - O(m+n)  SC - O(1)
    public static ListNode mergeTwoLL(ListNode head1, ListNode head2){
        // 10 --> 30 --> 40 --> 60
        //               t       i
        // 20 --> 50 --> 70 --> 80 --> 90
        //        t      j
        ListNode temp;
        ListNode i = head1;
        ListNode j = head2;

        if(head1.val >head2.val){
            temp = head2;
            j = j.next;
        }
        else{
            temp = head1;
            i = i.next;
        }
        ListNode ans = temp;

        while(i!=null && j!=null){
            if(i.val <j.val){
                temp.next = i;
                temp = temp.next;
                i = i.next;
            }
            else{
                temp.next = j;
                temp = temp.next;
                j = j.next;
            }
        }
        if(j!=null) temp.next = j;
        if(i!=null) temp.next = i;
        return ans;
    }

    public static void main(String[] args) {

    }
}
