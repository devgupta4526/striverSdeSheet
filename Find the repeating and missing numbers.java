//Maths Approach
import java.util.ArrayList;

public class Solution {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        // Write your code here
      int S = n*(n+1)/2;
      int  P = n*(n+1)*(2*n + 1)/6;
        for(int i=0 ; i < arr.size() ; i++){
       S -= arr.get(i);
       P -= arr.get(i)*arr.get(i);
    }
        int res [] = new int [2];
        res[0] = (S + P/S)/2;
        res[1] = res[0] - S;
        
        return res;
    }
}

//Xor Approach 
