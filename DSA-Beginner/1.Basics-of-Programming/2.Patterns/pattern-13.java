import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        //write your code here
        
        int n= scn.nextInt();
        
        for(int i=0; i<=n-1; i++)
        {
            int v= 1;
            for(int j=0;j<=i; j++)
                {
                    System.out.print(v+"	");
                    v=v*(i-j)/(j+1);
                }
                
                System.out.println();
        }

    }
}