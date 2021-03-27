import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int dn = getValueInBase(n, b);
      System.out.println(dn);
   }
  
   public static int getValueInBase(int n, int b){
       // write code here
       int sum=0;
       int count=0;
       while(n !=0)
       {
           sum= sum+ n%b*(int)Math.pow(10,count++);
           n=n/b;
       }
       
       return sum;
   }
  }