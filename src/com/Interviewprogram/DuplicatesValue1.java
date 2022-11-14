package com.Interviewprogram;

public class DuplicatesValue1 {

	public static void main(String[] args) {

		int a[] = { 1, 2, 2, 3, 4, 5, 6, 4 };

		for (int i = 0; i <= a.length - 1; i++) {

			if (i == 2) {

				continue;
				
			} else if (i == 4)

			{

				continue;
			}

			System.out.println(a[i]);
		}

	}

}
