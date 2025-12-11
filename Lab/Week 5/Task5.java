import java.util.Scanner;

public class Task5 {
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

            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }

            for (int col = row - 1; col >= 1; col--) {
                System.out.print(col);
            }

            System.out.println();
        }

        sc.close();
    }
}
