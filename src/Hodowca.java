import java.io.Serializable;

public class Hodowca extends ObjectPlus4 implements Serializable {

    private String imie;
    private String nazwisko;
    private int wiek;
    private Cerytfikat cerytfikat;


    public Hodowca(String imie, String nazwisko, int wiek, Cerytfikat cerytfikat) throws Exception{
        super();

        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        setCerytfikat(cerytfikat);
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

    public Cerytfikat getCerytfikat() {
        return cerytfikat;
    }

    public void setCerytfikat(Cerytfikat cerytfikat) throws Exception {
        if(cerytfikat.getRokWydania() < 2020){
            throw new Exception("Hodowca ma już nieaktualny certyfikat. Można rejestrować hodowców z certyfikatem wydanym od 2020 roku. \nRok podanego certyfikatu to: " + cerytfikat  );
        } else {
            this.cerytfikat = cerytfikat;
        }
    }

    @Override
    public String toString() {
        return "Hodowca{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                ", cerytfikat=" + cerytfikat +
                '}';
    }
}
