# Assignment-1 

---

#### Submitted to: *Mr. Mohit Behl* &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; Submitted by: *Kamalakar Srivastava* (ECE)

#### original/remote link: [*github*](https://github.com/iamrnkk/pepcoding-solutions/blob/master/assignment-1/assignment1.md)

---

<br>

1- Write a program to check given number is perfect number or not.
[ Input : a number , output : boolean ]

```java
// Approach: find the divisors and add them , if sum=number,then its perfect.
import java.util.*;
public class Main {
    public static boolean isPerfect(int num)
	{
		if (num==1) return false;
        int ans=1;
		for(int i = 2 ; i<=num/2;i++)
		{
			if(num%i==0) ans+=i;
            if(ans>num) return false;
		}
		return ans==num;
	}
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        System.out.println(isPerfect(num));
    }
}
```

2- Write a program to check given number is Armstrong number or not.
[ Input : a number , output : boolean ]

```java
// Approach: sum all the cubes of digits , if sum=num, num is armstrong. 
import java.util.*;
public class Main {
    public static boolean isArmstrong(int num)
	{
		if(num==0 || num==1) return true;
		int ans=0;
		int n=num;
		while(num!=0)
		{
			int r= num%10;
			ans=ans+r*r*r;
			num/=10;
		}
		
		return n==ans;
	}
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        System.out.println(isArmstrong(num));
    }
}
```
3- Write a program to check given number is prime number or not.
[ Input : a number , output : boolean ]
```java
import java.util.*;
public class Main {
    public static boolean isPrime(int num)
	{
		for(int i = 2; i<=Math.sqrt(num); i++)
			if(num%i==0) return false;
		return true;
	}
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        System.out.println(isPrime(num));
    }
}
```

4- Write a program to check given number is strong number or not.
[ Input : a number , output : boolean ]
```java
// Approach: sum the factorial of all digits , if sum=num ,num is strong.
import java.util.*;
public class Main {
	public static boolean isStrong(int num)
	{
		int n=num;
		int ans=0;
		while(n!=0)
		{
			ans+= factorial(n%10);
			n/=10;
		}
		return ans==num;
	}
    
	public static int factorial(int num)
	{
		if (num==0|| num==1) return 1;
		int f=1 ;
		for(int i=num; i>1; i--) f*=i;
		return f;
	}
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        System.out.println(isStrong(num));
    }
} 
```
5-Write a program to check a number is odd or even. [ Input : a number ]
```java
import java.util.*;
public class Main {
	public static void evenOdd(int num)
	{
		if(num%2==0) System.out.println("Even");
		else System.out.println("Odd");
	}
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        //System.out.println(isStrong(num));
        evenOrOdd(num);
    }
}
```
6- Write a program to check given number is palindrome number or not.
[ Input : a number , output : boolean ]
```java
import java.util.*;
public class Main {
	public static boolean isPalindrome(int num)
	{
		int revNum=0;
		
		while(revNum < num)
		{
			revNum= revNum*10 + num/10;
			num/=10;
		}
		
		return revNum == num;
	}
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        System.out.println(isPalindrome(num));
    }
}
```
7- Write a program to check given string is palindrome number or not.[ Input : a string , output : boolean ]<br>
66- Write a function that checks whether a given string is Palindrome or not. Use this function to find whether the string entered by user is Palindrome or not.

```java
import java.util.*;
public class Main {
	public static boolean isPalindrome(String num)
	{
		int left=0,right= num.length()-1;
		while(left<right)
		{
			if(num.charAt(left++)!=num.charAt(right--)) return false;
		}
		
		return true;
	}
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        System.out.println(isPalindrome(num));
        
    }
}
```
8- Write a program to solve quadratic equation. [ Input : 4 numbers (representing coefficients & value at which equation must be solved) output : a number]
```java
import java.util.*;
public class Main {
    public static int quadratic(int a, int b, int c, int x)
	{
		return a*x*x+b*x+c;
	}
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        System.out.println(quadratic(num));
        
    }
}
```
9. Write a program to print Fibonacci series of given range.
[ Input : a number , output : fibonacci series ]
```java
import java.util.*;
public class Main {
    public static void fibonacci(int n)
	{
		if(n==0) return;
		if(n>0) System.out.print(0+" ");
		if(n>1) System.out.print(1+" ");
		int a=0,b=1,c=0;
		for(int i=2; i<n;i++)
		{
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
		System.out.println();
	}
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        System.out.println(fibonacci(num));
        
    }
}
```
10. Write a program to get factorial of given number.
[ Input : a number , output : factorial ]
```java
import java.util.*;
public class Main {
    public static int factorial(int num)
	{
		if (num==0|| num==1) return 1;
		int f=1 ;
		for(int i=num; i>1; i--) f*=i;
		return f;
	}
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        System.out.println(factorial(num));
        
    }
}
```
11. Write a program for Floyd’s triangle.
[ Input : a number , output : floyd’s triangle pattern ]
```java
import java.util.*;
public class Main {
    public static void floyd(int num)
	{
		int c=1;
		for(int i=1; i<=num; i++)
		{
			for(int j=1; j<=i;j++,c++ ) System.out.print(c+" ");
			System.out.println();
		}
	}
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        floyd(num);
        
    }
}
```
12. Write a program to print Pascal triangle.
[ Input : a number , output : pascal’s triangle pattern ]
```java
import java.util.*;
public class Main {
    public static void pascal(int num)
	{
		for(int i = 1; i <= num; i++)
		{
		         
		    int c=1;
		    for(int j = 1; j <= i; j++)
		    {
		        System.out.print(c+" ");
		        c= c* (i - j) / j;
		    }
		    System.out.println();
	    }
	}
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        pascal(num);
        
    }
}
```
13. Write a program to generate multiplication table.
[ Input : a number , output : multiplication till 10]
```java
import java.util.*;
public class Main {
    public static void table(int n)
	{
		for(int i=0; i<=10; i++) System.out.printf("%d X %d = %d\n",n,i,(n*i));
	}
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        table(num);
        
    }
}
```
14. Write a program to print ASCII value of all characters.
```java
import java.util.*;
public class Main {
    public static int getASCII(char c)
	{
		return (int)c;
	}
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        char n= sc.next().charAt(0);
        System.out.println(getASCII(n));
        
        
    }
}
```
15. Write a program to print hello world without using semicolon at the end of print statement
```java
import java.util.*;
public class Main {    
    public static void main(String[] args) {
        if(System.out.printf("hello world")==null) {}
    }
}
```
16- Write a program to reverse any number.<br>
60- WAP to reverse a number.
```java
import java.util.*;
public class Main {
    public static int reverse(int num)
	{
		
		int rev=0;
		while(num!=0)
		{
			rev=rev*10+ num%10;
			num/=10;
		}
		
		return rev;
	}
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        System.out.println(reverse(num));
        
    }
}
```
17.  Write a program to find out sum of digit of given number.
```java
import java.util.*;
public class Main {
    public static int digitSum(int num)
	{
		int sum=0;
		while(num!=0)
		{
			sum+=num%10;
			num/=10;
		}
		
		return sum;
	}
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        System.out.println(digitSum(num));
        
    }
}
```
18. Write a program to find out power of number.
```java
import java.util.*;
public class Main {
    public static int pow(int x,int y)
	{
	    if( y == 0)
	        return 1;
	    
	    int p = pow(x, y / 2);
	    p*=p;
	    
	    if (y % 2 == 0) return p;
	    else return x*p;
	}
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        System.out.println(pow(a,b));
        
    }
}
```
19. Write a program to add two numbers without using addition operator.
```java
import java.util.*;
public class Main {
    public static int add(int a, int b)
    {
	    if (b==0) return a;
	     
	    int sum = a ^ b;
	    int carry = (a & b) << 1;
	 
	    return add(sum, carry);
	}
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        System.out.println(add(a,b));
        
    }
}
```
20. Write a program to subtract two numbers without using subtraction operator.
```java
import java.util.*;
public class Main {
    public static int difference(int a, int b)
	{
		 if (b == 0) return a;
		 
		 int diff= a^b;
		 int borrow= (~a & b)<<1;
		 
		 return difference(diff,borrow);
	}
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        System.out.println(difference(a,b));
        
    }
}
```
21. Write a program to find largest among three numbers using binary minus operator.
22. Write a program to find largest among three numbers using conditional operator.
```java
import java.util.*;
public class Main {
    public static int greatest(int a , int b, int c)
	{
		if(a-b>0 && a-c>0) return a;
		else if(b-a>0 && b-c>=0) return b;
		else return c;
	}
	
	public static int greatest2(int a, int b, int c)
	{
		return (a>b)?(a>c)?a:c:(b>c)?b:c;
	}
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        System.out.println(greatest(a,b,c));
        System.out.println(greatest2(a,b,c));
    }
}
```
23. Write a program to find out generic root of any number.
```java
import java.util.*;
public class Main {
    public static int genRoot(int num)
	{
		int sum=0;
		while(num!=0)
		{
			sum+= num%10;
			num/=10;
			if(num==0 && sum>9)
			{
				num=sum;
				sum=0;
			}
		}
		
		return sum;
	}
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(genRoot(n));
    }
}
```
24. Write a program to find out prime factor of given number.
```java
import java.util.*;
public class Main {
    public static void primefact(int n)
	{
		for(int i=2; i<=Math.sqrt(n);i++)
		{
			while(n%i==0)
			{
				System.out.print(i+" ");
				n/=i;
			}
			
		}
		
		if (n>1) System.out.print(n);
		System.out.println();
	}
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        primefact(n);
    }
}
```
25. Write a program to find out NCR factor of given number.
```java
import java.util.*;
public class Main {
    public static int ncr(int n, int r)
	{
		return factorial(n)/(factorial(r)*factorial(n-r));
	}
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int r= sc.nextInt();
        System.out.println(ncr(n,r));
    }
}
```
26. convert string to int without using library functions.
```java
import java.util.*;
public class Main {
    public static int toInteger(String num)
	{
		int n=0;
		for(int i=0; i<num.length(); i++)
		{
			char ch= num.charAt(i);
			n= n*10+ ((int)ch-48); 
		}
		
		return n;
	}
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String n= sc.next();
        System.out.println(toInteger(n));
    }
}
```
27. Write a program to print 1 to 100 without using loop
```java
import java.util.*;
public class Main {
    public static void print100(int n)
	{
		if(n==100) 
		{
			System.out.println(100);
			return;
		}
		System.out.print(n+" ");
		print100(n+1);
		
	}
    
    public static void main(String[] args) {
        print100(1);
    }
}
```
28- Write a program for swapping of two numbers without using extra variable.<br>
35- Write a program to swap two numbers.<br>
36- Write a program to swap two numbers without using third variable.
```java
import java.util.*;
public class Main {
    public static void swap()
	{
		int a=10;
		int b=20;
		System.out.println(a+" "+b);
		a= a^b;
		b=a^b;
		a=a^b;
		System.out.println(a+" "+b);
	}
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        System.out.println(a+" "+b);
		a= a^b;
		b=a^b;
		a=a^b;
		System.out.println(a+" "+b);
    }
}
```
29.  Program to find largest of n numbers
```java
import java.util.*;
public class Main {
    public static int largest(int nums[])
	{
		int max=Integer.MIN_VALUE;
		for(int num:nums)
		{
			if(max<num) max= num;
		}
		
		return max;
	}
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int a[]= new int[n];
        for(int i=0; i<n;i++) a[i]= sc.nextInt();
        System.out.println(largest(a));
    }
}
```
30. Split number into digits
```java
import java.util.*;
public class Main {
    public static ArrayList<Integer> toDigits(int n)
	{
		ArrayList<Integer> digits= new ArrayList<>();
		while(n!=0) {
			digits.add(n%10);
			n=n/10;
		}
		Collections.reverse(digits);
		return digits;
	}
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(toDigits(n));
    }
}
```

31. Write a program to count number of digits in a number
```java
import java.util.*;
public class Main {
    public static int countDigits(int n)
	{
		int count=0;
		while(n!=0) {
			count++;
			n=n/10;
		}
		return count;
	}
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(countDigits(n));
    }
}
```
32. Write a program to find out L.C.M. of two numbers.
33. Write a program to find out H.C.F. of two numbers.
34. Write a program to find out G.C.D. of two numbers.
```java
import java.util.*;
public class Main {
    public static int lcm(int a,int b)
	{
		int hcf=gcd(a,b);
		return a*b/hcf;
	}
	
	public static int gcd(int a, int b)
	{
		// base case
		if(a%b==0)
			return b;

		// recursive case
		else
			return gcd(b,a%b);
	}
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        System.out.println(lcm(a,b));
        System.out.println(gcd(a,b));
    }
}
```
37. Write a program for swapping of two arrays.
```java
import java.util.*;
public class Main {
	 
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        int m= sc.nextInt();
        int a[]=new int[m]; 
		for(int i=0;i<m;i++) a[i]=sc.nextInt();
        
        int n= sc.nextInt();
        int b[]=new int[n]; 
        for(int i=0;i<n;i++) b[i]=sc.nextInt();
        
		System.out.print("[");
		for(int x: a) System.out.print(x+", ");
		System.out.println("]");
		
        System.out.print("[");
		for(int x: b) System.out.print(x+", ");
		System.out.println("]");
		
        int t[]= a;
		a=b;
		b=t;
		
        System.out.print("[");
		for(int x: a) System.out.print(x+", ");
		System.out.println("]");
		
        System.out.print("[");
		for(int x: b) System.out.print(x+", ");
		System.out.println("]");
    }
}
```
38. Write a program for swapping of two string.
```java
import java.util.*;
public class Main {
	
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String a= sc.nextLine();
        String b= sc.nextLine();
        
        System.out.println(a+" "+b);
		String t=a;
        a=b;
		b=t;
		System.out.println(a+" "+b);
    }
}
```
39. Write a program to convert decimal number to binary number.
40. Write a program to convert decimal number to octal number.
41. Write a program to convert decimal number to hexadecimal number.
42. Write a program to convert octal number to binary number.
43. Write a program to convert octal number to decimal number.
44. Write a program to convert octal number to hexadecimal number.
45. Write a program to convert hexadecimal number to binary number.
46. Write a program to convert hexadecimal number to octal number.
47. Write a program to convert hexadecimal number to decimal number.
48. Write a program to convert binary number to octal number.
49. Write a program to convert binary number to decimal number.
50. Write a program to convert binary number to hexadecimal number.
```java

// Approach: source base -> decimal base -> destination base
import java.util.*;  
public class Main{
  
    public static int getAnyBase(int s, int d, int n)
    {
       
      int sum=0;
      int count=0;
    
	  // source base -> Decimal
      while(n!=0)
      {
          sum= sum +(n%10)*(int) Math.pow(s,count++);
          n=n/10;
      }
      
      n=sum; count=sum=0;
      // decimal -> destination base
      while(n !=0)
      {
           sum= sum+ n%d*(int)Math.pow(10,count++);
           n=n/d;
      }
       
       return sum;
       
   }

    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int sourceBase = scn.nextInt();
      int  destBase= scn.nextInt();
     
      int ans= getAnyBase(sourceBase,destBase,n);
     
      System.out.println(ans);
   }   
   
  }
  ```
51. Write a program for addition of binary numbers
52. Write a program for multiplication of two binary numbers
```java
import java.util.*;
public class Main {
	
    public static int binSum(int n1, int n2)
	{
       
       int ans=0, carry=0;
       int power=1;
       while(n1!=0 || n2!=0 || carry!=0)
       {
           int r1=n1%10;
           int r2=n2%10;
           int s= r1+r2+carry;
           
           ans=ans+ s%2*power;
           carry= s/2;
           power*=10;
           n1=n1/10;
           n2=n2/10;
       }
       
      return ans;   
	}
    public static int binProduct(int n1, int n2){
	     // write your code here
	     
	     int ans=0;
	     int pow=1;
	     while(n1!=0)
	     {
	         ans= binSum(ans,getProductWithSingleDigit(n2,n1%10)*pow);
	         n1/=10;
	         pow*=10;
	     }
	     
	     return ans;
	     
	 }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n1= sc.nextInt();
        int n2= sc.nextInt();
        System.out.println(binSum(n1,n2));
        System.out.println(binProduct(n1,n2));
    }
}
```
53. Write a program fractional binary conversion from decimal.
54. Write a program for fractional decimal to binary fraction conversion.
```java
import java.util.*;
public class Main {
	
    public static int getProductWithSingleDigit( int n2, int l1)
	 {
	     int carry=0;
	     int ans=0;
	     int pow=1;
	     while(n2!=0 || carry!=0)
	     {
	         int l2= n2%10;
	         int p= l2*l1+carry;
	         
	         int r= p%2;
	         carry= p/2;
	         
	         ans= ans + r*pow;
	         
	         pow*=10;
	         n2/=10;
	         
	     }
	     
	     return ans;
	 }
	 
	 public static String decToFracBin(double num,int p)
	 {
		 int n= (int)num;
		 double frac= num-n;
		 
		 int bin= decToBin(n);
		 
		 if(frac==0) return bin+"";
		 String ans=bin+".";
		 
		 while(p-->0)
		 {
			 frac=frac*2;
			 ans+= (int)frac;
             frac-= (int)frac;
		 }
		 
		 return ans;
	 }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int p= sc.nextInt();
        System.out.println(decToFracBin(n,p));
    }
}
```
55. Write a program to convert decimal number to roman.
```java
import java.util.*;
public class Main {
	
    public static String convertToRoman(int n)
	 {
		 int[] decimal = new int[] {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
		 String[] roman = new String[] {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
	
		 String ans = "";
		 int i = 0;
	
		 while (n > 0) 
		 {
			 if (n >= decimal[i]) 
			 {
				 ans += roman[i];
				 n -= decimal[i];
			 } 
			 else i++;
			 
		 }
		 
		 return ans;
	 }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(convertToRoman(n));
    }
}
```
56. Write a program to convert roman number to decimal number.
```java
import java.util.*;
public class Main {
    
    public static int romanToInt(String s)
    {
        HashMap<Character,Integer> roman = new HashMap<>() 
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);
        
        int sum = 0;
        int n = s.length();

        for(int i = 0; i < n; i++) 
        {
            if (i != n - 1 && roman.get(s.charAt(i)) < roman.get(s.charAt(i + 1)))
            {
                sum += roman.get(s.charAt(i + 1)) - roman.get(s.charAt(i));
                i++;
            } 
            else sum += roman.get(s.charAt(i));
            
        }
        return sum;
    }    

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String n= sc.next();
        System.out.println(romanToInt(n));
    }
}
```
57. Write a program to convert each digits of a number in words
```java
import java.util.*;
public class Main {
	
    public static String digitsToWords(int num)
	 {
		 String nums[]= {"zero","one","two","three","four","five","six","seven","eight","nine"};
		 String ans="";
		 while(num!=0)
		 {
			 ans= nums[num%10]+" "+ans;
			 num/=10;
		 }
		 
		 return ans;
 	  }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(digitsToWords(n));
    }
}
```
58. Write a program to convert currency or number in word.
```java
import java.util.*;
public class Main {
	
    static String one[] = { "", "one ", "two ", "three ", "four ",
                            "five ", "six ", "seven ", "eight ",
                            "nine ", "ten ", "eleven ", "twelve ",
                            "thirteen ", "fourteen ", "fifteen ",
                            "sixteen ", "seventeen ", "eighteen ",
                            "nineteen " };

	// Strings at index 0 and 1 are not used, they is to
	// make array indexing simple
	static String ten[] = { "", "", "twenty ", "thirty ", "forty ",
                            "fifty ", "sixty ", "seventy ", "eighty ",
                            "ninety " };
		
	static String numToWords(int n, String s)
	{
		String str = "";
		
		if (n > 19) str += ten[n / 10] + one[n % 10];
		else str += one[n];
		
		if (n != 0) str += s;

		return str;
	}
		

	static String convertToWords(long n)
	{
		String out = "";
		
		out += numToWords((int)(n / 10000000), "crore ");
		out += numToWords((int)((n / 100000) % 100), "lakh ");
		out += numToWords((int)((n / 1000) % 100), "thousand ");	
		out += numToWords((int)((n / 100) % 10), "hundred ");
		if (n > 100 && n % 100 > 0) out += "and ";
		out += numToWords((int)(n % 100), "");
		
		return out;
	}
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long n= sc.nextInt();
        System.out.println(convertToWords(n));
    }
}
```

59. WAP to print the sum and product of digits of an integer.
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int s,p;
		s=0;p=1;
		while(num!=0)
		{
			int r= num%10;
			s+=r;
			p*=r;
			num/=10;
		}
		
		System.out.printf("sum= %d \n product= %d",s,p);

    }
}
```
61. WAP to compute the sum of the first n terms of the following series S = 1+1/2+1/3+1/4+……
63. WAP to compute the sum of the first n terms of the following series S =1-2+3-4+5…………….

```java
import java.util.*;
public class Main {
	public static int seriesSum(int n)
	{
		int s=0;
		for(int i=1;i<=n;i++) s= s+ 1/i;
		
		return s;
	}
	
	public static int seriesSum2(int n)
	{
		int s=0;
		for(int i=1;i<=n;i++)
		{
			if(i%2==0) s-=i;
			else s+=i;
		}
		
		return s;
	}
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(seriesSum(n));
        System.out.println(seriesSum2(n));
    }
}
```


67. Write a function to find whether a given no. is prime or not. Use the same to generate the prime numbers less than 100.
```java
import java.util.*;
public class Main {
    
    public static boolean isPrime(int num)
	{
		for(int i = 2; i<=Math.sqrt(num); i++)
		{
			if(num%i==0) return false;
		}
		return true;
	}
    
    public static void generatePrime()
	{
		for(int i=2;i<100;i++)
			if(isPrime(i)) 
				System.out.print(i+" ");
		System.out.println();
	}    

    public static void main(String[] args) {
        generatePrime();
    }
}
```
68. WAP to compute the factors of a given number.
```java
import java.util.*;
public class Main {
    
    public static void factors(int num)
	{
		for(int i=1; i<=Math.sqrt(num);i++)
			if(num%i==0) System.out.print(i+" ");
		System.out.println(num);
	}  

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        factors(n);
    }
}
```
69. Write a macro that swaps two numbers. WAP to use it.
```java
// Note: java does not hava macros, therefore using lambda.
import java.util.*;
public class Main {
    interface Swappable
    {
        void swap(int []a, int b[]);
    }
    
    static Swappable swappable= (x,y)->{
        System.out.println(x[0]+" "+y[0]);
        int[] t= x;
        x=y;
        y=t;
        System.out.println(x[0]+" "+y[0]);
    };
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a[]=new int[1];
        a[0]= sc.nextInt();
        
        int b[]=new int[1];
        b[0]= sc.nextInt();
        swappable.swap(a,b);
        
    }
}
```
70. WAP to print a triangle of stars as follows (take number of lines from user): <br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; \*<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; \* \* \*<br>
&nbsp;&nbsp;&nbsp;&nbsp; \* \* \* \* \*<br>
&nbsp;&nbsp; \* \* \* \* \* \* \*<br>
&nbsp;\* \* \* \* \* \* \* \* \*<br>

```java
public class Main {

  public static void main(String[] args) {
    int rows = 5, k = 0;

    for (int i = 1; i <= rows; ++i, k = 0) {
      for (int space = 1; space <= rows - i; ++space) {
        System.out.print("  ");
      }

      while (k != 2 * i - 1) {
        System.out.print("* ");
        ++k;
      }

      System.out.println();
    }
  }
}
```
71.  WAP to perform following actions on an array entered by the user:<br>
i) Print the even-valued elements<br>
ii) Print the odd-valued elements<br>
iii) Calculate and print the sum and average of the elements of array<br>
iv) Print the maximum and minimum element of array<br>
v) Remove the duplicates from the array<br>
vi) Print the array in reverse order<br>
The program should present a menu to the user and ask for one of the options. The menu should also include options to re-enter array and to quit the program.
```java
import java.util.*;
public class Main {
    public static void operations(int nums[])
	{	
		System.out.print("even: ");
		for(int n:nums)
			if(n%2==0) System.out.print(n+" ");
		System.out.println();
		
		System.out.print("odd: ");
		for(int n:nums)
			if(n%2!=0) System.out.print(n+" ");
		System.out.println();
		
		int s=0;
		for(int n:nums)
			s+=n;
		System.out.printf("sum: %d \n avg: %d \n", s,(s/nums.length));
		
		int max,min;
		max=min=nums[0];
		for(int n:nums)
		{
			max= Math.max(max, n);
			min= Math.min(min, n);
		}
		
		System.out.printf("max: %d \n min: %d \n", max,min);
		
		HashSet<Integer> set= new HashSet<>();
		for(int n:nums) set.add(n);

		System.out.println(set);
		
		System.out.print("elements in reverse: ");
		for(int i=nums.length-1;i>=0;i--) System.out.print(nums[i]+" ");
		
		System.out.println();
	}
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int a[]=new int[n];
        for(int i=0; i<n;i++) a[i]= sc.nextInt();
        
        operations(a);
        
    }
}
```
72. Write a program which takes the radius of a circle as input from the user, passes it to another function that computes the area and the circumference of the circle and displays the value of area and circumference from the main() function.
```java
import java.util.*;
public class Main {
    public static double circumference(double r)
	{
		return 2*3.14*r;
	}
	
	public static double area(double r)
	{
		return 3.14*r*r;
	}
	
	public static void areaCircum(double r)
	{
		System.out.printf("area: %d \n circumference \n", area(r),circumference(r));
	}
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int r= sc.nextInt();
        areaCircum(r);
    }
}
```
73. Given two ordered arrays of integers, write a program to merge the two-arrays to get an ordered array.
```java
import java.util.*;
public class Main {
    public static int[] merge(int A[], int m, int B[], int n) {
		int i = m - 1, j = n - 1, k = m + n;
        int M[]= new int[k];
        
        while(i >= 0 && j >= 0) M[k++] = A[i] < B[j] ? A[i++] : B[j++];
        
        while(i <m) M[k++] = A[i++];
        
        while(j < n) M[k++] = B[j++];
        
        return M;
    }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int m= sc.nextInt();
        int a[]=new int[m];
        for(int i=0; i<n;i++) a[i]= sc.nextInt();
        
        int n= sc.nextInt();
        int b[]=new int[n];
        for(int i=0; i<n;i++) b[i]= sc.nextInt();
        int M[]= merge(a,b);
        for(int n:nums) System.out.print(n+" ");
        System.out.println();
    }
}
```
74. WAP to display Fibonacci series (i)using recursion, (ii) using iteration
```java
import java.util.*;
public class Main {
    
	static int dp[];
    static int fib(int n)
    {
    if (n <= 1)
       return n;
        
    if(dp[n]!=0) return dp[n];
    
    return dp[n]=fib(n-1) + fib(n-2);
    }
	
	public static void fibonacci(int n)
	{
		if(n==0) return;
		if(n>0) System.out.print(0+" ");
		if(n>1) System.out.print(1+" ");
		int a=0,b=1,c=0;
		for(int i=2; i<n;i++)
		{
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
		System.out.println();
	}
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);        
        int n= sc.nextInt();
        dp=new int[n];
        dp[1]=1;
        fibonacci(n);
        for(int i=0;i<n;i++) System.out.println(fib(i));
        
    }
}
```
75. WAP to calculate Factorial of a number (i)using recursion, (ii) using iteration
```java
import java.util.*;
public class Main {
    
    public static int fact(int n)
    {
        if (n==0|| n==1) return 1;
        return n*fact(n-1);
    }

	public static int factorial(int num)
	{
		if (num==0|| num==1) return 1;
		int f=1 ;
		for(int i=num; i>1; i--) f*=i;
		return f;
	}

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);        
        int n= sc.nextInt();
        System.out.println(factorial(n));
        System.out.println(fact(n));
        
    }
}
```
76. WAP to calculate GCD of two numbers (i) with recursion (ii) without recursion.
```java
import java.util.*;
public class Main {
    public static int gcd(int a, int b)
	{
		// base case
		if(a%b==0)
			return b;

		// recursive case
		else
			return gcd(b,a%b);
	}
    public static int gcd2(int a, int b)
    {
        while (b != 0)
        {
            long temp = b;
            b = a % b; 
            a = temp;
        }
        return a;    
    }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);        
        int a= sc.nextInt();
        int b= sc.nextInt();
        System.out.println(gcd(a,b));
        System.out.println(gcd2(a,b));
        
    }
}
```