import java.awt.*;
import java.awt.event.*;
class Awt13 implements ItemListener
{
	Frame f;
	Checkbox cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8,cb9,cb10;
	Label l1;
	CheckboxGroup cbg;
	Awt13(){

		f=new Frame("RadioButton Example");
		f.setLayout(null);
		cbg=new CheckboxGroup();
		cb1=new Checkbox("10",true,cbg);
		cb1.setBounds(100,50,50,20);
		f.add(cb1);
		cb2=new Checkbox("20",false,cbg);
		cb2.setBounds(190,50,50,20);
		f.add(cb2);
		cb3=new Checkbox("30",false,cbg);
		cb3.setBounds(280,50,50,20);
		f.add(cb3);
		cb4=new Checkbox("40",false,cbg);
		cb4.setBounds(370,50,50,20);
		f.add(cb4);
		
		cb5=new Checkbox("50",false,cbg);
		cb5.setBounds(130,90,50,20);
		f.add(cb5);
		cb6=new Checkbox("60",false,cbg);
		cb6.setBounds(220,90,50,20);
		f.add(cb6);
		cb7=new Checkbox("70",false,cbg);
		cb7.setBounds(310,90,50,20);
		f.add(cb7);
		cb8=new Checkbox("80",false,cbg);
		cb8.setBounds(160,130,50,20);
		f.add(cb8);
		cb9=new Checkbox("90",false,cbg);
		cb9.setBounds(270,130,50,20);
		f.add(cb9);
		cb10=new Checkbox("100",false,cbg);
		cb10.setBounds(220,170,50,20);
		f.add(cb10);
		l1=new Label("Emulation",Label.CENTER);
		l1.setBounds(10,100,500,500);
		f.add(l1);
		cb1.addItemListener(this);
		cb2.addItemListener(this);
		cb3.addItemListener(this);
		cb4.addItemListener(this);
		cb5.addItemListener(this);
		cb6.addItemListener(this);
		cb7.addItemListener(this);
		cb8.addItemListener(this);
		cb9.addItemListener(this);
		cb10.addItemListener(this);
		


		f.setSize(600,800);
	f.setVisible(true);
	}
	public void itemStateChanged(ItemEvent ie){
		Object ob=ie.getSource();
		if(ob==cb1){
			Font f1=new Font("TimesNewRoman",Font.PLAIN,10);
				l1.setFont(f1);
		}
		if(ob==cb2){
			Font f1=new Font("TimesNewRoman",Font.PLAIN,20);
				l1.setFont(f1);
		}
		if(ob==cb3){
			Font f1=new Font("TimesNewRoman",Font.PLAIN,30);
				l1.setFont(f1);
		}
		if(ob==cb4){
			Font f1=new Font("TimesNewRoman",Font.PLAIN,40);
				l1.setFont(f1);
		}
		if(ob==cb5){
			Font f1=new Font("TimesNewRoman",Font.PLAIN,50);
				l1.setFont(f1);
		}
		if(ob==cb6){
			Font f1=new Font("TimesNewRoman",Font.PLAIN,60);
				l1.setFont(f1);
		}
		if(ob==cb7){
			Font f1=new Font("TimesNewRoman",Font.PLAIN,70);
				l1.setFont(f1);
		}
		if(ob==cb8){
			Font f1=new Font("TimesNewRoman",Font.PLAIN,80);
				l1.setFont(f1);
		}
		if(ob==cb9){
			Font f1=new Font("TimesNewRoman",Font.PLAIN,90);
				l1.setFont(f1);
		}
		if(ob==cb10){
			Font f1=new Font("TimesNewRoman",Font.PLAIN,100);
				l1.setFont(f1);
		}

	}
	public static void main(String[]z){
		Awt13 A=new Awt13();
	}

}