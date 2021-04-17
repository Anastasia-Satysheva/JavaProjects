package com.class09;

public class Group {

	public static void main(String[] args) {
		int[][] board = new int[3][3]; 
		for (int i = 0; i < board.length; i++) { 
			for (int j = 0; j < board[i].length; j++) { 
				board[i][j] = i + j; } } // now let's print a two dimensional array in Java for (int[] a : board) 
		{ for (int i : a) { 
			System.out.print(i + "\t"); } System.out.println("\n"); } 
		// printing 2D array using Arrays.deepToString() meRead more: https://www.java67.com/2014/10/how-to-create-and-initialize-two-dimensional-array-java-example.html#ixzz6oMkD2XXl

	}

}
