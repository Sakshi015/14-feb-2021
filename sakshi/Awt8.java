import java.awt.*;
import java.awt.event.*;
class Awt8 implements ActionListener{
Frame f;
Button b1,b2,b3;
Awt8(){
f=new Frame("Button Click Example");
f.setLayout(null);
b1=new Button("Red");
b1.setBounds(100,100,100,20);
f.add(b1);
b2=new Button("Green");
b2.setBounds(300,100,100,20);
f.add(b2);
b3=new Button("Blue");
b3.setBounds(500,100,100,20);
f.add(b3);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
f.setSize(700,200);
f.setVisible(true);
}
public void actionPerformed(ActionEvent ae){
	Object ob=ae.getSource();
	if(ob==b1)
		f.setBackground(Color.red);
	if(ob==b2)
		f.setBackground(Color.green);
	if(ob==b3)
		f.setBackground(Color.blue);
	
	
}
	
	public static void main(String []z){
	Awt8 A=new Awt8();
	}
	

	
}