class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        if(k<=1) return head;
        ListNode node=new ListNode(0);
        node.next=head;
        ListNode p1=head.next.next;
        ListNode p2=node;
        ListNode p3=node;
        int nodeCount=2;
        for(;p1!=null;p1=p1.next,nodeCount++);
        p1=node;
        while(k<=nodeCount){
            p2=p1.next;
            p3=p2.next;
            for(int i=1;i<k;i++){
                p2.next=p3.next;
                p3.next=p1.next;
                p1.next=p3;
                p3=p2.next;
            }
            p1=p2;
            nodeCount=nodeCount-k;
        }
        return node.next;
    }
}
