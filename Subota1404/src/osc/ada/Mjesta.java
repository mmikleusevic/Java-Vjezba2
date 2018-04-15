package osc.ada;

public class Mjesta implements TraziMjesto {
    private  String uvjet;
    @Override
    public void setUvjet(String uvjet) {
        this.uvjet=uvjet;
    }

    @Override
    public String getRezultat() {
        return "nasao " + uvjet;
    }
}
