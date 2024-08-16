public class Solution {
    public int solve(ArrayList<String> A) {
        String alph="abcdefghijklmnopqrstuvwxyz";
        String temp="";
        int flag=0;
        for(int i=0;i<alph.length();i++)
        {
            flag=0;
            char ch=alph.charAt(i);
            for(String j: A )
            {
                if(j.indexOf(ch)!=-1)
                {
                    flag=1;
                }
            }
            if(flag==0) return 0;
        }
        return 1;
    }
}
