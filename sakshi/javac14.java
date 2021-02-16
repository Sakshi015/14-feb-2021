import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Awt20 implements ActionListener
{
	Frame f;
	Label l1,l2,l3,l4;
	TextField t1,t2,t3,t4;
	Button b1,b2,b3,b4,b5,b6,b7;
	//ImageIcon img1,img2;
	//JLabel jl1,jl2;

	Awt20(){
	f=new Frame("this is my first application");
	f.setTitle("Application of DBMS");
	//f.setBackground(Color.red);
	Color c=new Color(255,0,0);
	f.setBackground(c);
	
	f.setLayout(null); //to set bounds it is necessary
	l1=new Label("Employee name");
	l1.setForeground(Color.white);
	l1.setBounds(10,50,200,20);
	f.add(l1);
	t1=new TextField();
	t1.setBounds(250,50,200,20);
	f.add(t1);
	b1=new Button("Add");
	b1.setBounds(500,50,100,20);
	f.add(b1);

	l2=new Label("Employee Desig");
	l2.setForeground(Color.white);
	l2.setBounds(10,90,200,20);
	f.add(l2);
	t2=new TextField();
	t2.setBounds(250,90,200,20);
	f.add(t2);
	b2=new Button("clear");
	b2.setBounds(500,90,100,20);
	f.add(b2);
	l3=new Label("Employee Depart");
	l3.setForeground(Color.white);
	l3.setBounds(10,130,200,20);
	f.add(l3);
	t3=new TextField();
	t3.setBounds(250,130,200,20);
	f.add(t3);
	b3=new Button("end");
	b3.setBounds(500,130,100,20);
	f.add(b3);
	b4=new Button("show all");
	b4.setBounds(500,170,100,20);
	f.add(b4);
	b5=new Button("Search");
	b5.setBounds(500,210,100,20);
	f.add(b5);
	b6=new Button("find");
	b6.setBounds(500,250,100,20);
	f.add(b6);
	
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(this);
    b5.addActionListener(this);
    b6.addActionListener(this);

	f.setBounds(150,100,800,600);
    //f.setSize(800,600);
	f.setVisible(true);
	}
	public  void actionPerformed(ActionEvent ae){
		Object ob=ae.getSource();
		if(ob==b1){
			t1.setText("");
			t2.setText("");
			t3.setText("");
			t1.requestFocus();

		}
		if(ob==b2)
		{
			JOptionPane.showMessageDialog(null,"Thankyou","Emulation",0);
			System.exit(0);
		}
		if(ob==b3){
			int a,b,c;
			a=Integer.parseInt(t1.getText());
			b=Integer.parseInt(t2.getText());
			c=a+b;
			t3.setText(""+c);
		}
		if(ob==b4){
			int a,b,c;
			a=Integer.parseInt(t1.getText());
			b=Integer.parseInt(t2.getText());
			c=a-b;
			t3.setText(""+c);
		}
			if(ob==b5){
			int a,b,c;
			a=Integer.parseInt(t1.getText());
			b=Integer.parseInt(t2.getText());
			c=a*b;
			t3.setText(""+c);
		}
		if(ob==b6){
			int a,b,c;
			a=Integer.parseInt(t1.getText());
			b=Integer.parseInt(t2.getText());
			c=a/b;
			t3.setText(""+c);
		}
	}
	public static void main(String[]z){
	Awt20 A=new Awt20();
	}
	


}