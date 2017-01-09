package pl.podstawyjavy;

/**
 * Created by RENT on 2016-12-08.
 */
public class Car extends Vehicle{
    public Car(String model, String make, int productionYear) {
        super(model, make, productionYear);
    }

    @Override
    public void drive(){
        System.out.println("Max speed: 140");
    }

}
