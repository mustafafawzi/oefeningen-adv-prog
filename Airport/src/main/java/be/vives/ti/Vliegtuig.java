package be.vives.ti;

public class Vliegtuig {
    private String code;
    private int aantal_plaatsen_eco;
    private int getAantal_plaatsen_bus;
    private Luchthaven huidigeLuchthaven;

    public Vliegtuig(String code, int aantal_plaatsen_eco, int getAantal_plaatsen_bus, Luchthaven huidigeLuchthaven) {
        this.code = code;
        this.aantal_plaatsen_eco = aantal_plaatsen_eco;
        this.getAantal_plaatsen_bus = getAantal_plaatsen_bus;
        this.huidigeLuchthaven = huidigeLuchthaven;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getAantal_plaatsen_eco() {
        return aantal_plaatsen_eco;
    }

    public void setAantal_plaatsen_eco(int aantal_plaatsen_eco) {
        this.aantal_plaatsen_eco = aantal_plaatsen_eco;
    }

    public int getGetAantal_plaatsen_bus() {
        return getAantal_plaatsen_bus;
    }

    public void setGetAantal_plaatsen_bus(int getAantal_plaatsen_bus) {
        this.getAantal_plaatsen_bus = getAantal_plaatsen_bus;
    }

    public Luchthaven getHuidigeLuchthaven() {
        return huidigeLuchthaven;
    }

    public void setHuidigeLuchthaven(Luchthaven huidigeLuchthaven) {
        this.huidigeLuchthaven = huidigeLuchthaven;
    }
}
