import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        
        int n= Integer.parseInt(br.readLine());
        int a[][]= new int[n][n];
        
        for(int i=0; i<n;i++)
        {
            for(int j=0; j<n;j++)
                a[i][j]= Integer.parseInt(br.readLine());
        }
        
        // for(int i=0; i<n;i++)
        // {
        //     for(int j=0; j<n;j++)
        //     	System.out.print(a[i][j]+" ");
        //     System.out.println();
        // }
        boolean isSaddle;
            for(int i=0; i<n; i++)
            {
                int minIdx= min(a[i]);
                //System.out.println(minIdx);
                isSaddle=true;
                for(int j=0; j<n;j++)
                {
                    int max= a[i][minIdx];
                    isSaddle=true;
                    if(a[j][minIdx] > max)
                    {
                            isSaddle=false;
                            break;
                    }
                }
                
                 if(isSaddle)
                    {
                        System.out.println(a[i][minIdx]);
                        System.exit(0);
                    } 
            }
        System.out.println("Invalid input");
    }
    
    public static int min(int arr[])
    {
        int min=arr[0], pos=0;
        for(int j=1; j<arr.length; j++)
        {
            if(arr[j]<min)
            {
                min= arr[j];
                pos=j;
            }
        }
        
        //System.out.println(min);
        return pos;
    }

}