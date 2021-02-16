import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Awt3 implements AdjustmentListener{
	Frame f;
	Scrollbar sb1,sb2;
	JLabel jl1;
    ImageIcon img1;
	Awt3(){
		f=new Frame("Scrollbar 2nd Example");
		f.setLayout(null);
		sb1=new Scrollbar(Scrollbar.VERTICAL,10,10,0,600);
		sb2=new Scrollbar(Scrollbar.HORIZONTAL,10,10,0,800);
		sb1.setBounds(760,30,40,560);
		f.add(sb1);
		sb2.setBounds(10,560,750,40);
		f.add(sb2);
		img1=new ImageIcon("SONATA-hero-option1-764A5360-edit.jpg");
		jl1=new JLabel();
		jl1.setIcon(img1);
		jl1.setBounds(20,30,40,40);
		f.add(jl1);
		sb1.addAdjustmentListener(this);
		sb2.addAdjustmentListener(this);
		f.setSize(800,600);
		f.setVisible(true);

	}
	public void adjustmentValueChanged(AdjustmentEvent ae){
		Object ob=ae.getSource();
		int i,j;
		i=sb2.getValue();
		j=sb1.getValue();
		if(ob==sb1){
			jl1.setBounds(i,j,40,40);
		}
		if(ob==sb2){
			jl1.setBounds(i,j,40,40);
		}
	}
	public static void main(String[] z){
		Awt3 A=new Awt3();
	}
}