package com.leo.cyber.dojo03.lcd.digits;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;

public enum LCD {
	ZERO("._.", "|.|", "|_|"),
	ONE("...", "..|", "..|"),
	TWO("._.", "._|", "|_."),
	THREE("._.", "._|", "._|"),
	FOUR("...", "|_|", "..|"),
	FIVE("._.", "|_.", "._|"),
	SIX("._.", "|_.", "|_|"),
	SEVEN("._.", "..|", "..|"),
	EIGHT("._.", "|_|", "|_|"),
	NINE("._.", "|_|", "..|");
	
	public static final String LINE_SEPARATOR=System.getProperty("line.separator");
	public static final String LINE_SPACE=" ";

	private LCD(String header, String body, String foot) {
		this.header = header;
		this.body = body;
		this.foot = foot;
	}

	@Getter
	String header;
	@Getter
	String body;
	@Getter
	String foot;

	public static List<LCD> get(int[] number) {
		List<LCD> result = new ArrayList<>(number.length);
		for (int i = 0; i < number.length; i++) {
			result.add(get(number[i]));
		}
		return result;
	}

	public static LCD get(int number) {
		return values()[number];
	}
}
