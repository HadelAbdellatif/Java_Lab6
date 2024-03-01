package com.sun;

public class Ex1_MyString {

	private static String string;

	// Constructor
	public Ex1_MyString(String string) {
		super();
		Ex1_MyString.string = string;
	}

	// Setters & Getters
	public String getString() {
		return string;
	}

	public void setString(String string) {
		Ex1_MyString.string = string;
	}

	// Method 1 Ex_1
	public static String reverseString(String s) {

		StringBuilder string = new StringBuilder(s);
		string = string.reverse();
		return string.toString();

	}

	// Method 2 Ex_1
	public static Boolean isPelindrom(String s) {

		StringBuilder string = new StringBuilder();

		// Filter --- 1

		for (int i = 0; i < s.length(); i++) {
			if (Character.isLetterOrDigit(s.charAt(i))) {
				string.append(s.charAt(i));
			}
		}
		//System.out.println("------------>>> "+string+" After filter");

		// Reverse --- 2

		string.reverse();
		//System.out.println("------------>>> "+string+" After reverse");

		// equal --- 3

		return s.equals(string.toString());

	}

	// Method 3 Ex_1
	public static String shortHanded(String s) {

		s = s.replaceAll("and", "&");
		s = s.replaceAll("to", "2");
		s = s.replaceAll("you", "U");
		s = s.replaceAll("for", "4");

		s = s.replaceAll("[AaOoEe]", "");
		s = s.replaceAll("ei", "");
		s = s.replaceAll("EI", "");

		return s;

	}

	// Method 4.1 Ex_1
	public static int numberOfSentences(String s) {

		String[] s2 = s.split("[.,?!]");
		return s2.length;
	}

	// Method 4.2 Ex_1
	public static int numberOfWords(String s) {

		int NumberOfWords = 0;
		// int NumberOfChar = 0;

		String[] token = s.split(" ");
		for (int i = 0; i < token.length; i++) {
			if (token[i].length() > 3)
				NumberOfWords++;

			/*
			 * for (int j = 0; j < token[i].length(); j++) { for (int h = 0; h <
			 * token[i].charAt(j); h++) { NumberOfChar++; }
			 * 
			 * if (NumberOfChar > 3) { NumberOfChar = 0; NumberOfWords++; } }
			 */
		}

		return NumberOfWords;
	}

}
