package com.leo.cyber.dojo03.lcd.digits;

import java.util.ArrayList;
import java.util.List;

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

	private LCD(String header, String body, String foot) {
		this.header = header;
		this.body = body;
		this.foot = foot;
	}

	String header;
	String body;
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

	public void printHeader() {
		System.out.println(this.header);
	}

	public void printBody() {
		System.out.println(this.body);
	}

	public void printFoot() {
		System.out.println(this.foot);
	}
}
