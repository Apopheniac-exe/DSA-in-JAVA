import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public static boolean[] subsequenceSumAfterCapping(int[] nums, int k) {
        int [] ca=new int[nums.length];
        boolean [] values=new boolean[nums.length];
        int x=1;
        ArrayList<Integer> seq = new ArrayList<>();
        while(x<=nums.length){
            for(int i=0;i<nums.length;i++)
            {
                ca[i]= Math.min(nums[i],x);
            }
            values[x-1]=SubSeqSum(0,ca,k,seq,0);
            x++;
        }
        return values;
    }
    static boolean SubSeqSum(int i, int[] nums, int k, ArrayList<Integer> seq,int sum){
        if(i==nums.length)
        {
            if(sum==k) {
                return true;
            }
            else
                return false;
        }
        seq.add(nums[i]);
        sum+=nums[i];
        if(SubSeqSum(i+1,nums,k,seq,sum)==true)
            return true;
        seq.remove(seq.size()-1);
        sum-=nums[i];
        if(SubSeqSum(i+1,nums,k,seq,sum)==true)
            return true;

        return false;
    }

    public static void main(String[] args) {
        int [] nums={4,5,6,3,2,9,1};
        int k=11;
        System.out.println(Arrays.toString(subsequenceSumAfterCapping(nums,k)));

    }

}
