package pl.podstawyjavy;

/**
 * Created by RENT on 2016-12-07.
 */
public class Box {
    private double x;
    private double y;
    private double z;

    public Box() {
    }

    public Box(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double volume(){
        double result = x*y*z;
        return result;
    }
}

