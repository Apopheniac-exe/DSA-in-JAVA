public class BinarySearch {
    public static void main(String[] args)
    {
        int[] arr={-2,-1,0,1,2,4,5,8,46,54,65,88,99};
        int target=0;
        System.out.println(binarysearch(arr,target));

    }

    static int binarysearch(int[] arr, int target)
    {
     int start=0;
     int end=arr.length-1;

     while(start<=end)
     {
         int mid= (start+end)/2;
         if(target>arr[mid])
             start=mid+1;
         else if(target<arr[mid])
             end=mid-1;
         else
             return mid;
     }
     return -1;

    }
}