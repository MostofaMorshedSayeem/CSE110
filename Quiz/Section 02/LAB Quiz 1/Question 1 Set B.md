# 🎯 Question 1 - Set B
## Employee Salary Calculation After Promotion (10 Marks)

Write a Java program to calculate the new total salary of an employee after applying promotion increments and service-based bonuses.

**Promotion Increment Rules:**

The promotion increment is determined by the current salary tier:
- For salaries `up to 50,000 BDT`: apply a `5% increment`
- For salaries `between 50,001 and 100,000 BDT`: apply a `7% increment`
- For salaries `above 100,000 BDT`: apply a `10% increment`

**Service Bonus Rules:**

The bonus amount is calculated based on years of service:
- For employees with `up to 5 years of service`: apply a `5% bonus` on current salary
- For employees with `more than 5 years of service`: apply a `5% bonus` plus an `additional 1% for each year` beyond 5 years

Write the program that takes current salary and years of service as input, then calculates and prints the total new salary.

**Sample Input:**
```
Enter current salary: 90000
Enter years of service: 18
```

**Sample Output:**
```
Total New Salary: 112500.00 BDT
```

**Explanation:**

Calculation breakdown:

- Salary of 90,000 BDT falls in second tier: `90000 × 0.07 = 6300 BDT increment`
- Service of 18 years: `5% + (13 extra years × 1%) = 5% + 13% = 18% bonus`
- Bonus amount: `90000 × 0.18 = 16200 BDT`
- Total new salary: `90000 + 6300 + 16200 = 112500 BDT`

**Constraints:**
- Use only the `Scanner` class for input
- Implement the solution using basic control structures (`if`, `else`) only
- Do not use any other built-in utility methods

---

## 🎀 Solution 🎀
```java
import java.util.Scanner;

public class SetB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read user inputs
        System.out.print("Enter current salary: ");
        double currentSalary = input.nextDouble();

        System.out.print("Enter years of service: ");
        int yearsOfService = input.nextInt();

        // Calculate promotion increment based on salary tiers
        double promotionIncrease;
        if (currentSalary <= 50000) {
            // Salary ≤ 50,000: 5% increment
            promotionIncrease = currentSalary * 0.05;
        } else if (currentSalary <= 100000) {
            // Salary ≤ 100,000: 7% increment
            promotionIncrease = currentSalary * 0.07;
        } else {
            // Salary > 100,000: 10% increment
            promotionIncrease = currentSalary * 0.10;
        }

        // Calculate bonus based on years of service
        double bonusAmount;
        if (yearsOfService <= 0) {
            // No service: no bonus
            bonusAmount = 0.0;
        } else if (yearsOfService <= 5) {
            // Up to 5 years: 5% bonus
            bonusAmount = currentSalary * 0.05;
        } else {
            // Beyond 5 years: 5% + 1% per extra year
            int extraYears = yearsOfService - 5;
            bonusAmount = currentSalary * (0.05 + extraYears * 0.01);
        }

        // Calculate total new salary
        double totalNewSalary = currentSalary + promotionIncrease + bonusAmount;
        System.out.printf("Total New Salary: %.2f BDT%n", totalNewSalary);
    }
}
```
