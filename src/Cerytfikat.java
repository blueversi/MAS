import java.time.LocalDate;

public class Cerytfikat {

    private String nazwaCertyfikatu;
    private int rokWydania;

    public Cerytfikat(String nazwaCertyfikatu, int rokWydania) {
        this.nazwaCertyfikatu = nazwaCertyfikatu;
        this.rokWydania = rokWydania;
    }

    public String getNazwaCertyfikatu() {
        return nazwaCertyfikatu;
    }

    public void setNazwaCertyfikatu(String nazwaCertyfikatu) {
        this.nazwaCertyfikatu = nazwaCertyfikatu;
    }

    public int getRokWydania() {
        return rokWydania;
    }

    public void setRokWydania(int rokWydania) {
        this.rokWydania = rokWydania;
    }

    @Override
    public String toString() {
        return "Cerytfikat{" +
                "nazwaCertyfikatu='" + nazwaCertyfikatu + '\'' +
                ", date=" + rokWydania +
                '}';
    }


    //ekstensja
    public static void wyswietlCertyfikaty() throws Exception {
        ObjectPlus.showExtent(Cerytfikat.class);
    }
}
