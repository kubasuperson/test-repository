package pl.podstawyjavy;

/**
 * Created by RENT on 2016-12-08.
 */
public class SavingsAccount extends AbstractAccount {
    public static final double INTEREST_RATE = 0.05;
    double money;

    @Override
    public double getMoneyAfterYear() {
        return money + money * INTEREST_RATE;
    }
}
