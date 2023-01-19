package proiect_poofinal;

import java.util.ArrayList;



public class SortareMiniCamere {
    public static ArrayList<MiniCamere> filtreazaDupaGreutate(ArrayList<MiniCamere> listainitialaCamere, int greutate) {
		ArrayList<MiniCamere> listaMiniCamere = new ArrayList<MiniCamere>();
		for(MiniCamere minicamere:listainitialaCamere)
			if (minicamere.getGreutate()<=greutate)
					listaMiniCamere.add(minicamere);				
		return listaMiniCamere;
	}


	
	public static ArrayList<MiniCamere> filtreazaDupaSistemedeOperare(ArrayList<MiniCamere> listaCamere, String SistemOperare) {
		ArrayList<MiniCamere> listaMiniCamere = new ArrayList<MiniCamere>();
		for(MiniCamere minicamere:listaCamere)
			if (minicamere.getSistemeOperare().equals(SistemOperare) )
            listaMiniCamere.add(minicamere);		
		return listaMiniCamere;
		
	}

}