import java.util.*;

public class Main{

public static void main(String[] args) {
    // write your code here
    
    Scanner sc= new Scanner(System.in);
    
    int n= sc.nextInt();
    
    int arr[]= new int[n];
    
    for(int i=0; i<n; i++)
        arr[i]=sc.nextInt();
    
    int max=arr[0];
    
    for(int num: arr)
        {
            if(max<num)
                max=num;
        }
        
        for(int i= max; i>=1;i--)
        {
            for(int j=0; j<n; j++)
                {
                    if(arr[j]>=i)
                        System.out.print("*	");
                    else
                        System.out.print("	");
                }
                
            System.out.println();
        }
    
 }

}