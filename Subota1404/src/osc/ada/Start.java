package osc.ada;

import javax.swing.*;

public class Start {

    Profesor p;

    public Start(){

        Covjek[] ljudi = new Covjek[2];

        int i;
        //Covjek c = new Covjek();
        p = new Profesor(
                JOptionPane.showInputDialog("Unesi ime")
                ,"Perić",180,true);

        p.setFakultet(new Fakultet("FFOS","Jagerova"));
        ispisi();

        Student s = new Student("Marko","Marić",190,true,new Smjer("IT",1));

        System.out.println(p.pozdravi());
        System.out.println(s.pozdravi());

        p.knjizi();
        s.knjizi();

        ljudi[0]=p;
        ljudi[1]=s;


        kljiziSve(ljudi);

        new UnosOsoba();
        new UnosFakulteta();

        Posao<Profesor> pp = new Posao<>();
        pp.odradi();

        Posao<Student> ps = new Posao<>();
        ps.odradi();

    }

    private void kljiziSve(Covjek[] n){
        for (Covjek c: n
             ) {
            c.knjizi();
        }
    }

    private void ispisi() {
        System.out.println(p.getFakultet().getNaziv());

    }

    public static void main(String[] args) {

        new Start();
    }

}
