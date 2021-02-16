import java.io.*;
class Demo16{
	public static void main(String[]z) throws IOException{
	InputStreamReader a=new InputStreamReader(System.in);
	BufferedReader b=new BufferedReader(a);
	int x,y,s;
	System.out.print("Enter first No.= ");
	x=Integer.parseInt(b.readLine());
	System.out.print("Enter second No.= ");
	y=Integer.parseInt(b.readLine());
	s=x+y;
	System.out.println("Sum is= "+s);
	}
}