package punto3;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class FrameLib extends JFrame{
	
	private char [][] array = new char[1][2];
	private JTextArea textArea;
	
	
	//array[1][1]= {'?','?'};
	
	public FrameLib(char [][] array) {
		this.array= array;
		setSize(300, 400);
		textArea= new JTextArea(4,4);
		JScrollPane scroll= new JScrollPane(textArea);
		add(createButtonPanel(), BorderLayout.WEST);
		add(scroll, BorderLayout.CENTER);
		
	}
	
	public JPanel createButtonPanel () {
		JPanel buttonPanel = new JPanel();
		JButton buttonAgg = new JButton("Aggiorna");
		
		class ButtonAggListener implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				this.x= x;
				this.y= y;
			}
		}
		
		buttonAgg.addActionListener(new ButtonAggListener());
		return button
	}
	
	

}
