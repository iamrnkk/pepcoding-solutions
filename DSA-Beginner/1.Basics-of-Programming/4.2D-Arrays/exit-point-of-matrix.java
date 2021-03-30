import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        
        int n= Integer.parseInt(br.readLine());
        
        int m= Integer.parseInt(br.readLine());
        
        int a[][]= new int[n][m];
        
        for(int i=0; i< n; i++)
        {
            for(int j=0; j<m; j++)
                a[i][j]= Integer.parseInt(br.readLine());
        }
        
        int dir=0;
        int i=0,j=0;
        
        while(i>=0 && j>=0 && i<n && j< m)
        {
            dir= dir+a[i][j];
            
            if(dir==4)
                dir=0;
                
            if(dir==0) j++;   
            else if(dir==1) i++;
            else if(dir==2) j--;
            else i--;
        }
        
        if(i<0) i++;
        else if(j<0) j++;
        else if(i==n) i--;
        else j--;
        
        System.out.println(i);
        System.out.println(j);
    }
}