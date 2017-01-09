package pl.podstawyjavy;

/**
 * Created by RENT on 2016-12-06.
 */
public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
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

    @Override
    public String toString() {
        return "Punkt o wspolrzednych " + x + ", " + y;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Point){
            Point point = (Point) obj;
            if (x== point.x && y == point.y){
                return true;
            }

        }else{
            return false;
        }
        return super.equals(obj);
    }
}
