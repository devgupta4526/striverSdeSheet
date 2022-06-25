//copied code
import java.util.*;

public class Solution {
	public static int removeDuplicates(ArrayList<Integer> arr,int n) {
		// Write your code here.
         int cur = 0;
        for(int i = 0;i<n;i++){
            arr.set(cur++,arr.get(i)); 
            while(i+1<n && arr.get(i) == arr.get(i+1)) 
                i++;// it's help jump over the duplicate
        }
        return cur;
	}
}

//my code 
import java.util.*;

public class Solution {
	public static int removeDuplicates(ArrayList<Integer> arr,int n) {
		// Write your code here.
        int j=1;
        for(int i=1;i<n;i++){
            if(arr.get(i)!=arr.get(i-1)){
                arr.set(j,arr.get(i));
                j++;
            }
        }
        return j;
	}
}
