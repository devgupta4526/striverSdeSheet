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
