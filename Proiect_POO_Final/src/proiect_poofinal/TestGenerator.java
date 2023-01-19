package proiect_poofinal;

import java.util.ArrayList;
import java.util.Scanner;

public class TestGenerator {
    public static void main(String[] args) {
				
		
		/// --- instantiere obiecte pe rand si adaugare in lista
		ArrayList<MiniCamere> chestii =new ArrayList<MiniCamere>();
		chestii.add(new MiniCamere("Sony", "galben", "uzat", 4, 100,0, 24, 50, 1080, 300, "Android"));
		chestii.add(new MiniCamere("Dell", "neon", "nou", 3, 120,33, 64, 30, 720, 500, "Android"));
		chestii.add(new MiniCamere("Samsung", "negru", "nou", 2, 80,64, 64, 20, 720, 600, "Android"));
		System.out.println(chestii);
		
		MiniCamere oCameraoarecare = chestii.get(0);
		System.out.println(" Camera din lista "+oCameraoarecare);		
		
		for(int i=0;i<chestii.size();i++)		
			System.out.println(chestii.get(i));
		
		
		System.out.println(" parcuregere cu for each");
		for(MiniCamere MiniCamere:chestii)
			System.out.println(MiniCamere);
		 	
		
		
		ArrayList<MiniCamere> listaGenericaDeObiecte = new ArrayList<MiniCamere>();
		listaGenericaDeObiecte.add(new MiniCamere("nokia","rosu","nou",2,3,4,2,3,1,0, "Android"));
		
		
		
		
		MiniCamere altaCamera = (MiniCamere) listaGenericaDeObiecte.get(0);
		System.out.println(altaCamera);
		
		
		///------------------------------------------------------------------------
			
		ArrayList<MiniCamere> listaCamere = GeneratorMiniCamere.genereazaRandomCamere(10);		
		System.out.println("lista de camere:");
		System.out.println(listaCamere);
		
		System.out.println("folosim for each pe lista");
		for(MiniCamere oCamera:listaCamere)
			System.out.println(oCamera);
		
		System.out.println("folosim for old style pe lista");
		for(int i=0;i<listaCamere.size();i++)
			System.out.println(listaCamere.get(i));


		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Introduceti limita de greutate: ");
			int greutate = scanner.nextInt();

			 ArrayList<MiniCamere> listaFiltrataCamereG = SortareMiniCamere.filtreazaDupaGreutate(listaCamere, greutate);
			System.out.println("Lista de camere filtrata dupa greutate: \n");
			System.out.println(listaFiltrataCamereG+"\n");
			
		}


		

		ArrayList<MiniCamere> listaMiniCamere = SortareMiniCamere.filtreazaDupaSistemedeOperare(listaCamere, "Android");
        System.out.println("Lista de camere filtrata dupa Sistemul de Operare: \n");
        System.out.println(listaMiniCamere+"\n");
		

		
		
	}




	
	
}