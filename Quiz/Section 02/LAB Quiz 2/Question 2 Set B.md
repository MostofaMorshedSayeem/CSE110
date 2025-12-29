# 🎯 Question 2 - Set B
## Vault Value Calculator (10 Marks)

In the wizarding world of Harry Potter, Gringotts Bank has a magical vault that protects treasures using a secret spell. Harry has been given a mysterious number by the goblins, and he must calculate its Vault Value to unlock the treasure.

**The rules of the vault are enchanted as follows:**

- If a digit is `even`, the vault considers it too heavy, and `its square is subtracted` from the Vault Value.
- If a digit is `odd` and less than or equal to 3, the vault considers it magically potent, and `its cube is added` to the Vault Value.
- If a digit is `divisible by 3`, the vault recognizes it as a lucky number and `adds the digit` itself to the Vault Value.
- All other digits are `cursed`, and `their value is subtracted` from the Vault Value.

Harry must process the entire number using only one loop — a requirement imposed by the ancient goblins' magic.

Write a program that takes a number from Harry (user) and calculates the Vault Value according to the above magical rules.

**Sample Input:**
```
Enter the secret number: 46385
```

**Sample Output:**
```
Vault Value = -94
```

**Explanation:**

Processing starts from the last digit of the number:

- Last digit = 5, Vault Value change: `0 - 5 = -5`
- Next digit = 8, Vault Value change: `-5 - (8²) = -5 - 64 = -69`
- Next digit = 3, Vault Value change: `-69 + (3³) = -69 + 27 = -42`
- Next digit = 6, Vault Value change: `-42 - (6²) = -42 - 36 = -78`
- Next digit = 4, Vault Value change: `-78 - (4²) = -78 - 16 = -94`

**Constraints:**
- Use only the `Scanner` class for input
- Use only **one loop** to process the digits
- Do **not use String or Array** for digit extraction

---

## 🎀 Solution 🎀
```java
import java.util.Scanner;

public class chamber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input number from Harry
        System.out.print("Enter the secret number: ");
        int num = sc.nextInt();

        int vaultValue = 0;

        // Process each digit using a single loop
        while (num > 0) {
            // Extract the last digit
            int digit = num % 10;

            // Apply magical vault rules
            if (digit % 2 == 0) {
                // Rule 1: Even digit (too heavy) - subtract square
                vaultValue -= digit * digit;
            }
            else if (digit % 2 != 0 && digit <= 3) {
                // Rule 2: Odd and ≤3 (magically potent) - add cube
                vaultValue += digit * digit * digit;
            }
            else if (digit % 3 == 0) {
                // Rule 3: Divisible by 3 (lucky number) - add digit
                vaultValue += digit;
            }
            else {
                // Rule 4: Cursed digit - subtract value
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
