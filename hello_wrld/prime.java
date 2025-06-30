package hello_wrld;

class prime{

public static void main(String args[])
/*{	int count=0;
	int a=11;
	int b=12;
	for(int i=2;i<=Math.sqrt(b);i++)
	{
		if( b%i==0){
		count++;}}

	if(count!=0) System.out.println("not prime");
	else System.out.println("prime");
}
}*/
{ int n=100;
	for(int i=2;i<=n;i++)
	{	boolean prime=true;
		for(int j=2;j*j<=i;j++)
		{ if(i%j==0) {prime=false; break;}}
			if(prime)
			{
				System.out.println(i);
			}
		}
	}
	
}
