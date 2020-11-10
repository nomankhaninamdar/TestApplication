package com.noman.dependencyinjection;

public class BinarySearch {
	
	//BubbleSort bs= new BubbleSort();  //bubble sort is tightly coupled with binary search
	
	SortingAlgorithm algorithm;

	public BinarySearch(SortingAlgorithm algorithm) {
		super();
		this.algorithm = algorithm;
	}
	
	public void search() {
		algorithm.sort();
	}
	

}
