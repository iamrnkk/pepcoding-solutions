import java.util.*;

public class Main{

public static void main(String[] args) {
  // write your code here  
  
  Scanner sc = new Scanner(System.in);
  
  int n = sc.nextInt();
  int count = 0;
  
  int i=0;
  while (n!=0)
  {
     count++;
     int r= n%10;
     i=i+ count*(int)Math.pow(10,r-1);
     n=n/10;
     
  }
  
  System.out.println(i);
 }
}