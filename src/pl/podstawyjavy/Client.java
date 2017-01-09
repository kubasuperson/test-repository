package pl.podstawyjavy;

/**
 * Created by RENT on 2016-12-11.
 */
public class Client {
    private String imie;
    private String nazwisko;
    private int rokUrodzenia;

    public Client(String imie, String nazwisko, int rokUrodzenia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.rokUrodzenia = rokUrodzenia;
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

    public double getRokUrodzenia() {
        return rokUrodzenia;
    }

    public void setRokUrodzenia(int rokUrodzenia) {
        this.rokUrodzenia = rokUrodzenia;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Client){
            Client klient = (Client) obj;
            return imie.equals(klient.imie)&& nazwisko.equals(klient.nazwisko) && rokUrodzenia == klient.rokUrodzenia;
        }

        return false;
    }
}
