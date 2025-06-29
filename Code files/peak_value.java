public class peak_value {
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

    public static void main(String[] args) {
        int[] arr={-3,-1,0,2,1,-2,-4,-5};
        System.out.println(peak(arr));
    }
}
