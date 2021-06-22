package wasilewski;


public class Plyta extends Obiekt {
    public int iloscPiosenek;

    public Plyta(int id, String tytul, String autor, int iloscPiosenek) {
        super(id, tytul, autor);
        this.iloscPiosenek = iloscPiosenek;
    }



}
