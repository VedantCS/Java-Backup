package Number_Based;

import java.util.Scanner;

//A perfect number is a positive integer that is equal to the sum of its proper divisors, or divisors excluding the number itself.
//For example, 6 is a perfect number because 1 + 2 + 3 = 6. similarly 28=1+2+4+7+14 

public class perfect_number {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int num=s.nextInt();
	int sum=0;
	for(int i=1;i*i<=num;i++)
	{ if(num%i==0) sum+=i;
		
	}
if(sum==num) System.out.println("Perfect Number");
else System.out.println("Not Perfect");
s.close();
}
}
