import javax.swing.*;
class Ques2{
	public static void main(String[]z){
	int x;
	x=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter no.","ques2",0));
	//y=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter second no.","ques1",0));
	if(x>0)
		JOptionPane.showMessageDialog(null,"no. is positive","ques2",0);
	else if(x<0)
		JOptionPane.showMessageDialog(null,"no. is negative","ques2",0);
	else
		JOptionPane.showMessageDialog(null,"no. is 0","ques2",0);

	}
}