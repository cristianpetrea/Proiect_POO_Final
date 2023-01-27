package proiect_poofinal;

import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;
import java.io.*;





public class InterfataMiniCamere {
	
	public static ArrayList<MiniCamere> listaCamere;
	public static ArrayList<MiniCamere> listaMiniCamere;
	
	
	InterfataMiniCamere() {
 
        // Creeaza un textarea
        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
		textArea.setFont(new Font("Arial", Font.PLAIN, 25));
        // Seteaza pozitia si marimea textarea-ului
        textArea.setBounds(400, 60, 400, 270);


//culoare fundal
		JFrame frame = new JFrame();
        frame.getContentPane().setBackground(Color.CYAN);

//Butoane	
        JButton saveButton = new JButton("Salvare ListaCamere");
        saveButton.setBounds(20,330,200,30);
        JButton saveButton2 = new JButton("Salvare ListaFiltrata");
        saveButton2.setBounds(20,280,200,30);
        JButton clearButton2 = new JButton("Golire CamereFiltrare.txt");
        clearButton2.setBounds(600,550,200,30);
        JButton Filtrare = new JButton("Filtreaza dupa greutate");
        Filtrare.setBounds(20, 220, 200, 30);
        JScrollPane scrollPane = new JScrollPane(textArea);

        // Adauga un listener pentru buton
        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Creeaza un obiect File pentru fisierul in care se va salva textul
                File file = new File("CamereGenerate.txt");
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
                    // Scrie continutul campului de text in fisier
                    writer.write(textArea.getText());
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });

                // Adauga un listener pentru buton
                saveButton2.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        // Creeaza un obiect File pentru fisierul in care se va salva textul
                        File file = new File("CamereFiltrate.txt");
                        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
                            // Scrie continutul campului de text in fisier
                            writer.write(textArea.getText());
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }
                    }
                });

        JButton clearButton = new JButton("Golire CamereGenerate.txt");
        clearButton.setBounds(600,500,200,30);
        // Adauga un listener pentru buton
        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Creeaza un obiect File pentru fisierul care se va sterge
                File file = new File("CamereGenerate.txt");
                try (PrintWriter writer = new PrintWriter(file)) {
                    // Goleste continutul fisierului
                    writer.print("");
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                }
            }
        });
        clearButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Creeaza un obiect File pentru fisierul care se va sterge
                File file = new File("CamereFiltrate.txt");
                try (PrintWriter writer = new PrintWriter(file)) {
                    // Goleste continutul fisierului
                    writer.print("");
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                }
            }
        });
       


		JButton genereazaBT = new JButton("Genereaza MiniCamere");
		genereazaBT.setBounds(20, 50, 200, 30);
		
        genereazaBT.addActionListener(new ActionListnerGenerareDate(){
  
            @Override
            public void actionPerformed(ActionEvent e) {

               listaCamere = GeneratorMiniCamere.genereazaRandomCamere(1);
               
                textArea.setText(" " +listaCamere);


            }

        });

		JTextField Sistem = new  JTextField();
        Sistem.setBounds(20,100,200,30);
        JTextField Sistem2 = new  JTextField();
        Sistem2.setBounds(20,190,200,30);

        JButton btnClear = new JButton("Clear");
  
        btnClear.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
         
                textArea.setText(" ");
            }

        

        });
		btnClear.setBounds(200,700,70,50);



		JButton genereazaBT2 = new JButton("Filtreaza dupa Sistem ");
		genereazaBT2.setBounds(20, 130, 200, 30);
        

        genereazaBT2.addActionListener(new ActionListnerFiltrareDate()

        {
            public void actionPerformed(ActionEvent e) 
            { 	
                ArrayList<MiniCamere> listaCamere = new ArrayList<MiniCamere>();
                listaCamere = GeneratorMiniCamere.genereazaRandomCamere(10);

                if (Sistem.getText().isEmpty()) {
                    textArea.setText(" ");
                } else {
                    listaMiniCamere = SortareMiniCamere.filtreazaDupaSistemedeOperare(listaCamere,Sistem.getText());
                    textArea.setText(" " +listaMiniCamere);
                }
            
           
  
            }
        });
        Filtrare.addActionListener(new ActionListnerFiltrareDate() {
            public void actionPerformed(ActionEvent e) { 	
                ArrayList<MiniCamere> listaCamere = new ArrayList<MiniCamere>();
                listaCamere = GeneratorMiniCamere.genereazaRandomCamere(10);
        
                if (Sistem2.getText().isEmpty()) {
                    textArea.setText(" ");
                } else {
                    listaMiniCamere = SortareMiniCamere.filtreazaDupaGreutate(listaCamere, Integer.parseInt(Sistem2.getText()));
                    textArea.setText(" " +listaMiniCamere);
                }
            }
        });
        
        
        JButton CitireFisier = new JButton("Import");
        CitireFisier.setBounds(600,600,200,30);

        CitireFisier.addActionListener(e -> {
 
            JFileChooser fileChooser = new JFileChooser();
            int returnValue = fileChooser.showOpenDialog(null); 
            if (returnValue == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();

                try {
         
                    BufferedReader reader = new BufferedReader(new FileReader(selectedFile));
                   
                    String line;
                    while ((line = reader.readLine()) != null) {
                        textArea.append(line + "\n");
                    }  
                    reader.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });

	
		
//implementari in interfata
       frame.add(CitireFisier);
        frame.add(clearButton2);
        frame.add(saveButton2);
        frame.add(Sistem);
        frame.add(Sistem2);
        frame.add(Filtrare);
        frame.add(clearButton);
		frame.add(genereazaBT);
        frame.add(textArea);
		frame.add(btnClear);
		frame.add(genereazaBT2);
		frame.add(saveButton);
		frame.setSize(900, 900);
		frame.setTitle("Interfata Grafica");
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setResizable(false);
        frame.add(scrollPane);
	}

	public static void main(String[] args) {
	
		InterfataMiniCamere s = new InterfataMiniCamere();
       
	}
}
