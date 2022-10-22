package com.basics.java;

public class BasicLoops {
	
	//for loop
	public  static void executeForLoop(int start, int increment) {
		
		System.out.println("Executing While Loop");
		
		for(int i = start ; i < 10; i = i + increment) {
			System.out.println(i);
		}
	}
	
	public static void executeWhileLoop(int start, int end, int increment) {
		System.out.println("Executing While Loop");
		while(start != end) {
			System.out.println(start);
			start += increment;
		}
	}
	
	public static void executeDoWhileLoop(int start, int end, int increment) {
		System.out.println("Executing DO While Loop");
		do {
			System.out.println(start);
			start += increment;
		}while(start != end);
	}
	
	public static void executeForEachElement() {
		
		System.out.println("Executing for each Loop");
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		for(int i: arr) {
			if(i %2 == 1)
				System.out.println(i);
		}
	}
	
	public static void printCube() {
		
		for(int i = 0; i < 10; i++ ) {
			for(int j = 0; j < 10 ;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
	}
	
	
	
}
