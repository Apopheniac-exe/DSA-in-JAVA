package Arrays;
import java.util.*;

class Hash_map {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //precompute:
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int key = arr[i];
            int freq = 0;
            if (mp.containsKey(key))
                freq = mp.get(key); // if key is in the map, then find its current frequency
            freq++; // increase the frequency of that key by 1
            mp.put(key, freq); // insert that frequency into the key and reiterate
        }

        // Iterate over the map:

        for (Map.Entry<Integer, Integer> it : mp.entrySet()) {
            System.out.println(it.getKey() + "->" + it.getValue());
        }

        int q;
        q = sc.nextInt();
        while (q-- > 0) {
            int number;
            number = sc.nextInt();
            // fetch:
            if (mp.containsKey(number))
                System.out.println(mp.get(number));

            else System.out.println(0);
        }
    }
}

