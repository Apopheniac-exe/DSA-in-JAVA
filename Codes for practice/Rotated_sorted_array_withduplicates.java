public class Rotated_sorted_array_withduplicates {
    static int search(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target)
                return mid;

            // Handle duplicates
            if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
                start++;
                end--;
            }
            // Left sorted portion
            else if (arr[start] <= arr[mid]) {
                if (arr[start] <= target && target < arr[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            }
            // Right sorted portion
            else {
                if (arr[mid] < target && target <= arr[end])
                    start = mid + 1;
                else
                    end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {3, 6, 7, 8, 1, 2, 3, 3};
        int target = 7;
        System.out.println(search(arr, target));
    }
}
