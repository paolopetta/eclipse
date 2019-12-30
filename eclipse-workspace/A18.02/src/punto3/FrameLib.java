package punto3;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import punto1.Autore;
import punto1.LibroCatalogato;
import punto2.Estrattore;
import punto2.Estrazione;

public class FrameLib extends JFrame{
	
	private ArrayList<Autore> autori;
	private ArrayList<LibroCatalogato> libri;
	private Estrazione<LibroCatalogato> estrazioneLibri;
	private Estrazione<Autore> estrazioneAutore ;
	private JTextArea textArea;
	
	public FrameLib(ArrayList<Autore> autori, ArrayList<LibroCatalogato> libri) {
		this.autori = autori;
		this.libri= libri;
		setSize(300, 400);
		textArea = new JTextArea(4,4);
		JScrollPane scroll= new JScrollPane(textArea);
		add(createButtonPanel(), BorderLayout.WEST);
		add(scroll, BorderLayout.CENTER);		
	}
	
	public JPanel createButtonPanel() {
		JPanel buttonPanel = new JPanel();
		JButton buttonLibri= new JButton("Libri");
		JButton buttonAutori= new JButton("Autori");
		
		class ButtonLibriListener implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				Estrattore<LibroCatalogato> estrattoreLibri = new Estrattore<LibroCatalogato>(estrazioneLibri);
				textArea.setText(estrattoreLibri.estrazione(libri));
			}
		}
		
		class ButtonAutoriListener implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				Estrattore<Autore> estrattoreAutori= new Estrattore<Autore>(estrazioneAutore);
				textArea.setText(estrattoreAutori.estrazione(autori));
			}
		}
		
		buttonLibri.addActionListener(new ButtonLibriListener());
		buttonAutori.addActionListener(new ButtonAutoriListener());
		buttonPanel.add(buttonLibri, BorderLayout.NORTH);
		buttonPanel.add(buttonAutori, BorderLayout.SOUTH);
		return buttonPanel;
		
	}
	

}
