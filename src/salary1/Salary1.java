// Sajid Ahmed
// Lab 5 - If Else Conditional
// To compute the raise and new salary for an employee

package salary1;

import java.util.Scanner;
import java.text.NumberFormat;

public class Salary1 {

    public static void main(String[] args) {
        double currentSalary; // current annual salary
        int rating; // performance rating
        double raise; // dollar amount of the raise
        double newSalary; // new salary for the employee
        
        Scanner scan = new Scanner(System.in);
        // Get the current salary and performance rating
        System.out.print("Enter the current salary: ");
        currentSalary = scan.nextDouble();
        
        System.out.print("Enter the performance rating:\n "
                + "Enter 1 for Excellent, 2 for Good, or 3 for Poor: ");
        rating = scan.nextInt();
        
        // Compute the raise -- Use if...else...
        if (rating == 1)
        {
            raise = currentSalary * .06;
            newSalary = currentSalary + raise;
        }
        else if (rating == 2)
        {
            raise = currentSalary * .04;
            newSalary = currentSalary + raise;
        }
        else if (rating == 3)
        {
            raise = currentSalary * 0.015;
            newSalary = currentSalary + raise;
        }
        else
        {
            System.out.println("Invalid input");
            raise = 0;
            newSalary = currentSalary + raise;
        }
        // Print the results
        NumberFormat money = NumberFormat.getCurrencyInstance();
        
        System.out.println("Current Salary: " +
                money.format(currentSalary));
        System.out.println("Amount of your raise: " +
                money.format(raise));
        System.out.println("Your new salary: " +
                money.format(newSalary));
        System.out.println();
    }
    
}
