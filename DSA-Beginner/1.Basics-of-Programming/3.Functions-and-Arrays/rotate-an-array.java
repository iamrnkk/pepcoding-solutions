import java.io.*;
import java.util.*;

public class Main{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + " ");
    }
    System.out.println(sb);
  }

  public static void rotate(int[] a, int k){
    // write your code here
    k=k% a.length;
    if(k<0)
        k=a.length+k;
    reverse(a,0,a.length-1);
    reverse(a,0,k-1);
    reverse(a,k,a.length-1);
    
  }
  
  public static void reverse(int nums[] , int start, int end)
	{
		while(start < end)
		{
			int temp= nums[start];
			nums[start]= nums[end];
			nums[end]= temp;
			
			start++;
			end--;
		}
	}

public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }
    int k = Integer.parseInt(br.readLine());

    rotate(a, k);
    display(a);
 }

}