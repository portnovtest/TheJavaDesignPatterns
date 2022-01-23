package com.javamasterclass.chainofresponsibilityexample;

public class DollarTwentyDispenser implements DispenseChain {
    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        chain = nextChain;
    }

    @Override
    public void dispense(Currency cur) {
        if (cur.getAmount() >= 20) {
            var num = cur.getAmount() / 20;
            var remainder = cur.getAmount() % 20;
            System.out.printf("Dispensing %d $20 note", num);
            if (remainder != 0) {
                this.chain.dispense(new Currency(remainder));
            }
        } else {
            this.chain.dispense(cur);
        }
    }
}
