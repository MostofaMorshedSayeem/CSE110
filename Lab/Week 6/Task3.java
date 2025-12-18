import java.util.*;

public class Task3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Names of the spells:");
        System.out.println();

        String longestSpell = "";

        while (true) {
            String input = sc.nextLine();

            if (input.equals("stop")) {
                break;
            }

            String cleanedSpell = "";
            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                    if (ch >= 'a' && ch <= 'z') {
                        ch = (char) (ch - 32);
                    }
                    cleanedSpell = cleanedSpell + ch;
                }
            }

            if (cleanedSpell.length() > longestSpell.length()) {
                longestSpell = cleanedSpell;
            }
        }

        int powerLevel = 0;
        for (int i = 0; i < longestSpell.length(); i++) {
            powerLevel = powerLevel + (int) longestSpell.charAt(i);
        }

        System.out.println("Largest Spell : " + longestSpell);
        System.out.println("Power Level : " + powerLevel);

        sc.close();
    }
}
