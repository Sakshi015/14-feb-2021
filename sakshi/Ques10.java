import java.io.*;
class Ques10{
	public static void main(String[]z) throws IOException{
	InputStreamReader a=new InputStreamReader(System.in);
	BufferedReader b=new BufferedReader(a);
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);

			}
			System.out.print("\n");
		}
	}
}