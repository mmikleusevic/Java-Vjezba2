package osc.ada;

public class Student extends Covjek {

    public Student(String ime, String prezime, int visina, boolean ziv, Smjer s) {
        super(ime, prezime, visina, ziv);
        this.smjer=s;
    }

    @Override
    public void knjizi() {
        System.out.println("4662 +");
    }

    public Student(){

    }

    private Smjer smjer;

    public Smjer getSmjer() {
        return smjer;
    }

    public void setSmjer(Smjer smjer) {
        this.smjer = smjer;
    }
}
