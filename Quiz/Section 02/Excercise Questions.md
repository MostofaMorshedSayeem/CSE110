# 🎯 Excercise Questions - Section 02

## Question 1: Number Reversal

Write a Java program that takes a number from the user, reverses it, and prints the new number.

**Sample Input & Output:**

| Sample Input | Sample Output |
|--------------|---------------|
| Enter number: 12345 | Reversed number: 54321 |
| Enter number: 9876 | Reversed number: 6789 |

---

## 🎀 Solution 🎀
```java
import java.util.Scanner;

public class NumberReversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        
        int reversed = 0;
        int original = number;
        
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        
        System.out.println("Reversed number: " + reversed);
    }
}
```

---

## Question 2: Pattern Printing

Take an integer number from the user and print a pattern using asterisks (*).

**Example 1:** If the user gives 132, the pattern to print is:
```
*
***
**
```

**Example 2:** If the user gives 9015, the pattern would be:
```
*********

*
*****
```

**Constraints:**
- The input will contain only digits (0-9)
- Each digit in the input represents the number of asterisks in that row
- A digit 0 will produce an empty line (no asterisks)

**Note:** 
- You need to convert each character digit to integer manually using: `int digit = ch - '0'`
- You can not use `Character.getNumericValue()` or `Integer.parseInt()` for this conversion.
---

## 🎀 Solution 🎀
```java
import java.util.Scanner;

public class PatternPrinting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number: ");
        String number = sc.nextLine();
        
        for (int i = 0; i < number.length(); i++) {
            char ch = number.charAt(i);
            int digit = ch - '0';
            
            for (int j = 0; j < digit; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
```

---

## Question 3: Code Output Prediction

Print the output of the following code:

```java
class Main {
    public static void main(String[] args) {
        int i = 0;
        for (;i<=10;i+=2){
            if (i>4 && i<8){
                continue;
            }
            System.out.println(i);
        }
    }
}
```

**Expected Output:**
```
0
2
4
8
10
```

**Explanation:**
- The loop starts with `i = 0` and increments by 2 each iteration (`i+=2`)
- Loop continues while `i <= 10`
- When `i` is 6 (which satisfies `i>4 && i<8`), the `continue` statement skips printing
- Therefore, 6 is not printed, but all other even numbers from 0 to 10 are printed

---


