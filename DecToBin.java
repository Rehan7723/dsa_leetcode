package Leetcode;

public class DecToBin {
    public static void convert(int num)
    {
        if(num==0) return;
        int rem=num%2;
        convert(num/2);
        System.out.print(rem);
    }
    public static int maxRec(int[] arr,int n)
    {
        int max=arr[n];
        if(n==0)
            return max;
        if(max<maxRec(arr,n-1))
            max=maxRec(arr,n-1);
       // maxRec(arr,n-1);
        return max;

    }
    public static void main(String[] args)
    {
        convert(29);
        int[] arr={1,2,5,9,2,8};
       //System.out.println( maxRec(arr,(arr.length-1)));
    }
}
