package hello_wrld;
import java.util.InputMismatchException;
import java.util.Scanner;
public class practise {

public static void main(String[] args) {System.out.println("give name");Scanner sc=new Scanner(System.in);String name=sc.nextLine();int gap=name.indexOf(' ');if(name.indexOf(' ')==-1)//to ensure names are like: John Doe, Bryan johnasson etc not like Vedant,ryan,Lebron etc..{System.out.println("Not a  valid name");}else if(name.indexOf(' ')>0){String fname=name.substring(0,gap);String surname=name.substring(gap+1);System.out.println("First name: "+fname+"\nLast Name is: "+surname);System.out.println("Give char Index");try{	int index=sc.nextInt();	System.out.println("Char At Index "+index+" is "+name.charAt(index));}catch(StringIndexOutOfBoundsException E) {System.out.println("The error is: "+E.getMessage());//E.printStackTrace() cant be used  because:
//The method printStackTrace() doesn't return a value; instead, it prints the stack trace
//Because it doesn't return a string, you can't concatenate its output directly with +}catch(InputMismatchException E) {	System.out.println("The error is: "+E.getMessage());}finally{	System.out.println("Exit... ");}
	sc.close();	
}
	}
		}
