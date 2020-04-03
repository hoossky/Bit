package com.jse.app;

public class Member {
	private String id; // 인스턴스 변수 (멤버 변수)
//	public Member() { // 생성자(메소드)
//		
//	} 생성자는 생략이 가능하다
	public void setId(String id) { //(다이나믹) 멤버 메소드 , 인스턴스 메소드
		System.out.println("지역변수 들어옴 "+id);
		this.id = id; //파란색 인스턴스 변수, 밤색 로컬변수
		System.out.println("인스턴스 변수에 저장됨: "+this.id);
	}
	public String getId() {
		return this.id;
	}
	
		
	
	
}
