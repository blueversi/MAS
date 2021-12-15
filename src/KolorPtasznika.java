import java.awt.*;
import java.io.Serializable;

public class KolorPtasznika extends ObjectPlus  implements Serializable {

    private String nazwa;
    private int r;
    private int g;
    private int b;

    public KolorPtasznika(String nazwa, int r, int g, int b) {
        super();

        this.nazwa = nazwa;
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getG() {
        return g;
    }

    public void setG(int g) {
        this.g = g;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public Color getKolorPtasznika() {
        return new Color(this.r, this.g, this.b);
    }

    @Override
    public String toString() {
        return  nazwa +
                "\n"
                + "Wartości RGB:      " +
                "R = " + r +
                " , G = " + g +
                " , B = " + b;
    }
}
