package Binary_search;

public class mountain_array {
static int Search(int[] arr, int target)
{
    int p=peak(arr);
    int val=orderagnostic(arr,target,0,p);
    if(val!=-1)
        return val;
    else
        return orderagnostic(arr,target,p+1,arr.length-1);
}

    public static int peak(int[] arr) {
        int start=0,end=arr.length-1;
        while(start<end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1])
                end= mid;
            else if(arr[mid]<arr[mid+1])
                start=mid+1;
        }
        return start;

    }
    static int orderagnostic(int[] arr, int target, int start, int end ) {
        boolean val = arr[start] < arr[end];
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
        int[] arr={1,2,3,4,5,3,1};
        int target=5;
        System.out.println(Search(arr,target));
    }
}
