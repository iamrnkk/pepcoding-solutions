import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    
    Scanner sc =new Scanner(System.in);
    int n = sc.nextInt();
    int a[]= new int[n];
    for(int i=0; i<n;i++)
        a[i]= sc.nextInt();
    printSubset(a);
 }
 
 public static void printSubset(int a[])
 {
     
     int t= (int) Math.pow(2,a.length);
     
     for(int i=0; i<t;i++)
     {
         int b= decToBin(i);
         int div=(int)Math.pow(10,a.length-1);
         for(int j=0; j<a.length; j++)
         {
             int q= b/div;
             int r= b%div;
             if(q==1)
             System.out.print(a[j]+"	");
             else
             System.out.print("-	");
             
             b=r;
             div/=10;
             
         }
         
         System.out.println();
     }
 }
 
 public static int decToBin(int n)
 {
     int s=0;
     int pow=1;
     
     while(n!=0)
     {
        s= s+n%2*pow;
        n=n/2;
        pow*=10;
     }
     
     return s;
 }

}