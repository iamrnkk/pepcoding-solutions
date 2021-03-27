import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int b = scn.nextInt();
    int n1 = scn.nextInt();
    int n2 = scn.nextInt();

    int d = getProduct(b, n1, n2);
    System.out.println(d);
 }

 public static int getProduct(int b, int n1, int n2){
     // write your code here
     
     int ans=0;
     int pow=1;
     while(n1!=0)
     {
         ans= getSum(b,ans,getProductWithSingleDigit(b,n2,n1%10)*pow);
         n1/=10;
         pow*=10;
     }
     
     return ans;
     
 }
 
 public static int getProductWithSingleDigit(int b, int n2, int l1)
 {
     int carry=0;
     int ans=0;
     int pow=1;
     while(n2!=0 || carry!=0)
     {
         int l2= n2%10;
         int p= l2*l1+carry;
         
         int r= p%b;
         carry= p/b;
         
         ans= ans + r*pow;
         
         pow*=10;
         n2/=10;
         
     }
     
     return ans;
 }
 
  public static int getSum(int b, int n1, int n2){
       // write ur code here
       int ans=0, carry=0;
       int power=1;
       while(n1!=0 || n2!=0 || carry!=0)
       {
           int r1=n1%10;
           int r2=n2%10;
           int s= r1+r2+carry;
           
           ans=ans+ s%b*power;
           carry= s/b;
           power*=10;
           n1=n1/10;
           n2=n2/10;
       }
       
      return ans; 
       
    }

}