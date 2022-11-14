package com.Interviewprogram;

public class Ascendingorder {
	
	public static void main(String[] args) {
		
		int a [] = {1,2,4,5,6,8,8,9};
		
		Array.sort(a);
		
		for(int i=a.length-1;i>0;i--) {
			
			System.out.println(a[i]);
			
			
		}
	}

}
