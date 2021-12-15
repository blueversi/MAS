import java.io.Serializable;

public class Ryba extends ObjectPlusPlus implements Serializable {

    private String nazwa;
    private int dlugosc;

    public Ryba(String nazwa, int dlugosc) {
        this.nazwa = nazwa;
        this.dlugosc = dlugosc;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getDlugosc() {
        return dlugosc;
    }

    public void setDlugosc(int dlugosc) {
        this.dlugosc = dlugosc;
    }

    @Override
    public String toString() {
        return "Ryba{" +
                "nazwa='" + nazwa + '\'' +
                ", dlugosc=" + dlugosc +
                '}';
    }
}
