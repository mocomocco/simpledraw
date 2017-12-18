import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SampleWindow extends JFrame implements ActionListener{
    JButton button1,button2;

	public void initialize () {
		this.setTitle("Swingsample");
		
        

		//	JLabel label = new JLabel("Hello!");

		Container container = this.getContentPane();
		JPanel panel = new JPanel();

		button1= new JButton("button1");
		button2= new JButton("button2");

		panel.add(button1);
		panel.add(button2);

		container.add(panel);
		this.pack();


		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main (String argv[]) {
		SampleWindow sw = new SampleWindow();
		sw.initialize();
	}
}
