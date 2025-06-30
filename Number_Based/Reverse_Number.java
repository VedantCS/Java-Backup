package Number_Based;
public class  Reverse_Number  { 

	static int reverse(int n) 
	{ 

		int rev = 0; 
			int rem; 

		while (n > 0) { 
			rem = n % 10; 
			rev = (rev * 10) + rem; 
			n = n / 10; 
		} 

		return rev; 
	} 

	// Driver Function 
	public static void main(String[] args) 
	{ 
		int n = 4526; 

		System.out.print("Reversed Number is "
						+ reverse(n)); 
	} 
}
