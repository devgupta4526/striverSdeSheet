//my code
import java.util.* ;
import java.io.*; 
/************************************************************

    Following is the linked list node structure:
    
    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;

        public LinkedListNode(T data) {
            this.data = data;
        }
    }

************************************************************/

public class Solution {
	public static LinkedListNode<Integer> sortTwoLists(LinkedListNode<Integer> first, LinkedListNode<Integer> second) {
		// Write your code here.
        LinkedListNode<Integer> p1 = first;
        LinkedListNode<Integer> p2 = second;
        LinkedListNode<Integer> res= new LinkedListNode<Integer>();
        LinkedListNode<Integer> li = res;
        while(p1 !=null && p2 !=null){
            if(p1.data =< p2.data){
                li.next = p1;
                p1=p1.next;
            }
            else{
                li.next = p2;
                p2 = p2.next;
            }
        }
        if(p1 ==null){
            li.next = p2;
        }
          if(p2==null){
            li.next = p1;
        }
            
        }
	
}


//****************************************************************************************************************************************
//
