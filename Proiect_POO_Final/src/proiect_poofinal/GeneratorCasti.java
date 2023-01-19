package proiect_poofinal;

import java.util.Random;
import java.util.ArrayList;

public class GeneratorCasti {
    static private String[] brand = { "Samsung", "Apple", "Sony", "Huawei", "Xiaomi", "LG", "Lenovo", "Microsoft" };

    static private String[] culoare = { "Negru", "Alb", "Rosu", "Verde", "Albastru", "Galben", "Portocaliu", "Gri" };

    static private String[] stare = { "Nou", "Vechi" };

    static private int[] garantie = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

    static private float[] pret = { 100, 200, 300, 400, 500, 600, 700, 800, 900, 1000 };

    static private int[] stoc = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

    static private String[] tip = { "Office", "Gaming", "Sport" };

    static private String[] functii = { "Bluetooth", "Wired", "Wireless" };

    static private boolean[] microfon = { true, false };

    static private int[] putere = { 5, 10, 15, 20 };

    public static ArrayList<Casti> genereazaNisteCasti(int n) {
        ArrayList<Casti> listaCasti = new ArrayList<Casti>();
        Casti oCasca;
        for (int i = 0; i < n; i++) {
            String brandCasca = brand[new Random().nextInt(brand.length)];
            String culoareCasca = culoare[new Random().nextInt(culoare.length)];
            String stareCasca = stare[new Random().nextInt(stare.length)];
            int garantieCasca = garantie[new Random().nextInt(garantie.length)];
            float pretCasca = pret[new Random().nextInt(pret.length)];
            int stocCasca = stoc[new Random().nextInt(stoc.length)];
            String tipCasca = tip[new Random().nextInt(tip.length)];
            String functiiCasca = functii[new Random().nextInt(functii.length)];
            boolean microfonCasca = microfon[new Random().nextInt(microfon.length)];
            int putereCasca = putere[new Random().nextInt(putere.length)];
            oCasca = new Casti(brandCasca, culoareCasca, stareCasca, garantieCasca, pretCasca, stocCasca, tipCasca,
                    functiiCasca, microfonCasca, putereCasca);

            listaCasti.add(oCasca);

        }
        return listaCasti;

    }

}