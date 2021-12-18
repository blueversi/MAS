import java.io.Serializable;

public class Paludarium extends ObjectPlusPlus implements Serializable {



    private int x;
    private int y;
    private int z;
    private Ptasznik ptasznik;
    private Ryba ryba;

    public Paludarium(int x, int y, int z, Ptasznik ptasznik, Ryba ryba) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.ptasznik = ptasznik;
        this.ryba = ryba;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public Ptasznik getPtasznik() {
        return ptasznik;
    }

    public void setPtasznik(Ptasznik ptasznik) {
        this.ptasznik = ptasznik;
    }

    public Ryba getRyba() {
        return ryba;
    }

    public void setRyba(Ryba ryba) {
        this.ryba = ryba;
    }

    @Override
    public String toString() {
        return "Paludarium{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", ptasznik=" + ptasznik +
                ", ryba=" + ryba +
                '}';
    }


    //ekstensja
    public static void wyswietlPaludaria() throws Exception {
        ObjectPlus.showExtent(Paludarium.class);
    }
}
