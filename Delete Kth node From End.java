//my code
import java.util.* ;
import java.io.*; 
/****************************************************************
	
	Following is the structure of the Singly Linked List.
	
	class LinkedListNode<T> {
    	T data;
    	LinkedListNode<T> next;

    	public LinkedListNode(T data) {
        	this.data = data;
    	}
	}

****************************************************************/

public class Solution {
	public static LinkedListNode<Integer> removeKthNode(LinkedListNode<Integer> head, int K) {
		// Write your code here.
         if (head == null || K == 0) {
            return head;
        }

        // It stores the Length of Linked List.
        int L = 0;

        // Creating temporory node.
        LinkedListNode<Integer> temp = head;

        while (temp != null) {
            L++;
            temp = temp.next;
        }

        // If head of Linked List is the Kth node from end.
        if (K == L) {
            
            LinkedListNode<Integer> next = head.next;
            head.next = null;
            head = next;
        } else {

            int countNode = 0;
            temp = head;
            while (temp != null) {

                countNode++;

                // Remove the Kth node from end of Linked List.
                if (L - K == countNode) {
                    temp.next = temp.next.next;
                    break;
                }
                temp = temp.next;
            }
        }
        return head;
	}
}
