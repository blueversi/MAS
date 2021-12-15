import java.io.*;
import java.time.LocalDate;
import java.util.Random;

public class Main {
    /*
    Zdecydowałem się na realizację projektu MP2 asocjacje
    przy użyciu dodatkowej klasy ObjectPlusPlus po której
    dziedziczą klasy bizsensowe
    */
    public static final String PTASZNIKI_DIR = "dane_ptasznikow.ser";

    public static void main(String args[]) throws Exception {


        Random r = new Random();
        //Instacja klasy ryba potrzebna do przypadku z Akwarium
        Ryba ryba = new Ryba("Złota Rybka", 15);
        Ryba rybaPaludarium = new Ryba("Bojownik", 10);

        /*
        Disjoint - Nadrzędna klasa ptasznik po której dziedziczą klasy PtasznikStaregoSwiata oraz PtasznikNowegoSwiata
        Ptaszniki starego swiata mają zawsze silny jad oraz niektóre potrafią strydulować czyli wydawać dźwieki poprzez
        wibracje własnym ciałem. Natomiast ptaszniki nowego świata mają słaby jad a za ich główny mechanizm obronny
        służą włoski parzące.

        */
        wstawEntery(2, " Disjoint - Nadrzędna klasa ptasznik po której dziedziczą klasy PtasznikStaregoSwiata oraz PtasznikNowegoSwiata\n" +
                "        Ptaszniki starego swiata mają zawsze silny jad oraz niektóre potrafią strydulować czyli wydawać dźwieki poprzez\n" +
                "        wibracje własnym ciałem. Natomiast ptaszniki nowego świata mają słaby jad a za ich główny mechanizm obronny\n" +
                "        służą włoski parzące.");
        wstawEntery(1);
        komunikat("Poniżej przykład dziedziczenia z klasy ptasznik głównych cech i dodanie cech osoobniczych w zależności od rodzaju ptasznika. ");
        wstawEntery(1);
        PtasznikNowegoSwiata ptasznikNowegoSwiata = new PtasznikNowegoSwiata("Brachypelma", "Hamorii", LocalDate.of(
                (r.nextInt((2021 - 2000)+ 1)+2000),
                (r.nextInt((12 - 1)+ 1)+1),
                (r.nextInt((28 - 1)+ 1)+1)
        ), 29438248 );

        PtasznikStaregoSwiata ptasznikStaregoSwiata = new PtasznikStaregoSwiata("Monocentropus", "Balfouri", LocalDate.of(
                (r.nextInt((2021 - 2000)+ 1)+2000),
                (r.nextInt((12 - 1)+ 1)+1),
                (r.nextInt((28 - 1)+ 1)+1)
        ), false);

        System.out.println("Liczba włosków parzących ptasznika " +
                ptasznikNowegoSwiata.getRodzaj() + " " +
                ptasznikNowegoSwiata.getGatunek() + ": " +
                ptasznikNowegoSwiata.getIloscWloskowParzacych());

        System.out.println(
                "Ptasznik: " +
                ptasznikStaregoSwiata.getRodzaj() + " " +
                ptasznikStaregoSwiata.getGatunek() + " " +
                (ptasznikStaregoSwiata.CzyStryduluje() ? "stryduluje. " : " nie stryduluje. "));

        /*
        Klasa abstrakcyjna - w moim mp3 jest nią klasa Pojemnik która przyjmuje określone podstawowe cechy związane z wymiarami i objętością a także
        metody dla wszystkich typów pojemników obecnych i wprowadzonych w przyszłości. W systemie niepożądane są jej pojedyńcze
        wystąpienia.

        */

        wstawEntery(2, "Klasa abstrakcyjna - w moim mp3 jest nią klasa Pojemnik która przyjmuje określone podstawowe cechy związane z wymiarami i objętością a także\n" +
                "        metody dla wszystkich typów pojemników obecnych i wprowadzonych w przyszłości. W systemie niepożądane są jej pojedyńcze \n" +
                "        wystąpienia.");
        wstawEntery(1);
        komunikat("Poniżej tworzę 2 obiekty podklas, jedno terrarium oraz jedno akwarium");
        wstawEntery(1);

        Terrarium terrarium = new Terrarium(15,15,30, 2, "Umiarkowany", "Biotopowe");

        //W terrarium można umieścić tylko ptasznika
        terrarium.umiescPtasznika(ptasznikNowegoSwiata);

        komunikat(terrarium.toString());
        wstawEntery(1);

        Akwarium akwarium = new Akwarium(50, 120, 60, 250, 7);

        //A w akwarium tylko rybe
        akwarium.umiescRybe(ryba);
        komunikat(akwarium.toString());

        /*
        Polimorficzne wołanie metody - Abstrakcyjna metoda getProcentZapelnienia odziedziczona z klasy Pojemnik, w podklasach dzidziczących będzie miała
        różną implementacje. Jako przypadki posłużą mi podklasy Terrarium i Akwarium oraz wielodziedzicząca po nich klasa Paludarium. W każdym z nich będzie
        potrzebna inna implementacja tej metody. Terrarium wypełniamy torfem, akwarium wodą a palludarium potrzebuje obu.

        */

        wstawEntery(1, "Procent zapełnienia terrarium jest wyznaczany z ilości torfu w niej zawartego");
        System.out.println((int)(terrarium.getProcentZapelnienia() * 100) +"%");


        wstawEntery(1, "Procent zapełnienia akwarium jest wyznaczany z ilości wody, którą wlano");
        System.out.println((int)(akwarium.getProcentZapelnienia() * 100) +"%");

        /*
        Overlapping - Zrealizowano z pomocą kompozycji i klasy ObjectPlusPlus Pojemniki z ptasznikami są przechowywane na regałach.
        W zależności od potrzeb wyróżniamy w systemie 3 rodzaje regałów:   docieplony, ogrzewany i oświetlony.
        1 regał może być ich dowolną kombinacją. Z

        */

        wstawEntery(2, "Tworze nowy regał. ");
        Regal regal = new Regal(90, 120, 40);

        komunikat("Próbuje wyświetlić informacje o materiale, którym docieplono regał");

        regal.czymJestDocieplonyRegal();

        regal.dodajDocieplenie("Styropian");
        wstawEntery(1, "Dodałem docieplenie  styropianem do regału sprawdzmy teraz.");

        regal.czymJestDocieplonyRegal();

        wstawEntery(1, "Teraz oswietle regał ale spróbuje wyswietlic informacje o tym co go ogrzewa.");

        regal.dodajOswietlenie("LED", 1000);

        regal.wyswietlSzczegolyOgrzewania();

        wstawEntery(1, "Teraz dodam również ogrzewanie dla regału. ");


        regal.dodajOgrzewanie(80, 8);

        regal.wyswietlSzczegolyOgrzewania();

        wstawEntery(1, "Nasz regał posiada już wszystkie opcje. Sprawdźmy zatem jeszcze szczegóły oświetlenia:");

        regal.wyswietlSzczegolyOswietlenia();

        wstawEntery(1);

        /*
        Wielodziedziczenie - Wielodziedziczenie realizuje przy pomocy implementacji przez klase wielodziedziczącą Interfejsu (ITerrarium) oraz dziedziczenie z 2 klasy biznesowej
        Moim przypadkiem jest Palludarium łączy ono cechy zarówno Terrarium jak i Akwarium. Przy pomocy interfejsu pobiera metody te same co klasa Terrarium a "ręcznie" powiela również
        jej pola. Natomiast przez bezpośrednie dziedziczenie z klasy Akwarium jest również wyposażona w pola i metody tej klasy.

        */
        wstawEntery(2, "Wielodziedziczenie - Wielodziedziczenie realizuje przy pomocy implementacji przez klase wielodziedziczącą Interfejsu (ITerrarium) oraz dziedziczenie z 2 klasy biznesowej\n" +
                "        Moim przypadkiem jest Palludarium łączy ono cechy zarówno Terrarium jak i Akwarium. Przy pomocy interfejsu pobiera metody te same co klasa Terrarium a \"ręcznie\" powiela również\n" +
                "        jej pola. Natomiast przez bezpośrednie dziedziczenie z klasy Akwarium jest również wyposażona w pola i metody tej klasy.");

        wstawEntery(1);

        Paludarium paludarium = new Paludarium(60, 150, 100, 200, 6, 350, "Wilgotny", "Biotopowy");

        komunikat("Polimofriczne wołanie metody getProcentZapelnienia() tutaj rowniez mamy inna jej implementacje poniewaz uwzgledniamy zarowno wode jak i torf.");
        System.out.println((int)(paludarium.getProcentZapelnienia() * 100) + "%");

        //korzystam z funkcji terrarium i akwarium umieszczajac w palludarium zarowno rybe jak i ptasznika
        wstawEntery(1,"korzystam z funkcji terrarium i akwarium umieszczajac w palludarium zarowno rybe jak i ptasznika." + "\n" +
                "Poniżej wyświetlam szczegóły ryby i ptasznika umieszczonych w palludarium.");

        paludarium.umiescPtasznika(ptasznikStaregoSwiata);
        paludarium.umiescRybe(rybaPaludarium);

        System.out.println(paludarium.getPtasznik());
        System.out.println(paludarium.getRyba());

        wstawEntery(1, "Teraz wyswietle wlasnosc odziedziczona po terrarium czyli typ klimatyczny: ");
        System.out.println(paludarium.getTypKlimatyczny());

        wstawEntery(1, "A teraz dla Akwarium czyli pH wody");
        komunikat(paludarium.getpHWody() + "pH");

        wstawEntery(1);
        /*
        Dziedziczenie Wieloaspektowe - Wykorzystałem spłaszczenie hierarchi i typ wyliczeniowy enum. Dodatkowy aspekt dla
        klasy ptasznik to jego stan zdrowia. Zdrowego ptasznika można wystawić na sprzedaż ale nie można skierować na
        kwarantanne, w przypadku chorego na odwrót. Ptasznik może być zatem zdrowy lub chory w zależności od sytuacji
        mozna na nim wykonać dedykowane metody.

        */

        wstawEntery(1, "Zmieniamy stan zdrowia ptasznika na chory i próbujemy wystawić go na sprzedaż");
        ptasznikNowegoSwiata.setStanZdrowiaPtasznika(PtasznikZdrowieType.CHORY);
        ptasznikNowegoSwiata.wystawPtasznikaNaSprzedaz(500, "Okazały ptasznik, przyjmuje pokarm i jest wiele wart na rynku.");


        komunikat( "Teraz wystawmy zdrowego ptasznika, zdrowy to stan domyslny wiec wezmiemy 2 instancje");
        ptasznikStaregoSwiata.wystawPtasznikaNaSprzedaz(50, "Popularny i łatwy w hodowli ptasznik.");


        wstawEntery(1, "Teraz sprawdzmy opis oferty ptasznika: " +ptasznikStaregoSwiata.toString());
        System.out.println(ptasznikStaregoSwiata.getOpisOferty());

        wstawEntery(1, "Zmienimy teraz jego stan zdrowia na chory i ponownie sprawdzimy opis oferty");
        ptasznikStaregoSwiata.setStanZdrowiaPtasznika(PtasznikZdrowieType.CHORY);
        System.out.println(ptasznikStaregoSwiata.getOpisOferty());

        wstawEntery(1, "Teraz skierujemy ptasznika na kwarantanne a następnie go wyleczymy dzięki temu będzie można wystawić go na sprzedaż.");
        ptasznikNowegoSwiata.skierujPtasznikaNaKwarantanne();
        ptasznikNowegoSwiata.wyleczPtasznika();
        ptasznikNowegoSwiata.wystawPtasznikaNaSprzedaz(500, "Okazały ptasznik, przyjmuje pokarm i jest wiele wart na rynku.");

        wstawEntery(1, "Sprawdzmy jeszcze opis oferty");
        System.out.println(ptasznikNowegoSwiata.getOpisOferty());

        /*
        Dziedziczenie Dynamiczne - Zrealizowane przy pomocy spłaszczenia hierarchi. Przypadkiem jest hodowca - każdy na poczatku jest Amatorem lecz
        potem w zależności od doświadczenia możemy go awansować na Hobbyste a potem Profesjonaliste. Im większa rola tym więcej możliwości. Amator
        może zajmować się tylko ptasznikami nowego świata. Hobbysta może już mieć pod opieką te ze starego świata, natomiast profesjonalista może
        rozmnażać ptaszniki.

        */

        wstawEntery(1, "Dziedziczenie Dynamiczne - Zrealizowane przy pomocy spłaszczenia hierarchi. Przypadkiem jest hodowca, każdy na poczatku jest Amatorem lecz\n" +
                "        potem w zależności od doświadczenia możemy go awansować na Hobbyste a potem Profesjonaliste. Im większa rola tym więcej możliwości. Amator\n" +
                "        może zajmować się tylko ptasznikami nowego świata. Hobbysta może już mieć pod opieką te ze starego świata, natomiast profesjonalista może\n" +
                "        rozmnażać ptaszniki. ");

        Hodowca hodowca = new Hodowca("Mac", "Gregor", 25);

        wstawEntery(1, "Spróbujmy zatem nowemu hodowcy amatorowi dać pod opieke ptasznika starego świata.");
        hodowca.dodajPodOpiekePtasznikaStaregoSwiata(ptasznikStaregoSwiata);

        wstawEntery(1, "Teraz sporbujemy dodac ptasznika nowego świata.");
        hodowca.dodajPodOpiekePtasznikaNowegoSwiata(ptasznikNowegoSwiata);
        komunikat("Udało się.");

        wstawEntery(1, "Nasz hodowca ma już jakieś doświadczenie zatem awansujmy go na hobbyste i zobaczmy czy będzie mógł się zająć ptasznikami starego świata.");
        hodowca.awansujHodowce();
        hodowca.dodajPodOpiekePtasznikaNowegoSwiata(ptasznikNowegoSwiata);
        komunikat("Udało się. Upewnijmy się, że nie ma dostepu do rozmnażania.");
        wstawEntery(1);
        hodowca.rozmnazajPtaszniki(ptasznikNowegoSwiata, ptasznikStaregoSwiata);

        wstawEntery(1, "Pozostało już tylko sprawdzić czy po awansie naszego hobbysty na profesjonaliste będzie on mógł rozmnażać ptaszniki.");

        wstawEntery(1);

        hodowca.awansujHodowce();
        hodowca.rozmnazajPtaszniki(ptasznikNowegoSwiata, ptasznikStaregoSwiata);

        wstawEntery(1, "Niestety nasz hodowca popełnił błąd i próbował rozmnożyć różne gatunki ptaszników. Na szczęście system go powstrzymał.");





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
