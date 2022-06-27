package com.karima.io.read;

import java.io. * ;
import java.util.ArrayList;
import java.util.Scanner;

import com.karima.io.Client;


class CsvReader implements Reader{
	
	@Override
	public ArrayList <Client> readFile(String fileName) {
		
		ArrayList <Client> clients = new ArrayList<>();

		try (Scanner scanner = new Scanner(new File(fileName));) {
		    while (scanner.hasNextLine()) {
		    	String[] args = scanner.nextLine().split(";");
		        clients.add(new Client(Integer.parseInt(args[0]), args[1], args[2], args[3], args[4], Double.parseDouble(args[5]), args[6]));
		    }
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		return clients;
	}
}
