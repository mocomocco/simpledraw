import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleButton extends JFrame implements ActionListener{
    JButton button1,button2;

	public void initialize () {
		this.setTitle("Swingsample");
		        

		//	JLabel label = new JLabel("Hello!");

		Container container = this.getContentPane();
		JPanel panel = new JPanel();

		button1= new JButton("button1");
		button2= new JButton("button2");

		button1.addActionListener(this);
		button2.addActionListener(this);

		panel.add(button1);
		panel.add(button2);

		container.add(panel);
		this.pack();


		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

    public void actionPerformed(ActionEvent e){
	if(e.getSource()==(button1)){
		System.out.println("Hello");
	    }else{
		System.out.println("Good Bye");
	    }
    }

	public static void main (String argv[]) {
		SimpleButton sb = new SimpleButton();
		sb.initialize();
	}
}
