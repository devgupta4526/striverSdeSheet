//My code 
import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr) 
    {
        // Write your code here.
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int i = 0 ; i < arr.size()-1 ; i++){
            int count = 1;
            for(int j = i+1 ; i < arr.size()-1 ; j++){
                if(arr.get(i)==arr.get(j)){
                    count++;
                }
                if(count >= (arr.size())/3){
                ans.add(arr.get(i));
            }
            }
            
        }
        return ans;
    }
}


//Code HashMap 
import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr) 
    {
        // Write your code here.
        int n = arr.size();
        HashMap < Integer, Integer > mp = new HashMap < > ();
    ArrayList < Integer > ans = new ArrayList < > ();

    for (int i = 0; i < n; i++) {
      mp.put(arr.get(i), mp.getOrDefault(arr.get(i), 0) + 1);
    }

    for (int x: mp.keySet()) {
      if (mp.get(x) > (n / 3))
        ans.add(x);
    }

    return ans;
        
    }
}


//Extended Boyer Moore’s Voting Algorithm

import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> nums) 
    {
        // Write your code here.
        int number1 = -1, number2 = -1, count1 = 0, count2 = 0, len = nums.size();
    for (int i = 0; i < len; i++) {
      if (nums.get(i) == number1)
        count1++;
      else if (nums.get(i) == number2)
        count2++;
      else if (count1 == 0) {
        number1 = nums.get(i);
        count1 = 1;
      } else if (count2 == 0) {
        number2 = nums.get(i);
        count2 = 1;
      } else {
        count1--;
        count2--;
      }
    }
        
         ArrayList < Integer > ans = new ArrayList < Integer > ();
    count1 = 0;
    count2 = 0;
    for (int i = 0; i < len; i++) {
      if (nums.get(i) == number1)
        count1++;
      else if (nums.get(i) == number2)
        count2++;
    }
    if (count1 > len / 3)
      ans.add(number1);
    if (count2 > len / 3)
      ans.add(number2);
    return ans;
    }
}
