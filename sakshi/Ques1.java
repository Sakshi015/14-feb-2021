import javax.swing.*;
class Ques1{
	public static void main(String[]z){
	int x,y;
	x=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter first no.","ques1",0));
	y=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter second no.","ques1",0));
	if(x>y)
	JOptionPane.showMessageDialog(null,"greater numb is "+x,"ques1",0);
	else
	JOptionPane.showMessageDialog(null,"greater numb is "+y,"ques1",0);

	}
}