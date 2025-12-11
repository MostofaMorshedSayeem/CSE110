import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        int totalCol = 2 * input - 1;

        // Upper half of the rhombus
        for (int row = 1; row <= input; row++) {
            int width = 2 * row - 1;

            // For spaces
            for (int s = 1; s <= (totalCol - width) / 2; s++) {
                System.out.print("  ");
            }
            // For stars
            for (int star = 1; star <= width; star++) {
                System.out.print(star + " ");
            }
            System.out.println();
        }
        // Lower half of the rhombus
        for (int row = input - 1; row >= 1; row--) {
            int width = 2 * row - 1;
            // For spaces
            for (int s = 1; s <= (totalCol - width) / 2; s++) {
                System.out.print("  ");
            }
            // For stars
            for (int star = 1; star <= width; star++) {
                System.out.print(star + " ");
            }
            System.out.println();
        }
    }

}
