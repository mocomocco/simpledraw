import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class fivebutton extends JFrame implements ActionListener{
    JButton[] button; 

	public void initialize () {
		this.setTitle("aiueo");
		        

		//	JLabel label = new JLabel("Hello!");

		Container container = this.getContentPane();
		JPanel panel = new JPanel();

		button=new JButton[5];

		panel.setLayout(new BorderLayout());

		panel.add(button[0]=new JButton("WEST"),BorderLayout.WEST);
		panel.add(button[1]=new JButton("EAST"),BorderLayout.EAST);
		panel.add(button[2]=new JButton("NORTH"),BorderLayout.NORTH);
		panel.add(button[3]=new JButton("SOUTH"),BorderLayout.SOUTH);
		panel.add(button[4]=new JButton("CENTER"),BorderLayout.CENTER);

		for(int i=0;i<5;i++){
		button[i].addActionListener(this);
		panel.add(button[i]);
		}
		container.add(panel);
		this.pack();


		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

    public void actionPerformed(ActionEvent e){
        System.out.println(((JButton)e.getSource()).getText());
    }

	public static void main (String argv[]) {
		SimpleButton sb = new SimpleButton();
		sb.initialize();
	}
}
