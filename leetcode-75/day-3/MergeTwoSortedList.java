/**
 * link - https://leetcode.com/problems/merge-two-sorted-lists/
 * Merge Two Sorted Lists
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class MergeTwoSortedList {
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
     * You are given the heads of two sorted linked lists list1 and list2.
     * 
     * Merge the two lists in a one sorted list. The list should be made by splicing
     * together the nodes of the first two lists.
     * 
     * Return the head of the merged linked list.
     * 
     * @param list1
     * @param list2
     * @return
     */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode(-1000);
        ListNode head = result;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                result.next = list1;
                list1 = list1.next;
                result = result.next;
            } else {
                result.next = list2;
                list2 = list2.next;
                result = result.next;

            }
        }
        while (list1 != null) {
            result.next = list1;
            list1 = list1.next;
            result = result.next;
        }
        while (list2 != null) {
            result.next = list2;
            list2 = list2.next;
            result = result.next;
        }
        return head.next;
    }

    public void Test() {
        ListNode node1 = new ListNode(-9);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        node1.next = node2;
        // node2.next = node3;

        Print(node1);
        ListNode node10 = new ListNode(5);
        ListNode node21 = new ListNode(7);
        ListNode node32 = new ListNode(4);
        node10.next = node21;
        // node21.next = node32;
        Print(node10);
        ListNode temp = mergeTwoLists(node1, node10);
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
        MergeTwoSortedList mergeTwoSortedList = new MergeTwoSortedList();
        mergeTwoSortedList.Test();

    }
}