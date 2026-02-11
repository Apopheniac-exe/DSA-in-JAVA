package Binary_search;

import java.util.Arrays;

public class FirstLast_occurrence_optimized {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 2, 2, 6, 9, 12, 12,12, 14, 14, 14, 14, 14};
        int target=2;
        System.out.println(Arrays.toString(find(nums,target)));
        count_occurance(nums);
    }

    static int[] find(int[] nums, int target) {
        int first = findFirst(nums, target);
        int last = findLast(nums, target);
        return new int[]{first, last};
    }

    static int findFirst(int[] nums, int target) {
        int start = 0, end = nums.length - 1, result = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                result = mid;
                end = mid - 1; // keep searching left
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return result;
    }

    static int findLast(int[] nums, int target) {
        int start = 0, end = nums.length - 1, result = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                result = mid;
                start = mid + 1; // keep searching right
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return result;
    }

    static void count_occurance(int[] nums)
    {
        int i=0;
        while(i<nums.length)
        {
            int[] arr=find(nums,nums[i]);
            int freq=arr[1]-arr[0]+1;
            if(freq>1)
            {
                System.out.println("The frequency of "+nums[i]+" is: "+freq);
            }
            i=arr[1]+1;

        }
    }
}
