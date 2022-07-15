package batchProject;

import java.util.ArrayList;

import com.io.read.Reader;
import com.io.write.Writer;

public class Main { 
	
	public static void main(String[] args) throws Exception {
		
		Reader r = Reader.getReader(Integer.parseInt(args[0]));
		
		ArrayList<Client> clients = r.readFile(args[1]);
		
		Writer w = Writer.getWriter(Integer.parseInt(args[0]));
		
		w.writeFile(args[2], clients);
	}
}
