import java.util.*;

public class Task4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Fan Message: ");
        String message = sc.nextLine();

        String lowerMessage = "";
        for (int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);
            }
            lowerMessage = lowerMessage + ch;
        }

        int madridCount = 0;
        int cityCount = 0;

        for (int i = 0; i <= lowerMessage.length() - 6; i++) {
            String word = "";
            for (int j = i; j < i + 6; j++) {
                word = word + lowerMessage.charAt(j);
            }
            if (word.equals("madrid")) {
                madridCount++;
            }
        }

        for (int i = 0; i <= lowerMessage.length() - 4; i++) {
            String word = "";
            for (int j = i; j < i + 4; j++) {
                word = word + lowerMessage.charAt(j);
            }
            if (word.equals("city")) {
                cityCount++;
            }
        }

        String supporter = "";
        if (madridCount > cityCount) {
            supporter = "Madrid Supporter";
        } else if (cityCount > madridCount) {
            supporter = "City Supporter";
        } else {
            supporter = "Neutral";
        }

        String sentiment = "";
        boolean hasClose = false;
        boolean hasDestroy = false;

        for (int i = 0; i <= lowerMessage.length() - 5; i++) {
            String word = "";
            for (int j = i; j < i + 5; j++) {
                word = word + lowerMessage.charAt(j);
            }
            if (word.equals("close")) {
                hasClose = true;
            }
        }

        for (int i = 0; i <= lowerMessage.length() - 7; i++) {
            String word = "";
            for (int j = i; j < i + 7; j++) {
                word = word + lowerMessage.charAt(j);
            }
            if (word.equals("destroy")) {
                hasDestroy = true;
            }
        }

        if (hasClose) {
            sentiment = "Fan expect a close match";
        } else if (hasDestroy) {
            sentiment = "Fan expects a dominating victory!";
        } else {
            sentiment = "Hard to read the fan sentiment";
        }

        System.out.println(supporter);
        System.out.println(sentiment);

        sc.close();
    }
}
