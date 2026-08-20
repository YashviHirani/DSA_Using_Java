public class mergeKSortedLists {
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }
    public ListNode mergeKLists(ListNode[] lists) {

          ListNode temp1 = null;

          for(ListNode temp2 : lists){
              temp1 = mergeTwoLL(temp1, temp2);
          }
          return temp1;

    }
    public ListNode mergeTwoLL(ListNode head1, ListNode head2){

        if(head1==null) return head2;
        if(head2==null) return head1;
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
}
