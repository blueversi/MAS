import java.time.LocalDate;

public class Cerytfikat {

    private String nazwaCertyfikatu;
    private LocalDate date;

    public Cerytfikat(String nazwaCertyfikatu, LocalDate date) {
        this.nazwaCertyfikatu = nazwaCertyfikatu;
        this.date = date;
    }

    public String getNazwaCertyfikatu() {
        return nazwaCertyfikatu;
    }

    public void setNazwaCertyfikatu(String nazwaCertyfikatu) {
        this.nazwaCertyfikatu = nazwaCertyfikatu;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Cerytfikat{" +
                "nazwaCertyfikatu='" + nazwaCertyfikatu + '\'' +
                ", date=" + date +
                '}';
    }


    //ekstensja
    public static void wyswietlCertyfikaty() throws Exception {
        ObjectPlus.showExtent(Cerytfikat.class);
    }
}
