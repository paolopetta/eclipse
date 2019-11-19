import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FrameEllipse extends JFrame{
	
	private JPanel buttonPanel;
	private JButton drawButton;
	private JTextField blueField;
	private JTextField greenField;
	private JTextField redField;
	private JLabel Rlabel;
	private JLabel Glabel;
	private JLabel Blabel;
	private EllisseComponent ellisseComponent;
	
	public FrameEllipse() {
		setSize(500,500);
		add(createButtonPanel(), BorderLayout.NORTH);
		ellisseComponent= new EllisseComponent();
		add(ellisseComponent);
		
	}
	
	public JPanel createButtonPanel() {
		buttonPanel= new JPanel();
		Rlabel= new JLabel("R: ");
		Glabel= new JLabel("G: ");
		Blabel= new JLabel("B: ");
		redField = new JTextField(3);
		redField.setText("0");
		greenField= new JTextField(3);
		greenField.setText("0");
		blueField= new JTextField(3);
		blueField.setText("0");
		drawButton = new JButton("DRAW");
		
		class DrawListener implements ActionListener{
			
			public void actionPerformed(ActionEvent e) {
				ellisseComponent.repaint();
			}
		}
		
		drawButton.addActionListener(new DrawListener());
		buttonPanel.add(Rlabel);
		buttonPanel.add(redField);
		buttonPanel.add(Glabel);
		buttonPanel.add(greenField);
		buttonPanel.add(Blabel);
		buttonPanel.add(blueField);
		buttonPanel.add(drawButton);
		return buttonPanel;
		
	}
	class EllisseComponent extends JComponent{

		public void paintComponent(Graphics g1 ) {
			float r = Float.parseFloat(redField.getText());
			float g = Float.parseFloat(greenField.getText());
			float b = Float.parseFloat(blueField.getText());
			Color userColor= new Color(r,g,b);
			
			Graphics2D g2 = (Graphics2D) g1;
			
			Ellipse2D.Double ellisse = new Ellipse2D.Double(0,0, getWidth(), getHeight());
			g2.setColor(userColor);
			g2.fill(ellisse);
		}
		
	}
	
}
