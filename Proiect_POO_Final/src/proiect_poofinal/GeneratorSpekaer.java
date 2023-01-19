package proiect_poo;

import java.util.Random;

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

    public static Casti[] genereazaNisteCasti(int n) {
        Casti[] listaCasti = new Casti[n];
        for (int i = 0; i < n; i++) {
            String brandCasti = brand[new Random().nextInt(brand.length)];
            String culoareCasti = culoare[new Random().nextInt(culoare.length)];
            String stareCasti = stare[new Random().nextInt(stare.length)];
            int garantieCasti = garantie[new Random().nextInt(garantie.length)];
            float pretCasti = pret[new Random().nextInt(pret.length)];
            int stocCasti = stoc[new Random().nextInt(stoc.length)];
            String tipCasti = tip[new Random().nextInt(tip.length)];
            String functiiCasti = functii[new Random().nextInt(functii.length)];
            boolean microfonCasti = microfon[new Random().nextInt(microfon.length)];
            int putereCasti = putere[new Random().nextInt(putere.length)];

            Casti casti = new Casti(brandCasti, culoareCasti, stareCasti, garantieCasti, pretCasti, stocCasti, tipCasti,
                    functiiCasti, microfonCasti, putereCasti);
            listaCasti[i] = casti;

        }
        return listaCasti;
    }

}
