package Filehandling;

import java.io.*;

public class Read_from_a_file {
public static void main(String[] args) throws IOException{
	BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\91808\\File handling.txt"));
	while(br.ready()) {//or use String line;while((line=br.readLine())!=null) {System.out.println(line);}
		System.out.println(br.readLine());}	
	br.close();
}
}
