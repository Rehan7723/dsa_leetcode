package Codeforces;

import java.util.*;
public class MatrixSumRecursion {
    static int[][] c=new int[10][10];
    public static void summ(int[][] a,int[][] b,int R,int C)
    {
        if(R<0) return;
        for(int i=0;i<C;i++)
        {
           c[R][i]=a[R][i]+b[R][i];
        }
        summ(a,b,R-1,C);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int R=sc.nextInt();
        int C=sc.nextInt();
        int[][] a=new int[10][10];
        int[][] b=new int[10][10];
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<C;j++)
                a[i][j]=sc.nextInt();
        }
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<C;j++)
                b[i][j]=sc.nextInt();
        }
        summ(a,b,R,C);
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<C;j++)
                System.out.print(c[i][j]+" ");
            System.out.println();

        }
    }
}
