package com.karima.io.read;

import java.util.ArrayList;

import com.karima.io.Client;

public interface Reader {

	static Reader getReader(int code) {
        switch (code) {
            case 0: 
            	return new CsvReader();
            default:
            	return null;
        }
    }
	
	ArrayList<Client> readFile(String fileName);

}
