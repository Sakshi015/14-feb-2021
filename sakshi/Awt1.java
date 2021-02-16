import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Awt1 implements ActionListener
{
	Frame f;
	Label l1,l2,l3;
	TextField t1,t2,t3;
	Button b1,b2,b3,b4,b5,b6;
	ImageIcon img1,img2;
	JLabel jl1,jl2;

	Awt1(){
	f=new Frame("this is my first application");
	f.setTitle("Maths applications");
	//f.setBackground(Color.red);
	Color c=new Color(255,0,0);
	f.setBackground(c);
	
	f.setLayout(null); //to set bounds it is necessary
	l1=new Label("first number");
	l1.setForeground(Color.white);
	l1.setBounds(10,300,120,20);
	f.add(l1);
	t1=new TextField();
	t1.setBounds(150,300,100,20);
	f.add(t1);
	b1=new Button("clear");
	b1.setBounds(300,300,100,20);
	f.add(b1);

	l2=new Label("Second number");
	l2.setForeground(Color.white);
	l2.setBounds(10,330,120,20);
	f.add(l2);
	t2=new TextField();
	t2.setBounds(150,330,100,20);
	f.add(t2);
	b2=new Button("end");
	b2.setBounds(300,330,100,20);
	f.add(b2);
	l3=new Label("Result");
	l3.setForeground(Color.white);
	l3.setBounds(10,360,120,20);
	f.add(l3);
	t3=new TextField();
	t3.setBounds(150,360,100,20);
	f.add(t3);
	b3=new Button("add");
	b3.setBounds(10,400,55,20);
	f.add(b3);
	b4=new Button("sub");
	b4.setBounds(70,400,55,20);
	f.add(b4);
	b5=new Button("multiply");
	b5.setBounds(130,400,55,20);
	f.add(b5);
	b6=new Button("Divide");
	b6.setBounds(190,400,55,20);
	f.add(b6);
	img1=new ImageIcon("dc.jpg");
	jl1=new JLabel();
	jl1.setIcon(img1);
	jl1.setBounds(10,10,780,280);
	f.add(jl1);
    img2=new ImageIcon("thumb-144942.jpg");
    jl2=new JLabel();
    jl2.setIcon(img2);
    jl2.setBounds(500,280,300,300);
    f.add(jl2);
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
	Awt1 A=new Awt1();
	}
	


}