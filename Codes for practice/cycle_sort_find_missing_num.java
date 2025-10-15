import java.util.Arrays;

 class cycle_sort_find_missing_num {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 3, 0};
        cycle(arr);
        System.out.print("The Missing element is: ");
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=i)
                System.out.print(i);
        }


    }

    static void cycle(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                int temp = arr[correct];
                arr[correct] = arr[i];
                arr[i] = temp;
            } else
                i++;

        }
    }
}



