import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Splash{
JFrame f;
JTextArea ta;
ImageIcon img1;
JLabel jl1;
JPanel p1;
JLabel l1,l2,l3,l4;
JToolBar tb;
JButton b1,b2,b3,b4;
JProgressBar pb;
//Container c;
Splash(){
	f=new JFrame("La casa de papel");
	f.setBackground(Color.red);
	ImageIcon img1=new ImageIcon("bankIcon.png");
	f.setIconImage(img1.getImage());
	//Color z=Color.black;
	//c.setBackground(z);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setLayout(null);
	Container  cp=f.getContentPane();
	cp.setBackground(Color.BLACK);

	//jl1=new JLabel();
    img1=new ImageIcon("download (1).png");
	jl1=new JLabel();
	jl1.setIcon(img1);
	jl1.setBounds(210,50,452,300);
	f.add(jl1);
	pb=new JProgressBar(1,100);
	pb.setBackground(Color.black);
	pb.setBounds(210,350,452,20);
	f.add(pb);
	l4=new JLabel("Loading..");
	l4.setBounds(400,380,100,20);
	l4.setForeground(Color.yellow);
	f.add(l4);


	f.setSize(900,600);
	f.setVisible(true);
	for(int i=0;i<=110;i+=10){
		try{
			Thread.sleep(1000);
			pb.setValue(i);

		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null,e,"Error",0);
		}
		
	}
	f.setVisible(false);
	Login A=new Login();
}
public static void main(String[]z){
	Splash A=new Splash();
	}
}