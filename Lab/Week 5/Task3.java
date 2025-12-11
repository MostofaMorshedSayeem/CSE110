import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int max = 2 * n - 1;

        for (int row = 1; row <= n; row++) {
            int width = 2 * row - 1;
            int spaces = (max - width) / 2;

            for (int i = 0; i < spaces; i++) {
                System.out.print(" ");
            }

            if (row == 1) {
                System.out.println(1);
                continue;
            }

            if (row == n) {
                for (int col = 1; col <= max; col++) {
                    System.out.print(col);
                }
                System.out.println();
                continue;
            }

            System.out.print(1);

            int gap = width - 2;
            for (int i = 0; i < gap; i++) {
                System.out.print(" ");
            }

            System.out.println(2 * row - 1);
        }

        sc.close();
    }
}
