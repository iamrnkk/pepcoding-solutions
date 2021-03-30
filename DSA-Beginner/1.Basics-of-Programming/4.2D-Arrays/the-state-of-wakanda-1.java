import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws IOException {
    // write your code here
    
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    
    int n1= Integer.parseInt(br.readLine());
    int m1= Integer.parseInt(br.readLine());
    
    int a1[][]= new int[n1][m1];
    for(int i=0; i<n1;i++)
    {
        for(int j=0; j<m1;j++)
            a1[i][j]= Integer.parseInt(br.readLine());
    }
    
    
    
    for(int i=0; i<m1;i++)
    {
        int j= (i%2==0)?0:n1-1;
        if(i%2==0)
        {
            while(j<n1)
            {
              System.out.println(a1[j][i]);
              j++;
            }
        }
        
        else
        {
            while(j>=0)
            {
              System.out.println(a1[j][i]);
              j--;
            }
        }
        
    }
 }

}