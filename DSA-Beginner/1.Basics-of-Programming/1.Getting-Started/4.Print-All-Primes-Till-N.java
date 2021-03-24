import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
  
       // write ur code here
       
       int t= scn.nextInt();
       
       int n[]= new int [t];
       
       for(int i=0; i<t;i++)
         n[i]= scn.nextInt();
    
       
       for(int j=0; j<t; j++)
       {
           int count=0;
            for(int i=2; i<= n[j]/2; i++)
            {
                if(n[j]%i==0)
                count++;
            }
        
            if(count==0)
            System.out.println("prime");
            else
            System.out.println("not prime");
       }
       
       
  
   }
  }