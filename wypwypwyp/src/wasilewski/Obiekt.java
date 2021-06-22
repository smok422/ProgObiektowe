package wasilewski;

public class Obiekt {

    private int id;
    private String tytul;
    private String autor;


    public int getId() {
        return id;
    }

    public String getTytul() {
        return tytul;
    }

    public String getAutor() {
        return autor;
    }

    public Obiekt(int id, String tytul, String autor) {
        this.id = id;
        this.tytul = tytul;
        this.autor = autor;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }



}
