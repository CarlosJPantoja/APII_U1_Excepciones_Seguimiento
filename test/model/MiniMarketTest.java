package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MiniMarketTest {
	
	private MiniMarket market;

	public void setupScenary1() {
		market = new MiniMarket();
	}
	
	public void setupScenary2() {
		market = new MiniMarket();
		market.addPerson(3, "47614652");
		market.addPerson(2, "19867674");
		market.addPerson(4, "17965412");
	}
	
	@Test
	public void testAddPerson() {
		
		//Todas las pruebas y escenarios estan configurados para un dia par
		
		//Agrega normal
		setupScenary1();
		market.addPerson(3, "1000282032");
		assertEquals(1, market.getPersons().size());
		assertEquals(3, market.getPersons().get(0).getTipoDocumento());
		assertEquals("1000282032", market.getPersons().get(0).getNumDocumento());
		
		setupScenary2();
		market.addPerson(3, "1000282032");
		assertEquals(4, market.getPersons().size());
		assertEquals(3, market.getPersons().get(3).getTipoDocumento());
		assertEquals("1000282032", market.getPersons().get(3).getNumDocumento());
		
		
		//No se agrega por tipo de documento
		setupScenary1();
		market.addPerson(1, "1000282032");
		assertEquals(0, market.getPersons().size());
		assertEquals(1, market.getIntentos());
	
		setupScenary2();
		market.addPerson(1, "1000282032");
		assertEquals(3, market.getPersons().size());
		assertEquals(4, market.getIntentos());
		
		//No se agrega por numero de dpcumento
		setupScenary1();
		market.addPerson(2, "10054874521");
		assertEquals(0, market.getPersons().size());
		assertEquals(1, market.getIntentos());
	
		setupScenary2();
		market.addPerson(4, "1000282022");
		assertEquals(3, market.getPersons().size());
		assertEquals(4, market.getIntentos());
	}

}
