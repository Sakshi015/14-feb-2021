import java.io.*;
class Ques8{
	public static void main(String[]z) throws IOException{
	InputStreamReader a=new InputStreamReader(System.in);
	BufferedReader b=new BufferedReader(a);
	int x;
	//s=0;
	System.out.print("enter a no.= ");
	x=Integer.parseInt(b.readLine());
     for(int i=1;i<=10;i++)
     {

     	System.out.println(x*i);
     }
  		//System.out.println("sum is="+s);
	}
}