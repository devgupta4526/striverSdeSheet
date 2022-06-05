import java.util.* ;
import java.io.*; 
public class Solution {
    public static void setZeros(int matrix[][]) {
        // Write your code here..
        boolean f_row=false;
        for(int i=0; i<matrix[0].length; i++)
        {
            if(matrix[0][i]==0)
            {
                f_row=true;
                break;
            }
        }
        
        boolean f_col = false;
        for(int j=0; j<matrix.length; j++)
        {
            if(matrix[j][0]==0)
            {
                f_col=true;
                break;
            }
        }
        
        for(int i=0; i<matrix.length; i++)
        {
            for(int j=0; j<matrix[0].length; j++)
            {
                if(matrix[i][j]==0)
                {
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                }
            }
        }
        
        for(int i=1; i<matrix.length; i++)
        {
            for(int j=1; j<matrix[0].length; j++)
            {
                if((matrix[i][0]==0) || (matrix[0][j]==0))
                {
                    matrix[i][j]=0;
                }
            }
        }
        
        if(f_row)
        {
            for(int i=0; i<matrix[0].length; i++)
            {
                matrix[0][i]=0;
            }
        }
        
        if(f_col)
        {
            for(int j=0; j<matrix.length; j++)
            {
                matrix[j][0]=0;
            }
        }
        
    }
    
 

}
