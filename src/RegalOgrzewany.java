import java.io.Serializable;

public class RegalOgrzewany  extends ObjectPlusPlus implements Serializable {

    private int mocKablaGrzewczego;
    private int dlugoscKablaGrzewczego;

    public RegalOgrzewany(int mocKablaGrzewczego, int dlugoscKablaGrzewczego) {
        this.mocKablaGrzewczego = mocKablaGrzewczego;
        this.dlugoscKablaGrzewczego = dlugoscKablaGrzewczego;
    }

    public int getMocKablaGrzewczego() {
        return mocKablaGrzewczego;
    }

    public void setMocKablaGrzewczego(int mocKablaGrzewczego) {
        this.mocKablaGrzewczego = mocKablaGrzewczego;
    }

    public int getDlugoscKablaGrzewczego() {
        return dlugoscKablaGrzewczego;
    }

    public void setDlugoscKablaGrzewczego(int dlugoscKablaGrzewczego) {
        this.dlugoscKablaGrzewczego = dlugoscKablaGrzewczego;
    }


    public void szczegoly() {
        System.out.println("Regał ogrzewany kablem o długości: " + this.dlugoscKablaGrzewczego + " metrów, o mocy: " + this.mocKablaGrzewczego + " wat.");
    }
}
