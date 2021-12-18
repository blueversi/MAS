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
    private LocalDate dataUrodzenia;
    private int numerWylinki;                                                            //nie mniejszy niż 0 następny musi być większy 
    private ArrayList<LocalDate> karmienia = new ArrayList<>();

    public Ptasznik(String rodzaj, String gatunek, LocalDate dataUrodzenia, int numerWylinki, ArrayList<LocalDate> karmienia) {
        this.rodzaj = rodzaj;
        this.gatunek = gatunek;
        this.dataUrodzenia = dataUrodzenia;
        this.numerWylinki = numerWylinki;
        this.karmienia = karmienia;
    }

    public static String getRodzina() {
        return rodzina;
    }

    public static void setRodzina(String rodzina) {
        Ptasznik.rodzina = rodzina;
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

    public int getNumerWylinki() {
        return numerWylinki;
    }

    public void setNumerWylinki(int numerWylinki) {
        this.numerWylinki = numerWylinki;
    }

    public ArrayList<LocalDate> getKarmienia() {
        return karmienia;
    }

    public void setKarmienia(ArrayList<LocalDate> karmienia) {
        this.karmienia = karmienia;
    }

    @Override
    public String toString() {
        return "Ptasznik{" +
                "rodzaj='" + rodzaj + '\'' +
                ", gatunek='" + gatunek + '\'' +
                ", dataUrodzenia=" + dataUrodzenia +
                ", numerWylinki=" + numerWylinki +
                ", karmienia=" + karmienia +
                '}';
    }
}
    

    
    
    