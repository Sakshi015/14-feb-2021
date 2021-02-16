import javax.swing.*;
class Demo21{
	public static void main(String[]z){
	int x,y,s;
	x=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter first no. ","Emulation",0));
	y=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter second No. ","Emulation",0));
	s=x+y;
	JOptionPane.showMessageDialog(null,"Sum is= "+s,"Emulation",0);
	}
}