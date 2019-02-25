class Solution {
    public ListNode middleNode(ListNode head) {
        int count = 0;
        if(head == null){
            return null;
        }
        ListNode listNode = head;
        while(listNode!=null){
            listNode = listNode.next;
            count++;
        }
        int n;
        if(count % 2 != 0) {
             n = (count + 1) / 2;
        }else {
             n = (count + 2) / 2;
        }
        count = 1;
        while(head!=null){
            if(count != n){
                head = head.next;
                count++;
            }else{
                return head;
            }

        }
        System.out.println(count);
        return null;
    }
}