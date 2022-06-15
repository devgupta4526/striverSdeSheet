import java.util.* ;
import java.io.*; 
/*
	Following is the structure of the Singly Linked List.	
	class LinkedListNode<T> 
    {
    	T data;
    	LinkedListNode<T> next;
    	public LinkedListNode(T data) 
        {
        	this.data = data;
    	}
	}

*/
public class Solution 
{
    public static LinkedListNode<Integer> reverseLinkedList(LinkedListNode<Integer> head) 
    {
        // Write your code here!
          LinkedListNode<Integer> p = head;

   LinkedListNode<Integer> q = null;

   LinkedListNode<Integer> r = null;

   

   while(p!=null){

       r = q;

       q = p;

       p = p.next;

       q.next = r;

   }

   

   head = q;

   

   return head;
    }
}
