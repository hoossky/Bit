package com.jse.member;
/*
 개발자님 키와 몸무게를 이용하여
 카우푸지수를 구하고
 그 결과 정상, 저체중, 비만 등으로 몸의 상태만
 알려주는 프로그램을 만들어주세요 
 카우프지수 = 체중(Kg) / 신장(m)2
 13이하 : 영양실조
 13 ~ 15 : 여윔
 15 ~ 18 : 정상
 18 ~ 20 : 과체중
 20이상 : 소아비만
 
 10~20
 10 < a && a < 20
 */
public class Kaup {
	private double height;
	private double weight;
		
	 public void setHeight(double height) {
		this.height = height / 100;
	}
	 public double getHeight() {
		 return height;
	 }
	 public void setWeight(double weight) {
		 this.weight = weight;
	 }
	 public double getWeight() {
		 return weight;
	 }
	 
	 public String calculate() {
		String result3 = "";
		
		double kaupIndex = (weight / (height * height));
								
		if(kaupIndex <= 13) {
			result3 = "영양실조 입니다.";		
		}else if(kaupIndex < 15) {
			result3 = "여윔 입니다.";		
		}else if(kaupIndex < 18) {
			result3 = "정상 입니다.";		
		}else if(kaupIndex < 20) {
			result3 = "과체중 입니다.";		
		}else {
			result3 = "소아비만 입니다.";		
		}
		System.out.println("카우프 지수 : "+kaupIndex);
		return result3;
		}
	 
	 
	}

