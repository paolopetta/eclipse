import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


public class FinestraQuery extends JFrame{

	private JPanel contentPane;
	
	
	public FinestraQuery() {
		super("docMoto");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1300, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTextArea descr= new JTextArea();
		String querys= "\r\n" + 
				"-1 Inserisci un cliente\r\n" + 
				"-2 Inserisci un fornitore\r\n" + 
				"-3 Inserisci un deposito\r\n" + 
				"-4 Inserisci uno Scaffale\r\n" + 
				"-5 Inserisci un Prodotto\r\n" + 
				"-6 Inserisci un prodotto di meccanica\r\n" + 
				"-7 Inserisci pneumatici \r\n" + 
				"-8 Inserisci Carrozzeria\r\n" + 
				"-9 Inserisci ordine \r\n" + 
				"-10 Inserisci Spedizione\r\n" + 
				"-11 Inserisci un numero di telefono del cliente\r\n" + 
				"-12 Seleziona il prezzo e la marca degli pneumatici larghi 155 estivi\r\n" + 
				"-13 Seleziona i clienti che hanno effettuato ordini nel mese di gennaio 2020\r\n" + 
				"-14 Seleziona i clienti che non hanno mai effettuato ordini \r\n" + 
				"-15 Seleziona i prodotti non venduti nell'anno 2020\r\n" + 
				"-16 Per ogni prodotto acquistato da più di due clienti, che costi più di 10€, \n     visualizzare il codice, la marca e il numero dei clienti\r\n" + 
				"-17 Seleziona i prodotti presenti nel deposito in via aztori\r\n" + 
				"-18 Inserisci un nuovo cliente che effettua un ordine\r\n" + 
				"-19 Trovare il numero di pezzi relativi ad un ordine\r\n" + 
				"-20 Stampa le info di tutti gli ordini spediti con nome cliente, data di spedizione e codice\r\n" + 
				""
				;
		descr.setText(querys);
		contentPane.add(descr, BorderLayout.EAST);
		
		
		JTextArea Results = new JTextArea();
		JScrollPane scrollV = new JScrollPane(Results);
		scrollV.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		contentPane.add(scrollV, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(9,2));
		contentPane.add(panel, BorderLayout.WEST);
		
		//query
		
		//1-Inserisci un cliente
		JButton btnNewButton1 = new JButton("Query1");
		btnNewButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFrame tmp= new JFrame("Inserisci Cliente");
				tmp.setVisible(true);
				tmp.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				tmp.setSize(500, 250);
				tmp.setLayout(new GridLayout(1,3));
				
				JPanel panel1 = new JPanel();
				panel1.setVisible(true);
				panel1.setLayout(new GridLayout(4,1));
				panel1.add(new JLabel("Codice Fiscale"));
				panel1.add(new JLabel("Nome"));
				panel1.add(new JLabel("Cognome"));
				panel1.add(new JLabel("Indirizzo"));
				tmp.add(panel1);
				JTextField t1= new JTextField();
				JTextField t2= new JTextField();
				JTextField t3= new JTextField();
				JTextField t4= new JTextField();
				
				JPanel panel = new JPanel();
				panel.setVisible(true);
				panel.setLayout(new GridLayout(4,1));
				panel.add(t1);
				panel.add(t2);
				panel.add(t3);
				panel.add(t4);
				tmp.add(panel);
				JButton btn= new JButton("Invia Dati");
				btn.setVisible(true);
				btn.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						Interface.query1(t1.getText(),t2.getText(),t3.getText(),t4.getText());
						Results.setText("Cliente Aggiunto!!");
						tmp.dispose();
					}
				});
				tmp.add(btn);
				
				}
		});
		
		panel.add(btnNewButton1);
		
		//2-inserisci un fornitore
		JButton btnNewButton2 = new JButton("Query2");
		btnNewButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFrame tmp= new JFrame("Inserisci Fornitore");
				tmp.setVisible(true);
				tmp.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				tmp.setSize(500, 250);
				tmp.setLayout(new GridLayout(1,3));
				
				JPanel panel1 = new JPanel();
				panel1.setVisible(true);
				panel1.setLayout(new GridLayout(4,1));
				panel1.add(new JLabel("Partita Iva"));
				panel1.add(new JLabel("Nome"));
				panel1.add(new JLabel("Indirizzo"));
				panel1.add(new JLabel("fax"));
				tmp.add(panel1);
				JTextField t1= new JTextField();
				JTextField t2= new JTextField();
				JTextField t3= new JTextField();
				JTextField t4= new JTextField();
				
				JPanel panel = new JPanel();
				panel.setVisible(true);
				panel.setLayout(new GridLayout(4,1));
				panel.add(t1);
				panel.add(t2);
				panel.add(t3);
				panel.add(t4);
				tmp.add(panel);
				JButton btn= new JButton("Invia Dati");
				btn.setVisible(true);
				btn.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						Interface.query2(t1.getText(),t2.getText(),t3.getText(),t4.getText());
						Results.setText("Fornitore Aggiunto!!");
						tmp.dispose();
					}
				});
				tmp.add(btn);
				
				}
		});
		
		panel.add(btnNewButton2);
		
		
		//3-inserisci un Deposito
			JButton btnNewButton3 = new JButton("Query3");
			btnNewButton3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					JFrame tmp= new JFrame("Inserisci Deposito");
					tmp.setVisible(true);
					tmp.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					tmp.setSize(500, 250);
					tmp.setLayout(new GridLayout(1,3));
					
					JPanel panel1 = new JPanel();
					panel1.setVisible(true);
					panel1.setLayout(new GridLayout(2,1));
					panel1.add(new JLabel("Codice Alfanumerico"));
					panel1.add(new JLabel("Indirizzo"));
					tmp.add(panel1);
					JTextField t1= new JTextField();
					JTextField t2= new JTextField();
					
					JPanel panel = new JPanel();
					panel.setVisible(true);
					panel.setLayout(new GridLayout(2,1));
					panel.add(t1);
					panel.add(t2);
					tmp.add(panel);
					JButton btn= new JButton("Invia Dati");
					btn.setVisible(true);
					btn.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent arg0) {
							Interface.query3(t1.getText(),t2.getText());
							Results.setText("Deposito Aggiunto!!");
							tmp.dispose();
						}
					});
					tmp.add(btn);
					
					}
			});
			
			panel.add(btnNewButton3);
			
			//4-inserisci un Scaffale	
			JButton btnNewButton4 = new JButton("Query4");
			btnNewButton4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					JFrame tmp= new JFrame("Insersci Scaffale");
					tmp.setVisible(true);
					tmp.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					tmp.setSize(500, 250);
					tmp.setLayout(new GridLayout(1,3));
					
					JPanel panel1 = new JPanel();
					panel1.setVisible(true);
					panel1.setLayout(new GridLayout(2,1));
					panel1.add(new JLabel("Codice"));
					panel1.add(new JLabel("Codice Alfanumerico"));
					tmp.add(panel1);
					JTextField t1= new JTextField();
					JTextField t2= new JTextField();
					
					JPanel panel = new JPanel();
					panel.setVisible(true);
					panel.setLayout(new GridLayout(2,1));
					panel.add(t1);
					panel.add(t2);
					tmp.add(panel);
					JButton btn= new JButton("Invia Dati");
					btn.setVisible(true);
					btn.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent arg0) {
							Interface.query4(Integer.parseInt(t1.getText()),t2.getText());
							Results.setText("Scaffale Aggiunto!!");
							tmp.dispose();
						}
					});
					tmp.add(btn);
					
					}
			});
			
			panel.add(btnNewButton4);
			
			//5-inserisci un Prodotto
			JButton btnNewButton5 = new JButton("Query5");
			btnNewButton5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					JFrame tmp= new JFrame("Inserisci Prodotto");
					tmp.setVisible(true);
					tmp.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					tmp.setSize(500, 250);
					tmp.setLayout(new GridLayout(1,3));
					JPanel panel1 = new JPanel();
					panel1.setVisible(true);
					panel1.setLayout(new GridLayout(8,1));
					panel1.add(new JLabel("CodiceProd"));
					panel1.add(new JLabel("Descrizione"));
					panel1.add(new JLabel("Prezzo"));
					panel1.add(new JLabel("Marca"));
					panel1.add(new JLabel("Disponibilità"));
					panel1.add(new JLabel("Partita Iva"));
					panel1.add(new JLabel("Codice alfanumerico"));
					panel1.add(new JLabel("Codice"));
					tmp.add(panel1);
					JTextField t1= new JTextField();
					JTextField t2= new JTextField();
					JTextField t3= new JTextField();
					JTextField t4= new JTextField();
					JTextField t5= new JTextField();
					JTextField t6= new JTextField();
					JTextField t7= new JTextField();
					JTextField t8= new JTextField();
					
					JPanel panel = new JPanel();
					panel.setVisible(true);
					panel.setLayout(new GridLayout(8,1));
					panel.add(t1);
					panel.add(t2);
					panel.add(t3);
					panel.add(t4);
					panel.add(t5);
					panel.add(t6);
					panel.add(t7);
					panel.add(t8);
					tmp.add(panel);
					JButton btn= new JButton("Invia Dati");
					btn.setVisible(true);
					btn.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent arg0) {
							Interface.query5(Integer.parseInt(t1.getText()),t2.getText(),Double.parseDouble(t3.getText()),t4.getText(), t5.getText(), Integer.parseInt(t6.getText()), t7.getText(), Integer.parseInt(t8.getText()));
							Results.setText("Prodotto Aggiunto!!");
							tmp.dispose();
						}
					});
					tmp.add(btn);
					
					}
			});
			
			panel.add(btnNewButton5);
			
			//6-inserisci un Prodotto di Meccanica	
			JButton btnNewButton6 = new JButton("Query6");
			btnNewButton6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					JFrame tmp= new JFrame("Inserisci Meccanica");
					tmp.setVisible(true);
					tmp.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					tmp.setSize(500, 250);
					tmp.setLayout(new GridLayout(1,3));
					
					JPanel panel1 = new JPanel();
					panel1.setVisible(true);
					panel1.setLayout(new GridLayout(2,1));
					panel1.add(new JLabel("Impiego"));
					panel1.add(new JLabel("Codice Prodotto"));
					tmp.add(panel1);
					JTextField t1= new JTextField();
					JTextField t2= new JTextField();
					
					JPanel panel = new JPanel();
					panel.setVisible(true);
					panel.setLayout(new GridLayout(2,1));
					panel.add(t1);
					panel.add(t2);
					tmp.add(panel);
					JButton btn= new JButton("Invia Dati");
					btn.setVisible(true);
					btn.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent arg0) {
							Interface.query6(t1.getText(),Integer.parseInt(t2.getText()));
							Results.setText("Prodotto Meccanica Aggiunto!!");
							tmp.dispose();
						}
					});
					tmp.add(btn);
					
					}
			});
			
			panel.add(btnNewButton6);
			
			//7-inserisci Pneumatici	
			JButton btnNewButton7 = new JButton("Query7");
			btnNewButton7.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					JFrame tmp= new JFrame("Inserisci Pneumatici");
					tmp.setVisible(true);
					tmp.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					tmp.setSize(500, 250);
					tmp.setLayout(new GridLayout(1,3));
					
					JPanel panel1 = new JPanel();
					panel1.setVisible(true);
					panel1.setLayout(new GridLayout(3,1));
					panel1.add(new JLabel("Misura"));
					panel1.add(new JLabel("Stagione"));
					panel1.add(new JLabel("Codice Prodotto"));
					tmp.add(panel1);
					JTextField t1= new JTextField();
					JTextField t2= new JTextField();
					JTextField t3= new JTextField();
					
					JPanel panel = new JPanel();
					panel.setVisible(true);
					panel.setLayout(new GridLayout(3,1));
					panel.add(t1);
					panel.add(t2);
					panel.add(t3);
					tmp.add(panel);
					JButton btn= new JButton("Invia Dati");
					btn.setVisible(true);
					btn.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent arg0) {
							Interface.query7(t1.getText(),t2.getText(), Integer.parseInt(t3.getText()));
							Results.setText("Scaffale Aggiunto!!");
							tmp.dispose();
						}
					});
					tmp.add(btn);
					
					}
			});
			
			panel.add(btnNewButton7);
			
			//8-inserisci Carrozzeria
			JButton btnNewButton8 = new JButton("Query8");
			btnNewButton8.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					JFrame tmp= new JFrame("Inserisci Carrozzeria");
					tmp.setVisible(true);
					tmp.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					tmp.setSize(500, 250);
					tmp.setLayout(new GridLayout(1,3));
					
					JPanel panel1 = new JPanel();
					panel1.setVisible(true);
					panel1.setLayout(new GridLayout(2,1));
					panel1.add(new JLabel("Materiale"));
					panel1.add(new JLabel("Codice Prodotto"));
					tmp.add(panel1);
					JTextField t1= new JTextField();
					JTextField t2= new JTextField();
					
					JPanel panel = new JPanel();
					panel.setVisible(true);
					panel.setLayout(new GridLayout(2,1));
					panel.add(t1);
					panel.add(t2);
					
					tmp.add(panel);
					JButton btn= new JButton("Invia Dati");
					btn.setVisible(true);
					btn.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent arg0) {
							Interface.query8(t1.getText(), Integer.parseInt(t2.getText()));
							Results.setText("Prodotto di Carrozzeria Aggiunto!!");
							tmp.dispose();
						}
					});
					tmp.add(btn);
					
					}
			});
			
			panel.add(btnNewButton8);
				
			
			//9-inserisci Ordine	
			JButton btnNewButton9 = new JButton("Query9");
			btnNewButton9.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					JFrame tmp= new JFrame("Inserisci Ordine");
					tmp.setVisible(true);
					tmp.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					tmp.setSize(500, 250);
					tmp.setLayout(new GridLayout(1,3));
					
					JPanel panel1 = new JPanel();
					panel1.setVisible(true);
					panel1.setLayout(new GridLayout(4,1));
					panel1.add(new JLabel("Codice"));
					panel1.add(new JLabel("Data"));
					panel1.add(new JLabel("Numero di Pezzi"));
					panel1.add(new JLabel("Codice Fiscale"));
					tmp.add(panel1);
					JTextField t1= new JTextField();
					JTextField t2= new JTextField();
					JTextField t3= new JTextField();
					JTextField t4= new JTextField();
					
					JPanel panel = new JPanel();
					panel.setVisible(true);
					panel.setLayout(new GridLayout(4,1));
					panel.add(t1);
					panel.add(t2);
					panel.add(t3);
					panel.add(t4);
					tmp.add(panel);
					JButton btn= new JButton("Invia Dati");
					btn.setVisible(true);
					btn.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent arg0) {
							Interface.query9(Integer.parseInt(t1.getText()),t2.getText(), Integer.parseInt(t3.getText()), t4.getText());
							Results.setText("Ordine Aggiunto!!");
							tmp.dispose();
						}
					});
					tmp.add(btn);
					
					}
			});
			
			panel.add(btnNewButton9);
		
			
			//10-inserisci Spedizione	
			JButton btnNewButton10 = new JButton("Query10");
			btnNewButton10.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					JFrame tmp= new JFrame("Inserisci Spedizione");
					tmp.setVisible(true);
					tmp.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					tmp.setSize(500, 250);
					tmp.setLayout(new GridLayout(1,3));
					
					JPanel panel1 = new JPanel();
					panel1.setVisible(true);
					panel1.setLayout(new GridLayout(2,1));
					panel1.add(new JLabel("Codice"));
					panel1.add(new JLabel("Data Spedizione"));
					tmp.add(panel1);
					JTextField t1= new JTextField();
					JTextField t2= new JTextField();
					
					JPanel panel = new JPanel();
					panel.setVisible(true);
					panel.setLayout(new GridLayout(2,1));
					panel.add(t1);
					panel.add(t2);
					tmp.add(panel);
					JButton btn= new JButton("Invia Dati");
					btn.setVisible(true);
					btn.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent arg0) {
							Interface.query10(Integer.parseInt(t1.getText()),t2.getText());
							Results.setText("Spedizione Aggiunta!!");
							tmp.dispose();
						}
					});
					tmp.add(btn);
					
					}
			});
			
			panel.add(btnNewButton10);
		
			
			//11-inserisci un numero di telefono del cliente
			JButton btnNewButton11 = new JButton("Query11");
			btnNewButton11.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					JFrame tmp= new JFrame("Inserisci numero di Telefono");
					tmp.setVisible(true);
					tmp.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					tmp.setSize(500, 200);
					tmp.setLayout(new GridLayout(1,3));
					
					JPanel panel1 = new JPanel();
					panel1.setVisible(true);
					panel1.setLayout(new GridLayout(2,1));
					panel1.add(new JLabel("Numero"));
					panel1.add(new JLabel("Codice Fiscale"));
					
					tmp.add(panel1);
					JTextField t1= new JTextField();
					JTextField t2= new JTextField();
					
					JPanel panel = new JPanel();
					panel.setVisible(true);
					panel.setLayout(new GridLayout(2,1));
					panel.add(t1);
					panel.add(t2);
					tmp.add(panel);
					JButton btn= new JButton("Invia Dati");
					btn.setVisible(true);
					btn.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent arg0) {
							Interface.query11(t1.getText(),t2.getText());
							Results.setText("Telefono Aggiunto!!");
							tmp.dispose();
						}
					});
					tmp.add(btn);
					
					}
			});
			
			panel.add(btnNewButton11);
		
			//12-Seleziona il prezzo e la marca degli pneumatici larghi 155, estivi 
			JButton btnNewButton12 = new JButton("Query12");
			btnNewButton12.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					Results.setText("Seleziona il prezzo e la marca degli pneumatici larghi 155, estivi \n\n"+Interface.query12());
				
				}
			});
			panel.add(btnNewButton12);	
			
			//13-Seleziona i clienti che hanno effettuato ordini nel mese di gennaio 2020
			JButton btnNewButton13 = new JButton("Query13");
			btnNewButton13.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					Results.setText("Seleziona i clienti che hanno effettuato ordini nel mese di gennaio 2020 \n\n"+Interface.query13());
				
				}
			});
			panel.add(btnNewButton13);	
		
			//14-Seleziona i clienti che non hanno mai effettuato ordini 
			JButton btnNewButton14 = new JButton("Query14");
			btnNewButton14.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					Results.setText("Seleziona i clienti che non hanno mai effettuato ordini  \n\n"+Interface.query14());
				
				}
			});
			panel.add(btnNewButton14);	
			
			//15-Seleziona i prodotti non venduti nell'anno 2020
			JButton btnNewButton15 = new JButton("Query15");
			btnNewButton15.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					Results.setText("Seleziona i prodotti non venduti nell'anno 2020  \n\n"+Interface.query15());
				
				}
			});
			panel.add(btnNewButton15);	
		
		
			//16-Per ogni prodotto acquistato da più di due clienti, che costi più di 10€, visualizzare il codice, la marca e 
			//	 il numero dei clienti
			JButton btnNewButton16 = new JButton("Query16");
			btnNewButton16.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					Results.setText("Per ogni prodotto acquistato da più di due clienti, che costi più di 10€, \nvisualizzare il codice, la marca e il numero dei clienti \n\n"+Interface.query16());
				
				}
			});
			panel.add(btnNewButton16);	
			
			//17-Seleziona i prodotti presenti nel deposito in via aztori
			JButton btnNewButton17 = new JButton("Query17");
			btnNewButton17.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					Results.setText("Seleziona i prodotti presenti nel deposito in via aztori \n\n"+Interface.query17());
				
				}
			});
			panel.add(btnNewButton17);
			
			//18-inserisci un cliente che ha effettuato un ordine
			JButton btnNewButton18 = new JButton("Query18");
			btnNewButton18.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					JFrame tmp= new JFrame("Inserisci un cliente che ha effettuato un ordine");
					tmp.setVisible(true);
					tmp.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					tmp.setSize(500, 200);
					tmp.setLayout(new GridLayout(1,3));
					
					JPanel panel1 = new JPanel();
					panel1.setVisible(true);
					panel1.setLayout(new GridLayout(7,1));
					panel1.add(new JLabel("Codice Fiscale"));
					panel1.add(new JLabel("Nome"));
					panel1.add(new JLabel("Cognome"));
					panel1.add(new JLabel("Indirizzo"));
					panel1.add(new JLabel("Codice Ordine"));
					panel1.add(new JLabel("Data"));
					panel1.add(new JLabel("Numero di Pezzi"));
					tmp.add(panel1);
					JTextField t1= new JTextField();
					JTextField t2= new JTextField();
					JTextField t3= new JTextField();
					JTextField t4= new JTextField();
					JTextField t5= new JTextField();
					JTextField t6= new JTextField();
					JTextField t7= new JTextField();
										
					JPanel panel = new JPanel();
					panel.setVisible(true);
					panel.setLayout(new GridLayout(7,1));
					panel.add(t1);
					panel.add(t2);
					panel.add(t3);
					panel.add(t4);
					panel.add(t5);
					panel.add(t6);
					panel.add(t7);
					tmp.add(panel);
					JButton btn= new JButton("Invia Dati");
					btn.setVisible(true);
					btn.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent arg0) {
							Interface.query1(t1.getText(),t2.getText(),t3.getText(),t4.getText());
							Interface.query9(Integer.parseInt(t5.getText()),t6.getText(), Integer.parseInt(t7.getText()), t1.getText());
							Results.setText("Cliente e relativo ordine Aggiunti!!");
							tmp.dispose();
						}
					});
					tmp.add(btn);
					
					}
			});
			panel.add(btnNewButton18);
			
		
			//19-Mostra il n di pezzi di un ordine
			JButton btnNewButton19 = new JButton("Query19");
			btnNewButton19.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					JFrame tmp= new JFrame("Mostra il numero di pezzi di un ordine");
					tmp.setVisible(true);
					tmp.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					tmp.setSize(500, 200);
					tmp.setLayout(new GridLayout(1,3));
					
					JPanel panel1 = new JPanel();
					panel1.setVisible(true);
					panel1.setLayout(new GridLayout(1,1));
					panel1.add(new JLabel("Codice ordine"));
					tmp.add(panel1);
					JTextField t1= new JTextField();
					
					JPanel panel = new JPanel();
					panel.setVisible(true);
					panel.setLayout(new GridLayout(2,1));
					panel.add(t1);
					
					tmp.add(panel);
					JButton btn= new JButton("Invia Dati");
					btn.setVisible(true);
					btn.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent arg0) {
							//Interface.query19(Integer.parseInt(t1.getText()));
							Results.setText("Mostra il numero di pezzi di un ordine \n\n"+Interface.query19(Integer.parseInt(t1.getText())));
							
							tmp.dispose();
						}
					});
					tmp.add(btn);
					
					}
			});
			
			panel.add(btnNewButton19);
			
			//20-Stampa le info degli ordini spediti
			JButton btnNewButton20 = new JButton("Query20");
			btnNewButton20.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					Results.setText("Stampa le info degli ordini spediti\n\n"+Interface.query20());
				
				}
			});
			panel.add(btnNewButton20);
		
		JButton btnNewButton21 = new JButton("CONNESSIONE");
		btnNewButton21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Results.setText(Interface.connessione());
			}
		});
		
		JButton btnNewButton22 = new JButton("ESCI");
		btnNewButton22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Results.setText(Interface.uscita());
				
			}
		});
		
		JPanel bt= new JPanel();
		bt.setVisible(true);
		bt.setLayout(new GridLayout(1,4));
		
		bt.add(new JPanel());
		bt.add(btnNewButton21);
		bt.add(btnNewButton22);
	
		bt.add(new JPanel());
		contentPane.add(bt, BorderLayout.NORTH);
		setVisible(true);
		
	}
	
}
