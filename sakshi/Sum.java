//pass a no from cmd line and display sum of smallest no. including the no. itself(without loop)
class Sum1{
public static void main(String[]z){
	int a,sum;
	a=Integer.parseInt(z[0]);
	sum=a*(a+1)/2;
	System.out.println(sum);
}

}