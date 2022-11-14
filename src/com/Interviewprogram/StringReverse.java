package com.Interviewprogram;

public class StringReverse {

	public static void main(String[] args) {

		String S = "Software Testing";

		for (int i = S.length() - 1; i >= 0; i--) {

			System.out.print(S.charAt(i));

			if (S.charAt(i) == ' ') {

				break;
			}

		}

		for (int i = 0; i < S.length()-1; i++) {

			if (i == 0) {

				System.out.print(S.charAt(0));

			} else if (S.charAt(i) == ' ') {
				
			break;
				
			} else {

				System.out.print(S.charAt(i));
			}

		}

	}

}
