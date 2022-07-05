package com.io.read;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;

import batchProject.Client;
import batchProject.Utils;

class CsvReader implements Reader {

	public static final int ID = 0;
	public static final int NOM = 1;
	public static final int PRENOM = 2;
	public static final int DATE = 3;
	public static final int PRODUIT = 4;
	public static final int MONTANT = 5;
	public static final int STATUT = 6;

	/**
	 * readFile reads a csv file and extracts clients information from it
	 * @param filePath - the csv file path
	 * @return clients - the array list of clients generated from the csv file
	 * @throws CsvException 
	 * @throws IOException 
	 */
	@Override
	public ArrayList<Client> readFile(String filePath) throws Exception {

		ArrayList<Client> clients = new ArrayList<>();

		CSVParser csvParser = new CSVParserBuilder().withSeparator(';').build(); // custom separator
		try(CSVReader reader = new CSVReaderBuilder(
				new FileReader(filePath))
				.withCSVParser(csvParser)   // custom CSV parser
				.withSkipLines(1)           // skip the first line, header info
				.build()){
			List<String[]> nextRecord;
			nextRecord = reader.readAll();
			for (String[] cell : nextRecord) {
				// System.out.println(Arrays.toString(cell));
				clients.add(new Client(Integer.parseInt(cell[ID]), cell[NOM], cell[PRENOM], Utils.convertStringToDate(cell[DATE]), cell[PRODUIT],
						Utils.convertDoubleWithComaToDoubleWithDot(cell[MONTANT]), cell[STATUT]));
			}
		}
		return clients;
	}
}

