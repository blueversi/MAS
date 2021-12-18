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
       Ograniczenie Atrybut Dynamiczny Wylinka ptasznika
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
        Ograniczenie Atrybut Statyczny rozmiar terrarium
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
       Ograniczenie Unique - Identyfikator Ptasznika
       Każdy ptasznik musi mieć swój unikalny identyfikator. W tym celu
       stworzono atrybut klasowy typu SET przechowujący wszystkie
       identyfikatory obecnie istniejących w sytemie ptaszników.
       Próba utworzenia ptasznika z takim samym identyfikatorem
       lub nadanie takiego samego idntyfikatora spowoduje wyjątek.
    */
        wstawEntery(1, "Atrybut Unique - Identyfikator Ptasznika\n\n" +
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
       Ograniczenie Subset
       Aby hodowca mógł zajmować się rozmnażaniem ptasznika musi posiadać
       rolę 'Rozmnaza" jednak aby mogl taką role otrzymać musi być najpierw
       opiekunem zwierzęcia. Z pomocą klasy ObjectPlusPlus i ObjectPlus4
       przed nadaniem roli "Rozmnaza" sprawdzamy czy dany hodowca jest
       opiekunem ptasznika. W 1 przypadku udaje się dodać te role gdyż
       Jan Kowalski opiekuje się ptasznikiem p1. Natomiast potem próbujemy
       nadać mu te role dla ptasznika p2 otrzymujemy exception, gdyż nie jest
       on jego opiekunem.
    */
        wstawEntery(1, "Ograniczenie Subset - Rozmnazac moze tylko Opiekun\n\n" +
                "Aby hodowca mógł zajmować się rozmnażaniem ptasznika musi posiadać\n" +
                "rolę 'Rozmnaza\" jednak aby mogl taką role otrzymać musi być najpierw\n" +
                "opiekunem zwierzęcia. Z pomocą klasy ObjectPlusPlus i ObjectPlus4\n" +
                "przed nadaniem roli \"Rozmnaza\" sprawdzamy czy dany hodowca jest \n" +
                "opiekunem ptasznika. W 1 przypadku udaje się dodać te role gdyż\n" +
                "Jan Kowalski opiekuje się ptasznikiem p1. Natomiast potem próbujemy\n" +
                "nadać mu te role dla ptasznika p2 otrzymujemy exception, gdyż nie jest\n" +
                "on jego opiekunem.");


        Cerytfikat c1 = new Cerytfikat("Nazwa certyfikatu", 2021 );
        Hodowca h1 = new Hodowca("Jan", "Kowalski", 34, c1);
        wstawEntery(1);
        try {
            h1.addLink("Opiekun", "Ptasznik", p1);

            h1.addLink_subset("Rozmnaza", "Ptasznik", "Opiekun", p1);

            // Show links info
            h1.showLinks("Opiekun", System.out);
            h1.showLinks("Rozmnaza", System.out);

            //Odkomentowanie poniższej lini usunie exeption
            //h1.addLink("Opiekun", "Ptasznik", p2);
            h1.addLink_subset("Rozmnaża", "Ptasznik", "Opiekun", p2);

        } catch (Exception e) {
            przechwycWyjatek(e);
        }

    /*
       Ograniczenie Ordered - Sortowanie ekstensji karmowki
       Ekstensja karmowki musi byc posortowana alfabetycznie
       po nazwie gatunkowej. Zrealizowane przy pomocy Collections.sort
       i metody compare. Poza 1 instancją karaczana madagaskarskiego
       i 1 karaczana argentyńskiego pozostałe są generowane losowo.
    */

        wstawEntery(1, "Ograniczenie Ordered - Sortowanie ekstensji karmowki\n\n" +
                "Ekstensja karmowki musi byc posortowana alfabetycznie\n" +
                "po nazwie gatunkowej. Zrealizowane przy pomocy Collections.sort\n" +
                "i metody compare. Poza 1 instancją karaczana madagaskarskiego\n" +
                "i 1 karaczana argentyńskiego pozostałe są generowane losowo.");


        Karmowka k1 = new Karmowka("Karaczan Madagaskarski", "Imago");
        Karmowka k2 = new Karmowka("Karaczan Argentynski", "Imago");
        Karmowka k3 = Karmowka.generujLosowaKarmowke();
        Karmowka k4 = Karmowka.generujLosowaKarmowke();
        Karmowka k5 = Karmowka.generujLosowaKarmowke();
        Karmowka k6 = Karmowka.generujLosowaKarmowke();
        Karmowka k7 = Karmowka.generujLosowaKarmowke();
        Karmowka k8 = Karmowka.generujLosowaKarmowke();
        Karmowka k9 = Karmowka.generujLosowaKarmowke();
        Karmowka k10 = Karmowka.generujLosowaKarmowke();

        wstawEntery(1);
        Karmowka.wyswietlKarmowke();


    /*
       Ograniczenie History - Klasa pośrednicząca karmienie
       Ogarniczenie History realizuje z pomocą klasy pośredniczącej Karmienie
       i jej asocjacjami binarnymi z klasa Ptasznik i Karmowka. History ze względu
       na czasowy aspekt jakim jest data karmienia.
    */

        wstawEntery(1, " Ograniczenie History - Klasa pośrednicząca karmienie\n\n" +
                "Ogarniczenie History realizuje z pomocą klasy pośredniczącej Karmienie\n" +
                "i jej asocjacjami binarnymi z klasa Ptasznik i Karmowka. History ze względu\n" +
                "na czasowy aspekt jakim jest data karmienia. ");

        Karmienie karmieni1 = new Karmienie(LocalDate.now(), ((int)(Math.random() * 10)));
        Karmienie karmieni2 = new Karmienie(LocalDate.now(), ((int)(Math.random() * 10)));
        Karmienie karmieni3 = new Karmienie(LocalDate.now(), ((int)(Math.random() * 10)));

        karmieni1.addLink("Ptasznik", "Karmienie", p1);
        karmieni1.addLink("Karmowka", "Karmienie", k1);
        karmieni2.addLink("Ptasznik", "Karmienie", p1);
        karmieni2.addLink("Karmowka", "Karmienie", k1);
        karmieni3.addLink("Ptasznik", "Karmienie", p2);
        karmieni3.addLink("Karmowka", "Karmienie", k2);

        wstawEntery(1, "Wyswietlamy karmienia jakie zaszły dla Ptasznika p1");
        p1.showLinks("Karmienie", System.out);

        wstawEntery(1, "Wyswietlamy karmienia jakie zaszły dla Karmowki k2");
        k2.showLinks("Karmienie", System.out);



    /*
       Ograniczenie Własne - Rok wydania certyfikatu
       Aby stworzyć hodowce potrzba podać jego certyfikat.
       Jednak zleceniodawca systemu zastrzegł, że nie chce
       mieć sytuacji, w której zarejestruje hodowce, który
       uzyskał certyfikat przed 2020 rokiem ze względu na
       znaczące różnice w zakresie tegoż certyfikatu.
    */

        wstawEntery(1, "Ograniczenie Własne - Rok wydania certyfikatu\n\n" +
                "Aby stworzyć hodowce potrzba podać jego certyfikat.\n" +
                "Jednak zleceniodawca systemu zastrzegł, że nie chce \n" +
                "mieć sytuacji, w której zarejestruje hodowce, który\n" +
                "uzyskał certyfikat przed 2020 rokiem ze względu na \n" +
                "znaczące różnice w zakresie tegoż certyfikatu. ");


        Cerytfikat c2 = new Cerytfikat("Certyfikat wiedzy w zakresie terrarystyki", 2021 );
        Cerytfikat c3 = new Cerytfikat("Certyfikat wiedzy w zakresie ptaszników", 2018);
        System.out.println(c2);
        try {

            Hodowca h2 = new Hodowca("Marzena", "Sawicka", 34, c3);
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
