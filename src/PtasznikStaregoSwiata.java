import java.time.LocalDate;

public class PtasznikStaregoSwiata extends Ptasznik {

    private static String silaJadu = "silny";
    private boolean czyStryduluje;
    public PtasznikStaregoSwiata(String rodzaj, String gatunek, LocalDate dataUrodzenia, KolorPtasznika kolor, boolean czyStryduluje) {
        super(rodzaj, gatunek, dataUrodzenia, kolor);
    }

    public PtasznikStaregoSwiata(String rodzaj, String gatunek, LocalDate dataUrodzenia, boolean czyStryduluje) {
        super(rodzaj, gatunek, dataUrodzenia);
        this.czyStryduluje = czyStryduluje;
    }

    public static String getSilaJadu() {
        return silaJadu;
    }

    public boolean CzyStryduluje() {
        return czyStryduluje;
    }

    public void setCzyStryduluje(boolean czyStryduluje) {
        this.czyStryduluje = czyStryduluje;
    }
}

