import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Awt4 implements AdjustmentListener{
	Frame f;
	Scrollbar sb2;
	Label l1;
	//JLabel jl1;
    //ImageIcon img1;
	Awt4(){
		f=new Frame("Scrollbar 3rd Example");
		f.setLayout(null);
		//sb1=new Scrollbar(Scrollbar.VERTICAL,10,10,0,255);
		sb2=new Scrollbar(Scrollbar.HORIZONTAL,10,10,0,500);
		//sb1.setBounds(760,30,40,550);
		//f.add(sb1);
		sb2.setBounds(20,550,780,40);
		f.add(sb2);
		l1=new Label("Emulation",Label.CENTER);
		l1.setBounds(20,50,760,500);
		l1.setBackground(Color.red);
		f.add(l1);
		//Font f1=new Font("TimesNewRoman",Font.BOLD,30);
		//l1.setFont(f1);
		//l1.setBounds(500,300,100,100);
		sb2.addAdjustmentListener(this);



		f.setSize(800,600);
		f.setVisible(true);

	}
	public void adjustmentValueChanged(AdjustmentEvent ae){
		Object ob=ae.getSource();
		int i;
		i=sb2.getValue();
		if(ob==sb2){
			Font f1=new Font("TimesNewRoman",Font.PLAIN,i);
				l1.setFont(f1);
		}
	}
	public static void main(String[] z){
		Awt4 A=new Awt4();
	}
}