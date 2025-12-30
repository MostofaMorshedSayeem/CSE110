# 🎯 Question 4 - Account Creation System
## User Account Registration System (10 Marks)

A software company is developing a user registration module for their new application. The system needs to register exactly 3 user accounts, where each account consists of a unique username and a password.

As a Java developer, your task is to write a program that handles user account creation with the following validation rules:

The program must ensure that each `username is unique` (not already registered in the system). If a username already exists, display "The username already exists" and prompt the user to enter a different username.

The `password must be exactly 8 characters long`. If the password length is not exactly 8 characters, display "Password length did not match" and prompt the user to re-enter the username.

When both username and password are valid, display "Account creation successful" and proceed to the next account registration. The program should continue until exactly 3 accounts are successfully created.

**Sample Input & Output:**

| Input | Output |
|-------|--------|
| Enter a username: john123<br>Give an 8 character password: pass1234 | Account creation successful |
| Enter a username: john123 | The username already exists |
| Enter a username: alice456<br>Give an 8 character password: short | Password length did not match |
| Enter a username: alice456<br>Give an 8 character password: alice890 | Account creation successful |
| Enter a username: bob12345<br>Give an 8 character password: secure99 | Account creation successful |

**Explanation:**

- "john123" with "pass1234" → Account creation successful (first valid account)
- "john123" (duplicate) → The username already exists (rejected, try again)
- "alice456" with "short" → Password length did not match (only 5 characters, need exactly 8)
- "alice456" with "alice890" → Account creation successful (second valid account)
- "bob12345" with "secure99" → Account creation successful (third valid account)

---

## 🎀 Solution 🎀
```java
import java.util.Scanner;

public class AccountCreationSystem {
    public static void main(String[] args) {
        String[] userName = new String[3];
        String[] password = new String[3];
        
        Scanner sc = new Scanner(System.in);
        int accountCount = 0;
        
        while (accountCount < 3) {
            System.out.println("Enter a username:");
            String user = sc.next();
            
            boolean usernameExists = false;
            for (int i = 0; i < accountCount; i++) {
                if (user.equals(userName[i])) {
                    usernameExists = true;
                    break;
                }
            }
            
            if (usernameExists) {
                System.out.println("The username already exists");
            } else {
                System.out.println("Give an 8 character password:");
                String pass = sc.next();
                
                if (pass.length() != 8) {
                    System.out.println("Password length did not match");
                } else {
                    userName[accountCount] = user;
                    password[accountCount] = pass;
                    System.out.println("Account creation successful");
                    accountCount++;
                }
            }
        }
    }
}
```
