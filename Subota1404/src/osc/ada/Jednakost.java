package osc.ada;

public class Jednakost {

    public static void main(String[] args) {


        Profesor p1 = new Profesor();
        p1.setIme("Pero");

        Profesor p2 = new Profesor();
        p2.setIme("Pero");

        System.out.println(p1.equals(p2));

    }
}
