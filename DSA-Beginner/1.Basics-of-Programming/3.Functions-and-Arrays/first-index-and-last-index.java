import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws IOException {
    // write your code here
    
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    
    int n= Integer.parseInt(br.readLine());;
    
    int a[]= new int[n];
    
    for(int i=0; i<n; i++)
       a[i]= Integer.parseInt(br.readLine());
        
    int d= Integer.parseInt(br.readLine());
    
    int start=0;
    int end= n-1;
    int u=-1;
    int l=-1;
    while(start<=end)
    {
        int mid= (start+end)/2;
        
        if(a[mid]==d)
        {
            
            l=mid;
            end=mid-1;
            u=mid;
        }
        
        else if (d < a[mid])
        end=mid-1;
        
        else
         start=mid+1;
        
    }
    
    start=0;end=n-1;
    while(start<=end)
    {
        int mid= (start+end)/2;
        
        if(a[mid]==d)
        {
            start=mid+1;
            u=mid;
        }
        
        else if (d < a[mid])
        end=mid-1;
        
        else
         start=mid+1;
        
    }
    
    System.out.println(l);
    System.out.println(u);
 }

}