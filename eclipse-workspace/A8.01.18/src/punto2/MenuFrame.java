package punto2;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuFrame extends JFrame{
	
	private JMenuBar barra= new JMenuBar();
	private JMenu file= new JMenu("File");
	private JMenuItem esci = new JMenuItem("Esci");
	public JLabel label;
	
	public MenuFrame() {
		label= new JLabel("label");
		add(label, BorderLayout.CENTER);
		JMenuBar menuBar= new JMenuBar();
		setJMenuBar(menuBar);
		menuBar.add(createFileMenu());
		setSize(300, 400);
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
