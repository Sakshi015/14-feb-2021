import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
 class Login implements ActionListener
{
	Connection con;
	Statement st;
	ResultSet rs;
	JFrame f;
   ImageIcon img1,img2;
   JLabel jl1,jl2;
   JPanel p1;
   JLabel l1,l2,l3;
   JTextField t1;
   JPasswordField t2;
   JButton b1,b2,b3,b4;
   String d[][]=new String[20][3];
	String h[]={"userid","username","password"};
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
Login(){
	f=new JFrame("Login Page");
	ImageIcon img1=new ImageIcon("mh.jpg");
	f.setIconImage(img1.getImage());
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setLayout(null);
	Color c1=new Color(255,200,20);
	Container  cp=f.getContentPane();
	cp.setBackground(Color.WHITE);

	//jl1=new JLabel();
    img1=new ImageIcon("logoo.jpg");
	jl1=new JLabel();
	jl1.setIcon(img1);
	jl1.setBounds(10,0,150,83);
	//f.add(jl1);
	img2=new ImageIcon("LOGIN_UI (1).png");
	jl2=new JLabel();
	jl2.setIcon(img2);
	jl2.setBounds(0,0,486,595);
	f.add(jl2);
	l1=new JLabel("Username");
	l1.setBounds(500,250,100,20);
	f.add(l1);
	t1=new JTextField();
	t1.setBounds(620,250,100,20);
	f.add(t1);
	l2=new JLabel("Password");
	l2.setBounds(500,290,100,20);
	f.add(l2);
	t2=new JPasswordField();
	t2.setBounds(620,290,100,20);
	f.add(t2);

	b1=new JButton("Login");
	b1.setBounds(520,330,100,40);
	b1.setBackground(c1);
	f.add(b1);

	b2=new JButton("Clear");
	b2.setBounds(620,330,100,40);
	b2.setBackground(c1);
	f.add(b2);

	b1.addActionListener(this);
    b2.addActionListener(this);

	f.setSize(800,600);
	f.setVisible(true);

}
public  void actionPerformed(ActionEvent ae){
		Object ob=ae.getSource();
		if(ob==b2){
			t1.setText("");
			t2.setText("");
		}
		if(ob==b1){
			try{
			rs=st.executeQuery("select * from userid");

			boolean flag=false;
			while(rs.next()){
				if(rs.getString("Username").equals(t1.getText()) && rs.getString("Password").equals(t2.getText())){
					JOptionPane.showMessageDialog(null,"Welcome user ","Account",1);
					Test B=new Test();
					flag=true;
				}
				

			}
			if(flag==false)
			{
					JOptionPane.showMessageDialog(null,"Acccount not Found","Account",0);	
				
			}
			}
			catch(Exception e){
		       JOptionPane.showMessageDialog(null,e,"Bank of Spain",0);
			}
		}
		
}

public static void main(String[]z){
	Login A=new Login();
	}
}