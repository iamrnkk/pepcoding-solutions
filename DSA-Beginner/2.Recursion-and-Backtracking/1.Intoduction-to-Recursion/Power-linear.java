import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        
        // write your code here
        
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        
        int x= Integer.parseInt(br.readLine());
        int n= Integer.parseInt(br.readLine());
        System.out.println(power(x,n));
    }

    public static int power(int x, int n){
        if( n==0)
            return 1;
        
        if(n==1)
            return x;
            
        return x*power(x,n-1);
    }

}