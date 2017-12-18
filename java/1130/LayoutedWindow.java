import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LayoutedWindow extends JFrame implements ActionListener{
    JButton[] button; 

	public void initialize () {
		this.setTitle("LayoutedWindow");
		        

		//	JLabel label = new JLabel("Hello!");

		Container container = this.getContentPane();
		JPanel panel1 = new JPanel();
		JPanel panel2 =new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();

		button=new JButton[5];

		panel1.setLayout(new BorderLayout());

		panel1.add(button[0]=new JButton("WEST"),BorderLayout.WEST);
		panel1.add(button[1]=new JButton("EAST"),BorderLayout.EAST);
		panel1.add(button[2]=new JButton("NORTH"),BorderLayout.NORTH);
		panel1.add(button[3]=new JButton("SOUTH"),BorderLayout.SOUTH);
		panel1.add(button[4]=new JButton("CENTER"),BorderLayout.CENTER);

		for(int i=0;i<5;i++){
		button[i].addActionListener(this);
		button[i].setActionCommand(button[i].getText());
		}
		container.add(panel1);
		this.pack();


		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

    public void actionPerformed(ActionEvent e){
        System.out.println(((JButton)e.getSource()).getText());
    }

	public static void main (String argv[]) {
		LayoutedWindow sl = new LayoutedWindow();
		sl.initialize();
	}
}
