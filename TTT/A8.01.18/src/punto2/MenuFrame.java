package punto2;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class MenuFrame extends JFrame{
	
	private JMenuBar barra= new JMenuBar();
	private JMenu file= new JMenu("File");
	private JMenuItem esci = new JMenuItem("Esci");
	public JLabel label;
	final int righe = 10;
	final int colonne= 40;
	public JTextArea textArea = new JTextArea(righe, colonne);
	
	
	public MenuFrame() {
		label= new JLabel();
		add(label, BorderLayout.CENTER);
		JMenuBar menuBar= new JMenuBar();
		setJMenuBar(menuBar);
		menuBar.add(createFileMenu());
		setSize(250,250);
		
		textArea.setEditable(false);
		JScrollPane scroll= new JScrollPane(textArea);
		//add(scroll, BorderLayout.WEST);
		add(textArea, BorderLayout.CENTER);
		
		
	}
	
	public JMenu createFileMenu() {
		JMenu menu= new JMenu("File");
		menu.add(createApri());
		menu.add(createEsci());
		return menu;
	}
	
	public JMenuItem createApri() {
		JMenuItem apri = new JMenuItem("Apri");
		//quello che fa apri
		class MenuItemListener implements ActionListener{
			public void actionPerformed(ActionEvent event) {
				FileReader in;
				try {
					in = new FileReader("testo.txt");
					while(in.read() != -1) {
						Scanner scanner= new Scanner(in);
						textArea.append(scanner.nextLine());
					}
						
					in.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
				
			 /* visualizzare nel corpo della finestra il contenuto del file
				“testo.txt” allegato in pagine di 10 righe, ciascuna con 40 caratteri; il corpo
				della finestra deve contenere due pulsanti per muoversi alla pagina
				precedente e alla pagina successiva rispettivamente. */
				
				System.exit(0);
			}
		}
		return apri;
	}
	
	public JMenuItem createEsci() {
		JMenuItem esci= new JMenuItem("Esci");
		class MenuItemListener implements ActionListener{
			public void actionPerformed(ActionEvent event) {
				System.exit(0);
			}
		}
		ActionListener listener = new MenuItemListener();
		esci.addActionListener(listener);
		return esci;
	}
	
	
	
	
	

}
