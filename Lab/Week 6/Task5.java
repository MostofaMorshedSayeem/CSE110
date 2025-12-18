import java.util.*;

public class Task5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        int lastWordLength = 0;
        boolean inWord = false;

        for (int i = input.length() - 1; i >= 0; i--) {
            char ch = input.charAt(i);

            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                lastWordLength++;
                inWord = true;
            } else if (ch == ' ') {
                if (inWord) {
                    break;
                }
            }
        }

        System.out.println(lastWordLength);

        sc.close();
    }
}
