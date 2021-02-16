import java.io.*;
class Ques7{
	public static void main(String[]z) throws IOException{
	InputStreamReader a=new InputStreamReader(System.in);
	BufferedReader b=new BufferedReader(a);
	int x,r,s;
	s=0;
	System.out.print("enter a no.= ");
	x=Integer.parseInt(b.readLine());
     while(x!=0){
     r=x%10;
     s=s+r;
     x=x/10;
     }
  		System.out.println("sum is="+s);
	}
}