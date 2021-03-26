import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        
            int x= scn.nextInt();  
	        int n= (int)Math.ceil(x/2.0);
	        
	        for(int i=1;i<=n;i++)
	        {
	            for(int k=n-1;k>=i;k--)
	              System.out.print("	");
	            for(int j=1;j<=i-1;j++)
	            {
	              if(i==n)
	              System.out.print("*	");
	              else
	              System.out.print("	");
	            }
	            for(int l=i;l>=1;l--)
	              System.out.print("*	");
	            System.out.println();
	        }
	        
	        for(int i=n-1;i>=1;i--)
	        {
	            for(int k=n-1;k>=i;k--)
	              System.out.print("	");
	            for(int j=1;j<=i-1;j++)
	              System.out.print("	");
	            for(int l=i;l>=1;l--)
	              System.out.print("*	");
	            System.out.println();
	        }

    }
}