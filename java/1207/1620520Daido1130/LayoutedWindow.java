import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LayoutedWindow extends JFrame implements ActionListener{
    JButton[] button_north,button_south,button_center,button_east,button_west; 

	public void initialize () {
		this.setTitle("aiueo");
		        

		//	JLabel label = new JLabel("Hello!");
		JFrame frame = new JFrame("LayoutedWindow");
		Container container = this.getContentPane();
		
		JPanel panel1 = new JPanel();
	       	JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
	       	JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
	       	
		button_north=new JButton[3];
		panel1.setLayout(new FlowLayout());
		for(int i=1;i<=3;i++){
		    button_north[i-1]=new JButton("NORTH"+i);
		    panel1.add(button_north[i-1]);
		    button_north[i-1].addActionListener(this);
		    button_north[i-1].setActionCommand(button_north[i-1].getText());
		}

		button_west=new JButton[3];
		panel2.setLayout(new BoxLayout(panel2,BoxLayout.Y_AXIS));
		for(int i=1;i<=3;i++){
		    button_west[i-1]=new JButton("WEST"+i);		    
		    panel2.add(button_west[i-1]);
		    button_west[i-1].addActionListener(this);
		    button_west[i-1].setActionCommand(button_west[i-1].getText());
		}

		button_center=new JButton[6];
		panel3.setLayout(new GridLayout(3,2));
		for(int i=1;i<=6;i++){
		    button_center[i-1]=new JButton("CENTER"+i);
		    panel3.add(button_center[i-1]);
		    button_center[i-1].addActionListener(this);
		    button_center[i-1].setActionCommand(button_center[i-1].getText());
		}

		button_east=new JButton[2];
		panel4.setLayout(new BorderLayout());
		button_east[0]=new JButton("EAST1");
		button_east[1]=new JButton("EAST2");
		panel4.add(button_east[0],BorderLayout.NORTH);
		panel4.add(button_east[1],BorderLayout.SOUTH);
		button_east[0].addActionListener(this);
		button_east[0].setActionCommand(button_east[0].getText());
		button_east[1].addActionListener(this);
		button_east[1].setActionCommand(button_east[1].getText());

		button_south=new JButton[4];
		panel5.setLayout(new BoxLayout(panel5,BoxLayout.X_AXIS));
		for(int i=1;i<=4;i++){
		    button_south[i-1]=new JButton("SOUTH"+i);
		    panel5.add(button_south[i-1]);
		    button_south[i-1].addActionListener(this);
		    button_south[i-1].setActionCommand(button_south[i-1].getText());

		}

		container.add(panel1,BorderLayout.NORTH);
		container.add(panel2,BorderLayout.WEST);
		container.add(panel3,BorderLayout.CENTER);
		container.add(panel4,BorderLayout.EAST);
		container.add(panel5,BorderLayout.SOUTH);

		
		this.pack();


		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

    public void actionPerformed(ActionEvent e){
        System.out.println(((JButton)e.getSource()).getText());
    }

	public static void main (String argv[]) {
		LayoutedWindow lw = new LayoutedWindow();
		lw.initialize();
	}
}
