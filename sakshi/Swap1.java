//pass two no. from cmd line and display b4 swap and after swap withot using 3rd var
//pass a no from cmd line and display sum of smallest no. including the no. itself(without loop)
//pass a no. from cmd line and display sum of smallest odd no. and sum of smallest even no. without using loop
//ex=n=5 odd sum=9;
//even=6;
//pass a no. from cmd line and display next highest and prev lowest which is divisble by 7
//ex- x=24 output highest 28 and lowest 21
class Swap1{
	public static void main(String []z){
	int a,b;
	a=Integer.parseInt(z[0]);
	b=Integer.parseInt(z[1]);
	System.out.println("B4 swap a="+a+"b= "+b);
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("after  swap a="+a+"b= "+b);
	}
	}