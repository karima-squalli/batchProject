package com.io.read;

import java.util.ArrayList;

import batchProject.Client;



public interface Reader {

	/**
	 * getReader calls a reader class depending on a code
	 * @param code - the reader code (0 for csv reader) 
	 * @return the appropriate reader class, or null if code is not recognized
	 */
	public static Reader getReader(int code) {
        switch (code) {
            case 0: 
            	return new CsvReader();
            default:
            	return null;
        }
    }
	
	ArrayList<Client> readFile(String filePath) throws Exception;
}
