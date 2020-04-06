package com.jse.swing;
import java.util.Scanner;
public class Engine {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Grade[] grades = new Grade[2];
		
		while(true) {
			System.out.println("0. 종료 "
								+ "1. 성적 입력 "
								+ "2. 성적 출력 "
											);
			switch(scanner.nextInt()) {
			case 0: System.out.println("*** 종료합니다. ***"); return;
			case 1: System.out.println("*** 성적표 ***");
			for(int i=0; i<2; i++) {
				grades[i] = input(scanner);
			}
				break;
			case 2: 
				for(int i = 0; i<2; i++) {
					Grade grade = grades[i];
					System.out.println(String.format("[%s : 총점 %d 점, 평균 %d 점,학점 : %s]",
							grade.getName(),grade.total(),grade.average(),grade.grade()));
				}
				break;
			}
			
		}
	}
	static Grade input(Scanner scanner) {
		Grade grade = new Grade();
		System.out.println("이름을 입력해주세요.");
		grade.setName(scanner.next());
		System.out.println("국어 점수를 입력해주세요.");
		grade.setKorean(scanner.nextInt());
		System.out.println("영어 점수를 입력해주세요.");
		grade.setEnglish(scanner.nextInt());
		System.out.println("수학 점수를 입력해주세요.");
		grade.setMath(scanner.nextInt());
					System.out.println(String.format("[%s : 총점 %d 점, 평균 %d 점,학점 : %s]",
							grade.getName(),grade.total(),grade.average(),grade.grade()));
		return grade;
	}
}
