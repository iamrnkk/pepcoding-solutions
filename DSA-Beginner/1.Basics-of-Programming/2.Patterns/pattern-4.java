import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n= scn.nextInt();
        for(int i=n;i>=1; i--)
        {
            for(int k=n-1; k>=i; k--)
                System.out.print("	");
            for(int j=1;j<=i; j++)
                System.out.print("*	");
            System.out.println();
        }

    }
}
}