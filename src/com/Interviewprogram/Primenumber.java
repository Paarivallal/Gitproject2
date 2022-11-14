package com.Interviewprogram;

public class Primenumber {
	
	public static void main(String[] args) {
		
		int a = 6;
		
		int count = 0;
		
		for(int i = 2; i<a;i++) {
			
		if (a%i==0) {
			
			count++;
			
		}
		}
		
		if(count==0) {
			
			System.out.println(a + "is a Prime number" );
		}
		else {
			System.out.println(a + " is not prime number ");
		}
		}
	}


