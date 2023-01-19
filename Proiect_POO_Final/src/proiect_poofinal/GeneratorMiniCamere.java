package proiect_poofinal;

import java.util.ArrayList;
import java.util.Random;

public class GeneratorMiniCamere {
    public static String[] branduri=new String[]{"Sony","Samsung","Nokia","myria"};
	
	static private String[] culori = new String[]{"rosu","alb","negru","galben","mov","albastru"};
    static private String[] stari = new String[]{"nou","uzat"};
    static private String[] Sisteme = new String[]{"Android","IOS"};

	public static ArrayList<MiniCamere> genereazaRandomCamere(int n){
	    ArrayList<MiniCamere> listaCamere = new ArrayList<MiniCamere>();
		MiniCamere oCamera;
		for (int i=0;i<n;i++) {
			int greutate = new Random().nextInt(50);
            int pret = new Random().nextInt(1000);
            int stoc = new Random().nextInt(50);
            int memorie = new Random().nextInt(50);
            int format_foto = new Random().nextInt(1080);
            int autonomie = new Random().nextInt(600);
            int garantie = new Random().nextInt(5);
			String brand = branduri[new Random().nextInt(branduri.length)];
            String culoare = culori[new Random().nextInt(culori.length)];
			String stare = stari[new Random().nextInt(stari.length)];
            String SistemeOperare = Sisteme[new Random().nextInt(Sisteme.length)];
			oCamera=new MiniCamere(brand, culoare, stare, garantie, pret, stoc, memorie, greutate, format_foto, autonomie, SistemeOperare);
			listaCamere.add(oCamera);
		}
		return listaCamere;
	}
	

	
	


    
}
