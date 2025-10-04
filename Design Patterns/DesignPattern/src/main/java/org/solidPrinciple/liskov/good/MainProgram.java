package org.solidPrinciple.liskov.good;

import org.solidPrinciple.liskov.bad.CreditCardLoan;
import org.solidPrinciple.liskov.bad.LoanClosureService;
import org.solidPrinciple.liskov.bad.LoanPayment;

public class MainProgram {
    public static void main(String[] args) {
        LoanPayment homeLoan = new CreditCardLoan();
        org.solidPrinciple.liskov.bad.LoanClosureService loanClosureService = new LoanClosureService(homeLoan);
        loanClosureService.foreCloseLoan();
    }
}
