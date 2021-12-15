public class Terrarium extends Pojemnik implements ITerrarium {

    private int iloscTorfuWLitrach;
    private String typKlimatycnzy;
    private String typWystroju;
    private Ptasznik ptasznik;

    public Terrarium(int bokA, int bokB, int wysokosc, int iloscTorfuWLitrach, String typKlimatycnzy, String typWystroju) {

        super(bokA, bokB, wysokosc);

        this.iloscTorfuWLitrach = iloscTorfuWLitrach;
        this.typKlimatycnzy = typKlimatycnzy;
        this.typWystroju = typWystroju;

    }

    @Override
    public double getProcentZapelnienia() {
        return ( this.iloscTorfuWLitrach/this.objetosc);
    }

    public Ptasznik getPtasznik() {
        return ptasznik;
    }

    @Override
    public String getTypKlimatyczny() {
        return this.typKlimatycnzy;
    }

    @Override
    public String getTypWstroju() {
        return this.typWystroju;
    }

    public int getIloscTorfuWLitrach() {
        return iloscTorfuWLitrach;
    }

    @Override
    public void umiescPtasznika(Ptasznik ptasnzik) {
        this.ptasznik = ptasnzik;
    }

    public void setIloscTorfuWLitrach(int iloscTorfuWLitrach) throws Exception {
        if(this.iloscTorfuWLitrach < objetosc) {
            this.iloscTorfuWLitrach = iloscTorfuWLitrach;
        } else {
            throw new Exception("Nie można umieścić więcej torfu niż wynosi objętość Terrarmium");
        }
    }

    public void setTypKlimatycnzy(String typKlimatycnzy) {
        this.typKlimatycnzy = typKlimatycnzy;
    }

    public void setTypWystroju(String typWystroju) {
        this.typWystroju = typWystroju;
    }

    @Override
    public String toString() {
        return "Terrarium{" +
                "bokA=" + bokA +
                ", bokB=" + bokB +
                ", wysokosc=" + wysokosc +
                ", objetosc=" + objetosc +
                ", iloscTorfuWLitrach=" + iloscTorfuWLitrach +
                ", typKlimatycnzy='" + typKlimatycnzy + '\'' +
                ", typWystroju='" + typWystroju + '\'' +
                ", ptasznik=" + ptasznik +
                '}';
    }
}
