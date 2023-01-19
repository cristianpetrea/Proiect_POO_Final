package proiect_poofinal;

import java.util.ArrayList;

public class SpeakerFilter {
    public static ArrayList<Speaker> filtreazaDupaIncarcare(ArrayList<Speaker> listaSpeaker, int chargingTime) {
        ArrayList<Speaker> listaFiltrataSpeaker = new ArrayList<Speaker>();
        for (Speaker speaker : listaSpeaker)
            if (speaker.getChargingTime() <= chargingTime)
            listaFiltrataSpeaker.add(speaker);
        return listaFiltrataSpeaker;
    }

    public static ArrayList<Speaker> filtreazaDupaFrecventa(ArrayList<Speaker> listaSpeaker, int frequency) {
        ArrayList<Speaker> listaFiltrataSpeaker = new ArrayList<Speaker>();
        for (Speaker speaker : listaSpeaker)
            if (speaker.getFrequency() <= frequency)
            listaFiltrataSpeaker.add(speaker);
        return listaFiltrataSpeaker;
    }

}
