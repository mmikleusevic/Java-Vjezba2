package osc.ada;

public class Posao<T extends Covjek> {

    private T ime;

    public T getIme() {
        return ime;
    }

    public void setIme(T ime) {
        this.ime = ime;
    }

    public void odradi(){
        ime.knjizi();
    }
}
