package com.orubele.springbootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class BinarySearchImpl {
	//Sorting an array
	// Search the array
	// Return the search
	
	
	@Autowired
	SortAlgorithm sortAlgorithm;
	
	
	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}


	public int binarySearch(int[] numbers, int numbersToSearch) {
		//Implementing Sorting Logic
		
		//Bubble Sort Algorithm
		
		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		
		//Quick Sort Algorithm
		
		//Searching the array
		return 3;
	}
}
