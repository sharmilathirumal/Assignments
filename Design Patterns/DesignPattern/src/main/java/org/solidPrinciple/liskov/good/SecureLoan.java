package org.solidPrinciple.liskov.good;

public interface SecureLoan extends LoanPayment {
    public void foreCloseLoan();
}