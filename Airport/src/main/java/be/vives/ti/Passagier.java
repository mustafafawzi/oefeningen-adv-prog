package be.vives.ti;

public class Passagier {
    private String vm;
    private String an;

    public Passagier(String vm, String an) {
        this.vm = vm;
        this.an = an;
    }

    public String getVm() {
        return vm;
    }

    public void setVm(String vm) {
        this.vm = vm;
    }

    public String getAn() {
        return an;
    }

    public void setAn(String an) {
        this.an = an;
    }
}
