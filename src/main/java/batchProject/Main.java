package batchProject;

import java.util.ArrayList;

import com.io.read.Reader;
import com.io.write.Writer;

public class Main { 
	
	public static void main(String[] args) {

		final  int CSV =  0 ;
		
		Reader r = Reader.getReader(CSV);
		
		ArrayList<Client> clients = r.readFile("src/main/resources/input.csv");
		
		Writer w = Writer.getWriter(CSV);
		
		w.writeFile("src/main/resources/output.csv", clients);
	}
}
