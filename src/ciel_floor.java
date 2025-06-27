public class ciel_floor {
    public static void main(String[] args) {
        int[] nums={-2,0,5,7,9,11,15,17,19};
        int target=1;
        boolean val=true;
        if(val)
        {
            System.out.println("Lowe bound is: "+ nums[bound(nums,target,val)]);
            val=false;
        }
        System.out.println("Upper bound is: "+ nums[bound(nums,target,val)]);
    }

    static int bound(int[] nums, int target, boolean val)
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
        if(val)
            return end;
        else
            return start;

    }
}