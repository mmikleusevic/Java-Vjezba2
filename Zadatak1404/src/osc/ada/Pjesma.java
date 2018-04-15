package osc.ada;

import java.util.Objects;

public class Pjesma {

    private String izvodac;
    private String naziv;

    public String getIzvodac() {
        return izvodac;
    }

    public void setIzvodac(String izvodac) {
        this.izvodac = izvodac;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pjesma pjesma = (Pjesma) o;
        return Objects.equals(izvodac, pjesma.izvodac) &&
                Objects.equals(naziv, pjesma.naziv);
    }

    @Override
    public int hashCode() {

        return Objects.hash(izvodac, naziv);
    }
}
