import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int row = 1; row <= n; row++) {

            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }

            if (row == 1) {
                System.out.println(n);
                continue;
            }

            if (row == n) {
                for (int col = 1; col <= n; col++) {
                    System.out.print(col);
                }
                System.out.println();
                continue;
            }

            System.out.print(n - row + 1);

            for (int space = 1; space <= row - 2; space++) {
                System.out.print(" ");
            }

            System.out.println(n);
        }

        sc.close();

    }
}
