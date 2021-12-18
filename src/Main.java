import java.io.*;
import java.time.LocalDate;
import java.util.Random;

public class Main {
//    public static final String PTASZNIKI_DIR = "dane_ptasznikow.ser";
/*
Projekt MP4 - Ograniczenia
 */
    public static void main(String args[]) throws Exception {

        Ptasznik p1 = new Ptasznik("PTSZ01", "Brachypelma Hamorii", 4);
    /*
       Atrybut Dynamiczny Wylinka ptasznika
       Ptasznik wraz z czasem linieje,
       w systemie pamiętamy numer wylinki danego ptasznika jednak nie pozwalamy
       by był on mniejszy niż poprzedni gdyż jest to niemożliwe
    */

        wstawEntery(1, "Atrybut Dynamiczny Wylinka ptasznika\n\n" +
                "Ptasznik wraz z czasem linieje,\n" +
                "w systemie pamiętamy numer wylinki danego ptasznika jednak nie pozwalamy\n" +
                "by był on mniejszy niż poprzedni gdyż jest to niemożliwe");
        p1.setNumerWylinki(5);
        try {
            p1.setNumerWylinki(4);
        } catch (Exception e) {
            przechwycWyjatek(e);
        }

    /*
        Atrybut Statyczny rozmiar terrarium
        Zakładamy, że ze względów zdrowia ptaszników, terrarium nie może być
        mniejsze niż nasze stałe wartości. W naszym przypadku tyczy się to
        x(szerokości), y(wysokości) oraz z(głębokości) i przyjmujemy te
        minimalną wartość jako 30.
    */


        wstawEntery(1, "Atrybut Statyczny rozmiar terrarium\n\n" +
                "Zakładamy, że ze względów zdrowia ptaszników, terrarium nie może być\n" +
                "mniejsze niż nasze stałe wartości. W naszym przypadku tyczy się to\n" +
                "x(szerokości), y(wysokości) oraz z(głębokości) i przyjmujemy te\n" +
                "minimalną wartość jako 30.");

        Terrarium terrarium = new Terrarium(30,30,30);

        try {
            terrarium.setX(2);
        } catch (Exception e) {
            przechwycWyjatek(e);
        }
    /*
       Atrybut Unique - Identyfikator Ptasznika
       Każdy ptasznik musi mieć swój unikalny identyfikator. W tym celu
       stworzono atrybut klasowy typu SET przechowujący wszystkie
       identyfikatory obecnie istniejących w sytemie ptaszników.
       Próba utworzenia ptasznika z takim samym identyfikatorem
       lub nadanie takiego samego idntyfikatora spowoduje wyjątek.
    */
        wstawEntery(1, "Atrybut Unique - Identyfikator Ptasznika\n" +
                "Każdy ptasznik musi mieć swój unikalny identyfikator. W tym celu\n" +
                "stworzono atrybut klasowy typu SET przechowujący wszystkie\n" +
                "identyfikatory obecnie istniejących w sytemie ptaszników.\n" +
                "Próba utworzenia ptasznika z takim samym identyfikatorem\n" +
                "lub nadanie takiego samego idntyfikatora spowoduje wyjątek.");

        Ptasznik p2 = new Ptasznik("PTSZ02", "Chilobrachys Sp. Electric Blue", 2);

        try {
            Ptasznik p3 = new Ptasznik("PTSZ02", "Nhandu Chromatus", 8);
        } catch (Exception e) {
            przechwycWyjatek(e);
        }


        /*
        //Trwałość ekstensji - odczyt z pliku
        try {
            ObjectPlus.readExtents(new ObjectInputStream(new FileInputStream(PTASZNIKI_DIR)));
        } catch (Exception e){
            ObjectPlus.writeExtents(new ObjectOutputStream(new FileOutputStream(PTASZNIKI_DIR)));
        }
         */
        /*
        //Realizacja Trwałej Ekstensji - serializacja zapis do pliku
        ObjectPlus.writeExtents(new ObjectOutputStream(new FileOutputStream(PTASZNIKI_DIR)));
        */
    }


    //Poniżej metody pomocnicze
    public static void przechwycWyjatek( Exception e) {
        wstawEntery(1, "-----------------------");
        wstawEntery(1,"Przechywcono wyjątek o następującej treści: ");
        wstawEntery(1);
        System.out.println(e);
        wstawEntery(1, "-----------------------");
    }


    public static void wstawEntery(int liczbaEnterów) {
        for(int i = 0; i<=liczbaEnterów; i++){
            System.out.println();
        }
    }

    public static void wstawEntery(int liczbaEnterów, String komunikat) {
        for(int i = 0; i<=liczbaEnterów; i++){
            System.out.println();
        }

        System.out.println(komunikat);
    }

    public static void komunikat( String komunikat) {
        System.out.println(komunikat);
    }


}
