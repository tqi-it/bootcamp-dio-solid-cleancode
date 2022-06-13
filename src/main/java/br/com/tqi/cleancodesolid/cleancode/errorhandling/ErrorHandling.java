package br.com.tqi.cleancodesolid.cleancode.errorhandling;

import br.com.tqi.cleancodesolid.cleancode.comprehension.UserName;

public class ErrorHandling {

    public static void main(String[] args) {
        UserName userName = new UserName("Klerisson");
        ExpensesReportDAO expensesReportDAO = new ExpensesReportDAO();
        double total = 0;

        //...

        try {
            MealExpenses mealExpenses = expensesReportDAO.getMeals(userName);
            total += mealExpenses.getTotal();
        } catch (Exception e) {
            total += getMealPerDiem();
        }
    }

    private static double getMealPerDiem() {
        // magic code
        return 0;
    }
}
