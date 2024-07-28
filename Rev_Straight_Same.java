package Leetcode;
//41A
public class Rev_Straight_Same {
    public static boolean check(String t, String s)
    {
        if(s.length()!=t.length()) return false;
        int j=s.length()-1;
        for(int i=0;i<s.length();i++)
        {
            char ch=t.charAt(i);
            if(ch==s.charAt(j))
            {
                j--;
                continue;
            }
            return false;

        }
        return true;
    }
    public static void main(String[] args)
    {
        String t,s;
        t="case";
        s="case";
        System.out.println(check(t,s));
    }
}
