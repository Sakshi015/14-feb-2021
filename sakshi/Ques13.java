import java.io.*;
class Ques13{
	public static void main(String[]z) throws IOException{
	InputStreamReader a=new InputStreamReader(System.in);
	BufferedReader b=new BufferedReader(a);
		int x[]=new int[5];
		int y[]=new int[5];
		int arr[]=new int[10];
		int l=0;
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
		for(int i=4;i>=0;i--){
			arr[l]=x[i];
			l++;
		}
		for(int i=4;i>=0;i--){
			arr[l]=y[i];
			l++;
		}
		System.out.println("final array");
		for(int i=0;i<10;i++)
		{
			System.out.println(arr[i]);
		}

	}
}