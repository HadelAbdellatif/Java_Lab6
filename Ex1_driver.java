package com.sun;

public class Ex1_driver {

	public static void main(String[] args) {

		System.out.println("------------>>> reverse String");

		String s = Ex1_MyString.reverseString("Hello Word !");
		System.out.println(s);

		System.out.println("------------>>> isPelindrom");
		
		Boolean s2 = Ex1_MyString.isPelindrom("121");
		System.out.println(s2);

		Boolean s3 = Ex1_MyString.isPelindrom("123");
		System.out.println(s3);

		System.out.println("------------>>> short Handed");

		String s4 = Ex1_MyString.shortHanded("and its for you to you");
		System.out.println(s4);

		String s5 = Ex1_MyString.shortHanded("i am hadeel and whats about u illen ouh");
		System.out.println(s5);

		System.out.println("------------>>> Number Of Sentences");

		int s6 = Ex1_MyString.numberOfSentences("hadeel!are,you.here?obs");
		System.out.println(s6);

		System.out.println("------------>>> Number Of Words");
		
		int s7 = Ex1_MyString.numberOfWords("hadeel are you here?");
		System.out.println(s7);

	}

}
