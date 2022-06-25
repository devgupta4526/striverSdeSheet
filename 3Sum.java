//my code
import java.util.* ;
import java.io.*; 
public class Solution {

	public static ArrayList<ArrayList<Integer>> findTriplets(int[] nums, int n, int K)  {

	    // Write your code here.
       ArrayList < ArrayList < Integer >> ans = new ArrayList < > ();

        int i, j, k;
        for (i = 0; i < nums.length - 2; i++) {
            for (j = i + 1; j < nums.length - 1; j++) {
                for (k = j + 1; k < nums.length; k++) {
                    ArrayList < Integer > temp = new ArrayList < > ();
                    if (nums[i] + nums[j] + nums[k] == K) {
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                    }
                    if (temp.size() != 0)
                        ans.add(temp);
                }
            }
        }

        return ans;
	}
}


//optimised code 
import java.util.* ;
import java.io.*; 
public class Solution {

	public static ArrayList<ArrayList<Integer>> findTriplets(int[] num, int n, int k)  {

	    // Write your code here.
      
        Arrays.sort(num);

        ArrayList < ArrayList < Integer >> res = new ArrayList < > ();

        for (int i = 0; i < num.length - 2; i++) {

            if (i == 0 || (i > 0 && num[i] != num[i - 1])) {

                int lo = i + 1, hi = num.length - 1, sum = k - num[i];

                while (lo < hi) {
                    if (num[lo] + num[hi] == sum) {
                        ArrayList < Integer > temp = new ArrayList < > ();
                        temp.add(num[i]);
                        temp.add(num[lo]);
                        temp.add(num[hi]);
                        res.add(temp);

                        while (lo < hi && num[lo] == num[lo + 1]) lo++;
                        while (lo < hi && num[hi] == num[hi - 1]) hi--;

                        lo++;
                        hi--;
                    } else if (num[lo] + num[hi] < sum) lo++;

                    else hi--;
                }
            }
        }
        return res;
	}
}
