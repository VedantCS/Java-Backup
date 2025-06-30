package Number_Based;
public class HCF_LCM {
	
	public static void main(String[] args)
	    {
	        //LCM
	        int a = 15, b = 25;

	        int ans = (a > b) ? a : b;
	        while (true) {
	            if (ans % a == 0 && ans % b == 0)break;
	            ans++;
	        } 
	        System.out.println("LCM of " + a + " and " + b+ " : " + ans);
	    }
	}


/*______________________HCF_______________
	int a, b, i, hcf = 0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter first number :: ");
	a = sc.nextInt();
	System.out.println("Enter second number :: ");
	b = sc.nextInt();
	
	for(i = 1; i <= a || i <= b; i++) {
	   if( a%i == 0 && b%i == 0 )
	   hcf = i;
	}
	System.out.println("HCF of given two numbers is ::"+hcf);
*/