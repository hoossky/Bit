package com.jse.inheritance;
import java.util.Scanner;
public class Must {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("0. 종료 1. 시작 ");
				
			switch(scanner.nextInt()) {
			case 0: return;
			case 1: System.out.println("시작합니다.");
			break;
			
			}
		}
	}

}