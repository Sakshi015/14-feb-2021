import javax.swing.*;
class Demo22{
	public static void main(String[]z){
	int yy;
	yy=JOptionPane.showConfirmDialog(null,"Do u wanna Quit","COding",2);
	if(yy==0)
	System.exit(0);
	else
	JOptionPane.showMessageDialog(null,"stay connected","Emulation",1);
	}
}