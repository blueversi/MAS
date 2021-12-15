
public class Regal extends ObjectPlusPlus {
    private int szerokosc, wysokosc, glebokosc;

    public Regal(int szerokosc, int wysokosc, int glebokosc) {
        super();

        this.szerokosc = szerokosc;
        this.wysokosc = wysokosc;
        this.glebokosc = glebokosc;
    }

    public Regal( String materialDociepleniowy) throws Exception {
        super();

        this.szerokosc = szerokosc;
        this.wysokosc = wysokosc;
        this.glebokosc = glebokosc;

        dodajDocieplenie(materialDociepleniowy);
    }

    public Regal(int szerokosc, int wysokosc, int glebokosc,  int mocKablaGrzewczego, int dlugoscKablaGrzewczego) throws Exception {
        this.szerokosc = szerokosc;
        this.wysokosc = wysokosc;
        this.glebokosc = glebokosc;

        dodajOgrzewanie(mocKablaGrzewczego, dlugoscKablaGrzewczego);
    }


    public Regal(int szerokosc, int wysokosc, int glebokosc, String typOswietlenia, int natezenieSwiatla) throws Exception {
        this.szerokosc = szerokosc;
        this.wysokosc = wysokosc;
        this.glebokosc = glebokosc;

        dodajOswietlenie(typOswietlenia, natezenieSwiatla);
    }


    protected void dodajDocieplenie(String materialDociepleniowy) throws Exception {
        RegalDocieplony regalDocieplony = new RegalDocieplony(materialDociepleniowy);

        this.addLink(rolaDocieplenie, rolaOgolnaRegal, regalDocieplony);
    }

    protected void dodajOgrzewanie(int mocKablaGrzewczego, int dlugoscKablaGrzewczego) throws Exception {
        RegalOgrzewany regalOgrzewany = new RegalOgrzewany(mocKablaGrzewczego, dlugoscKablaGrzewczego);

        this.addLink(rolaOgrzewanie, rolaOgolnaRegal, regalOgrzewany);
    }


    protected void dodajOswietlenie(String typOswietlenia, int natezenieSwiatla) throws Exception {
        RegalOswietlony regalOswietlony = new RegalOswietlony(typOswietlenia, natezenieSwiatla);

        this.addLink(rolaOswietlenie, rolaOgolnaRegal, regalOswietlony);
    }

    protected void czymJestDocieplonyRegal()  {
        try {
            ObjectPlusPlus[] obj = this.getLinks(rolaDocieplenie);
            System.out.println("Materiał dociepleniowy to: "+  ((RegalDocieplony) obj[0]).getMaterialDociepleniowy());
        } catch (Exception e) {
            System.out.println("Ten regał nie jest Docieplony!");
        }
    }


    protected void wyswietlSzczegolyOswietlenia()  {
        try {
            ObjectPlusPlus[] obj = this.getLinks(rolaOswietlenie);
             ((RegalOswietlony) obj[0]).szczegoly();
        } catch (Exception e) {
          System.out.println("Ten regał nie jest oświetlony!");
        }
    }

    protected void wyswietlSzczegolyOgrzewania()  {
        try {
            ObjectPlusPlus[] obj = this.getLinks(rolaOgrzewanie);
            ((RegalOgrzewany) obj[0]).szczegoly();
        } catch (Exception e) {
            System.out.println("Ten regał nie jest ogrzewany!");
        }
    }

    private static String rolaDocieplenie = "specjalizacjaDocieplenie";
    private static String rolaOgrzewanie = "specjalizacjaOgrzewanie";
    private static String rolaOswietlenie = "specjalizacjaOswietlenie";
    private static String rolaOgolnaRegal = "generalizacja";

    @Override
    public String toString() {
        return "Regal{" +
                "szerokosc=" + szerokosc +
                ", wysokosc=" + wysokosc +
                ", glebokosc=" + glebokosc +
                '}';
    }
}