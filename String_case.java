package Leetcode;
//59A
public class String_case {
    public static String solution(String s)
    {
        String res="";
        int up=0,low=0;
        for(char ch: s.toCharArray())
        {
            if(Character.isUpperCase(ch)) up++;
            else
                low++;
        }
        if(low<up) res=s.toUpperCase();
        else
            res=s.toLowerCase();
        return res;
    }
    public static void main(String[] args)
    {
        String s="HoUse";
        System.out.println(solution(s));
        s="ViP";
        System.out.println(solution(s));
        s="maTRIx";
        System.out.println(solution(s));
    }
}
