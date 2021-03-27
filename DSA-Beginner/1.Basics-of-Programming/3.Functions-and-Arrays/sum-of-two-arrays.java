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
    int c=0;    
    
    int m= Math.max(n1,n2);
    int l1= n1-1;
    int l2= n2-1;
    int ans[]= new int[m];
    for(int i=m-1; i >=0; i--)
    {
        int dsum=c;
        if(l1>=0)
            dsum+= a1[l1];
        if(l2>=0)
            dsum+= a2[l2];
            
        ans[i]=dsum%10;
        c= dsum/10;
        
        l1--;
        l2--;
        
    }
    
    
    if(c==1)
    System.out.println(1);
    
     for(int i=0; i<ans.length; i++)
        System.out.println(ans[i]);
    
 }

}