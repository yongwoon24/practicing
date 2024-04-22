package ViewTest;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileSaveExam {
	public static void main(String[] args) throws IOException{
		String data = "";
		FileWriter fw = new FileWriter("out.txt", false);
		BufferedReader br = new BufferedReader(new FileReader("out.txt"));
		for (int i = 0; i < 10; i++) {
			data = (i+1)+"번째\n";
			fw.write(data);
		}
	        fw.close();
	        
	        while(true) {
	        	String str = br.readLine();
	        	if(str == null)
	        		break;
	        	System.out.println(str);
	        }
	        br.close();
	}
	
}
