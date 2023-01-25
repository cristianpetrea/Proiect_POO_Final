package proiect_poofinal;

import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;
import java.io.*;

public class TestInterfataC {

    public static ArrayList<Casti> listaCasti;
    public static ArrayList<Casti> listaCasti2;

    TestInterfataC() {

        // Creeaza un textarea
        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);

        textArea.setFont(new Font("Arial", Font.PLAIN, 29));
        // Seteaza pozitia si marimea textarea-ului
        textArea.setBounds(20, 60, 850, 320);

        // culoare fundal
        JFrame frame = new JFrame();
        frame.getContentPane().setBackground(Color.darkGray);

        // Butoane

        JButton Filtrare = new JButton("Filtreaza dupa putere(5,10,15,20)");
        Filtrare.setBounds(475, 450, 395, 30);
        JScrollPane scrollPane = new JScrollPane(textArea);
        // text pentru filtrare dupa tip
        JTextField Sistem = new JTextField();
        Sistem.setBounds(20, 480, 425, 30);
        // text pentru filtrare dupa putere
        JTextField Sistem2 = new JTextField();
        Sistem2.setBounds(475, 480, 395, 30);
        JButton genereazaBT = new JButton("Genereaza lista castilor");
        genereazaBT.setBounds(20, 10, 850, 30);
        JButton genereazaBT2 = new JButton("Filtreaza dupa tip (Office,Gaming,Sport) ");
        genereazaBT2.setBounds(20, 450, 425, 30);
        Filtrare.setIconTextGap(10);
        genereazaBT.setIconTextGap(10);
        genereazaBT2.setIconTextGap(10);

        // Logo
        ImageIcon img = new ImageIcon("logo.png");
        frame.setIconImage(img.getImage());

        // menu
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Salvare");
        JMenu menu2 = new JMenu("Golire");
        JMenu menu3 = new JMenu("Citire");

        JMenuItem menuItem = new JMenuItem("Salvare in fisierul CastiGenerate.txt");
        JMenuItem menuItem2 = new JMenuItem("Salvare in fisierul CastiFiltrate.txt");
        JMenuItem menuItem3 = new JMenuItem("Golire fisierul CastiGenerate.txt");
        JMenuItem menuItem4 = new JMenuItem("Golire fisierul CastiFiltrate.txt");
        JMenuItem menuitem5 = new JMenuItem("Citire din fisierul CastiScrise.txt");

        menu.add(menuItem);
        menu.add(menuItem2);
        menu2.add(menuItem3);
        menu2.add(menuItem4);
        menu3.add(menuitem5);

        menuBar.add(menu);
        menuBar.add(menu2);
        menuBar.add(menu3);

        frame.setJMenuBar(menuBar);

        // Adauga un listener pentru buton
        menuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Creeaza un obiect File pentru fisierul in care se va salva textul
                File file = new File("CastiGenerate.txt");
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
                    // Scrie continutul campului de text in fisier
                    writer.write(textArea.getText());
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });

        // Adauga un listener pentru buton
        menuItem2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Creeaza un obiect File pentru fisierul in care se va salva textul
                File file = new File("CastiFiltrate.txt");
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
                    // Scrie continutul campului de text in fisier
                    writer.write(textArea.getText());
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });

        // Adauga un listener pentru buton
        menuItem3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Creeaza un obiect File pentru fisierul care se va sterge
                File file = new File("CastiGenerate.txt");
                try (PrintWriter writer = new PrintWriter(file)) {
                    // Goleste continutul fisierului
                    writer.print("");
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                }
            }
        });

        menuItem4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Creeaza un obiect File pentru fisierul care se va sterge
                File file = new File("CastiFiltrate.txt");
                try (PrintWriter writer = new PrintWriter(file)) {
                    // Goleste continutul fisierului
                    writer.print("");
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                }
            }
        });

        genereazaBT.addActionListener(new ActionListenerGeneratorDateC() {

            @Override
            public void actionPerformed(ActionEvent e) {

                listaCasti = GeneratorCasti.genereazaNisteCasti(10);
                textArea.setText(" " + listaCasti);

            }

        });

        JButton btnClear = new JButton("Sterge");

        btnClear.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                textArea.setText(" ");
            }

        });
        btnClear.setBounds(20, 400, 850, 30);

        genereazaBT2.addActionListener(new ActionListnerFiltrareDateC() {

            public void actionPerformed(ActionEvent e) {

                ArrayList<Casti> listaCasti2 = new ArrayList<Casti>();
                listaCasti = GeneratorCasti.genereazaNisteCasti(10);
                listaCasti2 = CastiFilter.filtreazaDupaTip(listaCasti, Sistem.getText());
                textArea.setText(" " + listaCasti2);

            }

        });

        menuitem5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent s) {
                try (BufferedReader br = new BufferedReader(new FileReader("CastiScrise.txt"))) {
                    String line;
                    while ((line = br.readLine()) != null) {
                        textArea.append(line + "\n");
                    }
                    textArea.setFont(new Font("Arial", Font.PLAIN, 29));
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        });

        Filtrare.addActionListener(new ActionListnerFiltrareDateC() {

            @Override
            public void actionPerformed(ActionEvent e) {

                ArrayList<Casti> listaInitCasti = new ArrayList<Casti>();
                listaCasti = GeneratorCasti.genereazaNisteCasti(1);
                listaInitCasti = CastiFilter.filtreazaDupaPutere(listaCasti, Integer.parseInt(Sistem2.getText()));
                textArea.setText(" " + listaInitCasti);
            }

        });

        // implementari in interfata

        frame.add(Sistem);
        frame.add(Sistem2);
        frame.add(Filtrare);
        frame.add(genereazaBT);
        frame.add(textArea);
        frame.add(btnClear);
        frame.add(genereazaBT2);
        frame.setSize(900, 600);
        frame.setTitle("Proiect POO");
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.add(scrollPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

    }

    public static void main(String[] args) {

        TestInterfataC s = new TestInterfataC();

    }
}