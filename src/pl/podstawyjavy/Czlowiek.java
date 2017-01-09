package pl.podstawyjavy;

/**
 * Created by RENT on 2016-12-06.
 */
public class Czlowiek {

    private double waga;
    private String imie;
    private String nazwisko;

    public Czlowiek(double waga, String imie, String nazwisko) {
        this.waga = waga;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public double getWaga() {
        return waga;
    }

    public void setWaga(double waga) {
        this.waga = waga;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void printData() {
        System.out.println(imie + " " + nazwisko + " waga: " + waga);
    }

    public static Czlowiek createFrom(String fullname){
        String imie = "";
        String nazwisko = "";

        String[] split = fullname.split(" ");
        imie = split[0];
        nazwisko = split [1];
    Czlowiek czlowiek = new Czlowiek(80, imie, nazwisko);
        return czlowiek;
    }
}

