import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int total = 2 * n - 1;

        for (int row = 1; row <= total; row++) {
            
            int level;
            if (row <= n) {
                level = row;
            } else {
                level = 2 * n - row;
            }

            int spaces = n - level;

            for (int i = 0; i < spaces; i++) {
                System.out.print(" ");
            }

            if (level == 1) {
                System.out.println(1);
            } else {
                System.out.print(1);

                int gap = 2 * level - 3;

                for (int i = 0; i < gap; i++) {
                    System.out.print(" ");
                }

                int num = 2 * level - 1;
                System.out.println(num);
            }
        }

        sc.close();
    }
}