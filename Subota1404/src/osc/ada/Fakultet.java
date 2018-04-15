package osc.ada;

public class Fakultet {

    private String naziv;
    private String adresa;

    public Fakultet(String naziv, String adresa) {
        this.naziv = naziv;
        this.adresa = adresa;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }
}
