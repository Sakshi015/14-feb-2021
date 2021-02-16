import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Awt7 implements ActionListener{
	Frame f;
	Label l1,l2;
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11;
	ImageIcon img;
	JLabel jl;
	String p1;
		String p2;
		int i=0;
	Awt7(){
		p1=JOptionPane.showInputDialog(null,"Enter first player name","TicTacToe",0);
		p2=JOptionPane.showInputDialog(null,"Enter second player name","TicTacToe",0);
		f=new Frame("Tic Tac Toe");
		f.setLayout(null);
		l1=new Label("Ist Player- "+p1);
		l1.setBackground(Color.red);
		l1.setBounds(20,30,150,20);
		f.add(l1);
		img=new ImageIcon("1.jpg");
		jl=new JLabel();
		jl.setIcon(img);
		jl.setBounds(190,30,0,0);
		f.add(jl);
		b1=new Button("START");
		b1.setBounds(500,30,100,20);
		f.add(b1);
		l2=new Label("IInd Player- "+p2);
		l2.setBackground(Color.blue);
		l2.setBounds(20,60,150,20);
		f.add(l2);
		b2=new Button("STOP");
		b2.setBounds(500,60,100,20);
		f.add(b2);
		b3=new Button("");
		b3.setBounds(50,130,150,75);
		b3.setEnabled(false);
		f.add(b3);
		b4=new Button("");
		b4.setBounds(200,130,150,75);
		b4.setEnabled(false);
		f.add(b4);
		b5=new Button("");
		b5.setBounds(350,130,150,75);
		b5.setEnabled(false);
		f.add(b5);
		b6=new Button("");
		b6.setBounds(50,205,150,75);
		b6.setEnabled(false);
		f.add(b6);
		b7=new Button("");
		b7.setBounds(200,205,150,75);
		b7.setEnabled(false);
		f.add(b7);
		b8=new Button("");
		b8.setBounds(350,205,150,75);
		b8.setEnabled(false);
		f.add(b8);
		b9=new Button("");
		b9.setBounds(50,280,150,75);
		b9.setEnabled(false);
		f.add(b9);
		b10=new Button("");
		b10.setBounds(200,280,150,75);
		b10.setEnabled(false);
		f.add(b10);
		b11=new Button("");
		b11.setBounds(350,280,150,75);
		b11.setEnabled(false);
		f.add(b11);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		b11.addActionListener(this);



		f.setSize(620,405);
		f.setVisible(true);

	}
	public void actionPerformed(ActionEvent ae){
		Object ob=ae.getSource();
		if(ob==b1){
			JOptionPane.showMessageDialog(null,"Lets start the game","TicTacToe",0);
			b3.setEnabled(true);
			b4.setEnabled(true);
			b5.setEnabled(true);
			b6.setEnabled(true);
			b7.setEnabled(true);
			b8.setEnabled(true);
			b9.setEnabled(true);
			b10.setEnabled(true);
			b11.setEnabled(true);
			b1.setEnabled(false);
			jl.setBounds(190,30,10,10);
			}
			if(ob==b2){
			JOptionPane.showMessageDialog(null,"Thanks for playing","TicTacToe",0);
			System.exit(0);
		}
			//jl.setBounds(190,60,10,10);
			//b3.setLabel("X");
			jl.setBounds(190,30,10,10);
			
			//int i=0;
			if(i%2==0){
				//jl.setBounds(190,30,10,10);
				if(ob==b3){
					b3.setLabel("X");
					b3.setEnabled(false);
					i++;
				}
				if(ob==b4){
					b4.setLabel("X");
					b4.setEnabled(false);
					i++;
				}
				if(ob==b5){
					b5.setLabel("X");
					b5.setEnabled(false);
					i++;
				}
				if(ob==b6){
					b6.setLabel("X");
					b6.setEnabled(false);
					i++;
				}
				if(ob==b7){
					b7.setLabel("X");
					b7.setEnabled(false);
					i++;
				}
				if(ob==b8){
					b8.setLabel("X");
					b8.setEnabled(false);
					i++;
				}
				if(ob==b9){
					b9.setLabel("X");
					b9.setEnabled(false);
					i++;
				}
				if(ob==b10){
					b10.setLabel("X");
					b10.setEnabled(false);
					i++;
				}
				if(ob==b11){
					b11.setLabel("X");
					b11.setEnabled(false);
					i++;
				}
				if(i!=0)
				jl.setBounds(190,60,10,10);
			}
			//jl.setBounds(190,30,10,10);
			else
			{
				//jl.setBounds(190,60,10,10);
				if(ob==b3){
					b3.setLabel("O");
					b3.setEnabled(false);
					i++;
				}
				if(ob==b4){
					b4.setLabel("O");
					b4.setEnabled(false);
					i++;
				}
				if(ob==b5){
					b5.setLabel("O");
					b5.setEnabled(false);
					i++;
				}
				if(ob==b6){
					b6.setLabel("O");
					b6.setEnabled(false);
					i++;
				}
				if(ob==b7){
					b7.setLabel("O");
					b7.setEnabled(false);
					i++;
				}
				if(ob==b8){
					b8.setLabel("O");
					b8.setEnabled(false);
					i++;
				}
				if(ob==b9){
					b9.setLabel("O");
					b9.setEnabled(false);
					i++;
				}
				if(ob==b10){
					b10.setLabel("O");
					b10.setEnabled(false);
					i++;
				}
				if(ob==b11){
					b11.setLabel("O");
					b11.setEnabled(false);
					i++;
				}

			}
			if(i>4){
				if(b3.getLabel().equals("X") && b4.getLabel().equals("X") && b5.getLabel().equals("X")){
								JOptionPane.showMessageDialog(null,"Ist Player wins","TicTacToe",0);
								System.exit(0);
			}
			if(b6.getLabel().equals("X") && b7.getLabel().equals("X") && b8.getLabel().equals("X")){
								JOptionPane.showMessageDialog(null,"Ist Player wins","TicTacToe",0);
								System.exit(0);
			}
			if(b9.getLabel().equals("X") && b10.getLabel().equals("X") && b11.getLabel().equals("X")){
								JOptionPane.showMessageDialog(null,"Ist Player wins","TicTacToe",0);
								System.exit(0);
			}
			if(b3.getLabel().equals("X") && b6.getLabel().equals("X") && b9.getLabel().equals("X")){
								JOptionPane.showMessageDialog(null,"Ist Player wins","TicTacToe",0);
								System.exit(0);
			}
			if(b4.getLabel().equals("X") && b7.getLabel().equals("X") && b10.getLabel().equals("X")){
								JOptionPane.showMessageDialog(null,"Ist Player wins","TicTacToe",0);
								System.exit(0);
			}
			if(b5.getLabel().equals("X") && b8.getLabel().equals("X") && b11.getLabel().equals("X")){
								JOptionPane.showMessageDialog(null,"Ist Player wins","TicTacToe",0);
								System.exit(0);
			}
			if(b3.getLabel().equals("X") && b7.getLabel().equals("X") && b11.getLabel().equals("X")){
								JOptionPane.showMessageDialog(null,"Ist Player wins","TicTacToe",0);
								System.exit(0);
			}
			if(b5.getLabel().equals("X") && b7.getLabel().equals("X") && b9.getLabel().equals("X")){
								JOptionPane.showMessageDialog(null,"Ist Player wins","TicTacToe",0);
								System.exit(0);
			}
			if(b3.getLabel().equals("O") && b4.getLabel().equals("O") && b5.getLabel().equals("O")){
								JOptionPane.showMessageDialog(null,"IInd Player wins","TicTacToe",0);
								System.exit(0);
			}
			if(b6.getLabel().equals("O") && b7.getLabel().equals("O") && b8.getLabel().equals("O")){
								JOptionPane.showMessageDialog(null,"IInd Player wins","TicTacToe",0);
								System.exit(0);
			}
			if(b9.getLabel().equals("O") && b10.getLabel().equals("O") && b11.getLabel().equals("O")){
								JOptionPane.showMessageDialog(null,"IInd Player wins","TicTacToe",0);
								System.exit(0);
			}
			if(b3.getLabel().equals("O") && b6.getLabel().equals("O") && b9.getLabel().equals("O")){
								JOptionPane.showMessageDialog(null,"IInd Player wins","TicTacToe",0);
								System.exit(0);
			}
			if(b4.getLabel().equals("O") && b7.getLabel().equals("O") && b10.getLabel().equals("O")){
								JOptionPane.showMessageDialog(null,"IInd Player wins","TicTacToe",0);
								System.exit(0);
			}
			if(b5.getLabel().equals("O") && b8.getLabel().equals("O") && b11.getLabel().equals("O")){
								JOptionPane.showMessageDialog(null,"IInd Player wins","TicTacToe",0);
								System.exit(0);
			}
			if(b3.getLabel().equals("O") && b7.getLabel().equals("O") && b11.getLabel().equals("O")){
								JOptionPane.showMessageDialog(null,"IInd Player wins","TicTacToe",0);
								System.exit(0);
			}
			if(b5.getLabel().equals("O") && b7.getLabel().equals("O") && b9.getLabel().equals("O")){
								JOptionPane.showMessageDialog(null,"IInd Player wins","TicTacToe",0);
								System.exit(0);
			}
			}
		}
		
	
	public static void main(String[] z){
		Awt7 A=new Awt7();


		
		

	}
}