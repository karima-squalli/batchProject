import java.util.ArrayList;

import com.karima.io.Client;
import com.karima.io.read.Reader;
import com.karima.io.write.Writer;

public class Main { 
	
	public static void main(String[] args) {
		
		System.out.println("Hello World");
		final  int CSV =  0 ;
		
		Reader r = Reader.getReader(CSV);
		
		ArrayList<Client> clients = r.readFile("src/main/resources/input.csv");
		
		Writer w = Writer.getWriter(CSV);
		
		w.writeFile("src/main/resources/output.csv", clients);
	}
}
