# 🎯 Question 1 - Set A
## Electricity Bill Calculator (10 Marks)

Write a Java program that calculates the total electricity bill for a customer.

**Billing Rules:**

The electricity charges are calculated using a tiered pricing system:
- First `100 units` are charged at `5 BDT per unit`
- Next `200 units` are charged at `7 BDT per unit`
- Any `remaining units` (beyond 300) are charged at `10 BDT per unit`

**Late Payment Penalty:**

If the payment is delayed:
- For delays `up to 14 days`: apply a `10% penalty` on the base bill
- For delays `exceeding 14 days`: apply a `10% penalty` plus an `additional 2% for each day` beyond 14 days

Write the program that takes units consumed and late payment days as input, then calculates and prints the total payable amount.

**Sample Input:**
```
Enter units consumed: 400
Enter number of days payment is late: 19
```

**Sample Output:**
```
Total Payable: 3450.50 BDT
```

**Explanation:**

Calculation breakdown:

- Base bill for 400 units: `(100 × 5) + (200 × 7) + (100 × 10) = 500 + 1400 + 1000 = 2900 BDT`
- Late by 19 days: `10% + (5 extra days × 2%) = 10% + 10% = 20% penalty`
- Penalty amount: `2900 × 0.20 = 580 BDT`
- Total payable: `2900 + 580 = 3450 BDT`

**Constraints:**
- Use only the `Scanner` class for input
- Implement the solution using basic control structures (`if`, `else`) only
- Do **not use** any other built-in utility methods

---

## 🎀 Solution 🎀
```java
import java.util.Scanner;

public class SetA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read user inputs
        System.out.print("Enter units consumed: ");
        int unitsConsumed = input.nextInt();

        System.out.print("Enter number of days payment is late: ");
        int daysLate = input.nextInt();

        // Calculate base bill using tiered pricing
        double baseBill;
        if (unitsConsumed <= 100) {
            // First 100 units at 5 BDT per unit
            baseBill = unitsConsumed * 5;
        } else if (unitsConsumed <= 300) {
            // First 100 at 5 BDT, next (up to 200) at 7 BDT
            baseBill = (100 * 5) + (unitsConsumed - 100) * 7;
        } else {
            // First 100 at 5 BDT, next 200 at 7 BDT, remaining at 10 BDT
            baseBill = (100 * 5) + (200 * 7) + (unitsConsumed - 300) * 10;
        }

        // Calculate late payment penalty
        double penaltyAmount = 0.0;
        if (daysLate > 0) {
            if (daysLate <= 14) {
                // Up to 14 days: 10% penalty
                penaltyAmount = baseBill * 0.10;
            } else {
                // Beyond 14 days: 10% + 2% per extra day
                int extraDays = daysLate - 14;
                penaltyAmount = baseBill * (0.10 + extraDays * 0.02);
            }
        }

        // Calculate total payable amount
        double totalPayable = baseBill + penaltyAmount;
        System.out.printf("Total Payable: %.2f BDT%n", totalPayable);
    }
}
```
