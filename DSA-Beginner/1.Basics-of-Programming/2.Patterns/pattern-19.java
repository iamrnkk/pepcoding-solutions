import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

     // write ur code here
        int x= scn.nextInt(); 
     	 int n= (int)Math.ceil(x/2.0);
	        
		 for(int i=1;i<=n;i++)
	        {
	            for(int k=n-1;k>=i;k--)
	            {
	              if(i==1)
	                System.out.print("*	");
	              else
	              System.out.print("	");
	            }
	            for(int j=1;j<=i;j++)
	            {
	              if(j==i)
	                System.out.print("*	");
	              else if(i==n)
	                System.out.print("*	");
	              else
	              System.out.print("	");
	            }
	            for(int l=i-1;l>=1;l--)
	            {
	               if(i==n)
	                System.out.print("*	");
	               else
	                System.out.print("	");
	            }
	            
	            for(int m=n; m>=i+1; m--)
	            {
	             if(m==i+1)
	            System.out.print("*	");
	            else
	            System.out.print("	");
	             }
	            System.out.println();
	        }
	        
	        for(int i=n-1;i>=1;i--)
	        {
	            for(int k=n-1;k>=i;k--)
	              {
	                  if(k==n-1)
	                  System.out.print("*	");
	                  else
	                  System.out.print("	");
	                  
	              }
	              
	            for(int j=1;j<=i;j++)
	              {
	              if(j==i)
	                System.out.print("*	");
	              else if(i==n)
	                System.out.print("*	");
	              else
	              System.out.print("	");
	            }
	              
	            for(int l=i-1;l>=1;l--)
	            {
	              System.out.print("	");
	            }
	            
	             for(int m=n; m>=i+1; m--)
	             {
	              if(i==1)
	                System.out.print("*	");
	              else
	              System.out.print("	");
	             }
	            System.out.println();
	        }

 }
}