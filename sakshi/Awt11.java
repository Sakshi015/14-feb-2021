import java.awt.*;
import java.awt.event.*;
class Awt11 implements ItemListener,ActionListener
{
	Frame f;
	List li,li2;
	Button b1,b2,b3,b4,b5,b6;
	TextField t1,t2;
	Label l1,l2;

	Awt11(){
	f=new Frame("Item Listener example2");
	f.setLayout(null);
	li=new List();
	li.add("Red");
	li.add("green");
	li.add("blue");
	li.add("black");
	li.add("white");
	li.add("pink");
	li.setBounds(50,50,200,120);
	f.add(li);
	li2=new List();
	li2.add("car");
	li2.add("bikes");
	li2.add("truck");
	li2.add("airplane");
	li2.add("jeep");
	li2.add("bikes");
	li2.setBounds(350,50,200,120);
	f.add(li2);
	b1=new Button(">");
	b1.setBounds(280,50,40,20);
	f.add(b1);
	b2=new Button("<");
	b2.setBounds(280,80,40,20);
	f.add(b2);
	b3=new Button(">>");
	b3.setBounds(280,110,40,20);
	f.add(b3);
	b4=new Button("<<");
	b4.setBounds(280,140,40,20);
	f.add(b4);
	l1=new Label("EnterData");
	l1.setBounds(50,170,100,20);
	f.add(l1);
	l2=new Label("EnterData");
	l2.setBounds(350,170,100,20);
	f.add(l2);
	t1=new TextField();
	t1.setBounds(150,170,100,20);
	f.add(t1);
	t2=new TextField();
	t2.setBounds(450,170,100,20);
	f.add(t2);
	b5=new Button("Add");
	b5.setBounds(100,200,100,20);
	f.add(b5);
	b6=new Button("Add");
	b6.setBounds(400,200,100,20);
	f.add(b6);

	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	b5.addActionListener(this);
	b6.addActionListener(this);
	t1.addActionListener(this);
	t2.addActionListener(this);
	li.addItemListener(this);
	li2.addItemListener(this);
	li.addActionListener(this);
	li2.addActionListener(this);
	f.setSize(600,300);
	f.setVisible(true);


	}
	public void itemStateChanged(ItemEvent ie){
	Object ob=ie.getSource();
		if(ob==li){
			//String s="";
			
			t1.setText(li.getSelectedItem());
	}
	if(ob==li2){
		//String s="";
			
			t2.setText(li2.getSelectedItem());
	}
}
	public void actionPerformed(ActionEvent ae){
			Object ob1=ae.getSource();


			if(ob1==b5){
				String s=t1.getText();
				li.add(s);

			}
			if(ob1==b6){
				String s=t2.getText();
				li2.add(s);

			}
			if(ob1==li){
				li.remove(li.getSelectedItem());
			}
			if(ob1==li2){
				li2.remove(li2.getSelectedItem());
			}
			if(ob1==b1){
				li.add(li2.getItem(0));
				li2.remove(li2.getItem(0));
			}
			if(ob1==b2){
				li2.add(li.getItem(0));
				li.remove(li.getItem(0));
			}
			if(ob1==b3){  //doubt
				for(int i=0;i<li2.getItemCount();i++){
					li.add(li2.getItem(i));
					
				}
				li2.clear();
			}
			if(ob1==b4){ //doubt
				for(int i=0;i<li.getItemCount();i++){
					li2.add(li.getItem(i));
					
				}
				li.clear();
			}

		}

	
	
	public static void main(String[]z){
	Awt11 A=new Awt11();
	}
}