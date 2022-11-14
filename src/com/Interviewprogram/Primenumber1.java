package com.Interviewprogram;

public class Primenumber1 {

	public static void main(String[] args) {
		
		for(int i = 1; i<=10;i++) {
			
			int count =0;
			
			for (int j=2;j<i;j++) {
				
				if(i%j==0) {
					
					count++;
				}
			}
				if(count==0) {
					
					System.out.println(i + "is a prime number");
				}
				
				else {
					System.out.println(i + "is not a prime number"+count);
				}
			}
		}

	}


