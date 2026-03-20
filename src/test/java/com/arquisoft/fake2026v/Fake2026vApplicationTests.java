package com.arquisoft.fake2026v;

import com.fasterxml.jackson.databind.JsonNode;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class Fake2026vApplicationTests {

	@Autowired
	DataController dataController;

	@Test
	void health() {
		assertEquals("HEALTH CHECK OK", dataController.healtCheck());
	}

	@Test
	void version() {
		assertEquals("The actual version is 1.0.0", dataController.version());
	}

	@Test
	void nationLenght() {
		assertEquals(10, dataController.getRandomNation().size());
	}

	@Test
	void currenciesLength() {
		assertEquals(20 , dataController.getRandomCurrency().size());
	}

	@Test
	void aviationsLength() {
		assertEquals(20 , dataController.getRandomAviation().size());
	}

	@Test
	public void restRandomCurrenciesCodeFormat() {
		DataController dataController = new DataController();
		JsonNode response = dataController.getRandomCurrency();
		for (int i=0; i<response.size(); i++) {
			JsonNode curr = response.get(i);
			String code = curr.get("code").asText();
			assertTrue(code.matches("[a-zA-Z0-9]{3}"));
		}
	}

	@Test
	public void testRandomNationsPerformance() {
		DataController dataController = new DataController();
		long start = System.currentTimeMillis();
		JsonNode response = dataController.getRandomNation();
		long endTime = System.currentTimeMillis();
		long executionTime = endTime - start;
		System.out.printf("Execution time: %d ms\n", executionTime);
		assertTrue(executionTime < 2000);
	}
}
