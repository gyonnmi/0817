package org.project;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DBConnectTest {

	@Test
	void testGetConnetion() throws Exception {
		DBConnet.getConnetion();
	}

}
