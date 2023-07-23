class Solution:
    def swapPairs(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not(head and head.next): return head 

        nHead = head.next
        head.next, nHead.next = self.swapPairs(head.next.next), head

        return nHead
