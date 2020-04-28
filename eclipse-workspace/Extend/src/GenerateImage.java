
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GenerateImage")
public class GenerateImage extends HttpServlet {

	public static void writeJPEG(BufferedImage image, OutputStream out) {
		try {
			ImageIO.write(image, "jpg", out);
		} catch (IOException ioe) {
			System.err.println("Error outputting JPEG: " + ioe);
		}
	}

	private BufferedImage createImageWithText(){
	      BufferedImage bufferedImage = new BufferedImage(200,200,BufferedImage.TYPE_INT_RGB);
	      Graphics g = bufferedImage.getGraphics();

	      g.drawString("Programmazione Web 2016", 20,20);
	      
	      return bufferedImage;
	   }	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("image/jpeg");
		OutputStream out = response.getOutputStream();
		
		boolean face = false;
		
		String pface = request.getParameter("face");
		if(pface != null && pface.equals("true"))
			face = true;
		
		if(face)
			writeJPEG(createImageWithText2(), out);
		else
			writeJPEG(createImageWithText(), out);
		
		out.close();
	}	
	
	private static final long serialVersionUID = 1L;

	public GenerateImage() {
		super();
	}	
	
	private BufferedImage createImageWithText2() {
	    System.setProperty("java.awt.headless", "true");

	    final int size = 100;

	    BufferedImage img = new BufferedImage(size, size,
	            BufferedImage.TYPE_INT_RGB);

	    Graphics2D gfx = img.createGraphics();
	    gfx.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
	            RenderingHints.VALUE_ANTIALIAS_ON);
	    gfx.setStroke(new BasicStroke(size / 40f, BasicStroke.CAP_ROUND,
	            BasicStroke.JOIN_ROUND));

	    gfx.setColor(Color.BLUE);
	    gfx.setBackground(Color.WHITE);
	    gfx.clearRect(0, 0, size, size);

	    int b = size / 30;
	    gfx.drawOval(b, b, size - 1 - 2 * b, size - 1 - 2 * b);

	    int esz = size / 7;
	    int ex = (int) (0.27f * size);
	    gfx.drawOval(ex, ex, esz, esz);
	    gfx.drawOval(size - 1 - esz - ex, ex, esz, esz);

	    b = size / 5;
	    gfx.drawArc(b, b, size - 1 - 2 * b, size - 1 - 2 * b, 200, 140);

	    return img;
	}	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
