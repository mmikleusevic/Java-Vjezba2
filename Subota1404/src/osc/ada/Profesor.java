package osc.ada;

import java.util.Objects;

public class Profesor extends Covjek {

    private Fakultet fakultet;


    @Override
    public void knjizi() {
        System.out.println("na 220 + na 120 -");
    }

    public Profesor(String ime, String prezime, int visina, boolean ziv) {
        super(ime, prezime, visina, ziv);
    }

    public Profesor(){
        super();
    }

    public Fakultet getFakultet() {
        return fakultet;
    }



    public void setFakultet(Fakultet fakultet) {
        this.fakultet = fakultet;
    }

    public void metoda1(){
        super.getIme();
    }

    @Override
    public String getIme() {
        return "Pero";
    }

    @Override
    public String pozdravi() {
        return "Dobar dan profesore";
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Profesor profesor = (Profesor) o;
        return Objects.equals(fakultet, profesor.fakultet);
    }

    @Override
    public int hashCode() {

        return Objects.hash(fakultet);
    }
}
