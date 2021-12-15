import java.io.Serializable;

public class Hodowla extends ObjectPlusPlus implements Serializable {

    private String nazwaHodowli;
    private String typHodowli;

    public Hodowla(String nazwaHodowli, String typHodowli) {
        super();

        this.nazwaHodowli = nazwaHodowli;
        this.typHodowli = typHodowli;
    }

    public String getNazwaHodowli() {
        return nazwaHodowli;
    }

    public void setNazwaHodowli(String nazwaHodowli) {
        this.nazwaHodowli = nazwaHodowli;
    }

    public String getTypHodowli() {
        return typHodowli;
    }

    public void setTypHodowli(String typHodowli) {
        this.typHodowli = typHodowli;
    }


    //Podstawowa metoda wyświetla nam wszystie Hodowle
    public static void wyswietlHodowle() throws Exception {
        ObjectPlus.showExtent(Hodowla.class);
    }


    @Override
    public String toString() {
        return "Hodowla{" +
                "nazwaHodowli='" + nazwaHodowli + '\'' +
                ", typHodowli='" + typHodowli + '\'' +
                '}';
    }
}
