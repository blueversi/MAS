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
        p1.setNumerWylinki(5);
        System.out.println(p1);
        try {
            p1.setNumerWylinki(4);
        } catch (Exception e) {
            wstawEntery(1, "-----------------------");
            wstawEntery(1,"Przechywcono wyjątek o następującej treści: ");
            wstawEntery(1);
            System.out.println(e);
            wstawEntery(1, "-----------------------");
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
