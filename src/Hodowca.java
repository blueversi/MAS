import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

public class Hodowca extends ObjectPlusPlus implements Serializable {

    private String imie;
    private String nazwisko;
    private int wiek;


    public Hodowca(String imie, String nazwisko, int wiek){
        super();

        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public static void wyswietlHodowcow() throws Exception {
        ObjectPlus.showExtent(Hodowca.class);
    }

    @Override
    public String toString() {
        return "Opiekun{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                '}';
    }
}
