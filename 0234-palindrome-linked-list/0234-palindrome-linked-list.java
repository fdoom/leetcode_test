/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode node = head;
        Deque<Integer> d = new ArrayDeque<>();
        while(head != null) {
            d.addFirst(head.val);
            head = head.next;
        }

        while(node != null) {
            if(node.val != d.removeFirst())
                return false;
            node = node.next;
        }
        return true;
    }
}