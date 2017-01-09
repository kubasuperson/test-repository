package pl.podstawyjavy;

/**
 * Created by RENT on 2016-12-08.
 */
public class Vehicle {
    String model;
    String make;
    int productionYear;

    public Vehicle(String model, String make, int productionYear) {
        this.model = model;
        this.make = make;
        this.productionYear = productionYear;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public void drive(){
        System.out.println("-----" );
    }

}
