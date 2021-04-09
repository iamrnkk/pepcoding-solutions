import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int a[]= new int[n];
        for(int i=0; i<n;i++)
            a[i]= sc.nextInt();
        System.out.println(maxOfArray(a, 0));
        
    }

    public static int maxOfArray(int[] arr, int idx){
        if(idx==arr.length-1)
            return arr[arr.length-1];
            
        int max=maxOfArray(arr,idx+1);
        
        if(arr[idx]>max) max= arr[idx];
        
        return max;
    }

}