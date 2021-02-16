import java.awt.*;
import java.awt.event.*;
class Notepad   // implements ActionListener
{
Frame f;
TextArea ta;
MenuBar mb;
Menu mf,me,mfo,mv,mh;
MenuItem mf1,mf2,mf3,mf4,mf5,mf6,mf7,mf8;
MenuItem me1,me2,me3,me4,me5,me6,me7,me8,me9,me10,me11,me12,me13;
MenuItem mfo1,mfo2;
MenuItem mv1,mv2;
MenuItem mh1,mh2,mh3;
Panel p1;
Label l1,l2,l3;
Notepad() {
	f=new Frame("Untitled-Notepad");
	//f.setLayout(null);
	mb=new MenuBar();
	f.setMenuBar(mb);
	mf=new Menu("File");
	//`mf.setMnemonic(((int)'F')); //alt+Alphabet(shortcut)
	mb.add(mf);
	mf1=new MenuItem("New");
	mf.add(mf1);
	mf2=new MenuItem("New Window");
	mf.add(mf2);
	mf3=new MenuItem("Open");
	mf.add(mf3);
	mf4=new MenuItem("Save");
	mf.add(mf4);
	mf5=new MenuItem("Save As");
	mf.add(mf5);
	mf.addSeparator();
	mf6=new MenuItem("Page Setup");
	mf.add(mf6);
	mf7=new MenuItem("Print");
	mf.add(mf7);
	mf.addSeparator();
	mf8=new MenuItem("Exit");
	mf.add(mf8);
	me=new Menu("Edit");
	mb.add(me);
	me1=new MenuItem("Undo");
	me.add(me1);
	me.addSeparator();
	me2=new MenuItem("Cut");
	me.add(me2);
	me3=new MenuItem("Copy");
	me.add(me3);
	me4=new MenuItem("Paste");
	me.add(me4);
	me5=new MenuItem("Delete");
	me.add(me5);
	me.addSeparator();
	me6=new MenuItem("Search with bing");
	me.add(me6);
	me7=new MenuItem("Find next");
	me.add(me7);
	me8=new MenuItem("Find previous");
	me.add(me8);
	me9=new MenuItem("Find");
	me.add(me9);
	me10=new MenuItem("Replace");
	me.add(me10);
	me11=new MenuItem("Go to");
	me.add(me11);
	me.addSeparator();
	me12=new MenuItem("Select All");
	me.add(me12);
	me13=new MenuItem("Time/Date");
	me.add(me13);
	mfo=new Menu("Format");
	mb.add(mfo);
	mfo1=new MenuItem("Word Wrap");
	mfo.add(mfo1);
	mfo2=new MenuItem("Font..");
	mfo.add(mfo2);	
	mv=new Menu("View");
	mb.add(mv);
	mv1=new MenuItem("Zoom");
	mv.add(mv1);
	mv2=new MenuItem("Status Bar");
	mv.add(mv2);
	mh=new Menu("Help");
	mb.add(mh);
	mh1=new MenuItem("View help");
	mh.add(mh1);
	mh2=new MenuItem("Send Feedback ");
	mh.add(mh2);
	mh.addSeparator();
	mh3=new MenuItem("About Notepad");
	mh.add(mh3);

	ta=new TextArea();
	f.add(ta);
	p1=new Panel();
	f.add(p1,BorderLayout.SOUTH);
	p1.setLayout(null);
	l1=new Label("100%");
	l1.setBounds(450,580,50,20);
	p1.add(l1);
	//l2=new Label("Windows CRLF");


	f.setSize(800,600);
	f.setVisible(true); //Drawback is we cant change imageicon of title,it doesnt have close operation so refer Notepad1 

}
	public static void main(String[]z){
	Notepad A=new Notepad();
	}
}