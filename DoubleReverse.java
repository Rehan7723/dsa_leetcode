class Solution {
    public static int reverse(int x)
    {
        int rev=0;
        while(x!=0)
        {
            int rem=x%10;
            rev=rev*10+rem;
            x/=10;
        }
        return rev;
    }
    public boolean isSameAfterReversals(int num) {
        int rev=reverse(num);
        rev=reverse(rev);
        boolean c=(num==rev)?true:false;
        return c;
    }
}
