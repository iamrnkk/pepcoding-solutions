import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int d = getValueIndecimal(n, b);
      System.out.println(d);
   }
  
   public static int getValueIndecimal(int n, int b){
      // write your code here
      
      int sum=0;
      int count=0;
      
       
      while(n!=0)
      {
          sum= sum +(n%10)*(int) Math.pow(b,count++);
          n=n/10;
      }
      
      return sum;
   }
  }