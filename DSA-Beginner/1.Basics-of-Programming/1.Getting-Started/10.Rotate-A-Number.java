import java.util.*;
   
   public class Main{
   
   public static void main(String[] args) {
     // write your code here  
     
     Scanner sc= new Scanner(System.in);
     
     int n = sc.nextInt();
     int k= sc.nextInt();
     
     boolean isNegative= false;
  
        
     int num=n;
     int count=0;
     while(num!=0)
     {
         num=num/10;
         count++;
     }     
     
     k= k%count;
     
     if(k<0)
      {
          isNegative= true;
          k=count+k;
      }
         
     
     int r= n% (int)Math.pow(10,k);
     
     int q= n/(int)Math.pow(10,k);
     
     
     


   
     int res= r*(int)Math.pow(10,count-k) + q;
     
   
     
     System.out.println(res);
     
     //System.out.println(r);
     //System.out.println(q);
    }
   }