package com.javamasterclass.chainofresponsibilityexample;

public class DollarFiftyDispenser implements DispenseChain {
    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        chain = nextChain;
    }

    @Override
    public void dispense(Currency cur) {
        if (cur.getAmount() >= 50) {
            var num = cur.getAmount() / 50;
            var remainder = cur.getAmount() % 50;
            System.out.printf("Dispensing %d $50 note", num);
            if (remainder != 0) {
                this.chain.dispense(new Currency(remainder));
            }
        } else {
            this.chain.dispense(cur);
        }
    }
}
