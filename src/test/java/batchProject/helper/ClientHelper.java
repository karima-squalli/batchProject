package batchProject.helper;

import java.util.Date;

import batchProject.Client;

public class ClientHelper {

	public static Client getClient() {
		
		Client client = new Client();
		client.setId(1);
		client.setNom("toto");
		client.setPrénom("tata");
		client.setDate(new Date(0));
		client.setMontant(1000.00);
		client.setProduit("PROD");
		client.setStatut("en cours");
		
		return client;
	}
	
public static Client getClientConstructor() {
		
		Client client = new Client(1, "toto", "tata", new Date(0), "PROD", 1000.00, "en cours");
		
		return client;
	}
	
}
