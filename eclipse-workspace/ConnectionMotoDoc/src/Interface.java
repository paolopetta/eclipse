import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Interface {
	 
	private static Connection con = null ;
	public static String connessione () {

	  try {
			  //caricamento e registrazione driver
		  
		  	   String s=" ";
			   Class.forName("com.mysql.cj.jdbc.Driver"); //Carica il Driver
			   String url ="jdbc:mysql://localhost:3306/docmoto?useSSL=false&serverTimezone=UTC";
			   String username = "root";
			   String pwd = "1234";  
			   con = DriverManager.getConnection(url,username,pwd);
			   s="Connessione riuscita!!";
			   return s;
	  }
	  catch(Exception e)
	  {
		  return "La Connessione è fallita\n";  
	  }
	}
	
	public static String uscita() {
		
		try {
			con.close();
			return "Connessione chiusa correttamente\n";
		} catch (SQLException e) {
			return "Chiusura connessione fallita\n";
		}
	}
	
	//1-inserisci un cliente
	public static void query1(String CF, String nome, String cognome, String indirizzo)  {
	   	
	    try {
	   			String sql="INSERT INTO Cliente (CF, nome, cognome, indirizzo) VALUES(?,?,?,?)";
		        PreparedStatement query = con.prepareStatement(sql);
		        query.setString(1, CF);
		        query.setString(2, nome);
		        query.setString(3, cognome);
		        query.setString(4,indirizzo);
		        query.executeUpdate();
	            query.close();
	            
	         }
	    catch (SQLException e)
	    {
	       System.out.println(e);
	       JPanel pane= new JPanel();
	       JOptionPane.showMessageDialog(pane,"Inserisci i dati correttamente","Dati sbagliati", JOptionPane.ERROR_MESSAGE);
	    }
	}
	
	//2-inserisci un fornitore
	public static void query2(String p_iva, String nome, String indirizzo, String fax)  {
	   	
	    try {
	   			String sql="INSERT INTO Fornitore(p_iva, nome, indirizzo, fax) VALUES(?,?,?,?)";
		        PreparedStatement query = con.prepareStatement(sql);
		        query.setString(1, p_iva);
		        query.setString(2, nome);
		        query.setString(3, indirizzo);
		        query.setString(4,fax);
		        query.executeUpdate();
	            query.close();
	            
	         }
	    catch (SQLException e)
	    {
	       System.out.println(e);
	       JPanel pane= new JPanel();
	       JOptionPane.showMessageDialog(pane,"Inserisci i dati correttamente","Dati sbagliati", JOptionPane.ERROR_MESSAGE);
	    }
	}
	
	//3-inserisci un deposito
	public static void query3(String codiceAlfanumerico, String indirizzo)  {
		   	
		    try {
		   			String sql="INSERT INTO Deposito(codiceAlfanumerico, indirizzo) VALUES(?,?)";
			        PreparedStatement query = con.prepareStatement(sql);
			        query.setString(1, codiceAlfanumerico);
			        query.setString(2, indirizzo);
			        query.executeUpdate();
		            query.close();
		            
		         }
		    catch (SQLException e)
		    {
		       System.out.println(e);
		       JPanel pane= new JPanel();
		       JOptionPane.showMessageDialog(pane,"Inserisci i dati correttamente","Dati sbagliati", JOptionPane.ERROR_MESSAGE);
		    }
		}
	
	//4-inserisci uno Scaffale 
	public static void query4(int codice, String codiceAlfanumerico)  {
		   	
		    try {
		   			String sql="INSERT INTO Scaffale(codice, codiceAlfanumerico) VALUES(?,?)";
			        PreparedStatement query = con.prepareStatement(sql);
			        query.setInt(1, codice);
			        query.setString(2, codiceAlfanumerico);
			        query.executeUpdate();
		            query.close();
		            
		         }
		    catch (SQLException e)
		    {
		       System.out.println(e);
		       JPanel pane= new JPanel();
		       JOptionPane.showMessageDialog(pane,"Inserisci i dati correttamente","Dati sbagliati", JOptionPane.ERROR_MESSAGE);
		    }
		}
		
	//5-inserisci un Prodotto
	public static void query5(int codiceProd, String descrizione, Double prezzo, String marca, String disponibilita, int p_iva, String codiceAlfanumerico, int codice )  {
		   	
		    try {
		   			String sql="INSERT INTO (codiceProd, descrizione, prezzo, marca, disponibilità, p_iva, codiceAlfanumerico, codice ) VALUES(?,?,?,?,?,?,?,?)";
			        PreparedStatement query = con.prepareStatement(sql);
			        query.setInt(1, codiceProd);
			        query.setString(2, descrizione);
			        query.setDouble(3, prezzo);
			        query.setString(4,marca);
			        query.setString(5,disponibilita);
			        query.setInt(6,p_iva);
			        query.setString(7,codiceAlfanumerico);
			        query.setInt(8,codice);
			        query.executeUpdate();
		            query.close();
		            
		         }
		    catch (SQLException e)
		    {
		       System.out.println(e);
		       JPanel pane= new JPanel();
		       JOptionPane.showMessageDialog(pane,"Inserisci i dati correttamente","Dati sbagliati", JOptionPane.ERROR_MESSAGE);
		    }
		}	
		
		
	//6-inserisci un prodotto di meccanica
	public static void query6(String impiego, int codiceProd)  {
				   	
				    try {
				   			String sql="INSERT INTO Meccanica(impiego, codiceProd) VALUES(?,?)";
					        PreparedStatement query = con.prepareStatement(sql);
					        query.setString(1, impiego);
					        query.setInt(2, codiceProd);
					        query.executeUpdate();
				            query.close();
				            
				         }
				    catch (SQLException e)
				    {
				       System.out.println(e);
				       JPanel pane= new JPanel();
				       JOptionPane.showMessageDialog(pane,"Inserisci i dati correttamente","Dati sbagliati", JOptionPane.ERROR_MESSAGE);
				    }
				}
		
	//7-inserisci pneumatici 
	public static void query7(String misura, String stagione, int codiceProd)  {
				   	
				    try {
				   			String sql="INSERT INTO Pneumatici(misura, stagione, codiceProd) VALUES(?,?,?)";
					        PreparedStatement query = con.prepareStatement(sql);
					        query.setString(1, misura);
					        query.setString(2, stagione);
					        query.setInt(3, codiceProd);
					        query.executeUpdate();
				            query.close();
				            
				         }
				    catch (SQLException e)
				    {
				       System.out.println(e);
				       JPanel pane= new JPanel();
				       JOptionPane.showMessageDialog(pane,"Inserisci i dati correttamente","Dati sbagliati", JOptionPane.ERROR_MESSAGE);
				    }
				}
	
	//8-inserisci Carrozzeria
		public static void query8(String materiale, int codiceProd)  {
					   	
					    try {
					   			String sql="INSERT INTO Carrozzeria(materiale, codiceProd) VALUES(?,?)";
						        PreparedStatement query = con.prepareStatement(sql);
						        query.setString(1, materiale);
						        query.setInt(2, codiceProd);
						        query.executeUpdate();
					            query.close();
					            
					         }
					    catch (SQLException e)
					    {
					       System.out.println(e);
					       JPanel pane= new JPanel();
					       JOptionPane.showMessageDialog(pane,"Inserisci i dati correttamente","Dati sbagliati", JOptionPane.ERROR_MESSAGE);
					    }
					}
	
	
		//9-inserisci ordine 
		public static void query9(int codice, String dataOrd, int nPezzi, String CF)  {
					   	
					    try {
					   			String sql="INSERT INTO Ordine(codice, dataOrd, nPezzi, CF) VALUES(?,?,?,?)";
						        PreparedStatement query = con.prepareStatement(sql);
						        query.setInt(1, codice);
						        query.setString(2, dataOrd);
						        query.setInt(3, nPezzi);
						        query.setString(4, CF);
						        query.executeUpdate();
					            query.close();
					            
					         }
					    catch (SQLException e)
					    {
					       System.out.println(e);
					       JPanel pane= new JPanel();
					       JOptionPane.showMessageDialog(pane,"Inserisci i dati correttamente","Dati sbagliati", JOptionPane.ERROR_MESSAGE);
					    }
					}
		
		//10-inserisci Spedizione
		public static void query10(int codice, String dataSped)  {
		   	
		    try {
		   			String sql="INSERT INTO Spedizione(codice, dataSped) VALUES(?,?)";
			        PreparedStatement query = con.prepareStatement(sql);
			        query.setInt(1, codice);
			        query.setString(2, dataSped);
			        query.executeUpdate();
		            query.close();
		            
		         }
		    catch (SQLException e)
		    {
		       System.out.println(e);
		       JPanel pane= new JPanel();
		       JOptionPane.showMessageDialog(pane,"Inserisci i dati correttamente","Dati sbagliati", JOptionPane.ERROR_MESSAGE);
		    }
		}
		
		//11-inserisci un numero di telefono del cliente
		public static void query11(String numero, String CF)  {
		   	
		    try {
		   			String sql="INSERT INTO Telefono(numero, CF) VALUES(?,?)";
			        PreparedStatement query = con.prepareStatement(sql);
			        query.setString(1, numero);
			        query.setString(2, CF);
			        query.executeUpdate();
		            query.close();
		            
		         }
		    catch (SQLException e)
		    {
		       System.out.println(e);
		       JPanel pane= new JPanel();
		       JOptionPane.showMessageDialog(pane,"Inserisci i dati correttamente","Dati sbagliati", JOptionPane.ERROR_MESSAGE);
		    }
		}
		
	//12-Seleziona il prezzo e la marca degli pneumatici larghi 155 estivi 
	public static String query12() {

			String r="";
			try {
		        
		        Statement query = con.createStatement();
		        ResultSet result = query.executeQuery("select	P.prezzo, P.marca\r\n" + 
		        		"from	Prodotto as P, Pneumatici as PN\r\n" + 
		        		"where	PN.misura like \"155%\" and PN.stagione = \"estiva\" and P.codiceProd = PN.codiceProd;");
		    
	            while (result.next())
	            {
	               String prezzo = result.getString("prezzo");
	               String marca = result.getString("marca");
	               r+=prezzo+" | "+ marca+" | "+"\n\n";
	          
	            } 
	            result.close();
	            query.close();
	            return r;
	           
	       }
	    catch (SQLException e)
	    {
	        System.out.println(e);
	        JPanel pane= new JPanel();
	        JOptionPane.showMessageDialog(pane,"Inserisci i dati correttamente","Dati sbagliati", JOptionPane.ERROR_MESSAGE);
	        return null;
	    }
		}
		
	//13-Seleziona i clienti che hanno effettuato ordini nel mese di gennaio 2020
	public static String query13() {

			String r="";
			try {
		        
		        Statement query = con.createStatement();
		        ResultSet result = query.executeQuery("select C.CF, C.nome, C.cognome\r\n" + 
		        		"from Cliente as C, Ordine as O\r\n" + 
		        		"where C.CF = O.CF and O.dataOrd like '2020-01%';");
		    
	            while (result.next())
	            {
	               String CF = result.getString("CF");
	               String nome = result.getString("nome");
	               String cognome = result.getString("cognome");
	               r+=CF+" | "+ nome+" |"+cognome + " |"+"\n\n";
	          
	            } 
	            result.close();
	            query.close();
	            return r;
	           
	       }
	    catch (SQLException e)
	    {
	        System.out.println(e);
	        JPanel pane= new JPanel();
	        JOptionPane.showMessageDialog(pane,"Inserisci i dati correttamente","Dati sbagliati", JOptionPane.ERROR_MESSAGE);
	        return null;
	    }
		}	
		
	//14-Seleziona i clienti che non hanno mai effettuato ordini 
	public static String query14() {

		String r="";
		try {
	        
	        Statement query = con.createStatement();
	        ResultSet result = query.executeQuery("select C.CF, C.nome, C.cognome\r\n" + 
	        		"from Cliente as C\r\n" + 
	        		"where not exists (select *\r\n" + 
	        		"					from Ordine as O\r\n" + 
	        		"					where C.CF = O.CF);");
	    
            while (result.next())
            {
               String CF = result.getString("CF");
               String nome = result.getString("nome");
               String cognome = result.getString("cognome");
               r+=CF+" | "+ nome+" |"+cognome + " |"+"\n\n";
          
            } 
            result.close();
            query.close();
            return r;
           
       }
	    catch (SQLException e)
	    {
	        System.out.println(e);
	        JPanel pane= new JPanel();
	        JOptionPane.showMessageDialog(pane,"Inserisci i dati correttamente","Dati sbagliati", JOptionPane.ERROR_MESSAGE);
	        return null;
	    }
		}

	//15-Seleziona i prodotti non venduti nell'anno 2020
	public static String query15() {

		String r="";
		try {
	        
	        Statement query = con.createStatement();
	        ResultSet result = query.executeQuery("select P.codice, P.descrizione\r\n" + 
	        		"from Prodotto as P\r\n" + 
	        		"where not exists (select *\r\n" + 
	        		"					from composto as C, Ordine as O\r\n" + 
	        		"                    where C.codiceProd = P.codiceProd and O.dataOrd like '2019%');");
	    
            while (result.next())
            {
               String codice = result.getString("codice");
               String descrizione = result.getString("descrizione");
               r+=codice+" | "+ descrizione+" |"+"\n\n";
          
            } 
            result.close();
            query.close();
            return r;
           
       }
	    catch (SQLException e)
	    {
	        System.out.println(e);
	        JPanel pane= new JPanel();
	        JOptionPane.showMessageDialog(pane,"Inserisci i dati correttamente","Dati sbagliati", JOptionPane.ERROR_MESSAGE);
	        return null;
	    }
		}
	
	//16-Per ogni prodotto acquistato da più di due clienti, che costi più di 10€, visualizzare il codice, la marca e 
	//	 il numero dei clienti (Non funziona in mysql)
		public static String query16() {

			String r="";
			try {
		        
		        Statement query = con.createStatement();
		        ResultSet result = query.executeQuery("select P.codiceProd, P.marca, count(*)\r\n" + 
		        		"from Prodotto as P, Ordine as O, Cliente as C, Composto as CM\r\n" + 
		        		"where P.codiceProd = CM.codiceProd and CM.codice = O.codice and O.CF = C.CF and P.prezzo > 10\r\n" + 
		        		"group by P.codice \r\n" + 
		        		"having count(*) >2;");
		    
	            while (result.next())
	            {
	               String codiceProd = result.getString("codiceProd");
	               String marca = result.getString("marca");
	               int clienti= result.getInt("count(*)");
	               r+=codiceProd+" | "+ marca+" | "+ clienti+" | "+ "\n\n";
	          
	            } 
	            result.close();
	            query.close();
	            return r;
	           
	       }
		    catch (SQLException e)
		    {
		        System.out.println(e);
		        JPanel pane= new JPanel();
		        JOptionPane.showMessageDialog(pane,"Inserisci i dati correttamente","Dati sbagliati", JOptionPane.ERROR_MESSAGE);
		        return null;
		    }
			}
	
	//17-Seleziona i prodotti presenti nel deposito in via aztori
		public static String query17() {

			String r="";
			try {
		        
		        Statement query = con.createStatement();
		        ResultSet result = query.executeQuery("select P.codice, P.descrizione\r\n" + 
		        		"from Prodotto as P, Scaffale as S, Deposito as D\r\n" + 
		        		"where P.codice = S.codice and D.codiceAlfanumerico = P.codiceAlfanumerico and D.indirizzo = 'Via Aztori';");
		    
	            while (result.next())
	            {
	               String codice = result.getString("codice");
	               String descrizione = result.getString("descrizione");
	               r+=codice+" | "+ descrizione+" |"+"\n\n";
	          
	            } 
	            result.close();
	            query.close();
	            return r;
	           
	       }
		    catch (SQLException e)
		    {
		        System.out.println(e);
		        JPanel pane= new JPanel();
		        JOptionPane.showMessageDialog(pane,"Inserisci i dati correttamente","Dati sbagliati", JOptionPane.ERROR_MESSAGE);
		        return null;
		    }
			}
		
		//18-Inserire un nuovo cliente che effettua un ordine
		public static void query18(String CF, String nome, String cognome, String indirizzo,int codice, String dataOrd, int npezzi) {
			try {
	   			String sql =  "INSERT INTO Cliente VALUES(?,?,?,?);";
	   			String sql2= "INSERT INTO Ordine values(?,?,?,?);"; 
		        PreparedStatement query = con.prepareStatement(sql);
		        PreparedStatement query2 = con.prepareStatement(sql2);
		        query.setString(1, CF);
		        query.setString(2, nome);
		        query.setString(3, cognome);
		        query.setString(4, indirizzo);
		        query2.setInt(5, codice);
		        query2.setString(6, dataOrd);
		        query2.setInt(7, npezzi);
		        query2.setString(1, CF);
		        query.close();
		        query2.close();
	         }
	    catch (NumberFormatException |SQLException e )
	    {
	       System.out.println(e);
	       JPanel pane= new JPanel();
	       JOptionPane.showMessageDialog(pane,"Inserisci i dati correttamente","Dati sbagliati", JOptionPane.ERROR_MESSAGE);
	    
	    }
		}
		
		//19- Trova il n di pezzi di un ordine 	
				public static String query19(int codice) {

					String r="";
					try {
				        
				        /*Statement query = con.createStatement();
				        ResultSet result = query.executeQuery("select O.codice, O.npezzi \r\n" + 
				        		"from Ordine as O\r\n" + 
				        		"where O.codice=?;");
				        query.setInt(1,codice);*/
						String sql = "select O.codice, O.npezzi \r\n" + 
				        		"from Ordine as O\r\n" + 
				        		"where O.codice=?";
			       PreparedStatement query = con.prepareStatement(sql);
			       query.setInt(1, codice);
			       ResultSet result= query.executeQuery();
				        
			            while (result.next())
			            {
			            	String codici = result.getString("codice");
			            	String npezzi = result.getString("npezzi");
			               		               	               
			               r+=npezzi+" | "+ codici+" |"+"\n\n";
			          
			            } 
			            result.close();
			            query.close();
			            return r;
			           
			       }
				    catch (SQLException e)
				    {
				        System.out.println(e);
				        JPanel pane= new JPanel();
				        JOptionPane.showMessageDialog(pane,"Inserisci i dati correttamente","Dati sbagliati", JOptionPane.ERROR_MESSAGE);
				        return null;
				    }
					}	

	//20- Stampa le info degli ordini spediti
		public static String query20() {

			String r="";
			try {
		        
		        Statement query = con.createStatement();
		        ResultSet result = query.executeQuery("select C.nome, C.cognome, S.dataSpedizione, O.codice\r\n" + 
		        		"from Ordine as O, Cliente as C, Spedizione as S\r\n" + 
		        		"where O.CF = C.CF and O.codice= S.codice ");
		    
	            while (result.next())
	            {
	               String nome = result.getString("nome");
	               String cognome = result.getString("cognome");
	               String dataSpedizione = result.getString("dataSpedizione");
	               String codice= result.getString("codice");
	               r+= nome+" | "+cognome +" | "+dataSpedizione+" | "+ codice+ " |"+"\n\n";
	          
	            } 
	            result.close();
	            query.close();
	            return r;
	           
	       }
		    catch (SQLException e)
		    {
		        System.out.println(e);
		        JPanel pane= new JPanel();
		        JOptionPane.showMessageDialog(pane,"Inserisci i dati correttamente","Dati sbagliati", JOptionPane.ERROR_MESSAGE);
		        return null;
		    }
			}	
		
		
	 	
		
		
	public static String queryProva() {
		String s="";
		try {
			String sql= "select C.CF, C.nome\r\n" + 
					"from	Cliente as C\r\n" + 
					"where	CF like \"P%\";";
			PreparedStatement query = con.prepareStatement(sql);
			ResultSet result = query.executeQuery();
			
			while(result.next()) {
				String clienti= result.getString("CF") + "/" + result.getString("nome");
				s += clienti + "\n";
			}
			result.close();
			query.close();
			return s;
			
		}catch(SQLException e){
			e.printStackTrace();
			return null;
		}
	}
	
	
	
	
	
}























