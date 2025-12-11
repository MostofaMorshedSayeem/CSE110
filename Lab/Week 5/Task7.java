import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int mid = (n + 1) / 2;

        for (int row = 1; row <= n; row++) {
            int spaces;
            if (row <= mid) {
                spaces = row - 1;
            } else {
                spaces = n - row;
            }

            for (int i = 0; i < spaces; i++) {
                System.out.print(" ");
            }

            int width = n - 2 * spaces;
            for (int col = 1; col <= width; col++) {
                System.out.print(col);
            }

            System.out.println();
        }

        sc.close();
    }
}
