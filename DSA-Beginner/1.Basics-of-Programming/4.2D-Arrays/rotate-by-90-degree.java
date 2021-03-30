import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException 
    {
        // write your code here
        
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        
        int n= Integer.parseInt(br.readLine());
        
        int a[][]= new int[n][n];
        
        for(int i=0; i< n; i++)
        {
            for(int j=0; j<n; j++)
                a[i][j]= Integer.parseInt(br.readLine());
        }
        
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<i; j++)
                {
                    int t= a[i][j];
                    a[i][j]= a[j][i];
                    a[j][i]=t;
                }
        }
        
        for(int k=0; k<n;k++)
        {
            int left=0, right=n-1;
            while(left<right)
            {
                int t= a[k][left];
                a[k][left]= a[k][right];
                a[k][right]=t;
                
                left++;
                right--;
            }
        }
        
        display(a);
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}