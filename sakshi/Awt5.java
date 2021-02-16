import java.awt.*;
import javax.swing.*;
class Awt5{
	Frame f;
	List li1;
	Choice ch;
	Awt5(){
		f=new Frame("5th Example");
		f.setLayout(null);
		li1=new List();
		li1.add("INDIA");
		li1.add("UK");
		li1.add("USA");
		li1.add("Canada");
		li1.setBounds(50,50,300,100);
		f.add(li1);
		ch=new Choice();
		ch.add("Delhi");
		ch.add("California");
		ch.add("Amsterdam");
		ch.add("California");
		ch.add("Toronto");
		ch.setBounds(400,50,300,50);
		f.add(ch);

		f.setSize(800,400);
		f.setVisible(true);
	}
	public static void main(String[] z){
		Awt5 A=new Awt5();
	}
}