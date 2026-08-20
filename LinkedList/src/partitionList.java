class partitionList {

  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode partition(ListNode head, int x) {
        ListNode less = null;
        ListNode greater = null;
        ListNode temp = head;
        ListNode ans1 = null;
        ListNode ans2 = null;

        while(temp!=null){
            if(temp.val<x){
                if(less==null){
                    less = temp;
                    ans1 = less;
                }
                else{
                    less.next = new ListNode(temp.val);
                    less = less.next;
                }
            }
            else{
                if(greater==null){
                    greater = temp;
                    ans2 = greater;
                }
                else{
                    greater.next = new ListNode(temp.val);
                    greater = greater.next;
                }
            }
            temp = temp.next;
        }
        if (greater != null) {
            greater.next = null;
        }
        if (less != null) {
            less.next = ans2;
        }
        else return ans2;
        return ans1;
    }
}