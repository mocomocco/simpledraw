import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class JTextFieldSample2 extends JFrame implements ActionListener{
    JButton[]  button;
    JTextField textleft,textright;

    JTextFieldSample2(String title){
	setTitle(title);
	button=new JButton[2];

	button[0]=new JButton("left to right");
	button[1]=new JButton("clear");

	for(int i=0;i<2;i++){
	button[i].addActionListener(this);
	button[i].setActionCommand(button[i].getText());
	}

	textleft = new JTextField(10);
	textright= new JTextField(10);
	JPanel panel= new JPanel();
	panel.setLayout(new GridLayout(2,2));
	panel.add(textleft);
	panel.add(textright);
	panel.add(button[0]);
	panel.add(button[1]);

	Container container = getContentPane();
	container.add(panel);
    }

    public void actionPerformed(ActionEvent e){
	if(e.getActionCommand()==("left to right")){
		textright.setText(textleft.getText());
		textleft.setText("");
	}else if(e.getActionCommand()==("clear")){
		    textright.setText("");
		}
		}

    public static void main(String[] args){
	JTextFieldSample2 sample=new JTextFieldSample2("JTextFieldSample");

	sample.pack();
	sample.setVisible(true);
	sample.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
