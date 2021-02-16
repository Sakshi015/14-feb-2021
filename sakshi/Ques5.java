import javax.swing.*;
class Ques5{
	public static void main(String[]z){
	int w,c;
	c=30;
	w=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter weight in gms","hi",0));
	//y=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter second no.","ques1",0));
	if(w<2000)
	JOptionPane.showMessageDialog(null,"courier charges "+c,"hi",0);
	else
		{
			w=w-2000;
			w=w/100;
			w=w*2;
			c=c+w;
			JOptionPane.showMessageDialog(null,"courier charges are"+c,"hi",0);
		}
	}
}