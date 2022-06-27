package com.karima.io.write;

import java.util.ArrayList;

import com.karima.io.Client;

public interface Writer {

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
