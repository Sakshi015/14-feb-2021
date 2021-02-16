//pass two arg and display before swap and after swapusing //third variable
class Swap{
	public static void main(String[]z)
	{
	int a,b,c;
	c=0;
	a=Integer.parseInt(z[0]);
	b=Integer.parseInt(z[1]);
	System.out.println("a="+a+"b="+b);
	c=a;
	a=b;
	b=c;
	System.out.println("a="+a+"b="+b);
	}
}