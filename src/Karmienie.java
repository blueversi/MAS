import java.io.Serializable;
import java.time.LocalDate;

public class Karmienie extends ObjectPlusPlus implements Serializable {

    private LocalDate dataKarmienia;
    private int ilos;

    public Karmienie(LocalDate dataKarmienia, int ilos) {
        super();

        this.dataKarmienia = dataKarmienia;
        this.ilos = ilos;
    }

    public LocalDate getDataKarmienia() {
        return dataKarmienia;
    }

    public void setDataKarmienia(LocalDate dataKarmienia) {
        this.dataKarmienia = dataKarmienia;
    }

    public int getIlos() {
        return ilos;
    }

    public void setIlos(int ilos) {
        this.ilos = ilos;
    }


    //Podstawowa metoda wyświetla nam wszystie rodzaje karmowki
    public static void wyswietlKarmienia() throws Exception {
        ObjectPlus.showExtent(Karmienie.class);
    }

    @Override
    public String toString() {
        return "Karmienie{" +
                "dataKarmienia=" + dataKarmienia +
                ", ilos=" + ilos +
                '}';
    }
}
