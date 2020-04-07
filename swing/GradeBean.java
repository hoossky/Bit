package com.jse.swing;
/*
 클라이언트에서 프로그램 개발 요청이 왔습니다. 
 이름과 국,영,수 세과목점수를 입력받아서()
 [홍길동 : 총점 ***점, * 평균***점,학점 : F] 을 출력하는 프로그램을 만들어 주세요. 
  단) 평균은 소수점이하는 절삭합니다 
  평균점수가 90점 이상 A 
 80점 이상이면 B 
 70점 이상이면 C 
 60점 이상이면 D 
 50점 이상이면 E 
 50점 미만이면 F 학점입니다라고 출력되게 해주세요
  */
public class GradeBean {
	private String name;
	private int korean;
	private int english;
	private int math;
	
	public GradeBean(String name, int korean, int english, int math) {
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setKorean(int korean) {
		this.korean = korean;
	}
	public int getKorean() {
		return korean;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getEnglish() {
		return english;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getMath() {
		return math;
	}
	public int total() {
		int total = (korean + english + math);
				
		return total;
	}
	public int average() {
		return total() / 3;
	}
//	public String grade2() {
//		String grade = "F";
//		int average = average();
//		
//		int num = average/ 10;
//		switch(num) {
//		
//		case 5 : grade = "E"; break;
//		case 6 : grade = "D"; break;
//		case 7 : grade = "C"; break;
//		case 8 : grade = "B"; break;
//		case 9 : grade = "A"; break;
//			
//		}
//		
//		return grade;
//	}
	public String grade() {
		String grade = "";
		int average = average();
				
		if(average >= 90 ) {			
			grade = "A 학점입니다.";
		}else if(average >= 80) {
			grade = "B 학점입니다.";
		}else if(average >= 70) {
			grade = "C 학점입니다.";
		}else if(average >= 60) {
			grade = "D 학점입니다.";
		}else if(average >= 50) {
			grade = "E 학점입니다.";
		}else {
			grade = "F 학점입니다.";
		}
		
		return grade;
	}
	
}
