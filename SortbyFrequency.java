package Leetcode;
//Given an array of integers nums, sort the array in increasing order based on the frequency of the values. If multiple values have the same frequency, sort them in decreasing order.
//
//Return the sorted array.
//
//
//
//Example 1:
//
//Input: nums = [1,1,2,2,2,3]
//Output: [3,1,1,2,2,2]
//Explanation: '3' has a frequency of 1, '1' has a frequency of 2, and '2' has a frequency of 3.

import java.util.HashMap;
import java.util.HashSet;

class sort
{
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        HashSet<Integer> set=new HashSet<>();
        int[] arr=new int[nums.length+1];
        for(int i : nums)
        {
            int val=map.get(i);
            if(map.containsKey(i))
            {
                map.put(i,val++);
            }
            else
                map.put(i,1);
        }
        int i=0;
        while(nums.length!=arr.length)
        {

        }
        return nums;
    }
}
public class SortbyFrequency {
    public static void main(String[] args)
    {
        int[] arr={1,1,2,2,2,3};

    }
}
