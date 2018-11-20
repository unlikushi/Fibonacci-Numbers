package com.example1.Fibonacci.Number;

public class FibonacciNumberApplication {

	public static  boolean isPerfectSquare(int x) {
		int s = (int) Math.sqrt(x);
		return (s*s == x);
	}

	public static boolean isFibonacci(int n) {
		return isPerfectSquare(5*n*n + 4) || isPerfectSquare(5*n*n - 4);
	}

	public static void main(String[] args) {
		int[] array = {8, 16, 34};
		for(int i = 0; i < array.length; i++){
			if(isFibonacci(array[i])){
				System.out.println(array[i] + " is a fibonacci number.");
			}else {
				System.out.println(array[i] + " is not a fibonacci number.");
			}
		}
	}
}