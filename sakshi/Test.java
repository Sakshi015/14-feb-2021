import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Test implements ActionListener
{
	JFrame f;
    JTextArea ta;
    JMenuBar mb;
    JMenu mf,me,mfo,mv,mh;
    JMenuItem mf1,mf2,mf3,mf4,mf5,mf6,mf7,mf8;
    JMenuItem me1,me2,me3,me4,me5,me6,me7,me8,me9,me10,me11,me12,me13;
    JMenuItem mfo1,mfo2;
    JMenuItem mv1,mv2;
    JMenuItem mh1,mh2,mh3;
    JPanel p1;
    Label adlbl1,adlbl2;
    JToolBar tb;
    JButton b1,b2,b3,b4;
    JDesktopPane dp;
    ImageIcon img1,img2;
    JLabel jl1,jl2;
Test(){
	f=new JFrame("Axix Bank");
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	ImageIcon img1=new ImageIcon("mh.jpg");
	f.setIconImage(img1.getImage());
	f.setLayout(null);
	
	mb=new JMenuBar();
	f.setJMenuBar(mb);
	mf=new JMenu("Account");
	mf.setMnemonic(KeyEvent.VK_A); //alt+Alphabet(shortcut)
	mb.add(mf);
	mf1=new JMenuItem("New",new ImageIcon("new.jpg"));
	mf1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,ActionEvent.CTRL_MASK));
	mf.add(mf1);
	//mf2=new JMenuItem("modify");
	mf2=new JMenuItem("Modify",new ImageIcon("edit.png"));
	mf2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M,ActionEvent.CTRL_MASK));
	mf.add(mf2);
	//mf3=new JMenuItem("search");
	mf3=new JMenuItem("Search",new ImageIcon("search.png"));
	mf3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,ActionEvent.CTRL_MASK));
	mf.add(mf3);
	//mf4=new JMenuItem("show all");
	mf4=new JMenuItem("Show All",new ImageIcon("showall.png"));
	mf4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,ActionEvent.CTRL_MASK+ActionEvent.SHIFT_MASK));
	mf.add(mf4);
	me=new JMenu("Loan");
	mb.add(me);
	me.setMnemonic(KeyEvent.VK_L); //alt+Alphabet(shortcut)
	mb.add(me);
	//me1=new JMenuItem("Loan Application");
	me1=new JMenuItem("Loan Application",new ImageIcon("loanapp.png"));
	me1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,ActionEvent.CTRL_MASK));
	me.add(me1);
	//me2=new JMenuItem("Loan Installation");
	me2=new JMenuItem("Loan Installation",new ImageIcon("loaninstall.png"));
	me2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I,ActionEvent.CTRL_MASK));
	me.add(me2);
	//me3=new JMenuItem("Check Loan Status");
	me3=new JMenuItem("Check Loan Status",new ImageIcon("loanstat.png"));
	me3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L,ActionEvent.CTRL_MASK));
	me.add(me3);
	mfo=new JMenu("Transaction");
	mb.add(mfo);
	mfo.setMnemonic(KeyEvent.VK_T); //alt+Alphabet(shortcut)
	mb.add(mfo);
	mv=new JMenu("Extra");
	mb.add(mv);
	mv.setMnemonic(KeyEvent.VK_E); //alt+Alphabet(shortcut)
	mb.add(mv);
	mh=new JMenu("Settings");
	mb.add(mh);
	mh.setMnemonic(KeyEvent.VK_S); //alt+Alphabet(shortcut)
	mb.add(mh);



	
	//adlbl1 =new Label("");
	//adlbl1.setBackground(Color.RED);
	//adlbl1.setBounds(0,10,100,680);
	//f.add(adlbl1);
	img1=new ImageIcon("form_left.png");
	jl1=new JLabel();
	jl1.setIcon(img1);
	jl1.setBounds(0,-30,200,700);
	f.add(jl1);
	img2=new ImageIcon("right.png");
	jl2=new JLabel();
	jl2.setIcon(img2);
	jl2.setBounds(995,0,177,700);
	f.add(jl2);


	




	dp=new JDesktopPane();
	dp.setBounds(195,0,800,700);
	f.add(dp);


	mf1.addActionListener(this);
	mf2.addActionListener(this);
	mf3.addActionListener(this);
	mf4.addActionListener(this);

	f.setSize(1185,700);
	f.setVisible(true);

} 
public void actionPerformed(ActionEvent ae){
	Object ob=ae.getSource();
	if(ob==mf1){

		JInternalFrame jif=new JInternalFrame("new account form",true,true,true,true);
		//dp.setLayout(null);
		jif.setBounds(0,0,800,700);
		jif.setLayout(null); 
		jif.setVisible(true);
		dp.add(jif);


		NewAccountPanel p1=new NewAccountPanel();
		
		p1.setBounds(0,0,800,700);
		jif.add(p1);



		

	}
	if(ob==mf2){

	}
}
public static void main(String[]z){
	Test A=new Test();
	}
}
