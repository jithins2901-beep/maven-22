package com.example; 

import static org.junit.jupiter.api.Assertions.*; 
import org.junit.jupiter.api.Test; 
class gradecalcitest { 
	@Test
	void testTotal() { 
		assertEquals(235, gradecalci.calculateTotal(75, 68, 82)); 
	} 
	@Test 
	void testAverage() { 
		assertEquals(65.0, gradecalci.calculateAverage(75, 68, 82)); 
	} 
	@Test
	void testPass() { 
		assertTrue(gradecalci.isPass(75.0)); 
	} 
	@Test
	void testFail() { 
		assertFalse(gradecalci.isPass(35.0)); 
	}
} 
