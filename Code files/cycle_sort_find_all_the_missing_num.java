public class cycle_sort_find_all_the_missing_num {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        cycle_1(arr);
        System.out.print("The Missing elements are: ");
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=i+1)
                System.out.print((i+1)+" ");
        }


    }

    static void cycle_1(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i]-1;
            if (arr[i] != arr[correct]) {
                int temp = arr[correct];
                arr[correct] = arr[i];
                arr[i] = temp;
            } else
                i++;

        }
    }
}



