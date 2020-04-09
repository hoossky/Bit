package com.jse.game;

public class Sum1To100 {
	public static void main(String[] args) {
		sum();
	}
	static void sum() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
			sum += i;
		}
		System.out.println("합 계 : " + sum);
	}
}
