package pl.podstawyjavy;

/**
 * Created by RENT on 2016-12-06.
 */
public class Kalkulator {

    double suma;

    double dodaj(double x, double y) {
        return x + y;
    }

    double roznica(double x, double y) {
        return x - y;
    }

    double dajSume() {
        return suma;
    }

    void zwiekszSume(double oIle) {
        suma = suma + oIle;
    }
}
