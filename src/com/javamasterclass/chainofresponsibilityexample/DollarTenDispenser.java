package com.javamasterclass.chainofresponsibilityexample;

public class DollarTenDispenser implements DispenseChain {
    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        chain = nextChain;
    }

    @Override
    public void dispense(Currency cur) {
        if (cur.getAmount() >= 10) {
            var num = cur.getAmount() / 10;
            var remainder = cur.getAmount() % 10;
            System.out.printf("Dispensing %d $10 note", num);
            if (remainder != 0) {
                this.chain.dispense(new Currency(remainder));
            }
        } else {
            this.chain.dispense(cur);
        }
    }
}
