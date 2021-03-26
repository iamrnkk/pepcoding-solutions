import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

     // write ur code here
     
     int n= scn.nextInt();
    
     for(int i=1; i<=n; i++)
     {
        
         for(int j=1; j<= i; j++)
            System.out.print(j+"	");
            
         for (int k=n-1 ; k>=i;k--)
            System.out.print("	");
            
         for(int l=n-2; l>=i; l--)
            System.out.print("	");
            
         for(int m=i; m>=1; m--)
         {
            if(m==n)
                continue;
            System.out.print(m+"	");
         }
            
        System.out.println();
     }

 }
}