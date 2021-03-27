import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws IOException {
    // write your code here
    
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    
    int n= Integer.parseInt(br.readLine());
    
    int arr[]= new int[n];
    
    for(int i=0; i<n; i++ )
        arr[i]= Integer.parseInt(br.readLine());
    
    int d= Integer.parseInt(br.readLine());
    int idx=-1;
    for(int i=0; i<n; i++)
    {
        if(arr[i]==d)
        {
            idx=i;
            break;
        }
    }
    
    System.out.print(idx);
 }

}