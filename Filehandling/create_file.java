package Filehandling;
import java.io.*;
public class create_file {
public static void main(String[] args) {
	File f=new File("C:\\Users\\91808\\File handling.txt");
	try {
		if(f.createNewFile()) //The createNewFile() method is used to create a new, empty file in Java. It is part of the java.io.File class and returns:
			//true ✅ if the file was successfully created.//false ❌ if the file already exists.
		 {
			 System.out.println("File successfully created");
		 }
		 else {
			 System.out.println("File already exist!");
		 }
	}
	catch(IOException e)
	{
		e.printStackTrace(); 
	}
 
}
}
