package Number_Based;
public class Fibonacci{
public static void main(String[] args) {
int n=10;
int a=0,b=1,i=0,nextTerm=0;
while(i<n)
{System.out.print(a+" ");
nextTerm=a+b;
a=b;
b=nextTerm;
i++;}}
}
/* ------------------FIBONACCI RECURSION--------------
 * 			import java.util.Scanner;

public class FibonacciRecursion {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n; 
        }
        return fibonacci(n - 1) + fibonacci(n - 2); // Recursive case
    }

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        System.out.println("Fibonacci Series up to " + n + " terms:");

        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        // Close the scanner object
        scanner.close();
    }
}
 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

