package assignment;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class MergeAndSort {

    public static ListNode merge(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        if (l1 != null) {
            current.next = l1;
        }

        if (l2 != null) {
            current.next = l2;
        }

        return dummy.next;
    }

    public static ListNode mergeAndSort(ListNode l1, ListNode l2) {
        ListNode mergedList = merge(l1, l2);
        return sortLL(mergedList);
    }

    public static ListNode sortLL(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode middle = findMiddle(head);

        ListNode left = head;
        ListNode right = middle.next;
        middle.next = null;
        left = sortLL(left);
        right = sortLL(right);
        return merge(left, right);
    }

    private static ListNode findMiddle(ListNode head) {
        ListNode f = head;
        ListNode l = head;

        while (l != null && l.next != null && l.next.next != null) {
            f = f.next;
            l = l.next.next;
        }

        return f;
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
        ListNode l1 = new ListNode(25);
        l1.next = new ListNode(35);
        l1.next.next = new ListNode(12);
        l1.next.next.next = new ListNode(4);
        l1.next.next.next.next = new ListNode(36);
        l1.next.next.next.next.next = new ListNode(48);

        ListNode l2 = new ListNode(8);
        l2.next = new ListNode(32);
        l2.next.next = new ListNode(22);
        l2.next.next.next = new ListNode(45);
        l2.next.next.next.next = new ListNode(63);
        l2.next.next.next.next.next = new ListNode(49);

        System.out.println("Linked_List 1:");
        printLinkedList(l1);

        System.out.println("Linked_List 2:");
        printLinkedList(l2);
        ListNode mergedAndSorted = mergeAndSort(l1, l2);
        System.out.println("MergeandSort Linked_List:");
        printLinkedList(mergedAndSorted);
    }
}

