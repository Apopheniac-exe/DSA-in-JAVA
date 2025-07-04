public class Rotated_sorted_array {
    static boolean search(int[] arr, int target)
    {
        int start=0, end=arr.length-1;
        while(start<=end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target)
                return true;
            // for left sorted part
            if (arr[start] <= arr[mid]) {
                if (arr[start] <= target && target <= arr[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            }
            //right sorted part
            else {
                if (arr[mid] <= target && target <= arr[end])
                    start = mid + 1;
                else
                    end = mid - 1;
            }
        }
            return false;
    }

    public static void main(String[] args) {
        int[] arr={5,6,7,8,1,2,3,4};
        int target=7;
        System.out.println(search(arr,target));
    }
}
