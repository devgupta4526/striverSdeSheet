//Optimal Code
//Dutch National Flag
import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static void sort012(int[] arr)
    {
        //Write your code here
       int low = 0;
       int mid = 0;
       int high = arr.length -1;
       int temp;
        
        while(mid <= high){
            switch(arr[mid]){
                case 0:{
                    temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    mid++;
                    low++;
                    break;
                }
                    
                case 1:{
                    mid++;
                    break;
                }
                    
                case 2:{
                    temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
                    break;
                       }
                    
                   
            }
        }
        
        
    }
}








//*(*******************[My Code Count Method]***************************
// import java.util.* ;
// import java.io.*; 
// public class Solution 
// {
//     public static void sort012(int[] arr)
//     {
//         //Write your code here
//         int one = 0 , zero = 0 , two = 0 ;
//         for(int i = 0 ; i < arr.length ; i++){

//             if(arr[i]==0)
//                 zero++;
//             else if(arr[i]==1)
//                 one++;
//             else
//                 two++;
//         }
//         for(int i = 0 ; i < arr.length ; i++){
//             if(zero>0){
//                 arr[i]=0;
//                 zero--;
//             }
//             else if(one > 0){
//                 arr[i]=1;
//                 one--;
//             }
//             else if(two > 0){
//                 arr[i] = 2;
//                 two--;
//             }
//         }
        
        
//     }
// }
