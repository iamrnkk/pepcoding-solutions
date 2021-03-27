import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getDifference(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getDifference(int b, int n1, int n2){
       // write your code here
       int borrow=0, ans=0, pow=1;
       while(n2!=0)
       {
            int l1= n1%10, l2=n2%10;
        
            int diff= l2-l1-borrow;
        
            if(diff<0)
            {
            diff+=b;
            borrow= 1;
            }
        
            else
            borrow=0;
        
            ans= ans+ diff*pow;
            pow=pow*10;
             
             n1=n1/10;
             n2=n2/10;
       }
       
       
       return ans;
       
   }
  
  }