package Leetcode;

public class Firstrecursion {
    public static void  recur(int x)
    {
        if(x==0)
            return;
        x--;
        System.out.println("I love recurssion");
        recur(x);
    }
    public static void nToOne(int n)
    {
        if (n==0)
            return;
        System.out.println(n);
        nToOne(n-1);
    }
    public static void oneToN(int n)
    {
        if(n==0) return;
        oneToN(n-1);
        System.out.println(n);
    }
    public static void main(String[] args)
    {
        //recur(5);
       // nToOne(10);
        oneToN(10);

    }
}
