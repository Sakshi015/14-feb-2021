import java.io.*;
class Ques6{
	public static void main(String []z) throws IOException{
	InputStreamReader a=new InputStreamReader(System.in);
	BufferedReader b=new BufferedReader(a);
	int x,count;
	count=0;
    System.out.print("Enter no.= ");
    x=Integer.parseInt(b.readLine());
    if(x>1){
    	for(int i=1;i<=x;i++){
             if(x%i==0)
             count++;
    	}
    	if(count>2)
    		System.out.println("not prime");
    	else
    		System.out.println("prime");
    	}
    	else
    	System.out.println("not applicable ");
	}

}