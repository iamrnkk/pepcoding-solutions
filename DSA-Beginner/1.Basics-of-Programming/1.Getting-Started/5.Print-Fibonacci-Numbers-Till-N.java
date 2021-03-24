import java.util.*;
  
  public class Main{
  
  public static void main(String[] args)
  {
      // write your code here
      
      Scanner sc =new Scanner (System.in);
      
      int n= sc.nextInt();
      System.out.println("0");
      System.out.println("1");
      int a=0,b=1;
      for(int i=2; i<n; i++)
      {
          int c= a+b;
          System.out.println(c);
          a=b;
          b=c;
      }
   }
  }