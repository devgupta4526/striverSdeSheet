//My code (partially accepted)
import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	public static int subarraysXor(ArrayList<Integer> arr, int x) {
		// Write your code here.
        int cnt=0;

    int n=arr.size();

    for(int i=0;i<n;i++ ){

        int sum=0;

        for(int j=i;j<n;j++){

            sum^=arr.get(j);

            if(sum == x)cnt++;

        }

    }

    return cnt;
	}
}
