package proiect_poofinal;

import java.util.ArrayList;

public class CastiFilter {
    public static ArrayList<Casti> filtreazaDupaPutere(ArrayList<Casti> listaInitCasti, int putere) {
        ArrayList<Casti> listaCasti = new ArrayList<Casti>();
        for (Casti casti : listaInitCasti)
            if (casti.getPutere() <= putere)
                listaCasti.add(casti);
        return listaCasti;
    }

    public static ArrayList<Casti> filtreazaDupaTip(ArrayList<Casti> listaCasti2, String tip) {
        ArrayList<Casti> listaCasti = new ArrayList<Casti>();
        for (Casti casti : listaCasti2)
            if (casti.getTip().equals(tip))
                listaCasti.add(casti);
        return listaCasti;
    }

}