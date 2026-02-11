package Binary_search;

public class UpperBound {
    public static void main(String[] args) {
        int[] nums={-2,0,5,7,9,11,15,17,19};
        int target=6;
        System.out.println("The Upper bound is = "+nums[upperbound(nums,target)]);
    }

    static int upperbound(int[] nums, int target)
    {
        int start=0;
        int end=nums.length-1;

        while(start<=end)
        {
            int mid= (start+end)/2;
            if(target>nums[mid])
                start=mid+1;
            else if(target<nums[mid])
                end=mid-1;
            else
                return mid;
        }
        return start;

    }
}