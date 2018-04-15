package osc.ada;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Strukture {

    public static void main(String[] args) {

        String niz[] = new String[2];
        Vector v = new Vector();

        v.add("Pero");
        v.add("MArko");


        for (Object o: v
             ) {
            System.out.println(     ((String)o).charAt(0)   );
        }

        List<String> l = new ArrayList<>();

        l.add("Pero");
        l.add("marko");

        l.forEach((x)->{
            System.out.println(x.charAt(0));
        });

        List<Profesor> lp = new ArrayList<>();

        lp.forEach((profesor -> System.out.println(profesor.getIme())));





    }
}
