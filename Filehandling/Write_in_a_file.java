package Filehandling;

import java.io.*;
public class Write_in_a_file {
	
public static void main(String[] args) throws IOException { //can also use try catch block
	BufferedWriter writer=new BufferedWriter(new FileWriter("C:\\Users\\91808\\File handling.txt"));//or just write File handling.txt and see where its stored
	writer.write("Writing to the file");
	String[] Names= {"Ved","Veda","Vedu"};
	for(String name: Names)
	{
		writer.write("\n"+name);
	}
	writer.close();

} 
}
/*try {
FileWriter f=new FileWriter("C:\\Users\\91808\\File handling.txt");
try {
	f.write("Hello  i fucking hate file handling!");
}
finally {
	f.close();
}System.out.println("Data wrote successfully!");
}
catch(IOException e){
e.printStackTrace();
}*/
