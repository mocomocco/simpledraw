import javax.swing.JPanel;
import java.awt.Graphics;

/**
 * 
 */

/**
 * @author g1620520
 *simple draw panel class povides drawLine method
 */
public class DrawPanel extends JPanel {
	private static final long serialVersionUID = 42L;
public void drawLine(int x1,int y1,int x2,int y2){
	Graphics g = this.getGraphics();
	g.drawLine(x1,y1,x2,y2);
	}
}
