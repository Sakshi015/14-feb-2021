import java.io.*;
class Ques9{
	public static void main(String []z) throws IOException{
	InputStreamReader a=new InputStreamReader(System.in);
	BufferedReader b=new BufferedReader(a);
	int x,y,count;
	count=0;
    System.out.print("Enter starting no.= ");
    x=Integer.parseInt(b.readLine());
    System.out.print("Enter ending no.= ");
    y=Integer.parseInt(b.readLine());
    for(int i=x;i<=y;i++)
    {
        count=0;
        for(int j=1;j<=i;j++)
        {
            if(i%j==0)
           count++;
        }
        if(count==2)
        System.out.println(i);
        
    }

	}

}