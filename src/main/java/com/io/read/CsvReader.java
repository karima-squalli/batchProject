package com.io.read;

import java.io.*;
import java.util.ArrayList;

import com.opencsv.CSVReader;

import batchProject.Client;

class CsvReader implements Reader {

	/**
	 * readFile reads a csv file and extracts clients information from it
	 * @param filePath - the csv file path
	 * @return clients - the array list of clients generated from the csv file
	 */
	@Override
	public ArrayList<Client> readFile(String filePath) {

		ArrayList<Client> clients = new ArrayList<>();

		try {
			FileReader filereader = new FileReader(filePath);

			try (CSVReader csvReader = new CSVReader(filereader)) {
				String[] nextRecord;
				while ((nextRecord = csvReader.readNext()) != null) {
					for (String cell : nextRecord) {
						String[] args = cell.split(";");
						clients.add(new Client(Integer.parseInt(args[0]), args[1], args[2], args[3], args[4],
								Double.parseDouble(args[5]), args[6]));
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return clients;
	}
}

