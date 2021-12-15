import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

public class Hodowca extends ObjectPlusPlus implements Serializable {

    private String imie;
    private String nazwisko;
    private int wiek;
    private ArrayList<PtasznikNowegoSwiata> ptasznikNowegoSwiatas = new ArrayList<>();
    private ArrayList<PtasznikStaregoSwiata> ptasznikStaregoSwiatas = new ArrayList<>();;
    private ArrayList<Ryba> ryby = new ArrayList<>();;

    private HodowcaType typHodowcy = HodowcaType.AMATOR;


    public Hodowca(String imie, String nazwisko, int wiek){
        super();

        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    public void awansujHodowce(){
        if(this.typHodowcy.equals(HodowcaType.AMATOR)){
            this.typHodowcy = HodowcaType.HOBBYSTA;
        } else if(this.typHodowcy.equals(HodowcaType.HOBBYSTA)){
            this.typHodowcy = HodowcaType.PROFESJONALISTA;
        } else if(this.typHodowcy.equals(HodowcaType.PROFESJONALISTA)){
            System.out.println("Ten hodowca jest profesjonalistą i nie można go już wyżej awansować");
        }
    }

    public void dodajPodOpiekePtasznikaNowegoSwiata(PtasznikNowegoSwiata ptasznik){
        if(ptasznik.getSilaJadu().equals("slaby")){
            this.ptasznikNowegoSwiatas.add(ptasznik);
        } else {
            System.out.println("Ten ptasznik ma silny jad więc pochodzi ze starego świata i nie może być dodany do tej kolekcji");
        }
    }

    public void dodajPodOpiekePtasznikaStaregoSwiata(PtasznikStaregoSwiata ptasznik){
        if(this.typHodowcy.equals(HodowcaType.AMATOR)){
            System.out.println("Ten hodowca to amator nie może opiekować się jeszcze ptasznikami ze starego świata. Są dla niego zbyt groźne.");
        } else {
            if (ptasznik.getSilaJadu().equals("silny")) {
                this.ptasznikStaregoSwiatas.add(ptasznik);
            } else {

                System.out.println("Ten ptasznik ma słaby jad więc pochodzi ze nowego świata i nie może być dodany do tej kolekcji");
            }
        }
    }



    public void rozmnazajPtaszniki(Ptasznik p1, Ptasznik p2){
        if(typHodowcy.equals(HodowcaType.PROFESJONALISTA)){
            if(p1.getGatunek().equals(p2.getGatunek())) {
                System.out.println("Rozmnożono ptasznika");
            } else {
                System.out.println("Tylko ptaszniki tego samego gatunku mogą być se sobą rozmnażane");
            }}else{
            System.out.println("Rozmnażać ptaszniki może tylko profesjonalista ");
        }
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
