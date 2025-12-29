# 🎯 Question 3 - Set A
## Password Strength Validator (10 Marks)

A digital banking application is introducing a password strength validation system to enhance account security. Whenever a user creates or updates a password, the system must ensure that the password follows the bank's security rules.

As a Java developer, your task is to write a program that checks whether a given password is strong or weak. The password must be `at least 8 characters long` and must contain `at least one uppercase letter`, `one lowercase letter`, `one digit`, and `one special character` (any character other than a letter or digit).

The program will take the password as input and display "Strong Password" if all the conditions are satisfied; otherwise, it will display "Weak Password".

**Sample Input & Output:**

| Sample Input | Sample Output |
|--------------|---------------|
| Enter password: NewYear2k26 | Weak Password |
| Enter password: thisIs@18digitPass | Strong Password |
| Enter password: CSE110isFUN | Weak Password |

**Explanation:**

- "NewYear2k26" → Weak Password (missing special character)
- "thisIs@18digitPass" → Strong Password (contains uppercase, lowercase, digit, and special character `@`)
- "CSE110isFUN" → Weak Password (missing special character)

---

## 🎀 Solution 🎀
```java
import java.util.Scanner;

public class PasswordStrengthValidator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        if (password.length() < 8) {
            System.out.println("Weak Password");
            return;
        }

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                hasUpper = true;
            }
            else if (ch >= 'a' && ch <= 'z') {
                hasLower = true;
            }
            else if (ch >= '0' && ch <= '9') {
                hasDigit = true;
            }
            else {
                hasSpecial = true;
            }
        }

        if (hasUpper && hasLower && hasDigit && hasSpecial) {
            System.out.println("Strong Password");
        }
        else {
            System.out.println("Weak Password");
        }
    }
}
```

````
