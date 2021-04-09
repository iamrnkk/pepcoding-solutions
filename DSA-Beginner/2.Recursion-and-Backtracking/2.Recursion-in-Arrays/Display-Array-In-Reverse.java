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
        displayArr(a, 0);
        
    }

    public static void displayArr(int[] arr, int idx){
        if(idx==arr.length)
            return;
        
        displayArr(arr, idx+1);
        System.out.println(arr[idx]);
    }

}