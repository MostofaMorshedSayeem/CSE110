````markdown
# 🎯 Question 3 - Set B
## Email Validation (10 Marks)

An online platform allows users to sign up using an email address. Since the email will be used for account verification and communication, the system must check whether the entered email address is valid before completing the registration.

As a Java developer, your task is to create a program that checks the validity of an email address. The program will take an email address as input and verify it based on simple rules. The email must contain `exactly one @ symbol`, must `not contain any spaces`, and must have a valid domain name. The part of the email after `@` should contain `at least one dot (.)`, such as in example.com.

If the email follows all these rules, the program should print "Valid Email". Otherwise, it should print "Invalid Email".

**Sample Input & Output:**

| Sample Input | Sample Output |
|--------------|---------------|
| Enter email: student@bracu.ac.bd | Valid Email |
| Enter email: rased@gmail.com | Valid Email |
| Enter email: support@tripadvisor | Invalid Email |

**Explanation:**

- "student@bracu.ac.bd" → Valid Email (has exactly one `@`, no spaces, and domain has a dot)
- "rased@gmail.com" → Valid Email (has exactly one `@`, no spaces, and domain has a dot)
- "support@tripadvisor" → Invalid Email (missing dot after `@` in the domain)

---

## 🎀 Solution 🎀
```java
import java.util.Scanner;

public class EmailValidation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter email: ");
        String email = sc.nextLine();

        boolean isValid = true;
        int atCount = 0;
        int atPos = -1;

        // Check for spaces and count '@'
        for (int i = 0; i < email.length(); i++) {
            char ch = email.charAt(i);

            if (ch == ' ') {
                isValid = false;
            }

            if (ch == '@') {
                atCount++;
                atPos = i;
            }
        }

        // Must have exactly one '@'
        if (atCount != 1) {
            isValid = false;
        }

        // '@' cannot be first or last
        if (atPos == 0 || atPos == email.length() - 1) {
            isValid = false;
        }

        // Check for '.' after '@'
        boolean dotFound = false;
        for (int i = atPos + 1; i < email.length(); i++) {
            if (email.charAt(i) == '.') {
                dotFound = true;
                break;
            }
        }

        if (!dotFound) {
            isValid = false;
        }

        // Final output
        if (isValid) {
            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email");
        }
    }
}
```

````
