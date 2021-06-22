package wasilewski;

import java.util.ArrayList;
import java.util.List;

public class Uzytkownik {

    private String imie;
    private String nazwisko;

    private List<Obiekt> wypozyczenia = new ArrayList<>();


    public Uzytkownik(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;

    }

    public void wypozycz(Obiekt dod) {

        wypozyczenia.add(dod);
    }




    public List<Obiekt> getWypozyczenia() {
        return wypozyczenia;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

}