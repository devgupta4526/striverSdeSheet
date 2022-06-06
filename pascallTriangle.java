import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	public static ArrayList<ArrayList<Long>> printPascal(int n) {
                 // Write your code here. 
 ArrayList<ArrayList<Long>> l=new ArrayList<>();
        for(int i=0;i<n;i++){
            ArrayList<Long> k=new ArrayList<>();
            for(int j=0;j<i+1;j++){
                if(j==0 || j==i){
                    k.add((long)1);
                }else{
                    k.add(l.get(i-1).get(j-1)+l.get(i-1).get(j));
                }
            }
            l.add(k);
        }
        return l;
	}
}
