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
        int x= sc.nextInt();
        System.out.println(lastIndex(a, 0,x));
    }
    public static int lastIndex(int[] arr, int idx, int x){
        int currIdx=-1;
        if(idx==arr.length)
            return -1;
        if(arr[idx]==x)
            currIdx=idx;
        int index= lastIndex(arr,idx+1,x);
        if(index== -1) return currIdx;
        else return index;
        
    }

}