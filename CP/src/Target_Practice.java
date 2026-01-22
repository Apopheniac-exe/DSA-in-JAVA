import java.util.*;
public class Target_Practice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        int[][] score={
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 2, 2, 2, 2, 2, 2, 2, 2, 1},
                {1, 2, 3, 3, 3, 3, 3, 3, 2, 1},
                {1, 2, 3, 4, 4, 4, 4, 3, 2, 1},
                {1, 2, 3, 4, 5, 5, 4, 3, 2, 1},
                {1, 2, 3, 4, 5, 5, 4, 3, 2, 1},
                {1, 2, 3, 4, 4, 4, 4, 3, 2, 1},
                {1, 2, 3, 3, 3, 3, 3, 3, 2, 1},
                {1, 2, 2, 2, 2, 2, 2, 2, 2, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1} };
        while (t-- > 0) {
            char[][] a = new char[10][10];
            int points = 0;
            for (int i = 0; i < 10; i++) {
                String s = in.nextLine();
                for (int j = 0; j < 10; j++) {
                    a[i] = s.toCharArray();
                }
            }
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if (a[i][j] == 'X') {
                        points += score[i][j];
                    }
                }
            }
            System.out.println(points);
        }


    }
}




