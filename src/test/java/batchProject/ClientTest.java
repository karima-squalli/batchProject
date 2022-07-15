package batchProject;

import static org.junit.Assert.assertEquals;

import java.sql.Date;

import org.junit.Test;

import batchProject.helper.ClientHelper;

public class ClientTest {
	
	@Test
	public void getClientTest() {
		Client expectedClient = ClientHelper.getClient();
		
		assertEquals(expectedClient.getId(), 1);
		assertEquals(expectedClient.getNom(), "toto");
		assertEquals(expectedClient.getPrénom(), "tata");
		assertEquals(expectedClient.getDate(), new Date(0));
		assertEquals(expectedClient.getMontant(), 1000.00, 0.01);
		assertEquals(expectedClient.getProduit(), "PROD");
		assertEquals(expectedClient.getStatut(), "en cours");
	}
	
	@Test
	public void getClientConstructorTest() {
		Client expectedClient = ClientHelper.getClientConstructor();
		
		assertEquals(expectedClient.getId(), 1);
		assertEquals(expectedClient.getNom(), "toto");
		assertEquals(expectedClient.getPrénom(), "tata");
		assertEquals(expectedClient.getDate(), new Date(0));
		assertEquals(expectedClient.getMontant(), 1000.00, 0.01);
		assertEquals(expectedClient.getProduit(), "PROD");
		assertEquals(expectedClient.getStatut(), "en cours");
	}
}
