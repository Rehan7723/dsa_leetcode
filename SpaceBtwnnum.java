package Leetcode;

import java.util.Scanner;

public class SpaceBtwnnum {
    public static void sol(int num)
    {
        if (num==0) return ;
        int rem=num%10;
        sol(num/10);
        System.out.print(rem+" ");
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter number:");
            int num=sc.nextInt();
            sol(num);
            System.out.println();
        }

       // sol(1234);
    }
}
