package proiect_poofinal;

import java.util.ArrayList;
import java.util.Scanner;

public class TestGeneratorSpeaker {
    public static void main(String[] args) {
        System.out.println("Testare Proiect");

        // instantierea un obiect de tip Gadget
        // prin apel constructor implicit ( fara parametrii)

        Gadget gadegtMeu = new Gadget();
        gadegtMeu.AfisarePret();
        gadegtMeu.AfisareStoc();

        // initierea unui obiect de tip Speaker
        // prin apel constructor cu parametrii

        Speaker speakerMele = new Speaker("Samsung", "negru", "nou", "2", 299.99f,
                12, true, false, true, 2600, 30);
        speakerMele.AfisarePret();
        speakerMele.AfisareStoc();

        // initierea unui nou obiect de tip casti
        // prin apel constructorul de copiere

        Speaker speakerMele2 = new Speaker(speakerMele);
        speakerMele2.AfisarePret();
        speakerMele2.AfisareStoc();

        // folosirea metodelor get si set.

        speakerMele.setChargingTime(30);
        System.out.println("chargingTime speaker este: " + speakerMele.getChargingTime());

        // folosirea metodei toString()

        System.out.println(speakerMele2);
        System.out.println("Speaker meu este: " + speakerMele.toString());

        // ------------------Testare Proiect------------------

        ArrayList<Speaker> listaSpeaker = GeneratorSpeaker.genereazaNisteSpeaker(10);

        /*
         * for (int i = 0; i < listaSpeaker.length; i++) {
         * System.out.println(listaSpeaker[i]);
         * }
         */
        System.out.println("Lista speaker este: ");
        for (Speaker speaker : listaSpeaker) {
            System.out.println(speaker);
        }
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Introduceti timpul de incarcare:");
            int chargingTime = scanner.nextInt();

            ArrayList<Speaker> listaFiltrata = SpeakerFilter.filtreazaDupaIncarcare(listaSpeaker, chargingTime);
            System.out.println("Lista filtrata este: ");
            System.out.println(listaFiltrata);

            try (Scanner scanner2 = new Scanner(System.in)) {
                System.out.println("Introduceti frecventa maxima:");
                int maxFrequency = scanner2.nextInt();

                ArrayList<Speaker> listaFiltrata2 = SpeakerFilter.filtreazaDupaFrecventa(listaSpeaker, maxFrequency);
                System.out.println("Lista filtrata este: ");
                System.out.println(listaFiltrata2);
    }
        }
    }
}
