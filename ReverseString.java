package Leetcode;
//You are given a string s that consists of lower case English letters and brackets.
//
//        Reverse the strings in each pair of matching parentheses, starting from the innermost one.
//
//        Your result should not contain any brackets.
import java.util.Stack;

class solution
{
    public String reverse_string(String s)
    {
        int[] a=new int[100];
        Stack<String> stk=new Stack<>();
        String res="";
        for(int i=0;i<s.length();i++)
        {
            String temp="";
            //char ch=s.charAt(i);
            if(s.charAt(i)=='(')
            {
                i++;
                while(s.charAt(i)!=')')
                {
                    temp+=s.charAt(i);
                    i++;
                }
                stk.push(temp);
                //i++;
            }
            else
            {
                temp+=s.charAt(i);
                stk.push(temp);
            }

        }
        while(!stk.isEmpty())
        {
            res+=stk.pop();
        }
        return res;
    }
}
public class ReverseString {
    public static void main(String[] args)
    {
        solution obj=new solution();
        System.out.println(obj.reverse_string("abcde"));
    }
}
