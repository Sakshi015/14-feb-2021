class Div7{
	public static void main(String z[]){
	int x,u,l;
	x=Integer.parseInt(z[0]);
	u=x;
	l=x;
	while(l%7!=0)
	l--;
	while(u%7!=0)
	u++;
	System.out.println("next no"+u);
	System.out.println("prev no"+l);
	}
}