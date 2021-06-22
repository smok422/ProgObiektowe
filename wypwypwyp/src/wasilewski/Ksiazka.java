package wasilewski;

public class Ksiazka extends Obiekt {

    private int iloscStron;

    public Ksiazka(int id, String tytul, String autor, int iloscStron) {
        super(id, tytul, autor);
        this.iloscStron = iloscStron;
    }


}
