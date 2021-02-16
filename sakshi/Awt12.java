import java.awt.*;
import java.awt.event.*;
class Awt12 implements ItemListener
{
	Frame f;
	Checkbox cb1,cb2,cb3,cb4;
	Label l1;
	Awt12(){
		f=new Frame("CheckBox Example");
		f.setLayout(null);
		cb1=new Checkbox("Bold",false);
		cb1.setBounds(50,50,100,20);
		f.add(cb1);
		cb2=new Checkbox("Italic",false);
		cb2.setBounds(200,50,100,20);
		f.add(cb2);
		cb3=new Checkbox("Italic+bold",false);
		cb3.setBounds(350,50,100,20);
		f.add(cb3);
		cb4=new Checkbox("Plain",false);
		cb4.setBounds(200,120,100,20);
		f.add(cb4);
		
		l1=new Label("Emulation",Label.CENTER);
		l1.setBounds(20,200,500,500);
		Font f1=new Font("TimesNewRoman",Font.PLAIN,50);
		l1.setFont(f1);
		cb1.addItemListener(this);
		cb2.addItemListener(this);
		cb3.addItemListener(this);
		cb4.addItemListener(this);
		//l1.setBackground(Color.red);
		f.add(l1);
		f.setSize(600,800);
		f.setVisible(true);
	}
	public void itemStateChanged(ItemEvent ie){
		Object ob=ie.getSource();
		if(ob==cb1){
			if(cb1.getState()==true){

				Font f1=new Font("TimesNewRoman",Font.BOLD,50);
				l1.setFont(f1);
			}
			else{
				Font f1=new Font("TimesNewRoman",Font.PLAIN,50);
				l1.setFont(f1);
				
			}
		}
	if(ob==cb2){
		if(cb2.getState()==true){
				if(cb1.getState()==true)
				{
					Font f1=new Font("TimesNewRoman",Font.BOLD+Font.ITALIC,50);
					l1.setFont(f1);
				}
				else
				{
					Font f1=new Font("TimesNewRoman",Font.ITALIC,50);
					l1.setFont(f1);
				}
			}
			else{
				Font f1=new Font("TimesNewRoman",Font.PLAIN,50);
				l1.setFont(f1);
				
			}
	}
	if(ob==cb3){
		Font f1=new Font("TimesNewRoman",Font.BOLD+Font.ITALIC,50);
			l1.setFont(f1);
	}
	if(ob==cb4){
		cb1.setState(false);
		cb2.setState(false);
		cb3.setState(false);
		Font f1=new Font("TimesNewRoman",Font.PLAIN,50);
				l1.setFont(f1);


	}
	}
	public static void main(String [] z){
		Awt12 A=new Awt12();
	}
}