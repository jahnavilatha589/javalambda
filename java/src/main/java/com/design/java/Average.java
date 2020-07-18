package com.design.java;

import java.util.*;
public class Average {
	public static void main(String args[]){
		Integer[] list = {2,3,4};
		List<Integer> listNum = Arrays.asList(list);
		double averageRes = average(listNum);
		System.out.println(averageRes);
	}

	private static double average(List<Integer> listNum) {
		return listNum.stream().mapToInt(i -> i).average().getAsDouble();
	}
}