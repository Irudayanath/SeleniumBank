package ObserverPattern;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public  class NetworkKeyAssign implements ActionListener {	
JButton b1;
public NetworkKeyAssign()

{

b1=new JButton("Generate Key");
JFrame f=new JFrame();
f.add(b1);
f.setLayout(new FlowLayout());
f.setVisible(true);
f.setSize(500,600);
b1.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
	new Registerwindow();
}

}
public static void main(String argsp[])
{
	new NetworkKeyAssign();
}
}