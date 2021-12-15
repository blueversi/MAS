import java.io.Serializable;

public class RegalOswietlony  extends ObjectPlusPlus implements Serializable {

    private String typOswietlenia;
    private int natezenieSwiatla;

    public RegalOswietlony(String typOswietlenia, int natezenieSwiatla) {
        this.typOswietlenia = typOswietlenia;
        this.natezenieSwiatla = natezenieSwiatla;
    }

    public String getTypOswietlenia() {
        return typOswietlenia;
    }

    public void setTypOswietlenia(String typOswietlenia) {
        this.typOswietlenia = typOswietlenia;
    }

    public int getNatezenieSwiatla() {
        return natezenieSwiatla;
    }

    public void setNatezenieSwiatla(int natezenieSwiatla) {
        this.natezenieSwiatla = natezenieSwiatla;
    }

    public void szczegoly() {
        System.out.println("Regał oświetlony przez oświetlenie typu: " + this.typOswietlenia + ", o natężeniu: " + this.natezenieSwiatla + " lumenów.");
    }
}

