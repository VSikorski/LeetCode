/*
You are given the heads of two sorted linked lists list1 and list2.
Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
Return the head of the merged linked list.

Example 1:
Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]

Example 2:
Input: list1 = [], list2 = []
Output: []

Example 3:
Input: list1 = [], list2 = [0]
Output: [0]
*/

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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode resultListNode = null;
        ListNode headPointer = null;

        while(list1 != null || list2 != null) {
            ListNode newNode = new ListNode();
            if (list1 != null) {
                if (list2 != null) {
                    if (list1.val <= list2.val) {
                        newNode.val = list1.val;
                        list1 = list1.next;
                    } else {
                        newNode.val = list2.val;
                        list2 = list2.next;
                    }
                    if (resultListNode == null) {
                        resultListNode = new ListNode(newNode.val);
                        headPointer = resultListNode;
                    } else {
                        resultListNode.next = newNode;
                        resultListNode = resultListNode.next;
                    }
                } else {
                    newNode.val = list1.val;
                    list1 = list1.next;
                    if (resultListNode == null) {
                        resultListNode = new ListNode(newNode.val);
                        headPointer = resultListNode;
                    } else {
                        resultListNode.next = newNode;
                        resultListNode = resultListNode.next;
                    }
                }
            } else {
                 newNode.val = list2.val;
                    list2 = list2.next;
                    if (resultListNode == null) {
                        resultListNode = new ListNode(newNode.val);
                        headPointer = resultListNode;
                    } else {
                        resultListNode.next = newNode;
                        resultListNode = resultListNode.next;
                    }
            }
        }

        return headPointer;
    }
}
