package assignment;


class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class RemoveDuplicateLL {

    public static ListNode removeDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode current = head;

        while (current != null) {
            ListNode r = current;
            while (r.next != null) {
                if (r.next.val == current.val) {
                	r.next = r.next.next;
                } else {
                    r = r.next;
                }
            }
            current = current.next;
        }

        return head;
    }

    public static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + "->");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(2);
        head.next = new ListNode(5);
        head.next.next = new ListNode(12);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(3);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(1);
        head.next.next.next.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next.next.next.next = new ListNode(5);

        System.out.println("Linked-List with duplicates:");
        printLinkedList(head);

        head = removeDuplicates(head);

        System.out.println("Linked-List without duplicates:");
        printLinkedList(head);
    }
}
