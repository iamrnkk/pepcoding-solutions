import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws IOException {
    // write your code here
    
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    
    int n= Integer.parseInt(br.readLine());
    
    int a[]= new int[n];
    
    for(int i=0; i<n; i++)
        a[i]=Integer.parseInt(br.readLine());
        
    for(int i=0; i<n; i++)
    {
        int w=i;
        while(w<n)
        {
        for(int j=i; j<=w; j++)
            System.out.print(a[j]+"	");
            w++;
        System.out.println();
        }      
            
            
    }
 }

}