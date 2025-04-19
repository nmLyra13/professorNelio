package com.profnelio.cursojava.estrutura;

public class ToLowerCase {

	public static void main(String[] args) {

		String original = "abcde FGHI JlmN OPqrST UVxZ    ";
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2, 9);
		String s06 = original.replace("abcde", "xxxxx");
		int i = original.indexOf("b");
		int j = original.lastIndexOf("P");
		System.out.println("-" + s01 + "-");
		System.out.println("-" + s02 + "-");
		System.out.println("-" + s03 + "-");
		System.out.println("-" + s04 + "-");
		System.out.println("-" + s05 + "-");
		System.out.println("-" + s06 + "-");
		System.out.println();
		System.out.println(i);
		System.out.println(j);

	}

}
