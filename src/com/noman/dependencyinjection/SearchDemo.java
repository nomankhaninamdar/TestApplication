package com.noman.dependencyinjection;

public class SearchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinarySearch bs= new BinarySearch(new BubbleSort());
		bs.search();
		
		BinarySearch bs1= new BinarySearch(new QuikSort());
		bs1.search();
		
		BinarySearch bs2= new BinarySearch(new HeapSort());
		bs2.search();
		
		BinarySearch bs3= new BinarySearch(new InsertionSort());
		bs3.search(); 
		
	}

}
