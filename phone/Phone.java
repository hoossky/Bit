package com.jse.phone;

import lombok.Data;

@Data
public class Phone {
	private String phoneNumber, name, company;
	
	@Override
	public String toString() {
		return "Phone : 전화 번호 =" + phoneNumber + ", 이름 =" + name + ", 제조사 =" + company;
	}
	// 집 전화 번호, 이름, 제조사

}
@Data
class CellPhone extends Phone {

	private boolean portable;
	private String move;

	public CellPhone(String phoneNumber, String name, String company, boolean portable) {
		super(phoneNumber, name, company);

		setPortable(portable);
	}

	

	@Override
	public String toString() {

		return super.toString() + "," + portable + ", move=" + move;
	}

}
@Data
class Iphone extends CellPhone {
	private String search;

	public Iphone(String phoneNumber, String name, String company, boolean portable, String search) {
		super(phoneNumber, name, company, portable);
		this.search = search;
	}

	
	@Override
	public String toString() {

		return super.toString() + ", 구글 검색 =" + search;
	}
}
@Data
class GalaxyNote extends Iphone {
	public GalaxyNote(String phoneNumber, String name, String company, boolean portable, String search,
			String bigSize) {
		super(phoneNumber, name, company, portable, search);

		this.bigSize = bigSize;
	}

	private String bigSize;

	
	@Override
	public String toString() {

		return super.toString() + ", 사이즈 =" + bigSize;
	}
}
