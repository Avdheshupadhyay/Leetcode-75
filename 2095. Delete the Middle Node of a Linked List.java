class Solution {
    public ListNode deleteMiddle(ListNode head) {
        ListNode temp=head;
        ListNode slow=head;
        ListNode fast=head;
        if(head.next==null)
        {
            return null;
        }
        while(fast.next.next!=null && fast.next.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        slow.next=slow.next.next;
        return temp;

        
    }
}