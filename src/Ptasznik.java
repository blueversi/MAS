import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class Ptasznik extends ObjectPlusPlus implements Serializable {

    private String identyfikator;
    private String nazwa;
    private int numerWylinki;                                                            //nie mniejszy niż 0 następny musi być większy 
    private ArrayList<LocalDate> karmienia = new ArrayList<>();

    private static Set<String> identyfikatory = new TreeSet<>(); // do unique

    public Ptasznik(String identyfikator, String nazwa, int numerWylinki) throws Exception {
        setIdentyfikator(identyfikator);
        this.nazwa = nazwa;
        this.numerWylinki = numerWylinki;
    }

    public String getIdentyfikator() {
        return identyfikator;
    }

    public void setIdentyfikator(String identyfikator) throws Exception {
        if(Ptasznik.identyfikatory.contains(identyfikator)) {
            throw new Exception("Identyfikator musi być unikalny. \nPodany identyfikator:  -  " + identyfikator + "  -   już istnieje w systemie");
        } else {
            this.identyfikator = identyfikator;
            Ptasznik.identyfikatory.add(identyfikator);
        }
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
    

    
    
    