package Leetcode;
//282A
import java.util.Scanner;
public class Increment_Decrement {
    public static int update(int opp)
    {
        Scanner sc=new Scanner(System.in);
        String opr;
        int x=0;
        while(opp!=0)
        {
            System.out.println("Enter the operation:");
            opr=sc.next();
            if(opr.equals("x++")||opr.equals("++x")) {
                x++;
                opp--;
            }
            else if(opr.equals("x--")||opr.equals("--x")) {
                x--;
                opp--;
            }
            else
                System.out.println("Enter the right operation:");
        }
        return x;
    }
    public static void main(String[] args)
    {
        System.out.println(update(4));
    }
}
