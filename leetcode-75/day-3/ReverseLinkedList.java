/**
 * link - https://leetcode.com/problems/reverse-linked-list/
 * Reverse Linked List
 */
class ReverseLinkedList {
    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    /**
     * Given the head of a singly linked list, reverse the list, and return the
     * reversed list.
     * 
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        ListNode prev = null, current = head;
        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public void Test() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        Print(node1);
        ListNode temp = reverseList(node1);
        Print(temp);
    }

    public void Print(ListNode node) {
        System.out.print("content of nodes: ");
        while (node != null) {
            System.out.print(node.val + "  ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        reverseLinkedList.Test();

    }
}