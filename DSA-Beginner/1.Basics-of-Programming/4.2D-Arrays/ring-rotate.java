import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws IOException {
    // write your code here
    
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    
    int n= Integer.parseInt(br.readLine());
    int m= Integer.parseInt(br.readLine());
    
    int a[][]=new int[n][m];
    for(int i= 0; i<n; i++)
    {
        for(int j=0; j<m; j++)
            a[i][j]= Integer.parseInt(br.readLine());
    }
    
    int s=Integer.parseInt(br.readLine());;
    int r=Integer.parseInt(br.readLine());;
    shellRotate( a, s, r);
    display(a);
    
 }
 
 public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

 public static void shellRotate(int[][] a, int s, int r)
    {
        int startRow=s-1; 
        int endRow= a.length-s; 
        int startCol=s-1;
        int endCol= a[0].length-s;
        int size= 2*(endRow-startRow+ endCol-startCol);
        int l[]= new int[size];
        fill1DFrom2D(a,l,s);
        rotate(l,r);
        fill2DFrom1D(a, l, s);
    }
    
    public static void fill1DFrom2D(int[][] a, int[] l, int s)
    {
        int startRow=s-1; 
        int endRow= a.length-s; 
        int startCol=s-1;
        int endCol= a[0].length-s;
        int size= 2*(endRow-startRow+ endCol-startCol);
        int i=0;
        for(int row= startRow; row<= endRow; row++)
             l[i++]= a[row][startCol];
            
        for(int col=startCol+1; col<=endCol; col++ )
            l[i++]= a[endRow][col];
            
        for(int row= endRow-1;row>=startRow; row--)
            l[i++]= a[row][endCol];
            
        for(int col=endCol-1;col>startCol; col--)
            l[i++]= a[startRow][col];
    }
    
    public static void rotate(int[] l, int k){
        k= k% l.length;
        if(k<0)
            k+= l.length;
        reverse(l,0,l.length-1);
        reverse(l,0,k-1);
        reverse(l,k,l.length-1);
    }
    
    public static void reverse(int[] l, int s, int d){
        while(s<d){
            int t= l[s];
            l[s]= l[d];
            l[d]=t;
            s++;
            d--;
        }
    }
    
    public static void fill2DFrom1D(int[][]a,int[] l, int s)
    {
        int startRow=s-1; 
        int endRow= a.length-s; 
        int startCol=s-1;
        int endCol= a[0].length-s;
        int size= 2*((endRow-startRow)+ (endCol-startCol));
        int i=0;
        for(int row= startRow; row<= endRow; row++)
             a[row][startCol]=l[i++];
        for(int col=startCol+1; col<=endCol; col++ )
            a[endRow][col]= l[i++];
        for(int row= endRow-1;row>=startRow; row--)
            a[row][endCol]=l[i++];
        for(int col=endCol-1;col>startCol ; col--)
            a[startRow][col]=l[i++];
    }
}