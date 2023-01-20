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
Filtrare2.setBounds(620, 800, 200, 30)
