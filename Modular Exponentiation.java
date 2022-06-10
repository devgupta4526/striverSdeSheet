//my code
import java.util.* ;
import java.io.*; 
public class Solution {
    public static int modularExponentiation(int x, int n, int m) {
        // Write your code here.      
        long res = 1;
        for(int i = 0 ; i < n ; i++){
            res = res * x;
        }
        res = res % m;
        return res;
    }
}


//striver code
import java.util.* ;
import java.io.*; 
public class Solution {
    public static int modularExponentiation(int x, int n, int m) {
        // Write your code here.      
        long ans = 1;
        long xx = x;
        while(n>0){
        
            if(n%2 !=0){
                ans = ((ans)%m *(xx)% m ) %m;
                
            }
            xx = ((xx)%m *(xx)%m)%m;
            n= n>>1;
        
        }  
        return(int) (ans%m);
    }
}
