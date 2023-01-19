package proiect_poofinal;

import java.util.ArrayList;
import java.util.Random;

public class GeneratorSpeaker {
    static private String[] brand = { "Samsung", "Apple", "Sony", "A+", "Akai", "LG", "Lenovo", "Genesis" };//branduri de boxe

    static private String[] culoare = { "Negru", "Alb", "Rosu", "Verde", "Albastru", "Galben", "Portocaliu", "Gri" };//culori

    static private String[] stare = { "Nou", "Vechi" };

    static private String[] garantie = {"2","4 "};

    static private float[] pret = { 100, 200, 300, 400, 500, 600, 700, 800, 900, 1000 };

    static private int[] stoc = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    
    static private boolean[] onTheEar = { true, false };
    static private boolean[] hasMicrofon = { true, false };

    static private boolean[] operationalSystem = { true,false};


    static private int[] frequency = { 2600, 2666, 3200, 3666 };

    static private int[] chargingTime = { 30, 60, 90, 120 };

    public static ArrayList<Speaker> genereazaNisteSpeaker(int n) {
        ArrayList<Speaker> listaSpeaker = new ArrayList<Speaker>();
        Speaker unSpeaker;
        for (int i = 0; i < n; i++) {
            String brandCasca = brand[new Random().nextInt(brand.length)];
            String culoareCasca = culoare[new Random().nextInt(culoare.length)];
            String stareCasca = stare[new Random().nextInt(stare.length)];
            String garantieCasca = garantie[new Random().nextInt(garantie.length)];
            float pretSpeaker = pret[new Random().nextInt(pret.length)];
            int stocSpeaker = stoc[new Random().nextInt(stoc.length)];
            boolean onTheEarSpeaker = onTheEar[new Random().nextInt(onTheEar.length)];
            boolean hasMicrofonSpeaker = hasMicrofon[new Random().nextInt(hasMicrofon.length)];
            boolean operationalSystemSpeaker = operationalSystem[new Random().nextInt(operationalSystem.length)];
            int frequencySpeaker = frequency[new Random().nextInt(frequency.length)];
            int chargingTimeSpeaker = chargingTime[new Random().nextInt(chargingTime.length)];
            unSpeaker = new Speaker(brandCasca, culoareCasca, stareCasca, garantieCasca, pretSpeaker, stocSpeaker, onTheEarSpeaker,
                    hasMicrofonSpeaker, operationalSystemSpeaker, frequencySpeaker,chargingTimeSpeaker);

            listaSpeaker.add(unSpeaker);

        }
        return listaSpeaker;

    }

}
