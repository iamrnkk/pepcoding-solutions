import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        
        int n= Integer.parseInt(br.readLine());
        
        int a[][]= new int[n][n];
        
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
                a[i][j]= Integer.parseInt(br.readLine());
        }
        
        // for(int i=0; i<n; i++)
        // {
        //     for(int j=0; j<n; j++)
        //     	System.out.print(a[i][j]+" ");
        //     System.out.print("");
        // }
        
        // System.out.print("");
        
        // for(int i=0; i<n; i++)
        // {
        // 	for(int j=0,k=i; j<m && k<n;k++, j++)
        // 		System.out.print(a[k][j]+" ");
        // }
        
        for(int j=0; j<n; j++)
        {
        	for(int i=0,k=j; i<n && k<n;k++, i++)
        		System.out.println(a[i][k]+" ");
        }
    }

}