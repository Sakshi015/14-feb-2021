import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Notepad1 implements ActionListener
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
JLabel l1,l2,l3;
JToolBar tb;
JButton b1,b2,b3,b4;
Notepad1(){
	f=new JFrame("Untitled-Notepad");
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	ImageIcon img1=new ImageIcon("Notepad.png");
	f.setIconImage(img1.getImage());
	mb=new JMenuBar();
	f.setJMenuBar(mb);
	mf=new JMenu("File");
	mf.setMnemonic(KeyEvent.VK_F); //alt+Alphabet(shortcut)
	mb.add(mf);
	mf1=new JMenuItem("New",new ImageIcon("circle.png"));
	mf1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,ActionEvent.CTRL_MASK));
	mf.add(mf1);
	mf2=new JMenuItem("New Window",new ImageIcon("circle.png"));
	mf.add(mf2);
	mf3=new JMenuItem("Open",new ImageIcon("circle.png"));
	mf.add(mf3);
	mf4=new JMenuItem("Save",new ImageIcon("circle.png"));
	mf.add(mf4);
	mf5=new JMenuItem("Save As",new ImageIcon("circle.png"));
	mf.add(mf5);
	mf.addSeparator();
	mf6=new JMenuItem("Page Setup",new ImageIcon("circle.png"));
	mf.add(mf6);
	mf7=new JMenuItem("Print",new ImageIcon("circle.png"));
	mf.add(mf7);
	mf.addSeparator();
	mf8=new JMenuItem("Exit",new ImageIcon("circle.png"));
	mf.add(mf8);
	me=new JMenu("Edit");
	me.setMnemonic(KeyEvent.VK_E);
	mb.add(me);

	me1=new JMenuItem("Undo",new ImageIcon("circle.png"));
	me.add(me1);
	me.addSeparator();
	me2=new JMenuItem("Cut",new ImageIcon("circle.png"));
	me.add(me2);
	me3=new JMenuItem("Copy",new ImageIcon("circle.png"));
	me.add(me3);
	me4=new JMenuItem("Paste",new ImageIcon("circle.png"));
	me.add(me4);
	me5=new JMenuItem("Delete",new ImageIcon("circle.png"));
	me.add(me5);
	me.addSeparator();
	me6=new JMenuItem("Search with bing",new ImageIcon("circle.png"));
	me.add(me6);
	me7=new JMenuItem("Find next",new ImageIcon("circle.png"));
	me.add(me7);
	me8=new JMenuItem("Find previous",new ImageIcon("circle.png"));
	me.add(me8);
	me9=new JMenuItem("Find",new ImageIcon("circle.png"));
	me.add(me9);
	me10=new JMenuItem("Replace",new ImageIcon("circle.png"));
	me.add(me10);
	me11=new JMenuItem("Go to",new ImageIcon("circle.png"));
	me.add(me11);
	me.addSeparator();
	me12=new JMenuItem("Select All",new ImageIcon("circle.png"));
	me.add(me12);
	me13=new JMenuItem("Time/Date",new ImageIcon("circle.png"));
	me.add(me13);
	mfo=new JMenu("Format");
	mfo.setMnemonic(KeyEvent.VK_O);
	mb.add(mfo);
	mfo1=new JMenuItem("Word Wrap",new ImageIcon("circle.png"));
	mfo.add(mfo1);
	mfo2=new JMenuItem("Font..",new ImageIcon("circle.png"));
	mfo.add(mfo2);	
	mv=new JMenu("View");
	mv.setMnemonic(KeyEvent.VK_V);

	mb.add(mv);
	mv1=new JMenuItem("Zoom",new ImageIcon("circle.png"));
	mv.add(mv1);
	mv2=new JMenuItem("Status Bar",new ImageIcon("circle.png"));
	mv.add(mv2);
	mh=new JMenu("Help");
	mh.setMnemonic(KeyEvent.VK_H);
	mb.add(mh);
	mh1=new JMenuItem("View help",new ImageIcon("circle.png"));
	mh.add(mh1);
	mh2=new JMenuItem("Send Feedback ",new ImageIcon("circle.png"));
	mh.add(mh2);
	mh.addSeparator();
	mh3=new JMenuItem("About Notepad",new ImageIcon("circle.png"));
	mh.add(mh3);
	tb=new JToolBar();
	b1=new JButton("",new ImageIcon("download.png"));
	b1.setToolTipText("Settings");
	tb.add(b1);
	f.add(tb);
	f.setSize(800,600);
	f.setVisible(true);

}
public void actionPerformed(ActionEvent ae){
	Object ob=ae.getSource();
	if(ob==mf1){
		f.setBackground(Color.RED);
	}
} 
public static void main(String[]z){
	Notepad1 A=new Notepad1();
	}
}
