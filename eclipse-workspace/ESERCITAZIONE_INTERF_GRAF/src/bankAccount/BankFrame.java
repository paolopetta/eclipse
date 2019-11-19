package bankAccount;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class BankFrame extends JFrame {
	
	private JLabel label;
	private JRadioButton deposito;
	private JRadioButton prelievo;
	private BankAccount bank;
	private JTextArea cronologia;
	private JScrollPane scroll;
	private JLabel importoLabel;
	private JTextField inputAmount;
	private JButton esegui;
	private JPanel controlPanel;
	private JPanel radioPanel;
	
	
	
	public BankFrame() {
		setSize(800,400);
		add(createControlPanel(), BorderLayout.SOUTH);
		bank= new BankAccount(100);		
	}

	public JPanel createControlPanel() {
		controlPanel = new JPanel();
		importoLabel = new JLabel("Importo");
		inputAmount = new JTextField(5);
		createRadioPanel();
		esegui= new JButton("Esegui");
		
		class EseguiActionListener implements ActionListener{

			public void actionPerformed(ActionEvent e) {
				double amount = Double.parseDouble(inputAmount.getText());
				if(amount >= 0) {
					if(deposito.isSelected()) 
						bank.deposita(amount);
					else if(amount <= bank.getSaldo()) 
						bank.preleva(amount);
					
					cronologia.append("Current Balance: "+ bank.getSaldo()+"\n");
				}			
			}
		}
		
		esegui.addActionListener(new EseguiActionListener());
		controlPanel.add(importoLabel);
		controlPanel.add(inputAmount);
		controlPanel.add(radioPanel);
		controlPanel.add(esegui);
		return controlPanel;
		
	}
		
		public JPanel createRadioPanel() {
			JPanel radioPanel= new JPanel();
			radioPanel.setBorder(new TitledBorder(new EtchedBorder(), "Scelta"));
			deposito= new JRadioButton("Deposito");
			prelievo= new JRadioButton("Prelievo");
			ButtonGroup group = new ButtonGroup();
			group.add(deposito);
			group.add(prelievo);
			deposito.setSelected(true);
			radioPanel.add(deposito);
			radioPanel.add(prelievo);
			return radioPanel;			
			
		}		
	}
	

