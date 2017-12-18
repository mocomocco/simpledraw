import java.awt.event.MouseEvent;
import java.awt.event.*;
import javax.swing.JFrame;

public class SimpleDraw extends JFrame implements MouseListener,MouseMotionListener{

	int lastx=0, lasty=0, newx, newy;
	DrawPanel panel;
 

	public void mouseMoved(MouseEvent arg0) {
       }

	public void mouseClicked(MouseEvent e) {

	}
    
	public void mouseDragged(MouseEvent arg0) {
		newx=arg0.getX();
		newy=arg0.getY();
		panel.drawLine(lastx,lasty,newx,newy);
		lastx=newx;
		lasty=newy;
	}

	public void mouseExited(MouseEvent e) {
        
	}

    	public void mouseEntered(MouseEvent e) {
        
	}

    	public void mouseReleased(MouseEvent e) {
	    lastx=0;
	    lasty=0;	
	}
    
        public void mousePressed(MouseEvent e) {
	
	}
	private void init() {
		this.setTitle("Simple Draw");
		this.setSize(300, 200);
		this.addMouseMotionListener(this);
		panel=new DrawPanel();
		this.getContentPane().add(panel);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		SimpleDraw frame=new SimpleDraw();
		frame.init();
	}

}
