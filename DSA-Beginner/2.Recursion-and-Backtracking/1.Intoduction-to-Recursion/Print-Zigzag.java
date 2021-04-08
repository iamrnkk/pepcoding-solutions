import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        
        int n= Integer.parseInt(br.readLine());
        pzz(n);
    }

    public static void pzz(int n)
    {
        if(n==1)
        {
           System.out.print("1 1 1 ");
           return;
        }
            
        
        System.out.print(n+" ");
        pzz(n-1);
        System.out.print(n+" ");
        pzz(n-1);
        System.out.print(n+" ");
        
    }

}