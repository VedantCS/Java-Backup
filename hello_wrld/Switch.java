package hello_wrld;

public class Switch {
	public static void main(String[] args) {
		
	
	//String a="Comp Sci";
	String b="IT";
	//String c="CSBS";
	int year=3;
	String str=b;
	System.out.println(str.equalsIgnoreCase(b));
	switch(year)
	{	case 1:
		switch(str)
	{
		case "Comp Sci":
		{ 
			System.out.println("C lang, "+"Software lifecycle"); break;
		}
		case "IT" :
		{
			System.out.println("C++, "+"STQA");break;
		}
		case "CSBS":
		{
			System.out.println("Business values, "+"Intro to comp sci");break;
		}
	} break;
	case 2:
		switch(str)
	{
		case "Comp Sci":
		{ 
			System.out.println("Java lang, "+"Computer Architechture");break;
		}
		case "IT" :
		{
			System.out.println("Python, "+"Machine learning");break;
		}
		case "CSBS":
		{
			System.out.println("Business analysis, "+"Intro to java");break;
		}
	}
		break;

	case 3:
		switch(str)
	{
		case "Comp Sci":
		{ 
			System.out.println("Advance cpp, "+"System Design");break;
		}
		case "IT" :
		{
			System.out.println("dancing, "+"singing");break;
		}
		case "CSBS":
		{
			System.out.println("Football, "+"Marketing");break;
		}
}break;
	case 4:
		switch(str)
	{
		case "Comp Sci":
		{ 
			System.out.println("Aptitude, " +"Leetcode grind");break;
		}
		case "IT" :
		{
			System.out.println("MWA, " +"Devops");break;
		}
		case "CSBS":
		{
			System.out.println("enjoy, "+"Intro to employed lifestyle");break;
		}
		
	}break;
		default:
		{
			System.out.println("Btech is supposed to be a 4 year degree bro");break;
		}
		
		}
	}
}

			
