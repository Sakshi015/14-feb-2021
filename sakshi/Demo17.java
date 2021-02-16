import java.io.*;
class Demo17{
	public static void main(String[]z) throws IOException{
		DataInputStream a=new DataInputStream(System.in);
		int x,y,s;
		System.out.print("Enter first No= ");
		x=Integer.parseInt(a.readLine());
		System.out.print("Enter second No= ");
		y=Integer.parseInt(a.readLine());
		s=x+y;
		System.out.println("sum is= "+s);

	}
}