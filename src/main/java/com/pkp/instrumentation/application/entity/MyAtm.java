package com.pkp.instrumentation.application.entity;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyAtm {
	private static Logger LOGGER = LoggerFactory.getLogger(MyAtm.class);

	private static final BigDecimal account = BigDecimal.TEN;

	public static void withdrawMoney(int amount) throws InterruptedException {
		Thread.sleep(2000l); // processing going on here
		LOGGER.info("[Application] Successful Withdrawal of [{}] units!", amount);
	}
}
