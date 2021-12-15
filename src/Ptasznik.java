import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Random;

public class Ptasznik extends ObjectPlusPlus implements Serializable {

    public static String rodzina = "Ptasznikowate"; // Atrybut klasowy wspólny dla wszystkich instancji - każdy ptasznik należy do rodziny ptasznikowatych
    private String rodzaj;
    private String gatunek;
    private LocalDate dataUrodzenia;                                                    // Atrybut złożony
    private int wiek;                                                                  // Atrybut pochodny(wyliczalny)
    private KolorPtasznika kolor;                                                     // Atrybut opcjonalny
    //private ArrayList<LocalDate> karmienia = new ArrayList<>();                      // Atrybut powtarzalny
    private PtasznikZdrowieType stanZdrowiaPtasznika = PtasznikZdrowieType.ZDROWY;
    private int cena = 0;
    private String opisOferty = "Brak opisu";
    private boolean czyNaKwarantannie = false;


    public Ptasznik(String rodzaj, String gatunek, LocalDate dataUrodzenia, KolorPtasznika kolor) {
        super();
        this.rodzaj = rodzaj;
        this.gatunek = gatunek;
        this.dataUrodzenia = dataUrodzenia;
        this.wiek = Period.between(this.dataUrodzenia, LocalDate.now()).getYears();
        this.kolor = kolor;

    }

    public Ptasznik(String rodzaj, String gatunek, LocalDate dataUrodzenia) {
        super();
        this.rodzaj = rodzaj;
        this.gatunek = gatunek;
        this.dataUrodzenia = dataUrodzenia;
        this.wiek = Period.between(this.dataUrodzenia, LocalDate.now()).getYears();
    }

    public PtasznikZdrowieType getStanZdrowiaPtasznika() {
        return stanZdrowiaPtasznika;
    }

    public void setStanZdrowiaPtasznika(PtasznikZdrowieType stanZdrowiaPtasznika) {
        if(stanZdrowiaPtasznika.equals(PtasznikZdrowieType.CHORY)){
            cena = 0;
            opisOferty = "Ptasznik obecnie nie jest na sprzedaż";
        }
        this.stanZdrowiaPtasznika = stanZdrowiaPtasznika;
    }

    public void wystawPtasznikaNaSprzedaz(int cena, String opisOferty){
        if(this.stanZdrowiaPtasznika.equals(PtasznikZdrowieType.ZDROWY)) {
            this.opisOferty = opisOferty;
            this.cena = cena;
        } else {
            System.out.println("Ptasznik:  " + this + "\n" + "W związku z tym nie może zostać wystawiony na sprzedaż ponieważ jest chory" );
        }
    };

    public void skierujPtasznikaNaKwarantanne(){
        if(this.stanZdrowiaPtasznika.equals(PtasznikZdrowieType.ZDROWY)){
            System.out.println("Ten ptasznik jest zdrowy. Nie można skierować go na kwarantanne");
        } else {
            cena = 0;
            opisOferty = "Ptasznik obecnie nie jest na sprzedaż";
            czyNaKwarantannie = true;
        }
    }

    public void wyleczPtasznika(){
        this.stanZdrowiaPtasznika = PtasznikZdrowieType.ZDROWY;
        this.czyNaKwarantannie = false;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public String getOpisOferty() {
        return opisOferty;
    }

    public void setOpisOferty(String opisOferty) {
        this.opisOferty = opisOferty;
    }

    public String getRodzaj() {
        return rodzaj;
    }

    public void setRodzaj(String rodzaj) {
        this.rodzaj = rodzaj;
    }

    public String getGatunek() {
        return gatunek;
    }

    public void setGatunek(String gatunek) {
        this.gatunek = gatunek;
    }

    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }

    public void setDataUrodzenia(LocalDate dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }

    public int getWiek() {
        this.updateWiek();
        return this.wiek;
    }

    public void updateWiek() {
        this.wiek = Period.between(this.dataUrodzenia, LocalDate.now()).getYears();
    }

    //Getter zmieniony dla atrybutu opcjonalnego
    public KolorPtasznika getKolor() {
        if (this.kolor != null ){
            return this.kolor;
        } else {
            System.out.print("Nie zdefiniowano koloru ptasznika, zwrócono wartość null");
            return null;
        }
    }

    public void setKolor(KolorPtasznika kolor) {
        this.kolor = kolor;
    }

    //Przeciążenie metody

    //Podstawowa metoda wyświetla nam wszystie ptaszniki
    public static void wyswietlPtaszniki() throws Exception {
        ObjectPlus.showExtent(Ptasznik.class);
    }


    //Metoda przeciążona z parametrem rodzaj, który wyświetla ptaszniki tylko określonego przez nas rodzaju
    //w przypadku nie znalezienia danego rodzaju zostaje wyśwwietlana informacja o tym.
    public static void wyswietlPtaszniki(String rodzaj) throws Exception {
        var wszystkiePtaszniki =  ObjectPlus.getExtent(Ptasznik.class);
        ArrayList<Ptasznik> zakwalifikowanePtaszniki = new ArrayList<Ptasznik>();

        for (Ptasznik ptasznik: wszystkiePtaszniki) {
            if(ptasznik.getRodzaj().equals(rodzaj)){
                zakwalifikowanePtaszniki.add(ptasznik);
            }
        }


        if(!(zakwalifikowanePtaszniki.isEmpty())){
            for (Ptasznik ptasznik: zakwalifikowanePtaszniki) {
                System.out.println("");
                System.out.println("Znalezione w systemie ptaszniki rodzaju: " + rodzaj);
                System.out.println("");
                System.out.println(ptasznik);
            }
        } else {
            System.out.println("");
            System.out.println("Nie znaleziono ptaszników o podanym rodzaju: " + rodzaj);
            System.out.println("");
        }
    }


    //Metoda przeciążona z parametrem wiek, wypisuje ptaszniki w określonym wieku
    //w przypadku nie znalezienia ptaszników w odpowiednim wieku zwrócony zostaje
    //odpowiedni komunikat.
    public static void wyswietlPtaszniki(int wiek) throws Exception {
        var wszystkiePtaszniki =  ObjectPlus.getExtent(Ptasznik.class);
        ArrayList<Ptasznik> zakwalifikowanePtaszniki = new ArrayList<Ptasznik>();

        for (Ptasznik ptasznik: wszystkiePtaszniki) {
            if(ptasznik.getWiek() == wiek){
                zakwalifikowanePtaszniki.add(ptasznik);
            }
        }

        if(!(zakwalifikowanePtaszniki.isEmpty())){
            System.out.println("");
            System.out.println("Znalezione w systemie ptaszniki w wieku: " + wiek + " lat.");
            System.out.println("");
            for (Ptasznik ptasznik: zakwalifikowanePtaszniki) {
                System.out.println("");
                System.out.println(ptasznik);
                System.out.println("");
            }
        } else {
            System.out.println("");
            System.out.println("Nie znaleziono ptaszników w wieku: " + wiek + " lat.");
            System.out.println("");
        }

    }


    @Override
    public String toString() {
        return "Ptasznik{" +
                "rodzaj='" + rodzaj + '\'' +
                ", gatunek='" + gatunek + '\'' +
                ", dataUrodzenia=" + dataUrodzenia +
                ", wiek=" + wiek +
                ", kolor=" + kolor +
                '}';
    }

    /*
    //Przesłonięcie metody toString
    @Override
    public String toString() {
        return "|||     Informacje o Ptaszniku      ||| "                           + "\n" +
                "Rodzina:           "                       + Ptasznik.rodzina      + "\n" +
                "Rodzaj:            "                       + rodzaj                + "\n" +
                "Gatunek:           "                       + gatunek               + "\n" +
                "Data Urodzenia:    "                       + dataUrodzenia         + "\n" +
                "Wiek(w latach):    "                       + wiek                  + "\n" +
                "Kolor:             "                       + (kolor!=null ? kolor : "Nie wprowadzono jeszcze koloru tego ptasznika");
    }*/
}
