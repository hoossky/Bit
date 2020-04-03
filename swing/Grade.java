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
public class Grade {
	private String name;
	private int korean;
	private int english;
	private int math;
	
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
	public String grade2() {
		String grade = "";
		int average = average();
		
//		
//		switch(average) {
//		case 1 : result = F;
//		case 2 : result = E;
//			
//		}
		
		return grade;
	}
	public String grade() {
		String grade = "잘못 입력된 값입니다.";
		int average = average();
				
		if(average < 50) {
			grade = "F 학점입니다.";	 
		}else if(50 <= average ) {
			grade = "E 학점입니다.";
		}else if(60 <= average) {
			grade = "D 학점입니다.";
		}else if(70 <= average) {
			grade = "C 학점입니다.";
		}else if(80 <= average) {
			grade = "B 학점입니다.";
		}else if(90 <= average) {
			grade = "A 학점입니다.";
		}
		
		return grade;
	}
	
}
