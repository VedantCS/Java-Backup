package Filehandling;

import java.io.File;

public class File_info_display {
public static void main(String[] args) {
	File f=new File("C:\\Users\\91808\\File handling.txt");
if(f.exists())
{
	System.out.println("File name: "+f.getName());
	System.out.println("File location: "+f.getAbsolutePath());
	System.out.println("File writable: "+f.canWrite());
	System.out.println("File readable: "+f.canRead());
	System.out.println("File length: "+f.length());
	System.out.println("File is deleted now!! " + f.delete());
}
else {
	System.out.println("File does not exists!");
	
}

	
}

}
