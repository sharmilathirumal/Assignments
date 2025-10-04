package org.solidPrinciple.liskov.bad;

public class MainProgram {
    public static void main(String[] args) {
        LoanPayment homeLoan = new CreditCardLoan();
        LoanClosureService loanClosureService = new LoanClosureService(homeLoan);
        loanClosureService.foreCloseLoan();
    }
}
