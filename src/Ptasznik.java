import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Random;

public class Ptasznik extends ObjectPlusPlus implements Serializable {

    private String identyfikator;
    private String nazwa;
    private int numerWylinki;                                                            //nie mniejszy niż 0 następny musi być większy 
    private ArrayList<LocalDate> karmienia = new ArrayList<>();

    public Ptasznik(String identyfikator, String nazwa, int numerWylinki) {
        this.identyfikator = identyfikator;
        this.nazwa = nazwa;
        this.numerWylinki = numerWylinki;
    }

    public String getIdentyfikator() {
        return identyfikator;
    }

    public void setIdentyfikator(String identyfikator) {
        this.identyfikator = identyfikator;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getNumerWylinki()  {
        return numerWylinki;
    }

    public void setNumerWylinki(int numerWylinki) throws Exception {
        if(numerWylinki > this.numerWylinki){
            this.numerWylinki = numerWylinki;
        } else {
            throw new Exception("Numer wylinki nie może być mniejszy niż obecna. \n" + "Obecna wylinka: " +this.numerWylinki + "\n" + "Podana wylinka: " + numerWylinki);
        }
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
                "identyfikator='" + identyfikator + '\'' +
                ", nazwa='" + nazwa + '\'' +
                ", numerWylinki=" + numerWylinki +
                ", karmienia=" + karmienia +
                '}';
    }


    //ekstensja
    public static void wyswietlPtaszniki() throws Exception {
        ObjectPlus.showExtent(Ptasznik.class);
    }
}
    

    
    
    