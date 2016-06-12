package com.lewjun;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Unit test for simple App.
 */
public class AppTest {
	private static final Logger LOGGER = LoggerFactory.getLogger(AppTest.class);
	/**
	 * 打个招呼 :-)
	 */
	@Test
	public void testGreeting() {
//		System.out.println("Hello GitHub");
		LOGGER.debug("Hello GitHub");
	}
}
