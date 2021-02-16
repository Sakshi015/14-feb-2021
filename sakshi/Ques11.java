import java.io.*;
class Ques11{
	public static void main(String[]z) throws IOException{
	InputStreamReader a=new InputStreamReader(System.in);
	BufferedReader b=new BufferedReader(a);
		int x[]=new int[5];
		for(int i=0;i<5;i++){
			System.out.println("enter no.");
			x[i]=Integer.parseInt(b.readLine());
		}
		for(int i=4;i>=0;i--)
		{
			System.out.println(x[i]);
		}
	}
}