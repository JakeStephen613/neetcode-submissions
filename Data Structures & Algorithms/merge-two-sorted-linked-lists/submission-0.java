class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0); 
        ListNode curr = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                curr.next = list1;
                list1 = list1.next;       // advance list1
            } else {
                curr.next = list2;
                list2 = list2.next;       // advance list2
            }
            curr = curr.next;             // advance our result pointer
        }

        // At least one list is exhausted — attach the remainder
        if (list1 != null) {
            curr.next = list1;
        } else {
            curr.next = list2;
        }
        return dummy.next; // skip the placeholder
    }
}