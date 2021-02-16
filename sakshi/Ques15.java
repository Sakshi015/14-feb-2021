import java.io.*;
class Ques15{
	public static void main(String[]z) throws IOException{
	InputStreamReader a=new InputStreamReader(System.in);
	BufferedReader b=new BufferedReader(a);
		int x[]=new int[5];
		int y[]=new int[5];
		int arr[]=new int[10];
		int l=0,m=4,n=4;
		System.out.println("input first array");
		for(int i=0;i<5;i++){
			//System.out.println("enter no.");
			x[i]=Integer.parseInt(b.readLine());
		}
		System.out.println("input second array");
		for(int i=0;i<5;i++){
			//System.out.println("enter no.");
			y[i]=Integer.parseInt(b.readLine());
		}
		for(int i=0;i<10;i++)
		{
			if(i%2==0)
			{
				arr[l]=x[m];
				l++;
				m--;
			}
			else
			{
				arr[l]=y[n];
				l++;
				n--;
			}
		}
		System.out.println("final array");
		for(int i=0;i<10;i++)
		{
			System.out.println(arr[i]);
		}

	}
}