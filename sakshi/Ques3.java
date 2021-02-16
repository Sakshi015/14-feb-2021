import javax.swing.*;
class Ques3{
	public static void main(String[]z){
	int x;
	x=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter no.","ques3",0));
	//y=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter second no.","ques1",0));
	if(x%2==0)
	JOptionPane.showMessageDialog(null,"no. is even","ques3",0);
	//else if(x<0)
	//JOptionPane.showMessageDialog(null,"no. is negative","ques1",0);
	else
		JOptionPane.showMessageDialog(null,"no. is odd","ques3",0);

	}
}