package com.exercise22countitemsinvector.app;

import java.util.HashMap;
import java.util.Random;

public class OccurenciesApp {

	public static void main(String[] args) {
		final int ELEMENTS=100;
		
		Random numbers = new Random(System.nanoTime());
		int[] myArray = new int[ELEMENTS];
		HashMap<Integer, Integer> myHash = new HashMap<Integer, Integer>();
		
		for(int i = 0; i<ELEMENTS; i++) {
			myArray[i] = numbers.nextInt(11);
		}
		
		int occurences = 0;
		for(int  element : myArray) {
			occurences = 0;
			if(myHash.containsKey(element)) {
				occurences = myHash.get(element);
				occurences++;
				myHash.put(element, occurences);
			}else {
				myHash.put(element, 1);
			}
		}
		
		System.out.println(myHash);
		
		for(int  i : myArray) {
			System.out.print(" " + i);
		}

	}

}
