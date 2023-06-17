package org.example.lesson1.ClassWork4;

public class ListNode {
    private ListNode next;

    /*
    Given the head of a singly linked list, reverse the list, and return the reversed list.
     **/
    public ListNode reverseList(ListNode head) {
        ListNode pred = null;
        ListNode current = head;
        while(current!= null){
            ListNode temp = current.next;
            current.next=pred;
            pred = current;
            current = temp;
        }
        return pred;
    }
}
