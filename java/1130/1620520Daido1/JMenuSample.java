import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class JMenuSample extends JFrame implements ActionListener{
    JLabel label;
    JMenuSample(String title){
	setTitle(title);
    JMenuBar menubar=new JMenuBar();

    JMenu menu = new JMenu("menu");

    JMenuItem item1 =new JMenuItem("Sandwiches");
    item1.addActionListener(this);
    item1.setActionCommand("Sandwiches");

    JMenuItem item2 =new JMenuItem("Side Orders");

    item2.addActionListener(this);
    item2.setActionCommand("Side Orders");
    JMenu item3 = new JMenu("Drinks");

    menu.add(item1);
    menu.add(item2);
    menu.add(item3);

    JMenuItem subitem1 = new JMenuItem("Iced Coffee");
    subitem1.addActionListener(this);
    subitem1.setActionCommand("Iced Coffee");
    JMenuItem subitem2 = new JMenuItem("Iced Tea");
    subitem2.addActionListener(this);
    subitem2.setActionCommand("Iced Tea");
    JMenuItem subitem3 = new JMenuItem("Orange juice");
    subitem3.addActionListener(this);
    subitem3.setActionCommand("Orange juice");

    item3.add(subitem1);
    item3.add(subitem2);
    item3.add(subitem3);

    menubar.add(menu);

    setJMenuBar(menubar);

    label=new JLabel("");
    JPanel panel=new JPanel();
    panel.add(label);
    Container container = getContentPane();
    container.add(panel);
    }

public void actionPerformed(ActionEvent e){
    String command = e.getActionCommand();
    if(command != null){
	label.setText(command+"が注文されました");
    }
}

public static void main(String[] args){
    JMenuSample sample = new JMenuSample("JMenuSample");
    sample.pack();
    sample.setVisible(true);
    sample.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
