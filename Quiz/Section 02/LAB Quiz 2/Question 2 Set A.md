# 🎯 Question 2 - Set A
## Vault Value Calculator (10 Marks)

In the digital kingdom of Digitaria, every number holds a secret code.
You are the Royal Codekeeper, and your task is to calculate the "Vault Value"
of a given number by following specific rules.

**Rules for calculating Vault Value:**

- For every `even` digit, `add the square of that digit` to the Vault Value.
- For every `odd digit` that is less than 5, `subtract the cube of that digit` from the Vault Value.
- For every digit that is `divisible by 3`, `add the digit` itself to the Vault Value.
- Otherwise, `subtract the digit` from the Vault Value.

After processing all digits of the number, the final result is called the Vault Value.

Write a Java program that takes a number as input from the user and prints the calculated Vault Value.

**Sample Input:**
```
46385
```

**Sample Output:**
```
Vault Value = 84
```

**Explanation:**

Processing starts from the last digit of the number:

- Last digit = 5, Vault Value change: `0 - 5 = -5`
- Next digit = 8, Vault Value change: `-5 + (8²) = -5 + 64 = 59`
- Next digit = 3, Vault Value change: `59 - (3³) = 59 - 27 = 32`
- Next digit = 6, Vault Value change: `32 + (6²) = 32 + 36 = 68`
- Next digit = 4, Vault Value change: `68 + (4²) = 68 + 16 = 84`

**Constraints:**
- Use only the `Scanner` class for input
- Use only **one loop** to process the digits
- Do **not use String or Array** for digit extraction

---

## 🎀 Solution 🎀
```java
import java.util.Scanner;

public class Vault {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input number
        System.out.print("Enter the secret number: ");
        int num = sc.nextInt();

        int vaultValue = 0;

        // Process each digit using a single loop
        while (num > 0) {
            // Extract the last digit
            int digit = num % 10;

            // Apply rules based on digit properties
            if (digit % 2 == 0) {
                // Rule 1: Even digit - add square
                vaultValue += digit * digit;
            }
            else if (digit % 2 != 0 && digit < 5) {
                // Rule 2: Odd and less than 5 - subtract cube
                vaultValue -= digit * digit * digit;
            }
            else if (digit % 3 == 0) {
                // Rule 3: Divisible by 3 - add digit
                vaultValue += digit;
            }
            else {
                // Rule 4: Otherwise - subtract digit
                vaultValue -= digit;
            }

            // Remove the last digit
            num /= 10;
        }

        // Display the final vault value
        System.out.println("Vault Value = " + vaultValue);
    }
}
```
