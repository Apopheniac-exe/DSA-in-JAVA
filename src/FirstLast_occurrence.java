import java.util.Arrays;

public class FirstLast_occurrence {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 2, 2, 6, 9, 12, 12, 14, 14, 14, 14, 14};
        int target=2;
        System.out.println(Arrays.toString(find(nums,target)));
    }

    static int[] find(int[] nums, int target) {
        int start = 0, end = nums.length - 1, first = -1, last = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                first = last = mid;
                while (first > 0 && nums[first-1] == target)
                    first--;
                while (last < nums.length - 1 && nums[last+1] == target)
                    last++;
                break;
            } else if (target > nums[mid])
                start = mid + 1;
            else
                end = mid - 1;
        }
        return new int[]{first, last};
    }
}
