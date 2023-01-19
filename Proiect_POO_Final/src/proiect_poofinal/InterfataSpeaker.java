package proiect_poofinal;

import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;
import java.io.*;





public class InterfataSpeaker {
	
	public static ArrayList<Speaker> listaSpeaker;
	public static ArrayList<Speaker> listaFiltrataSpeaker;
	
	
	Interfata() {
 //Caseta Text
        JTextArea casetaText = new JTextArea();
        casetaText.setEditable(false);
		casetaText.setFont(new Font("Arial", Font.PLAIN, 24));
        casetaText.setBounds(40, 60, 450, 290);


//Campuri de scris pentru Filtrare
        JTextField Text = new  JTextField();
        Text.setBounds(40,360,250,30);
        JTextField Text2 = new  JTextField();
        Text2.setBounds(40,460,250,30);



//Schimbare culoare Interfata
		JFrame frame = new JFrame();
        frame.getContentPane().setBackground(Color.ORANGE);




//Butoanele din interfata
        JButton ButonSalvareListaSpeakere = new JButton("Salvare Speaker");
        ButonSalvareListaSpeakere.setBounds(20,800,200,30);
        JButton ButonSalvareListaFiltrata = new JButton("Salvare ListaFiltrata");
        ButonSalvareListaFiltrata.setBounds(20,750,200,30);
        JButton Filtrare = new JButton("Filtreaza dupa TimpIncarcare");
        Filtrare.setBounds(40, 490, 250, 30);
        JButton GenereazaSpeaker = new JButton("Genereaza Speakere");
		GenereazaSpeaker.setBounds(600, 200, 200, 100);
        JButton Filtrare2 = new JButton("Filtreaza dupa Frecventa ");
		Filtrare2.setBounds(40, 390, 250, 30);

    

//Actiunile butoanelor


//Buton Salvare in fisier
        ButonSalvareListaSpeakere.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                File file = new File("Speakere.txt");
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
                  
                    writer.write(casetaText.getText());
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });

//Buton Salvare Lista Filtrata in Fisier              
                ButonSalvareListaFiltrata.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                  
                        File file = new File("SpeakereFiltrate.txt");
                        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
                           
                            writer.write(casetaText.getText());
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }
                    }
                });


      

       


//Buton pentru Generare Speaker	
        GenereazaSpeaker.addActionListener(new ActiuneListaGenerareDate(){
  
            @Override
            public void actionPerformed(ActionEvent e) {

               listaSpeaker = GeneratorSpeaker.genereazaNisteSpeaker(1);
               
               casetaText.setText(" " +listaSpeaker);


            }

        });



        
//Buton filtrare dupa Frecventa
        Filtrare2.addActionListener(new ActiuneListaFiltrare()

        {
            public void actionPerformed(ActionEvent e) 
            { 	
                ArrayList<Speaker> listaSpeaker = new ArrayList<Speaker>();
                listaSpeaker = GeneratorSpeaker.genereazaNisteSpeaker(10);
                listaFiltrataSpeaker = SpeakerFilter.filtreazaDupaFrecventa(listaSpeaker,Integer.parseInt(Text.getText()));
                casetaText.setText(" " +listaFiltrataSpeaker);
            
           
  
            }
        });


//Buton filtrare dupa Timpul de Incarcare        
        
        Filtrare.addActionListener(new ActiuneListaFiltrare()

        {
            public void actionPerformed(ActionEvent e) 
            { 	
                ArrayList<Speaker> listaSpeaker = new ArrayList<Speaker>();
                listaSpeaker = GeneratorSpeaker.genereazaNisteSpeaker(10);
                listaFiltrataSpeaker = SpeakerFilter.filtreazaDupaIncarcare(listaSpeaker, Integer.parseInt(Text2.getText()));
                casetaText.setText(" " +listaFiltrataSpeaker);
            
           
  
            }
        });
        
        

		
//implementari in interfata
       

		frame.add(Filtrare2);
        frame.add(ButonSalvareListaFiltrata);
        frame.add(Text);
        frame.add(Text2);
        frame.add(Filtrare);
		frame.add(GenereazaSpeaker);
        frame.add(casetaText);
		frame.add(ButonSalvareListaSpeakere);
		frame.setSize(950, 950);
		frame.setTitle("Interfata");
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setResizable(false);
    
        
	}

	public static void main(String[] args) {
	
	InterfataSpeaker s = new InterfataSpeaker();
       
	}
}
