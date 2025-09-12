package LinkedList.Easy;

import java.util.LinkedList;
import java.util.List;

public class Prog1_206_ReverseLinkedList {
    public static void main(String[] args) {
//        List<Integer> list = new LinkedList<>();
//        list.add(1);list.add(2);list.add(3);list.add(4);list.add(5);
//
//        System.out.println(list.reversed());

    }
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}
