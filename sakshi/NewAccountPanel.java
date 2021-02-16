import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;
class NewAccountPanel extends JPanel implements ActionListener
{
	Connection con;
	Statement st;
	ResultSet rs;
	JButton b1;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21;
	JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
	JButton but;
	JRadioButton rb1,rb2,rb3,rb4,rb5,rb6,rb7,rb8,rb9,rb10,rb11,rb12,rb13;
	ButtonGroup bg1,bg2,bg3,bg4,bg5,bg6;
	JTextArea ta;
	int z=1;
	 String d[][]=new String[20][17];
	String h[]={"accno","cust_type","name","mother_father_name","dob","gender","ModeofOperation","MaritalStatus","Servicereq","city","email","nationality","state","mobno","balance","address","acctype"};
	{
	try{
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank of Spain","root","");
		st=con.createStatement();
		JOptionPane.showMessageDialog(null,"Connected","Bank of Spain",2);

	}
	catch(Exception e){
		JOptionPane.showMessageDialog(null,e,"Bank of Spain",0);
	}
}
	NewAccountPanel()
	{
		z++;
		setLayout(null);
		l1=new JLabel("Branch:MADRID");
		
		l1.setBounds(10,10,150,20);
		add(l1);
		l2=new JLabel("Type of Account you want to open:");
		//l2.setBackground(Color.red);
		l2.setBounds(10,60,200,20);
		add(l2);
		l3=new JLabel("Customer type:");
		l3.setBounds(10,110,150,20);
		add(l3);
		l4=new JLabel("(A)Personal Details:");
		l4.setBounds(100,160,200,20);
		add(l4);
		l5=new JLabel("FullName:");
		l5.setBounds(10,210,100,20);
		add(l5);
		l21=new JLabel("Account No.:");
		l21.setBounds(350,110,100,20);
		add(l21);
		t10=new JTextField();
		t10.setBounds(450,110,250,20);
		add(t10);
		t10.setForeground(Color.red);
		t10.setText("BOSmad150102000"+z);
		t10.setEnabled(false);

		t1=new JTextField();
		t1.setBounds(120,210,150,20);
		add(t1);
		l6=new JLabel("Name of Mother:");
		l6.setBounds(10,260,100,10);
		add(l6);
		t2=new JTextField();
		t2.setBounds(120,260,150,20);
		add(t2);
		l7=new JLabel("/Father");
		l7.setBounds(10,270,50,10);
		add(l7);
		l8=new JLabel("Date of Birth:");
		l8.setBounds(10,320,100,20);
		add(l8);
		t3=new JTextField();
		t3.setBounds(120,320,150,20);
		add(t3);
		l9=new JLabel("Sex:");
		l9.setBounds(10,370,50,20);
		add(l9);
		rb5=new JRadioButton("Male");
		rb5.setBounds(120,370,100,20);
		rb6=new JRadioButton("Female");
		rb6.setBounds(220,370,100,20);
		bg3=new ButtonGroup();
		bg3.add(rb5);
		bg3.add(rb6);
		add(rb5);
		add(rb6);
		l10=new JLabel("Marital Status:");
		l10.setBounds(10,420,100,20);
		add(l10);
		rb7=new JRadioButton("Married");
		rb7.setBounds(120,420,100,20);
		rb8=new JRadioButton("Unmarried");
		rb8.setBounds(220,420,100,20);
		bg4=new ButtonGroup();
		bg4.add(rb7);
		bg4.add(rb8);
		add(rb7);
		add(rb8);
		l11=new JLabel("ModeofOperation");
		l11.setBounds(10,470,100,20);
		add(l11);
		rb9=new JRadioButton("Self");
		rb9.setBounds(120,470,70,20);
		rb10=new JRadioButton("Either or Survivor");
		rb10.setBounds(190,470,150,20);
		bg5=new ButtonGroup();
		bg5.add(rb9);
		bg5.add(rb10);
		add(rb9);
		add(rb10);
		l12=new JLabel("Service Acquired");
		l12.setBounds(10,520,100,20);
		add(l12);
		rb11=new JRadioButton("Sms Alert");
		rb11.setBounds(120,520,100,20);
		rb12=new JRadioButton("Internet Banking");
		rb12.setBounds(220,520,150,20);
		rb13=new JRadioButton("Atm Cum Debit Card");
		rb13.setBounds(150,560,200,20);
		bg6=new ButtonGroup();
		bg6.add(rb11);
		bg6.add(rb12);
		add(rb11);
		add(rb12);
		add(rb13);
		l13=new JLabel("(B)Residential Address:");
		l13.setBounds(500,160,200,20);
		add(l13);
		ta=new JTextArea();
		ta.setBounds(450,190,250,150);
		add(ta);
		l14=new JLabel("City:");
		l14.setBounds(400,370,50,20);
		add(l14);
		t4=new JTextField();
		t4.setBounds(460,370,100,20);
		add(t4);
		l15=new JLabel("Email id");
		l15.setBounds(580,370,70,20);
		add(l15);
		t7=new JTextField();
		t7.setBounds(660,370,100,20);
		add(t7);
		
		l16=new JLabel("State");
		l16.setBounds(400,420,50,20);
		add(l16);
		t5=new JTextField();
		t5.setBounds(460,420,100,20);
		add(t5);
		l17=new JLabel("Nationality");
		l17.setBounds(580,420,70,20);
		add(l17);
		t8=new JTextField();
		t8.setBounds(660,420,100,20);
		add(t8);
		l19=new JLabel("Mob No. ");
		l19.setBounds(400,470,50,20);
		add(l19);
		t6=new JTextField();
		t6.setBounds(460,470,100,20);
		add(t6);
		l20=new JLabel("Balance");
		l20.setBounds(580,470,70,20);
		add(l20);
		t9=new JTextField();
		t9.setBounds(660,470,100,20);
		add(t9);

		but=new JButton("Save");
		but.setBounds(400,550,100,40);
		add(but);
		
		rb1=new JRadioButton("Saving Bank Account");
		rb1.setBounds(220,60,150,20);
		rb2=new JRadioButton("Current Account");
		rb2.setBounds(390,60,150,20);
		bg1=new ButtonGroup();
		bg1.add(rb1);
		bg1.add(rb2);
		add(rb1);
		add(rb2);
		rb3=new JRadioButton("Public");
		rb3.setBounds(110,110,100,20);
		rb4=new JRadioButton("Staff");
		rb4.setBounds(210,110,100,20);
		bg2=new ButtonGroup();
		bg2.add(rb3);
		bg2.add(rb4);
		add(rb3);
		add(rb4);




		


		//l1.addActionListener(this);
		but.addActionListener(this);
		
			


	}	
	public void actionPerformed(ActionEvent ae)
	{
		Object ob=ae.getSource();
		if(ob==but){
			try{
				z++;
			String s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s15,s16;
			int s13,s14;
			if(rb3.isSelected())  //cust type
				s1=rb3.getText();
			else
				s1=rb4.getText();
		
			s2=t1.getText();      //name
			s3=t2.getText();      //m_f_name
			s4=t3.getText();      //dob
			if(rb5.isSelected()) //gender
				s5=rb5.getText();
			else
				s5=rb6.getText();
			if(rb7.isSelected())
				s6=rb7.getText();  //maritalstatus
			else
				s6=rb8.getText();
			if(rb9.isSelected())
				s7=rb9.getText(); //mode of operation
			else
				s7=rb10.getText();
			if(rb11.isSelected())  //service req
				s8=rb11.getText(); 
			else if (rb12.isSelected()) 
				s8=rb12.getText();
			else
				s8=rb13.getText();
			s9=t4.getText();       //city
			s10=t7.getText();       //email
			s11=t8.getText();      //nationality
			s12=t5.getText();      //state
			s13=Integer.parseInt(t6.getText());  //mobno
			s14=Integer.parseInt(t9.getText());   //balance
			s15=ta.getText();  //address
			if(rb1.isSelected())
				s16=rb1.getText();      //acctype
			else
				s16=rb2.getText();
			st.execute("insert into newacc(customertype,name,mname_fname,dob,gender,modeofoperate,maritalstatus,servicerequired,city,email,nationality,state,mobno,balance,address,accounttype) values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+s7+"','"+s8+"','"+s9+"','"+s10+"','"+s11+"','"+s12+"',"+s13+","+s14+",'"+s15+"','"+s16+"')");
			JOptionPane.showMessageDialog(null,"saved","BOS",2);
			//rb3.setChecked(false);
			//rb4.setChecked(false);
			//bg2.setSelected(false);
			t1.setText("");
			t2.setText("");
			t3.setText("");
			/*rb5.setEnabled(false);
			rb6.setEnabled(false);
			rb7.setEnabled(false);
			rb8.setEnabled(false);
			rb9.setEnabled(false);
			rb10.setEnabled(false);
			rb11.setEnabled(false);
			rb12.setEnabled(false);
			rb13.setEnabled(false);*/
			t4.setText("");
			t5.setText("");
			t6.setText("");
			t7.setText("");
			t8.setText("");
			t9.setText("");
			//t10.setText("");
			ta.setText("");
			//t.setText("");
			//rb.setEnabled("");
		}
		catch(Exception e){
		JOptionPane.showMessageDialog(null,e,"Bank of Spain",0);
	}
	}
		
			
	}
	public static void main(String z[]){
		
		NewAccountPanel p1=new NewAccountPanel();
		Frame f1=new Frame();
		f1.add(p1);
		f1.setSize(800,600);
		f1.setVisible(true);
	}

	
}