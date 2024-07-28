package Leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

class PO
{
    public static int[] plusOne(int[] digits) {
        ArrayList<Integer> arr=new ArrayList<>();

        if(digits[digits.length-1]!=9)
        {
            digits[digits.length-1]++;
            return digits;
        }
        int sum=0;
        for (int digit : digits) {
            sum = (sum + digit) * 10;
            // sum*=10;
        }
        sum=sum/10;
        sum++;
        System.out.println("sum:"+sum);
        while(sum!=0)
        {
            int rem=sum%10;
            arr.add(rem);
            sum=sum/10;
        }

        Collections.reverse(arr);
        int len=(digits[0]==9)? digits.length+1 : digits.length;

       int[] res=new int[len];
       for(int i=0;i<arr.size();i++)
       {
           res[i]=arr.get(i);
       }

     return res;
    }
}
public class PlusOne {
    public static int Sqrt(int x)
    {
        int fr=0;
        if(x==1) return 1;
        while(x>=2)
        {
            if(x%2==0) fr++;
            x/=2;
        }
        System.out.println(fr);
        fr=fr/2;
        return fr*2;
    }
    public static void main(String[] args)
    {
//        int[] arr={1,2,3};
//        int[] arr1={8,9,9,9};
//        int[] x=PO.plusOne(arr1);
//        for (int j : x) {
//            System.out.println(j);
//        }
        System.out.println(Sqrt(9));
    }
}
