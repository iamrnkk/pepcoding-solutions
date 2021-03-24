import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
      // write your code here 
      
      Scanner sc= new Scanner(System.in);
    
    int n= sc.nextInt();
    
    int count =0;
    ArrayList<Integer> rev = new ArrayList<>();
    
    while(n!=0)
    {
        rev.add(n%10);
        n=n/10;
    }
     
     for(int i= rev.size()-1; i>=0; i--)
        System.out.println(rev.get(i));
    
     }
    }