import java.awt.*;
import java.awt.event.*;
class Awt10 implements ItemListener{
	Frame f;
	List li;
	Awt10(){
	f=new Frame("Item Listener example");
	f.setLayout(null);
	li=new List();
	li.add("Red");
	li.add("green");
	li.add("blue");
	li.add("black");
	li.add("white");
	li.add("pink");
	li.setBounds(200,100,200,100);
	f.add(li);
	li.addItemListener(this);

	f.setSize(600,300);
	f.setVisible(true);


	}
	public void itemStateChanged(ItemEvent ie){
	Object ob=ie.getSource();
	if(ob==li){
	if(li.getSelectedItem().equalsIgnoreCase("red")){
		f.setBackground(Color.red);
		}
	if(li.getSelectedItem().equals("blue")){
		f.setBackground(Color.blue);
	}
	if(li.getSelectedItem().equals("black")){
		f.setBackground(Color.black);
	}
	if(li.getSelectedItem().equals("white")){
		f.setBackground(Color.white);
	}
	if(li.getSelectedItem().equals("pink")){
		f.setBackground(Color.pink);
	}
	if(li.getSelectedItem().equals("green")){
		f.setBackground(Color.green);
	}
	}
}
	public static void main(String[]z){
	Awt10 A=new Awt10();
	}
}