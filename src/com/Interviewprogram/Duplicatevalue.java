package com.Interviewprogram;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Duplicatevalue {
	
	public static void main(String[] args) {
		
		
		Integer a [] = {1,2,4,2,5,8};
		
		List <Integer> l = Array.aslist(a);
		
		Set<Integer> S = new TreeSet<>();
		
		S.addAll(l);
		
		System.out.println(S);
	}

}
