class Sum2{
	public static void main(String []z){
		int x,y,s0,s1,n0,n1;
		x=Integer.parseInt(z[0]);
		
		if(x%2==0)
		{	
			n0=x/2;
			s0= n0*(x+2)/2;
			n1=x/2;
			s1=n1*x/2;
			
			System.out.println("even sum= "+s0);
			System.out.println("odd sum= "+s1);
		}
		else
		{
			n0=(x-1)/2;
			s0= (1+x)*n0/2;
			n1=(x+1)/2;
			s1=n1*(1+x)/2;
			
			System.out.println("even sum= "+s0);
			System.out.println("odd sum= "+s1);
		}
	}
}