import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class Karmowka extends ObjectPlusPlus implements Serializable {

    private String nazwaGatunku;
    private String stadiumRozwojowe;

    public Karmowka(String nazwaGatunku, String stadiumRozwojowe) {
        super();

        this.nazwaGatunku = nazwaGatunku;
        this.stadiumRozwojowe = stadiumRozwojowe;
    }

    public String getNazwaGatunku() {
        return nazwaGatunku;
    }

    public void setNazwaGatunku(String nazwaGatunku) {
        this.nazwaGatunku = nazwaGatunku;
    }

    public String getStadiumRozwojowe() {
        return stadiumRozwojowe;
    }

    public void setStadiumRozwojowe(String stadiumRozwojowe) {
        this.stadiumRozwojowe = stadiumRozwojowe;
    }

    //Podstawowa metoda wyświetla nam wszystie rodzaje karmowki
    public static void wyswietlKarmowke() throws Exception {
        ObjectPlus.showExtent(Karmowka.class);
    }

    public static Karmowka generujLosowaKarmowke(){

        String tmpNazwaGatunku;
        String tmpStadiumRozwojowe;
        int nazwaGatunkuIndex, stadiumRozwojoweIndex;
        Random r = new Random();

        ArrayList<String> nazwyGatunkowe = new ArrayList<String>();
        nazwyGatunkowe.add("Karaczan Madagaskarski");
        nazwyGatunkowe.add("Karaczan Turecki");
        nazwyGatunkowe.add("Karaczan Argentyński");
        nazwyGatunkowe.add("Mącznik Młynarek");
        nazwyGatunkowe.add("Drewnojad");
        nazwyGatunkowe.add("Szarańcza");
        nazwyGatunkowe.add("Świerszcz Bananowy");

        nazwaGatunkuIndex = (int)(Math.random() * nazwyGatunkowe.size());

        ArrayList<String> stadiaRozwojowe = new ArrayList<String>();
        stadiaRozwojowe.add("Wylęg");
        stadiaRozwojowe.add("Sub-Imago");
        stadiaRozwojowe.add("Imago");

        stadiumRozwojoweIndex = (int)(Math.random() * stadiaRozwojowe.size());


        Karmowka tmpKarmowka = new Karmowka(
                nazwyGatunkowe.get(nazwaGatunkuIndex),
                stadiaRozwojowe.get(stadiumRozwojoweIndex)
        );

        return tmpKarmowka;
    }

    @Override
    public String toString() {
        return "Karmowka{" +
                "nazwaGatunku='" + nazwaGatunku + '\'' +
                ", stadiumRozwojowe='" + stadiumRozwojowe + '\'' +
                '}';
    }
}
