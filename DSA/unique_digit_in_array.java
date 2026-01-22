public class unique_digit_in_array {
    public static void main(String[] args) {
        int[] arr ={2,3,3,4,2,1,6,6,1};
        int unique=0;
        for(int n:arr)
            unique^=n;

        System.out.println(unique);
    }
}