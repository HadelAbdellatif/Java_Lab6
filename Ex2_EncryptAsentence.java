package com.sun;

public class Ex2_EncryptAsentence {

	public static void main(String[] args) {

		System.out.println("------------>>> Capital");

		String s = Capital("Hello Word !");
		System.out.println(s);

		System.out.println("------------>>> Reverse");

		String s2 = Reverse("My Word");
		System.out.println(s2);

		System.out.println("------------>>> toNumber");

		String s3 = toNumber("Oh, I Love you Sally !");
		System.out.println(s3);

		System.out.println("------------>>> beginAndEnd");

		String s4 = beginAndEnd(" hadeel are you here? ");
		System.out.println(s4);

	}

	// Ex2.1 capital letter
	public static String Capital(String s) {

		s.toUpperCase();

		return s;
	}

	// Ex2.2 Reverse
	public static String Reverse(String s) {

		StringBuilder s2 = new StringBuilder(s);
		s2.reverse();

		return s2.toString();
	}

	// Ex2.3 toNumber
	public static String toNumber(String s) {

		s = s.replace('O', '0');
		s = s.replace('S', '$');
		s = s.replace('L', '1');

		return s;

	}

	// Ex2.4 beginAndEnd
	public static String beginAndEnd(String s) {

		StringBuilder s2 = new StringBuilder();

		s2.append("**");
		for (int i = 0; i < s.length(); i++) {
			s2.append(s.charAt(i));
		}
		s2.append("**");

		return s2.toString();

	}

}
