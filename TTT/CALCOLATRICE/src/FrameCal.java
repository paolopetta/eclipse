import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class FrameCal extends JFrame{

	private char[] array= {'*'};
	private JTextArea textArea;
	
	
	
	
	public FrameCal() {
		setSize(300,500);
		textArea = new JTextArea(4,2);
		add(textArea, BorderLayout.NORTH);
		add(createButtonPanel(), BorderLayout.CENTER);
	}
	
	public JPanel createButtonPanel() {
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(5,4));
		JButton buttonCE = new JButton("CE");
		JButton buttonCanc = new JButton("<");
		JButton buttonDiv = new JButton("/");
		JButton button7 = new JButton("7");
		JButton button8 = new JButton("8");
		JButton button9 = new JButton("9");
		JButton buttonX = new JButton("X");
		JButton button4 = new JButton("4");
		JButton button5 = new JButton("5");
		JButton button6 = new JButton("6");
		JButton buttonMeno = new JButton("-");
		JButton button1 = new JButton("1");
		JButton button2 = new JButton("2");
		JButton button3 = new JButton("3");
		JButton buttonPiu = new JButton("+");
		JButton button0 = new JButton("0");
		JButton buttonVirgola = new JButton(",");
		JButton buttonUguale = new JButton("=");
		
		
		buttonPanel.add(new JButton());
		buttonPanel.add(buttonCE);
		buttonPanel.add(buttonCanc);
		buttonPanel.add(buttonDiv);
		buttonPanel.add(button7);
		buttonPanel.add(button8);
		buttonPanel.add(button9);
		buttonPanel.add(buttonX);
		buttonPanel.add(button4);
		buttonPanel.add(button5);
		buttonPanel.add(button6);
		buttonPanel.add(buttonMeno);
		buttonPanel.add(button1);
		buttonPanel.add(button2);
		buttonPanel.add(button3);
		buttonPanel.add(buttonPiu);
		buttonPanel.add(new JButton());
		buttonPanel.add(button0);
		buttonPanel.add(buttonVirgola);
		buttonPanel.add(buttonUguale);
		
		for(char ch: array) {
			System.out.println("1"+ch);
		}
		
		class ButtonCE implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				for(char ch: array) {
					ch= '*';
				}
			}
		}
		
		class ButtonCanc implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				int i;
				for(i=0; array[i] != '*'; i++) ;
				array[i]= '*';
				String stringa = new String(array);
				textArea.setText(stringa);
			}
		}
		
		class ButtonDiv implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				int i;
				for(i=0; array[i] != '*'; i++) ;
				array[i+1]= '/';
			}
		}
		
		class Button7 implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				int i;
				for(i=0; array[i] != '*'; i++) ;
				array[i+1]= '7';
				for(char ch: array) {
					System.out.println("7"+ch);
				}
			}
		}
		
		class Button8 implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				int i;
				for(i=0; array[i] != '*'; i++) ;
				array[i+1]= '8';
			}
		}
		
		class Button9 implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				int i;
				for(i=0; array[i] != '*'; i++) ;
				array[i+1]= '9';
			}
		}
		
		class ButtonX implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				int i;
				for(i=0; array[i] != '*'; i++) ;
				array[i+1]= 'X';
			}
		}
		
		class Button4 implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				int i;
				for(i=0; array[i] != '*'; i++) ;
				array[i+1]= '4';
			}
		}
		
		class Button5 implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				int i;
				for(i=0; array[i] != '*'; i++) ;
				array[i+1]= '5';
			}
		}
		
		class Button6 implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				int i;
				for(i=0; array[i] != '*'; i++) ;
				array[i+1]= '6';
			}
		}
		
		class ButtonMeno implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				int i;
				for(i=0; array[i] != '*'; i++) ;
				array[i+1]= '-';
			}
		}
		
		class Button1 implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				int i;
				for(i=0; array[i] != '*'; i++) ;
				array[i+1]= '1';
			}
		}
		
		class Button2 implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				int i;
				for(i=0; array[i] != '*'; i++) ;
				array[i+1]= '2';
			}
		}
		
		class Button3 implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				int i;
				for(i=0; array[i] != '*'; i++) ;
				array[i+1]= '3';
			}
		}
		
		class ButtonPiu implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				int i;
				for(i=0; array[i] != '*'; i++) ;
				array[i+1]= '+';
			}
		}
		
		class Button0 implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				int i;
				for(i=0; array[i] != '*'; i++) ;
				array[i+1]= '0';
			}
		}
		class ButtonVirgola implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				int i;
				for(i=0; array[i] != '*'; i++) ;
				array[i+1]= ',';
			}
		}
		
		class ButtonUguale implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				
			}
		}
		
		
		
		
		return buttonPanel;
		
	}
	
	
	
}
