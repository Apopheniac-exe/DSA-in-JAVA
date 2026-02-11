package Arrays;
import java.util.*;

public class Problem_1838 {

    public static int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int maxfreq = 1;

        for (int i = 0; i < nums.length; i++) {
            int tempK = k;
            int count = 1;

            for (int j = i - 1; j >= 0; j--) {
                int diff = nums[i] - nums[j];

                if (tempK >= diff) {
                    tempK -= diff;
                    count++;
                } else {
                    break;
                }
            }

            if (count > maxfreq) {
                maxfreq = count;
            }
        }

        return maxfreq;
    }

    public static void main(String[] args) {
        int[] nums = {3,9,6};
        int k = 2;
        System.out.println(maxFrequency(nums, k));
    }
}
