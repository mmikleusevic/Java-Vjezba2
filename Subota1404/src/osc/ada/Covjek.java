package osc.ada;

import java.util.Objects;

//pojo
public abstract class Covjek extends Object {

    public abstract void knjizi();

    private String ime;
    private String prezime;
    private int visina;
    private boolean ziv;

    public Covjek(String ime, String prezime, int visina, boolean ziv) {
        this.ime = ime;
        this.prezime = prezime;
        this.visina = visina;
        this.ziv = ziv;
    }

    public Covjek(){

    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getVisina() {
        return visina;
    }

    public void setVisina(int visina) {
        this.visina = visina;
    }

    public boolean isZiv() {
        return ziv;
    }

    public void setZiv(boolean ziv) {
        this.ziv = ziv;
    }

    protected void upit(){

    }

    public String pozdravi(){
        return "Dobar dan";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Covjek covjek = (Covjek) o;
        return visina == covjek.visina &&
                ziv == covjek.ziv &&
                Objects.equals(ime, covjek.ime) &&
                Objects.equals(prezime, covjek.prezime);
    }

    @Override
    public int hashCode() {

        return Objects.hash(ime, prezime, visina, ziv);
    }
}
