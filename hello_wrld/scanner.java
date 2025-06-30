package hello_wrld;
import java.util.Scanner;
public class scanner {
	public static void main(String[] args) {
		int age;
		String Height;
		double weight;
		Scanner input= new Scanner(System.in);
		System.out.print("Give your age: ");
		age=input.nextInt();
		System.out.print("Give your weight: ");
		weight=input.nextDouble();
		System.out.print("give HEIGHT ");
		Height=input.next()	;
		System.out.println("GOT IT!! You are "+age+" years old and you are "+weight+"kgs fat and you are "+Height+"cms tall");
		input.close();
	}
}
/*  
  (here input)	scan.nextLine(); // reads in the next token as an String like ved ant (this reads "ved ant" nahi toh sirf ved read hota)
  	scan.hasNextInt(); //returns true if there is another int to read in
	scan.hasNextFloat(); //returns true if there is another float to read in
	scan.hasNextDouble(); //returns true if there is another double to read in
	scan.hasNextLine(); //returns true if there is another String to read in
*/