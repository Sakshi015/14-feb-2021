import javax.swing.*;
class Ques4{
	public static void main(String[]z){
	int x,y,l;
	x=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter first no.","Emulation",0));
	y=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter second no.","Emulation",0));
	l=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter third no.","Emulation",0));

	if(x>y)
	{
		if(x>l)
			JOptionPane.showMessageDialog(null,"greatest numb is "+x,"Emulation",0);
		else
			JOptionPane.showMessageDialog(null,"greatest numb is "+l,"Emulation",0);
	}
	//JOptionPane.showMessageDialog(null,"greater numb is "+x,"Emulation",0);
	else{
		if(y>l)
		JOptionPane.showMessageDialog(null,"greatest numb is "+y,"Emu",0);
		else
		JOptionPane.showMessageDialog(null,"greatest numb is "+l,"Emulation",0);
		}
	}
}