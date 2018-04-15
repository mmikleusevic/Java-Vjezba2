package osc.ada;

public class UnosOsoba {

    TraziMjesto traziMjesto;

    public UnosOsoba(){
        traziMjesto = new Mjesta();
        traziMjesto.setUvjet("Iz Osobe");
        System.out.println(traziMjesto.getRezultat());
    }

}
