import java.time.LocalDate;

public class PtasznikNowegoSwiata extends Ptasznik {

    private static String silaJadu = "slaby";
    private long iloscWloskowParzacych;

    public PtasznikNowegoSwiata(String rodzaj, String gatunek, LocalDate dataUrodzenia, KolorPtasznika kolor, long iloscWloskowParzacych) {
        super(rodzaj, gatunek, dataUrodzenia, kolor);
        this.iloscWloskowParzacych = iloscWloskowParzacych;
    }

    public PtasznikNowegoSwiata(String rodzaj, String gatunek, LocalDate dataUrodzenia,long iloscWloskowParzacych) {
        super(rodzaj, gatunek, dataUrodzenia);
        this.iloscWloskowParzacych = iloscWloskowParzacych;
    }

    public static String getSilaJadu() {
        return silaJadu;
    }

    public long getIloscWloskowParzacych() {
        return iloscWloskowParzacych;
    }

    public void setIloscWloskowParzacych(long iloscWloskowParzacych) {
        this.iloscWloskowParzacych = iloscWloskowParzacych;
    }
}
