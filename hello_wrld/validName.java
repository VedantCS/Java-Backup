package hello_wrld;

import java.util.Scanner;
public class validName
{
	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   boolean validname=false; String name=""; 
		System.out.println("Hello World");
		while(!validname)
		{   System.out.println("Enter valid name:");
		     name=sc.nextLine();
		     if(name.indexOf(' ')==-1)//if ' ' does not exists then it returns -1
		     {
		         validname=false;
		         System.out.println("Please Enter a Valid Full Name");
		     }
		     else validname=true;
		}	 name=name.toLowerCase();
		String first_name="",last_name="";
		int space=name.indexOf(' ');
		System.out.println("Space is at "+space+" position");
		first_name=name.substring(0,space);
        last_name=name.substring(space+1,name.length());	//or ye bhi use kr skte: last_name = name.substring(space + 1)
	    System.out.println("First name is:"+first_name+"\nlast name is:"+last_name);
	    System.out.println("length of name is:"+name.length());
	    System.out.println("Now Formatting the writing style of name....\n");
	   
	    first_name = first_name.substring(0, 1).toUpperCase() + first_name.substring(1); 
	   // .substring(1)->get the characters including position 1 to the end
	    last_name = last_name.substring(0, 1).	toUpperCase() + last_name.substring(1);
        System.out.println("*Your modified first name:" + first_name);
		System.out.println("*Your modified last name:" + last_name);
		if(first_name.equals(last_name)) System.out.println("Your first name and last name is the same!");
		
		/****************** Find how many vowels are in the name *******************/	
		char[] vowels=new char[5];int vowelscount=0;String highlightedName = name;
		vowels[0]='a';
		vowels[1]='e';
		vowels[2] = 'i';
		vowels[3] = 'o';
		vowels[4] = 'u';
		char vowelsCaps[] = {'A', 'E', 'I', 'O', 'U'};
		for(int i=0;i<name.length();i++)
		{	for(int j=0;j<vowels.length;j++) 
		{
			if(name.charAt(i)==vowels[j]) {
				++vowelscount;
				highlightedName = highlightedName.replace(vowels[j], vowelsCaps[j]);//replace() method
			}
		}
	
}
		System.out.println("* Your name has " + vowelscount + " vowels (" + highlightedName + ").");
		
	
	sc.close();}
}