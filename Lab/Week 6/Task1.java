import java.util.Scanner;

public class Task1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Message: ");
        String message = sc.nextLine();

        int maxPin = 0;

        for (int i = 0; i < message.length() - 1; i++) {
            char first = message.charAt(i);
            char second = message.charAt(i + 1);

            if (first >= '0' && first <= '9' && second >= '0' && second <= '9') {
                int twoDigit = (first - '0') * 10 + (second - '0');

                if (twoDigit > maxPin) {
                    maxPin = twoDigit;
                }
            }
        }

        System.out.println("2-Digit PIN: " + maxPin);
        sc.close();
    }
}
