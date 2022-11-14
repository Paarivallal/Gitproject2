package com.Interviewprogram;

public class Array1 {
	
	public static void main(String[] args) {
		
		int a [] = {1,2,4,2,8,5,7};
		
		int target = 6;
		
		for (int i=0;i<a.length;i++) {
			
			for (int j =0;j<a.length;j++) {
				
				int sum = a[i] + a[j];

				
				if(sum==target) {
					
					System.out.println(a[i] + ","+ a[j]);
				}
			}
			
		}
	}
}


