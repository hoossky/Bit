package com.jse.swing;
import java.util.Random;
public class Age {
	public static void main(String[] args) {
		Random random = new Random();
	
		int a = random.nextInt(3)+1;
		int b = random.nextInt(3)+1;
		int c = random.nextInt(3)+1;
		
		String result = "";
		
		if(a > b && b > c) {
			result = "1. " + a + " 2. "+ b + " 3. "+ c;
		}else if(a > c && c > b) {
			result = "1. " + a + " 2. "+ c + " 3. "+ b;
		}else if(b > a && a > c) {
			result = "1. " + b + " 2. "+ a + " 3. "+ c;
		}else if(b > c && c > a) {
			result = "1. " + b + " 2. "+ c + " 3. "+ a;
		}else if(c > a && a > b) {
			result = "1. " + c + " 2. "+ a + " 3. "+ b;
		}else {
			result = "1. " + c + " 2. "+ b + " 3. "+ a;
		}
		
		System.out.println(result);
	}
}
