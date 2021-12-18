import java.io.Serializable;

public class Paludarium extends ObjectPlus4 implements Serializable {


    private Ptasznik ptasznik;
    private Ryba ryba;

    public Paludarium(Ptasznik ptasznik, Ryba ryba) {
        this.ptasznik = ptasznik;
        this.ryba = ryba;
    }

    public Ptasznik getPtasznik() {
        return ptasznik;
    }

    public void setPtasznik(Ptasznik ptasznik) {
        this.ptasznik = ptasznik;
    }

    public Ryba getRyba() {
        return ryba;
    }

    public void setRyba(Ryba ryba) {
        this.ryba = ryba;
    }

    @Override
    public String toString() {
        return "Paludarium{" +
                ", ptasznik=" + ptasznik +
                ", ryba=" + ryba +
                '}';
    }


    //ekstensja
    public static void wyswietlPaludaria() throws Exception {
        ObjectPlus.showExtent(Paludarium.class);
    }
}
