public class Insert_index {
    public static void main(String[] args) {
        int[] nums={-2,0,5,7,9,11,15,17,19};
        int target=1;
        System.out.println("The insert index is = "+searchInsert(nums,target));
    }

        static int searchInsert(int[] nums, int target)

            {
                int start = 0;
                int end = nums.length - 1;

                while (start <= end) {
                    int mid = (start + end) / 2;
                    if (target > nums[mid])
                        start = mid + 1;
                    else if (target < nums[mid])
                        end = mid - 1;
                    else
                        return mid;
                }
                return end + 1;

            }
        }
