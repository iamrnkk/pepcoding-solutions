import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
      // write your code here
      
      Scanner sc= new Scanner(System.in);
      
      int a= sc.nextInt();
      int b= sc.nextInt();
      int n1=a,n2=b;
      
      while(a%b!=0)
      {
          int t=a;
          a=b;
          b=t%b;
      }
      
      System.out.println(b);
      int lcm= n1*n2/b;
      
      System.out.println(lcm);
      
     }
    }