package com.orubele.springbootdemo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootDemoApplication {
	
	// What are the beans?
	// bubble sort and quick sort
	
	// What are the dependencies of the bean?
	// Sort algorithm
	
	//Where to search for beans

	public static void main(String[] args) {
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm()); spring job
		
		
		// Application context manages the beans
		ApplicationContext applicationContext = SpringApplication.run(SpringbootDemoApplication.class, args);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		int result = binarySearch.binarySearch(new int[] {12, 4, 6}, 10);
		System.out.println(result);
		
	
	}

}
