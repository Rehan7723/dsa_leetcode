import java.util.ArrayList;

class Solution {
    public static void rotate(int[] nums, int k) {
        ArrayList<Integer> list= new ArrayList<>();
        for(int i: nums)
        {
            list.add(i);
        }
        while(k!=0)
        {
            Integer temp=list.getLast();
            list.removeLast();
            list.addFirst(temp);
            k--;
        }
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=list.get(i);
        }
    }
    public static void main(String[] args) {
        int[] x={1,2,3,4,5,6,7};
        rotate(x,3);
    }
}
