import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Awt14 implements ActionListener {
	Frame f;
	Button b[];
	int count=0,x;
	//Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26,b27,b28,b29,b30,b31,b32,b33,b34,b35,b36,b37,b38,b39,b40,b41,b42,b43,b44,b45,b46,b47,b48,b49,b50,b51,b52,b53,b54,b55,b56,b57,b58,b59,b60,b61,b62,b63,b64,b66,b65,b67,b68,b69,b70,b71,b72,b73,b74,b75,b76,b77,b78,b79,b80,b81,b82,b83,b84,b85,b86,b87,b88,b89,b90,b91,b92,b93,b94,b95,b96,b97,b98,b99,b100;
Awt14(){
	f=new Frame("Game");
	f.setLayout(null);
	x=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter any number","Game",0));
	b=new Button[100];
	for(int i=0;i<100;i++){
		int sum=50;
		b[i]=new Button("");
		if(i<10){
			//sum=sum+50;
			b[i].setBounds(20+sum*i,50,50,50);
			//sum=sum+50;

		}
		//sum=50;
		if(i>=10 && i<20){
			//sum=sum+50;
			b[i].setBounds(20+sum*(i%10),100,50,50);
			//sum=sum+50;

		}
		if(i>=20 && i<30){
			//sum=sum+50;
			b[i].setBounds(20+sum*(i%10),150,50,50);
			//sum=sum+50;

		}
		
		if(i>=30 && i<40){
			//sum=sum+50;
			b[i].setBounds(20+sum*(i%10),200,50,50);
			//sum=sum+50;

		}
		if(i>=40 && i<50){
			//sum=sum+50;
			b[i].setBounds(20+sum*(i%10),250,50,50);
			//sum=sum+50;

		}
		if(i>=50 && i<60){
			//sum=sum+50;
			b[i].setBounds(20+sum*(i%10),300,50,50);
			//sum=sum+50;

		}
		if(i>=60 && i<70){
			//sum=sum+50;
			b[i].setBounds(20+sum*(i%10),350,50,50);
			//sum=sum+50;

		}
		if(i>=70 && i<80){
			//sum=sum+50;
			b[i].setBounds(20+sum*(i%10),400,50,50);
			//sum=sum+50;

		}
		if(i>=80 && i<90){
			//sum=sum+50;
			b[i].setBounds(20+sum*(i%10),450,50,50);
			//sum=sum+50;

		}
		if(i>=90 && i<100){
			//sum=sum+50;
			b[i].setBounds(20+sum*(i%10),500,50,50);
			//sum=sum+50;

		}
			f.add(b[i]);
		}

		for(int i=0;i<100;i++){
			b[i].addActionListener(this);
		}
		f.setSize(550,600);
f.setVisible(true);

	}
	public void actionPerformed(ActionEvent ae){
		Object ob=ae.getSource();
		//ob.getText
		for(int i=0;i<100;i++){
			if(ob==b[i])
			{
				if(i+1>x){	
					b[i].setBackground(Color.green);
					b[i].setLabel(""+(i+1));
					count++;
				}
				else if(i+1<x) {
					b[i].setBackground(Color.yellow);
					b[i].setLabel(""+(i+1));
					count++;
				}
				else{
					b[i].setLabel(""+(i+1));
					b[i].setBackground(Color.red);
					count++;
					JOptionPane.showMessageDialog(null,"We found the Number on "+count+" clicks","Game",0);
					System.exit(0);
				}


			}
		}

	}
	public static void main(String[]z){
		Awt14 A=new Awt14();
	}
}


