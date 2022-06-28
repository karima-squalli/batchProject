package com.karima.io.write;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.karima.io.Client;
import com.opencsv.CSVWriter;

class CsvWriter implements Writer {

	/**
	 * writeFile writes in a csv file some clients information (id and status)
	 * @param filePath - the csv file path
	 * @param clients - the array list of clients 
	 * return void
	 */
	@Override
	public void writeFile(String filePath, ArrayList<Client> clients) {
		
	    try {
	        FileWriter outputfile = new FileWriter(filePath);
	  
	        CSVWriter writer = new CSVWriter(outputfile, ';',
	                                         CSVWriter.NO_QUOTE_CHARACTER,
	                                         CSVWriter.DEFAULT_ESCAPE_CHARACTER,
	                                         CSVWriter.DEFAULT_LINE_END);
	  
	        List<String[]> data = new ArrayList<String[]>();
	        for (Client client: clients) {
	        	data.add(new String[] { String.valueOf(client.getId()), client.getStatut() });
			}
	        
	        writer.writeAll(data);
	        writer.close();
	    }
	    catch (IOException e) {
	        e.printStackTrace();
	    }
	}

}
