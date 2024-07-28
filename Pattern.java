package Leetcode;

public class Pattern {
    public static void patt(int n)
    {
        if(n==0) return;
        patt(n-1);
        for(int i=0;i<n;i++)
            System.out.print("* ");
        System.out.println();
    }
    public static String space(int n,int x)
    {
        String sp="";
        for(int i=0;i<n;i++)
            sp+=" ";
        return sp;
    }
    public static void pyramid(int n,int x)
    {
        if(n==0) return;
        pyramid(n-1,x+1);
        for (int j = x; j >=0; j--)
            System.out.print(" ");
        for(int i=0;i<n;i++) {

            System.out.print("* ");
        }
        System.out.println();

    }
    public static void main(String[] args)
    {
       // patt(5);
        pyramid(5,1);
    }
}
