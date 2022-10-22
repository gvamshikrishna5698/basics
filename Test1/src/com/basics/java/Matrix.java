package com.basics.java;

import java.util.Scanner;

public class Matrix {
	
	public static void performAddition() {
		System.out.println("Provide first matrix");
		int[][]  mata = readArrays();
		System.out.println("Provide second matrix");
		int[][] matb = readArrays();
		
		if(mata.length > 0 && matb.length >0) {
			
			if(mata.length == matb.length) {
				
				if(mata[0].length == matb[0].length) {
					
					for(int i = 0 ;i < mata.length; i++) {
						for(int j =0 ; j < mata[0].length; j++) {
							System.out.print(mata[i][j]+matb[i][j]+" ");
						}
						System.out.println();
					}
					
				}else {
					System.out.println("The no of columns not equla");
				}
			}else {
				System.out.println("The no of rows not equal");
			}
		}else {
			System.out.println("Provided empty array");
		}
		
	}

	public static int[][] readArrays() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter rows");
		int rows = sc.nextInt();
		
		System.out.println("Enter Columns");
		int columns = sc.nextInt();
		
		int[][] mata = new int[rows][columns];
		
		System.out.println("Enter no of elements: " +(rows*columns));
		for(int i = 0; i< rows; i++) {
			for(int j = 0; j < columns; j++) {
				mata[i][j] = sc.nextInt();
			}
		}
		
//		printMatrix(mata, columns,rows);
//		transposeOfmatrix(mata, columns,rows);
		
		//sc.close();
		
		return mata;
	}
	
	public static void printMatrix(int[][] matrix, int columns, int rows)  {
		System.out.println("The origional martix");
		for(int i = 0; i < rows ; i++) {
			for(int j = 0; j <columns ; j++) {
				System.out.print(matrix[i][j]+ " ");
			}
			System.out.println();
		}
	}
	
	public static void transposeOfmatrix(int[][] matrix, int columns, int rows ) {
		System.out.println("The Transposed Matrix");
		for(int i = 0; i < columns ; i++) {
			for(int j = 0; j < rows ; j++) {
				System.out.print(matrix[j][i]+" ");
			}
			System.out.println();
		}
	}
	
	
}
