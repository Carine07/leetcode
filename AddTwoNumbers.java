// Runtime: 2 ms, faster than 67.40% of Java online submissions for Add Two Numbers.
// Memory Usage: 43.3 MB, less than 88.40% of Java online submissions for Add Two Numbers.

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head, l3, l4;
        int v1, v2, v3, r;
        
        head = l3 = l4 = null;
        v1 = v2 = v3 = r = 0;
        
        do {
            if (l1 != null) {
                v1 = l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                v2 = l2.val;
                l2 = l2.next;
            }
            v3 = v1+v2+r;
            l4 = new ListNode(v3%10); // reste de la division
            r = v3/10; // la retenue
            if (l3 != null) {
                l3.next = l4;
                l3 = l4;
            }
            if (head == null) {
                head = l4;
                l3 = l4;
            }
            v1 = v2 = v3 = 0;
        } while (l1 != null || l2 != null);
        if (r != 0) // il y a une retenue
            l3.next = new ListNode(r);
        return head;
    }
}
