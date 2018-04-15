package osc.ada;

import java.util.*;

public class Start {

    public static void main(String[] args) {

        List<Evidencija> evidencije = new ArrayList<>();

        Scanner ulaz = new Scanner(System.in);
        Evidencija e;
        Pjesma p;
        while(true){
            System.out.println("Unesi naziv evidencije");
            e=new Evidencija();
            e.setNaziv(ulaz.nextLine());
            System.out.println("Unesi ime osobe koja sluša");
            e.setImeOsobe(ulaz.nextLine());

            e.setPjesme(new ArrayList<>());
            for(;;){
                p=new Pjesma();
                System.out.println("Unesi ime pjesme");
                p.setNaziv(ulaz.nextLine());
                System.out.println("Unesi izvođača");
                p.setIzvodac(ulaz.nextLine());

                e.getPjesme().add(p);
                System.out.println("Još pjesama ?");
                if(ulaz.nextLine().equals("ne")){
                    break;
                }
            }

            evidencije.add(e);
            System.out.println("Još evidencija?");
            if(ulaz.nextLine().equals("ne")){
                break;
            }
        }


        Map<Pjesma,Integer> mapa = new HashMap<>();
        evidencije.forEach((ev)->{
            ev.getPjesme().forEach((pj)->{
                mapa.put(pj,mapa.containsKey(pj) ? mapa.get(pj)+1 : 1);
            });
        });
        Iterator<Pjesma> it = mapa.keySet().iterator();
        while (it.hasNext()){
            p=it.next();
            if(mapa.get(p)>1){
                System.out.println(p.getIzvodac() + ", "
                        + p.getNaziv() + mapa.get(p));
            }
        }



    }
}
