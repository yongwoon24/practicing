package ViewTest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadExam01 {
	public static void main(String[] args) throws IOException{
		FileReader fr = new FileReader("out.txt");
		int readData = fr.read();
		System.out.println((char)readData);
		fr.close();
	}
}
