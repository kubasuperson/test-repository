package pl.podstawyjavy;

/**
 * Created by RENT on 2016-12-08.
 */
public abstract class AbstractAccount implements Account {
    protected double money;

    @Override
    public void addMoney(double amount) {
        money = money + amount;
    }
}
