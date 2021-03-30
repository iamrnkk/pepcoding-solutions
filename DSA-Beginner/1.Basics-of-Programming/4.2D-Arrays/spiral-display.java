import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        
        int n= Integer.parseInt(br.readLine());
        int m= Integer.parseInt(br.readLine());
        
        int a[][]= new int[n][m];
        
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
                a[i][j]= Integer.parseInt(br.readLine());
        }
        
        int startRow=0, endRow=n-1, startCol=0,endCol=m-1;
        
        printSpiral(a,startRow,endRow,startCol,endCol);
    }
    
    public static void printSpiral(int[][] a, int startRow,int endRow, int startCol, int endCol)
    {
        if(endRow < startRow || endCol < startCol) return;
        
        for(int i=startRow; i<=endRow;i++)
            System.out.println(a[i][startCol]);
        for(int i=startCol+1; i<=endCol;i++)
            System.out.println(a[endRow][i]);
        if(startCol!=endCol)
        {
            for(int i=endRow-1; i>=startRow;i--)
                System.out.println(a[i][endCol]);
        }
        
        if(startRow != endRow)
        {
            for(int i=endCol-1; i> startCol;i--)
                System.out.println(a[startRow][i]);
        }
        
        printSpiral(a,startRow+1,endRow-1,startCol+1,endCol-1);
    }

}