//My Code
import java.util.* ;
import java.io.*; 
public class Solution {
    public static int lengthOfLongestConsecutiveSequence(int[] arr, int N) {
        // Write your code here.
        int count = 1;
        int maxCount = 1;
        Arrays.sort(arr);
        for(int i = 1 ; i < N ; i++){
           
            if(arr[i] == arr[i-1]+1){
                count++;
            }
            else if (arr[i] == arr[i-1]){
                continue;
            }
            else{
                count = 1;
            }
            maxCount = Math.max(maxCount , count);
        }
        return maxCount;
    }
}

//optimised code hashset method
import java.util.* ;
import java.io.*; 
public class Solution {
    public static int lengthOfLongestConsecutiveSequence(int[] arr, int N) {
        // Write your code here.
        int n =N;
        HashSet <Integer> set = new HashSet<Integer>();
        for(int i = 0; i < n ; i++)
            set.add(arr[i]);
        
        int maxCount = 0;
        for(int i = 0 ; i < n ; i++){
            if(!set.contains(arr[i]-1)){
                int nums = arr[i];
                int count = 0;
                while(set.contains(nums)){
                    nums++;
                    count++;
                }
                maxCount = Math.max(maxCount , count);
                count = 0;
            }
        }
        return maxCount;
    }
}
