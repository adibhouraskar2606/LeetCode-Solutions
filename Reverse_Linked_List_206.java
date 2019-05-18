class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode l2 = null;
        if(head == null){
            return null;
        }
        ListNode temp = null;
        while (head!=null){
            temp = new ListNode(head.val);
            temp.next = l2;
            l2 = temp;
            head = head.next;
        }
        return temp;
    }
}