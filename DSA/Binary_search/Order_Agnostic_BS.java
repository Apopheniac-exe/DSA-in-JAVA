package Binary_search;

public class Order_Agnostic_BS {
    static int orderagnostic(int[] arr, int target) {
        boolean val = arr[0] < arr[arr.length - 1];
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (arr[mid] == target)
                return mid;
            if (val) {
                if (target > arr[mid])
                    start = mid + 1;
                else if (target < arr[mid])
                    end = mid - 1;
            } else {
                if (target < arr[mid])
                    start = mid + 1;
                else if (target > arr[mid])
                    end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {-1,1,0,2,3,4,8,11,13,15};
        int target = 1;
        System.out.println("The index of target is = " + orderagnostic(arr, target));
    }
}
