

public class Budget {
    public static void main(String[] args) {
        // ************
        // Project 1
        // ************

        // Listing every expense for a month

        double monthlyRent = 625.00;
        double internetService = 27.00;
        double groceryBill = 250.00;
        double monthlyAllowance = 150.00;
        double hourlyWage = 10.00;

        // Calculating the total monthly expenses, hours needed to pay for expenses, and the hours needed to save $100/month.
        
        double totalExpenses = monthlyRent + internetService + groceryBill + monthlyAllowance;
        double hours = totalExpenses/hourlyWage;
        double hoursToSave = (totalExpenses + 100.00)/hourlyWage;

        /* Printing out the student's hourly wage, every monthly expense, the total for those montly expenses, hours of work 
        needed to pay for those monthly expenses, and hours needed to save $100/month. */

        System.out.println("The student's hourly wage is $" + hourlyWage);
        System.out.println("The student's monthly expenses are: ");
        System.out.println("    Montly Rent: $" + monthlyRent);
        System.out.println("    Internet Service: $" + internetService);
        System.out.println("    Grocery Bill: $" + groceryBill);
        System.out.println("    Fun Money: $" + monthlyAllowance);
        System.out.println("The student's total monthly expenses are $" + totalExpenses);
        System.out.println("The student will have to work " + hours + " to pay for monthly expenses.");
        System.out.println("The student will have to work " + hoursToSave + " to save $100 per month.");

    }
}
