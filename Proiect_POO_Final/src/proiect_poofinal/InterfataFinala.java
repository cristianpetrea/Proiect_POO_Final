package proiect_poofinal;


import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;
import java.io.*;


public class InterfataFinala {
    public static ArrayList<MiniCamere> listaCamere;
	public static ArrayList<MiniCamere> listaMiniCamere;
    public static ArrayList<Speaker> listaSpeaker;
	public static ArrayList<Speaker> listaFiltrataSpeaker;
    public static ArrayList<Casti> listaCasti;
    public static ArrayList<Casti> listaCasti2;

    InterfataFinala() {


        // Creeaza un textarea
        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
		textArea.setFont(new Font("Arial", Font.PLAIN, 24));
        // Seteaza pozitia si marimea textarea-ului
        textArea.setBounds(40, 60, 800, 280);

//culoare fundal
JFrame frame = new JFrame();
frame.getContentPane().setBackground(Color.LIGHT_GRAY );

//Butoane	
JButton saveButton = new JButton("Salvare ListaGenerata");
saveButton.setBounds(150,450,200,30);
JButton saveButton2 = new JButton("Salvare ListaFiltrata");
saveButton2.setBounds(150,500,200,30);
JButton clearButton2 = new JButton("Golire ListaFiltrataGenerata.txt");
clearButton2.setBounds(500,500,250,30);
JButton Filtrare = new JButton("Filtreaza dupa putere");
Filtrare.setBounds(320, 800, 200, 30);
JScrollPane scrollPane = new JScrollPane(textArea);
JButton GenereazaSpeaker = new JButton("Genereaza Speakere");
GenereazaSpeaker.setBounds(620, 700, 200, 30);
JButton GenereazaCasti = new JButton("Genereaza Casti");
GenereazaCasti.setBounds(320, 700, 200, 30);
JButton Filtrare2 = new JButton("Filtreaza dupa frecventa");
Filtrare2.setBounds(620, 800, 200, 30);

// Adauga un listener pentru buton

saveButton.addActionListener(new ActionListener() {

    public void actionPerformed(ActionEvent e) {

        // Creeaza un obiect File pentru fisierul in care se va salva textul

        File file = new File("ListaGenerata.txt");

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

                File file = new File("ListaGenerataGenerata.txt");

                try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {

                    // Scrie continutul campului de text in fisier

                    writer.write(textArea.getText());

                } catch (IOException ex) {

                    ex.printStackTrace();

                }

            }

        });



JButton clearButton = new JButton("Golire ListaGenerata.txt");

clearButton.setBounds(500,450,250,30);

// Adauga un listener pentru buton

clearButton.addActionListener(new ActionListener() {

    public void actionPerformed(ActionEvent e) {

        // Creeaza un obiect File pentru fisierul care se va sterge

        File file = new File("ListaGenerata.txt");

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

        File file = new File("ListaFiltrataGenerata.txt");

        try (PrintWriter writer = new PrintWriter(file)) {

            // Goleste continutul fisierului

            writer.print("");

        } catch (FileNotFoundException ex) {

            ex.printStackTrace();

        }

    }

});





JButton genereazaBT = new JButton("Genereaza MiniCamere");

genereazaBT.setBounds(20, 700, 200, 30);



genereazaBT.addActionListener(new ActionListnerGenerareDate(){



    @Override

    public void actionPerformed(ActionEvent e) {



       listaCamere = GeneratorMiniCamere.genereazaRandomCamere(1);

       

        textArea.setText(" " +listaCamere);




    }



});




GenereazaCasti.addActionListener(new ActionListenerGeneratorDateC(){



    @Override

    public void actionPerformed(ActionEvent e) {



       listaCasti = GeneratorCasti.genereazaNisteCasti(1);

       

        textArea.setText(" " +listaCasti);




    }



});



GenereazaSpeaker.addActionListener(new ActiuneListaGenerareDate(){

 

    @Override

    public void actionPerformed(ActionEvent e) {



       listaSpeaker = GeneratorSpeaker.genereazaNisteSpeaker(1);

       

       textArea.setText(" " +listaSpeaker);




    }



});

JTextField Sistem = new  JTextField();

Sistem.setBounds(20,750,200,30);

JTextField Sistem2 = new  JTextField();

Sistem2.setBounds(320,750,200,30);

JTextField Sistem3 = new  JTextField();

Sistem3.setBounds(620,750,200,30);




JButton btnClear = new JButton("Clear");



btnClear.addActionListener(new ActionListener(){



    @Override

    public void actionPerformed(ActionEvent e) {

 

        textArea.setText(" ");

    }





});

btnClear.setBounds(40,340,800,40);





JButton genereazaBT2 = new JButton("Filtreaza dupa Sistem ");

genereazaBT2.setBounds(20, 800, 200, 30);




genereazaBT2.addActionListener(new ActionListnerFiltrareDate()



{

    public void actionPerformed(ActionEvent e)

    {  

        ArrayList<MiniCamere> listaCamere = new ArrayList<MiniCamere>();

        listaCamere = GeneratorMiniCamere.genereazaRandomCamere(10);

        listaMiniCamere = SortareMiniCamere.filtreazaDupaSistemedeOperare(listaCamere, Sistem.getText());

        textArea.setText(" " +listaMiniCamere);

   

   



    }

});

Filtrare.addActionListener(new ActionListnerFiltrareDate()



{

    @Override

    public void actionPerformed(ActionEvent e) {



        ArrayList<Casti> listaInitCasti = new ArrayList<Casti>();

        listaCasti = GeneratorCasti.genereazaNisteCasti(1);

        listaInitCasti = CastiFilter.filtreazaDupaPutere(listaCasti, Integer.parseInt(Sistem2.getText()));

        textArea.setText(" " + listaInitCasti);

    }

});



Filtrare2.addActionListener(new ActiuneListaFiltrare()



{

    public void actionPerformed(ActionEvent e)

    {  

        ArrayList<Speaker> listaSpeaker = new ArrayList<Speaker>();

        listaSpeaker = GeneratorSpeaker.genereazaNisteSpeaker(10);

        listaFiltrataSpeaker = SpeakerFilter.filtreazaDupaFrecventa(listaSpeaker,Integer.parseInt(Sistem3.getText()));

        textArea.setText(" " +listaFiltrataSpeaker);

   

   



    }

});






//implementari in interfata

frame.add(Sistem2);

frame.add(Sistem3);

frame.add(Filtrare2);

frame.add(GenereazaCasti);

frame.add(GenereazaSpeaker);

frame.add(clearButton2);

frame.add(saveButton2);

frame.add(Sistem);

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

   

        InterfataFinala s = new InterfataFinala();

       

    }




}	
