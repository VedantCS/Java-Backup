                                                                    package Number_Based;
import java.util.Scanner;
public class Prime {
public static void main(String[] args) {
	
 
Scanner s=new Scanner(System.in);
int a =s.nextInt();int count=0;
if(a==0||a==1) System.out.println("NOT PRIME");
for(int i=2;i*i<=a;i++)
{	if(a%i==0) count++; 
	
}
if(count>0) System.out.println("Not Prime");
else System.out.println("Prime");
s.close();} 
}
/*----------PRIME BETWEEN RANGE-----------------
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
 */
		
