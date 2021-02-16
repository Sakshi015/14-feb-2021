import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
class Awt20 implements ActionListener
{	Connection con;
	Statement st;
	ResultSet rs;
	Frame f;
	int s;
	Label l1,l2,l3,l4;
	TextField t1,t2,t3,t4;
	Button b1,b2,b3,b4,b5,b6,b7;
	String d[][]=new String[20][5];
	String h[]={"Employee id","Employee Name","Employee Desig","Employee Department","Employee Salary"};
{
	try{
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Emulation","root","");
		st=con.createStatement();
		JOptionPane.showMessageDialog(null,"Connected","Emulation",0);

	}
	catch(Exception e){
		JOptionPane.showMessageDialog(null,e,"Emulation",0);
	}
}
	//ImageIcon img1,img2;
	//JLabel jl1,jl2;

	Awt20(){
	f=new Frame("this is my first application");
	f.setTitle("Application of DBMS");
	//f.setBackground(Color.red);
	Color c=new Color(255,0,0);
	f.setBackground(c);
	
	f.setLayout(null); 
	//d=new String[20][5];
	// h={"Employee id","Employee Name","Employee Desig","Employee Department","Employee Salary"};
	l1=new Label("Employee name");
	l1.setForeground(Color.white);
	l1.setBounds(10,50,200,20);
	f.add(l1);
	t1=new TextField();
	t1.setBounds(250,50,200,20);
	f.add(t1);
	b1=new Button("Add");
	b1.setBounds(680,50,100,20);
	f.add(b1);

	l2=new Label("Employee Desig");
	l2.setForeground(Color.white);
	l2.setBounds(10,90,200,20);
	f.add(l2);
	t2=new TextField();
	t2.setBounds(250,90,200,20);
	f.add(t2);
	b2=new Button("clear");
	b2.setBounds(680,90,100,20);
	f.add(b2);
	l3=new Label("Employee Depart");
	l3.setForeground(Color.white);
	l3.setBounds(10,130,200,20);
	f.add(l3);
	t3=new TextField();
	t3.setBounds(250,130,200,20);
	f.add(t3);
	b3=new Button("end");
	b3.setBounds(680,130,100,20);
	f.add(b3);
	l4=new Label("Employee Sal");
	l4.setForeground(Color.white);
	l4.setBounds(10,170,200,20);
	f.add(l4);
	t4=new TextField();
	t4.setBounds(250,170,200,20);
	f.add(t4);
	b4=new Button("show all");
	b4.setBounds(680,170,100,20);
	f.add(b4);
	b5=new Button("Search");
	b5.setBounds(680,210,100,20);
	f.add(b5);
	b6=new Button("find/delete");
	b6.setBounds(680,250,100,20);
	f.add(b6);
	b7=new Button("find/update");
	b7.setBounds(680,290,100,20);
	f.add(b7);
	t1.setEnabled(false);
	t2.setEnabled(false);
	t3.setEnabled(false);
	t4.setEnabled(false);

	 b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(this);
    b5.addActionListener(this);
    b6.addActionListener(this);
    b7.addActionListener(this);

	f.setBounds(150,100,800,600);
    //f.setSize(800,600);
	f.setVisible(true);
	}
	public  void actionPerformed(ActionEvent ae){
		Object ob=ae.getSource();
		if(ob==b1){
			if(b1.getLabel().equals("Add")){
				t1.setEnabled(true);
				t2.setEnabled(true);
				t3.setEnabled(true);
				t4.setEnabled(true);
				t1.requestFocus();
				b1.setLabel("Save");
			}
			else{
				try{
					String a1,a2,a3;
					int a4;
					a1=t1.getText();
					a2=t2.getText();
					a3=t3.getText();
					a4=Integer.parseInt(t4.getText());
					st.execute("insert into employee(ename,edesig,edepart,esal)values('"+a1+"','"+a2+"','"+a3+"','"+a4+"')");
					JOptionPane.showMessageDialog(null,"Saved","Emulation",0);
					t1.setText("");
					t2.setText("");
					t3.setText("");
					t4.setText("");
					t1.setEnabled(false);
					t2.setEnabled(false);
					t3.setEnabled(false);
					t4.setEnabled(false);
					b1.setLabel("Add");

				}
				catch(Exception e){
					JOptionPane.showMessageDialog(null,e,"Emulation",0);
				}
			}

		}
		if(ob==b2)
		{
			t1.setText("");
			t2.setText("");
			t3.setText("");
			t4.setText("");
		}
		if(ob==b3){
			JOptionPane.showMessageDialog(null,"ThankYou","Emulation",0);
			System.exit(0);

		}
		if(ob==b4){
		try{
			rs=st.executeQuery("select * from employee");
			int R=0;
			while(rs.next()){
				//int R=0;
				d[R][0]=rs.getString("eid");
				d[R][1]=rs.getString("ename");
				d[R][2]=rs.getString("edesig");
				d[R][3]=rs.getString("edepart");
				d[R][4]=rs.getString("esal");
				R++;

			}
			JTable tb=new JTable(d,h);
			JScrollPane sp=new JScrollPane(tb);
			sp.setBounds(10,210,660,370);
			f.add(sp);
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null,e,"",0);
		}
			
		}
			if(ob==b5){
				try{
					int s=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter employ id to be searched","",0));
					rs=st.executeQuery("select * from employee");
					boolean flag=false;
					while(rs.next()){
						if(rs.getString("eid").equals(""+s)){
							String z="Record found";
							z=z+"\n Name is "+rs.getString("ename");
							z=z+"\n desig is "+rs.getString("edesig");
							z=z+"\n dpart is "+rs.getString("edepart");
							z=z+"\n salary is "+rs.getString("esal");
							JOptionPane.showMessageDialog(null,z,"",1);
							flag=true;
							break;
						}
					}
					if(flag==false){
						JOptionPane.showMessageDialog(null,"Not Found","",0);
					}
				}
				catch(Exception e){
			JOptionPane.showMessageDialog(null,e,"",0);
		}
			
		}
		if(ob==b6){
			try{
				int s=Integer.parseInt(JOptionPane.showInputDialog(null,"enter eid ","",0));
				rs=st.executeQuery("select * from employee where eid="+s+"");
				if(rs.next()){
					String z="Record found";
					z=z+"\n Name is "+rs.getString("ename");
					z=z+"\n desig is "+rs.getString("edesig");
					z=z+"\n dpart is "+rs.getString("edepart");
					z=z+"\n salary is "+rs.getString("esal");
					int yy=JOptionPane.showConfirmDialog(null,z+"\n Do you want to delete","",2);
					if(yy==0){
						st.executeUpdate("delete from employee where eid= "+s+"");
						JOptionPane.showMessageDialog(null,"deleted","",0);
					}

				}
				else{
					JOptionPane.showMessageDialog(null,"Record not found","",0);
				}
			}
			catch(Exception e){
			JOptionPane.showMessageDialog(null,e,"",0);
		}

		}
		if(ob==b7){
			if(b7.getLabel().equals("find/update")){
				try{
					s=Integer.parseInt(JOptionPane.showInputDialog(null,"enter eid u want to search","",0));
					rs=st.executeQuery("select * from employee where eid="+s+"");
					if(rs.next()){
						t1.setText(rs.getString("ename"));
						t2.setText(rs.getString("edesig"));
						t3.setText(rs.getString("edepart"));
						t4.setText(rs.getString("esal"));
						t1.setEnabled(true);
						t2.setEnabled(true);
						t3.setEnabled(true);
						t4.setEnabled(true);
						b7.setLabel("update");
						JOptionPane.showMessageDialog(null,"Record found\n if u wants to update then made changes in TextField and click update","",0);

					}
					else{
						JOptionPane.showMessageDialog(null,"Not Found","",0);
					}
				}
			    catch(Exception e){
					JOptionPane.showMessageDialog(null,e,"",0);
				}
			}
			else{
				try{
					st.executeUpdate("update employee set ename='"+t1.getText()+"',edesig='"+t2.getText()+"', edepart='"+t3.getText()+"',esal="+Integer.parseInt(t4.getText())+" where eid="+s+"" );
					JOptionPane.showMessageDialog(null,"Updated","",0);
					t1.setText("");
					t2.setText("");
					t3.setText("");
					t4.setText("");
					t1.setEnabled(false);
					t2.setEnabled(false);
					t3.setEnabled(false);
					t4.setEnabled(false);
					b7.setLabel("find/update");
				}
				 catch(Exception e){
					JOptionPane.showMessageDialog(null,e,"",0);
				}

			}

		}
	}
	public static void main(String[]z){
	Awt20 A=new Awt20();
	}
	


}