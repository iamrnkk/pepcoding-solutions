import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws IOException {
    // write your code here
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    
    int n1= Integer.parseInt(br.readLine());
    int a1[]= new int[n1];
    for(int i=0; i<n1; i++)
        a1[i]= Integer.parseInt(br.readLine());

    int n2= Integer.parseInt(br.readLine());
    int a2[]= new int[n2];
    for(int i=0; i<n2; i++)
        a2[i]= Integer.parseInt(br.readLine());
        
    int ans[] =new int[n2];
    
    int l1= n1-1;
    int l2= n2-1;
    int k=  n2-1;
    int b=0;
    while(k>=0)
    {
        int diff= a2[l2]-b;
        if(l1>=0)
        diff-=a1[l1];
        
        if(diff<0)
        {
            diff+= 10;
            b=1;
        }
        else
            b=0;
            
        ans[k]= diff;
        k--;
        l1--;
        l2--;
    }
    k=0;
    while(ans[k]==0)
        k++;
    for(int i=k; i<n2; i++)
        System.out.println(ans[i]);
 }

}