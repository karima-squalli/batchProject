package com.karima.io.write;

import java.util.ArrayList;

import com.karima.io.Client;

public interface Writer {

	/**
	 * getReader calls a writer class depending on a code
	 * @param code - the writer code (0 for csv reader) 
	 * @return the appropriate writer class, or null if code is not recognized
	 */
	static Writer getWriter(int code) {
        switch (code) {
            case 0: 
            	return new CsvWriter();
            default:
            	return null;
        }
    }
	
	void writeFile(String filePath, ArrayList<Client> clients);
}
