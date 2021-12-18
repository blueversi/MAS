import java.io.Serializable;

public class Ryba extends ObjectPlusPlus implements Serializable {
    private String nazwa;

    public Ryba(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    @Override
    public String toString() {
        return "Ryba{" +
                "nazwa='" + nazwa + '\'' +
                '}';
    }

    //ekstensja
    public static void wyswietlRyby() throws Exception {
        ObjectPlus.showExtent(Ryba.class);
    }
}

