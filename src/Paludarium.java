public class Paludarium extends Akwarium implements ITerrarium {


    private int iloscTorfuWLitrach;
    private String typKlimatycnzy;
    private String typWystroju;
    private Ptasznik ptasznik;

    public Paludarium(int bokA, int bokB, int wysokosc, int iloscWodyWLitrach, int pHWody, int iloscTorfuWLitrach, String typKlimatycnzy, String typWystroju) {
        super(bokA, bokB, wysokosc, iloscWodyWLitrach, pHWody);

        this.iloscTorfuWLitrach = iloscTorfuWLitrach;
        this.typKlimatycnzy = typKlimatycnzy;
        this.typWystroju = typWystroju;
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

    @Override
    public double getProcentZapelnienia() {

        return (this.getIloscWodyWLitrach() + this.getIloscTorfuWLitrach())/this.objetosc;

    }

    public Ptasznik getPtasznik() {
        return ptasznik;
    }

}
