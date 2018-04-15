package osc.ada;

import java.util.List;

public class Evidencija {

    private String naziv;
    private String imeOsobe;
    private List<Pjesma> pjesme;

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getImeOsobe() {
        return imeOsobe;
    }

    public void setImeOsobe(String imeOsobe) {
        this.imeOsobe = imeOsobe;
    }

    public List<Pjesma> getPjesme() {
        return pjesme;
    }

    public void setPjesme(List<Pjesma> pjesme) {
        this.pjesme = pjesme;
    }
}
