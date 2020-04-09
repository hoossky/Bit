package com.jse.grade;
import java.util.Scanner;
import javax.swing.JOptionPane;

import com.jse.member.Member;
public class GradeController {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		GradeService gradeService = new GradeService();
		Member[] members = new Member[3];
		
		while(true) {
			System.out.println();
			switch(JOptionPane.showInputDialog("0. 종료 "
								+ "1. 성적 입력 "
								+ "2. 성적 출력 "
								+ "3. 성적 순위 "
								+ "4. 회원 가입 "
								+ "5. 나이 순위")) {
			case "0": System.out.println("*** 종료합니다. ***"); return;
			case "1": System.out.println("*** 성적표 ***");
			
			for(int i=0; i<3; i++) {
			System.out.println("이름, 국어 , 영어, 수학을 입력해주세요.");
			gradeService.add(new Grade(scanner.next(),
					scanner.nextInt(),
					scanner.nextInt(),
					scanner.nextInt()));
			}					
			break;
			
			case "2": 
				Grade[] grades = gradeService.getGrades();
				for(int i = 0; i<3; i++) {
					
					System.out.println(String.format("[%s : 총점 %d 점, 평균 %d 점,학점 : %s]",
							grades[i].getName(),grades[i].total(),grades[i].average(),grades[i].grade()));
				}
				break;
				
			case "3": 
				System.out.println("총점별로 1, 2, 3등 이름 나열하기");
//				for(int i = 0; i<3; i++) {
//					Grade grade = grades[i];
//					System.out.println(String.format("[%s : 총점 %d 점]",
//							grade.getName(),grade.total()));
//					
//				}
				
				break;
				
			case "4": 
				System.out.println("회원 가입");
				for(int i=0; i<3; i++) {
					members[i] = join(scanner);
				}
				break;
				
			case "5":
				for(int i=0; i<3; i++)
				System.out.println(String.format("ID: %s\nPW: %s\n이름: %s\n나이: %d", 
						members[i].getUserid(),members[i].getPasswd(),members[i].getName(),members[i].getAge()));
				
				break;
			}
			
				
								
			}
			
		
	}
	public static Grade input(Scanner scanner) {
		System.out.println("이름, 국어 , 영어, 수학을 입력해주세요.");
		return new Grade(scanner.next(),scanner.nextInt(),
				scanner.nextInt(),scanner.nextInt());
				
	}
	static Member join(Scanner scanner) {
		Member member = new Member();
		
		System.out.println("ID 입력");
		member.setUserid(scanner.next());
		System.out.println("비밀번호 입력");
		member.setPasswd(scanner.next());
		System.out.println("이름 입력");
		member.setName(scanner.next());
		System.out.println("나이 입력");
		member.setAge(scanner.nextInt());
				
		return member;
	}
}
