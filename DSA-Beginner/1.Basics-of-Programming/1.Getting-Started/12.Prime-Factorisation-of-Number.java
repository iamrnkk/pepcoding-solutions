import java.util.*;

public class Main{

public static void main(String[] args) {
  // write your code here
  
  Scanner sc = new Scanner(System.in);
  
  int n= sc.nextInt();
  int num=n;
  for(int j=2; j< Math.sqrt(num); j++)
  {
    
      while(n%j==0)
      {
            System.out.print(j+" ");
            n=n/j;
      }
      
      
      if(n==1)
        break;
     
  }
  
  if(n!=1)
        System.out.print(n+" ");
 }
}