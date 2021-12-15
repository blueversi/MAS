public class Akwarium extends Pojemnik {

    private int iloscWodyWLitrach;
    private int pHWody;
    private Ryba ryba;

    public Akwarium(int bokA, int bokB, int wysokosc, int iloscWodyWLitrach, int pHWody) {
        super(bokA, bokB, wysokosc);

        this.iloscWodyWLitrach = iloscWodyWLitrach;
        this.pHWody = pHWody;
    }

    @Override
    public double getProcentZapelnienia() {
        return (
                this.iloscWodyWLitrach /this.objetosc
        );
    }

    public int getIloscWodyWLitrach() {
        return iloscWodyWLitrach;
    }

    public void setIloscWodyWLitrach(int iloscWodyWLitrach) throws Exception{
        if(this.iloscWodyWLitrach < objetosc) {
            this.iloscWodyWLitrach = iloscWodyWLitrach;
        } else {
            throw new Exception("Nie można wlać więcej wody niż wynosi objętość Akwarium");
        }
    }

    public int getpHWody() {
        return pHWody;
    }

    public void setpHWody(int pHWody) {
        this.pHWody = pHWody;
    }

    public void umiescRybe(Ryba ryba) {
        this.ryba=ryba;
    }

    public Ryba getRyba() {
        return ryba;
    }

    @Override
    public String toString() {
        return "Akwarium{" +
                ", bokA=" + bokA +
                ", bokB=" + bokB +
                ", wysokosc=" + wysokosc +
                ", objetosc=" + objetosc +
                "iloscWodyWLitrach=" + iloscWodyWLitrach +
                ", pHWody=" + pHWody +
                ", ryba=" + ryba +
                '}';
    }
}