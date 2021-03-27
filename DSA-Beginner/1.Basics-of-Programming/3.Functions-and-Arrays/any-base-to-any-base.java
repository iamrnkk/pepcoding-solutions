import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int sourceBase = scn.nextInt();
     int  destBase= scn.nextInt();
     
     int ans= getAnyBase(sourceBase,destBase,n);
     
     System.out.println(ans);
   }   
   
   public static int getAnyBase(int s, int d, int n)
   {
       
      int sum=0;
      int count=0;
      
       
      while(n!=0)
      {
          sum= sum +(n%10)*(int) Math.pow(s,count++);
          n=n/10;
      }
      
      n=sum; count=sum=0;
      
      while(n !=0)
       {
           sum= sum+ n%d*(int)Math.pow(10,count++);
           n=n/d;
       }
       
       return sum;
       
   }
  }