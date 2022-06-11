//best one 
import java.util.* ;
import java.io.*; 
public class Solution {
	public static int uniquePaths(int m, int n) {
		// Write your code here.
        int a=1;
    for(int i=1;i<=n-1;i++)
    {
        a=(a*(m+i-1))/i;
    }
    return a;
	}
}

//can be solved by dp 
