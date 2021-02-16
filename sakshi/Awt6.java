import java.awt.*;
import javax.swing.*;
class Awt6{
Frame f;
Label l1,l2,l3,l4,l5,l6,l7;
List li1,li2,li3;
Choice ch;
TextField t1,t2,t3;
Button b1,b2;
Awt6(){
f=new Frame("Font");
f.setLayout(null);
l1=new Label("Font:");
//l1.setBackground(Color.red);
l1.setBounds(20,50,40,20);
f.add(l1);
t1=new TextField();
t1.setBounds(20,80,200,20);
f.add(t1);
li1=new List();
li1.add("Agency FB");
li1.add("Constantia");
li1.add("Cooper");
li1.add("Corbel");
li1.add("Copperplate Gothic");
li1.add("NSimSun");
li1.add("OCR A");
li1.add("Old English Text MT");
li1.add("Onyx");
li1.add("Yu Gothic");
li1.setBounds(20,100,200,100);
f.add(li1);


l2=new Label("Font style:");
//l2.setBackground(Color.yellow);
l2.setBounds(240,50,100,20);
f.add(l2);
t2=new TextField();
t2.setBounds(240,80,150,20);
f.add(t2);
li2=new List();
li2.add("Regular");
li2.add("Medium");
li2.add("Bold");
li2.add("Light  Oblique");
li2.add("Oblique");
li2.add("Medium Oblique");
li2.add("Bold Oblique");
li2.add("Light");
li2.add("Light Oblique");
li2.add("Regular Oblique");
li2.add("Medium");
li2.setBounds(240,100,150,100);
f.add(li2);

l3=new Label("Size:");
//l1.setBackground(Color.green);
l3.setBounds(410,50,40,20);
f.add(l3);
t3=new TextField();
t3.setBounds(410,80,100,20);
f.add(t3);
li3=new List();
li3.add("8");
li3.add("9");
li3.add("10");
li3.add("11");
li3.add("12");
li3.add("14");
li3.add("16");
li3.add("18");
li3.add("20");
li3.add("22");
li3.add("24");
li3.setBounds(410,100,100,80);
f.add(li3);
l4=new Label("Sample");
l4.setBounds(240,210,50,20);
f.add(l4);
l5=new Label("AaBbYyZz",Label.CENTER);
//l5.setBackground(Color.blue);
l5.setBounds(240,230,270,80);
//Font f1=new Font("TimesNewRoman",Font.BOLD,10);
//l5.setFont(f1);
f.add(l5);
l6=new Label("Script:");
l6.setBounds(240,320,50,20);
f.add(l6);
ch=new Choice();
ch.add("Western");
ch.add("Japnese");
ch.add("Chinese");
ch.add("Turkish");
ch.add("Baltic");
ch.add("Cynlic");
ch.add("Center European");
ch.setBounds(240,350,270,20);
f.add(ch);

b1=new Button("Cancel");
b1.setBounds(400,460,100,20);
f.add(b1);
b2=new Button("OK");
b2.setBounds(290,460,100,20);
f.add(b2);
l7=new Label("Show more fonts");
l7.setBounds(20,430,100,20);
f.add(l7);

f.setSize(530,500);
f.setVisible(true);
}

public static void main(String []z){
	Awt6 A=new Awt6();

}

}