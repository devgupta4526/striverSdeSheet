//Partially Accepted Code 
// import java.util.* ;
// import java.io.*; 
// import java.util.ArrayList;

// public class Solution{
//     public static int maximumProfit(ArrayList<Integer> prices){
//         // Write your code here.
//         int maxProfit = 0;
//         for(int i = 0 ; i < prices.size() ; i++){
//             for(int j = i+1 ; j < prices.size() ; j++){
//                 if(prices.get(j) > prices.get(i) ){
//                 maxProfit = 
//                     Math.max((prices.get(j)-prices.get(i)),maxProfit);
//                }
//             }   
//         }
//         return maxProfit;
//     }
// }



//Optimal Code Solution 

import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution{
    public static int maximumProfit(ArrayList<Integer> prices){
        // Write your code here.
        int maxProfit = 0;
        for(int i = 0 ; i < prices.size() ; i++){
            for(int j = i+1 ; j < prices.size() ; j++){
                if(prices.get(j) > prices.get(i) ){
                maxProfit = 
                    Math.max((prices.get(j)-prices.get(i)),maxProfit);
               }
            }   
        }
        return maxProfit;
    }
}
