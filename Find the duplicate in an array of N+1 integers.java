//My Code
import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution{
    public static int findDuplicate(ArrayList<Integer> arr, int n){
        // Write your code here.
       Collections.sort(arr);  
        for(int i = 0 ; i < n -1 ; i++){
            if(arr.get(i)==arr.get(i+1)){
                return arr.get(i);
            }
        }
        return 0;
    }
}


//frequnecy Code (half my approach)
import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution{
    public static int findDuplicate(ArrayList<Integer> arr, int n){
        // Write your code here.
       int frequency [] = new int[n+1];
        for(int i = 0 ; i < n ; i++){
   
            if(frequency[arr.get(i)]==0){
                frequency[arr.get(i)]+=1;
            }
            else{
                return arr.get(i);
            }
        }
        return 0;
        
    }
}


//optimal approach  Linked List cycle method
//yet to be added
