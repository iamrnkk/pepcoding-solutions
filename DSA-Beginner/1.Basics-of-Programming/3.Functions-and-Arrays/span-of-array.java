import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws IOException {
    // write your code here
    
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    
    int n= Integer.parseInt(br.readLine());
    int arr[]= new int[n];
    
    for(int i=0; i<n; i++)
        arr[i]= Integer.parseInt(br.readLine());
    
    int max=arr[0];
    int min= arr[0];
    for(int num: arr)
    {
        if(max<num)
            max= num;
            
        if(min>num)
            min=num;
    }
    
    System.out.println(max-min);
 }

}