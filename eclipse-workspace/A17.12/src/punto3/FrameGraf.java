package punto3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FrameGraf extends JFrame{
	
	
	public FrameGraf() {
		JFrame frame = new JFrame();
		setSize(400,400);
		add(createButtonPanel(),BorderLayout.SOUTH);
		
	}
	
	public JPanel createButtonPanel(){
		JPanel buttonPanel= new JPanel();
		JButton buttonNero = new JButton("nero");
		setLayout(GridLayout);
		buttonNero.setBackground(Color.BLACK);
		
		class ButtonNeroLiatener implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				//cambia colore sopra
			}
		}
		
		buttonPanel.add(buttonNero);
		return buttonPanel;
	}
	
	
	
	
	
}
