package be.vives.ti;

public class Luchthaven {
    private String naam;
    private String IATA_code;

    public Luchthaven(String naam) {
        this.naam = naam;
        this.IATA_code = setIATA_code(naam);
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getIATA_code() {
        return IATA_code;
    }

    public String setIATA_code(String naam) {
        return naam.substring(0,3).toUpperCase();
    }
}
