import javax.swing.*;
import java.awt.*;
public class SimpleWindow extends JFrame {

	public void initialize () {
		this.setTitle("Swingsample");
		
        

		JLabel label = new JLabel("Hello!");

		Container container = this.getContentPane();
		JPanel panel = new JPanel();

		JButton button1= new JButton("button1");
		JButton button2= new JButton("button2");

		panel.add(button1);
		panel.add(button2);

		container.add(panel);
		this.pack();


		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main (String argv[]) {
		SimpleWindow sw = new SimpleWindow();
		sw.initialize();
	}
}
