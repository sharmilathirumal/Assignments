package org.solidPrinciple.liskov.bad;

public class HomeLoan implements LoanPayment{
    @Override
    public void doPayment(int amount) {

    }

    @Override
    public void foreCloseLoan() {
        System.out.println("This is Home Lone");
    }

    @Override
    public void doRepayment(int amount) {

    }
}
