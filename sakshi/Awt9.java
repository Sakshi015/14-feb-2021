import java.awt.*;
import java.awt.event.*;
class Awt9 implements ActionListener,AdjustmentListener
{
	Frame f;
	Label l1,l2,l3;
	TextField t1,t2,t3;
	Button b1;
	Scrollbar sb1,sb2,sb3;
	
	Awt9(){
	f=new Frame("Scrollbar Example");
	f.setLayout(null);
	l1=new Label("Red");
	l1.setBackground(Color.red);
	l1.setForeground(Color.black);
	l1.setBounds(20,50,50,20);
	f.add(l1);
	l2=new Label("Green");
	l2.setBackground(Color.green);
	l2.setForeground(Color.black);
	l2.setBounds(200,50,50,20);
	f.add(l2);
	l3=new Label("blue");
	l3.setBackground(Color.blue);
	l3.setForeground(Color.black);
	l3.setBounds(400,50,50,20);
	f.add(l3);
	sb1=new Scrollbar(Scrollbar.VERTICAL,10,10,0,255);
	sb1.setBounds(20,50,50,400);
	f.add(sb1);
	t1=new TextField();
	t1.setBounds(20,500,50,20);
	f.add(t1);
	sb2=new Scrollbar(Scrollbar.VERTICAL,10,10,0,255);
	sb2.setBounds(200,50,50,400);
	f.add(sb2);
	t2=new TextField();
	t2.setBounds(200,500,50,20);
	f.add(t2);
	sb3=new Scrollbar(Scrollbar.VERTICAL,10,10,0,255);
	sb3.setBounds(400,50,50,400);
	f.add(sb3);
	t3=new TextField();
	t3.setBounds(400,500,50,20);
	f.add(t3);
	b1=new Button("APPLY");
	Font f1=new Font("TimesNewRoman",Font.BOLD,30);
	b1.setFont(f1);
	b1.setBounds(500,300,100,100);
	f.add(b1);
	sb1.addAdjustmentListener(this);
	sb2.addAdjustmentListener(this);
	sb3.addAdjustmentListener(this);
	b1.addActionListener(this);

	f.setSize(800,600);
	f.setVisible(true);
	}
	public void adjustmentValueChanged(AdjustmentEvent ae){
		Object ob1=ae.getSource();
		int i,j,k;
		if(ob1==sb1){
			
			i=sb1.getValue();

			t1.setText(""+i);
			}
			if(ob1==sb2){
				j=sb2.getValue();
				t2.setText(""+j);
				}
				if(ob1==sb3){
					k=sb3.getValue();
					t3.setText(""+k);
				}
				i=sb1.getValue();
				j=sb2.getValue();
				k=sb3.getValue();
				Color c2=new Color(i,j,k);
				f.setBackground(c2);
	}
	public void actionPerformed(ActionEvent ae){
		Object ob=ae.getSource();
		if(ob==b1){
			int a,b,c;
			a=Integer.parseInt(t1.getText());
			b=Integer.parseInt(t2.getText());
			c=Integer.parseInt(t3.getText());
			Color c1=new Color(a,b,c);
			sb1.setValue(a);
			sb2.setValue(b);
			sb3.setValue(c);
			f.setBackground(c1);
		}
	}
	public static void main(String[]z){
	Awt9 A=new Awt9();
	}
}