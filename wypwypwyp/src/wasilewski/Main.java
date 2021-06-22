package wasilewski;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.*;
import java.text.*;
public class Main {


    public static void main(String[] args) {
        List<Uzytkownik> listaUzytkownikow = new ArrayList<>();
        List<Obiekt> listaObiektow = new ArrayList<>();

        Uzytkownik wybranyUzytkownik = null;

        listaUzytkownikow.add(new Uzytkownik("Patryk", "Wasilewski", 24));
        listaUzytkownikow.add(new Uzytkownik("Adam", "Kowalski", 55));
        listaUzytkownikow.add(new Uzytkownik("Robert", "Lewandowski", 33));

        listaObiektow.add(new Ksiazka(101, "Krzyżacy", "Henryk Sienkiewicz", 1000));
        listaObiektow.add(new Plyta(201, "Finally Rich", "Chief Keef", 12));
        listaObiektow.add(new Ksiazka(102, "Potop", "Henryk Sienkiewicz", 1000));


        boolean cont = true;
        while (cont) {
            System.out.println("Wypozyczalnia");
            System.out.println("1. Wyswietl uzytkowników i wybierz którym chcesz być");
            System.out.println("2. Wyświetl i wypożycz produkt");
            System.out.println("3. Wyswietl wypozyczone" );
            Scanner scan = new Scanner(System.in);
            int x = scan.nextInt();
            int user;
            switch (x) {
                case 1:
                    System.out.println("Uzytkownicy: ");
                    for (Uzytkownik uzytkownik : listaUzytkownikow) {
                        System.out.println(" ");
                        System.out.println("Imię: " + uzytkownik.getImie());
                        System.out.println("Nazwisko: " + uzytkownik.getNazwisko());
                    }
                    user = scan.nextInt() - 1;
                    System.out.println("Wybrano użytkownika " + listaUzytkownikow.get(user).getImie());
                    wybranyUzytkownik = listaUzytkownikow.get(user);
                    break;
                case 2:
                    for (Obiekt obiekt : listaObiektow) {
                        System.out.println(" ");
                        System.out.println("Tytuł: " + obiekt.getTytul());
                        System.out.println("Autor/wykonawca: " + obiekt.getAutor());
                        System.out.println("ID: " + obiekt.getId());
                    }
                    System.out.println("Który obiekt chcesz wypozyczyc: ");
                    int wypozyczenie = scan.nextInt() - 1;
                    wybranyUzytkownik.wypozycz(listaObiektow.get(wypozyczenie));
                    listaObiektow.remove(wypozyczenie);
                    break;

                case 3:
                    for (int i = 0; i < wybranyUzytkownik.getWypozyczenia().size(); i++){
                        System.out.println( " "  + wybranyUzytkownik.getWypozyczenia().get(i).getTytul());
                    }

                    break;

                }
            }
        }
    }
