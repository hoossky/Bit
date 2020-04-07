package com.jse.swing;
import java.util.Scanner;
public class Engine {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		GradeBean[] grades = new GradeBean[3];
		MemberBean[] members = new MemberBean[3];
		
		while(true) {
			System.out.println("0. 종료 "
								+ "1. 성적 입력 "
								+ "2. 성적 출력 "
								+ "3. 성적 순위 "
								+ "4. 회원 가입 "
								+ "5. 나이 순위"
											);
			switch(scanner.nextInt()) {
			case 0: System.out.println("*** 종료합니다. ***"); return;
			case 1: System.out.println("*** 성적표 ***");
			for(int i=0; i<3; i++) {
				grades[i] = input(scanner);
				
			}
			break;
			case 2: 
				for(int i = 0; i<3; i++) {
					GradeBean grade = grades[i];
					System.out.println(String.format("[%s : 총점 %d 점, 평균 %d 점,학점 : %s]",
							grade.getName(),grades[i].total(),grades[i].average(),grades[i].grade()));
				}
				break;
				
			case 3: 
				System.out.println("총점별로 1, 2, 3등 이름 나열하기");
//				for(int i = 0; i<3; i++) {
//					Grade grade = grades[i];
//					System.out.println(String.format("[%s : 총점 %d 점]",
//							grade.getName(),grade.total()));
//					
//				}
				
				break;
				
			case 4: 
				System.out.println("회원 가입");
				for(int i=0; i<3; i++) {
					members[i] = join(scanner);
				}
				break;
				
			case 5:
				for(int i=0; i<3; i++)
				System.out.println(String.format("ID: %s\nPW: %s\n이름: %s\n나이: %d", 
						members[i].getUserid(),members[i].getPasswd(),members[i].getName(),members[i].getAge()));
				
				break;
			}
			
				
								
			}
			
		
	}
	public static GradeBean input(Scanner scanner) {
		System.out.println("이름, 국어 , 영어, 수학을 입력해주세요.");
		return new GradeBean(scanner.next(),scanner.nextInt(),
				scanner.nextInt(),scanner.nextInt());
				
	}
	static MemberBean join(Scanner scanner) {
		MemberBean member = new MemberBean();
		
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
