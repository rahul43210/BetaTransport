package com.transport.beta.utility;

import java.util.UUID;

public class AppUtility {

	public static String uniqueId(){
		return uniqueId(10);
	}

	public static String uniqueId(int length) {
		String uniqueId = UUID.randomUUID()
				.toString()
				.replace("-", "")
				.substring(0, length)
				.toUpperCase();
		return uniqueId;
	}
}
