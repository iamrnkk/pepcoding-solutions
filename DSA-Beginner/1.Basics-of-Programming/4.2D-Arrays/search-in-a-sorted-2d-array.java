import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        
        int n= Integer.parseInt(br.readLine());
        int a[][]= new int[n][n];
        
        for(int i=0; i<n;i++)
        {
            for(int j=0; j<n;j++)
                a[i][j]= Integer.parseInt(br.readLine());
        }
        
        int num= Integer.parseInt(br.readLine());
        
        int top=a[n-1][0] , right=a[n-1][0];
        
        int i= n-1, j=0;
        while(i>=0 && j<n)
        {
            if(a[i][j]==num)
            {
                System.out.println(i);
                System.out.println(j);
                return;
            }
            
            else if( num< a[i][j]) i--;
            else j++;
        }
        
        System.out.println("Not Found");
        
    }

}