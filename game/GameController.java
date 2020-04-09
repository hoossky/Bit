package com.jse.game;
import java.util.Random;
import java.util.Scanner;

import com.jse.member.Kaup;
import com.jse.util.Calculator;

public class GameController {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		Member member = new Member();
		
		Rps rps = null; 		
		Calculator calculator = null; 
		Dice dice = null;
		Kaup kaup = null;
		
		while(true) {
			System.out.println("0. 종료 "
					+ "1. 회원가입 "
					+ "2. 로그인 "
					+ "3. 주사위 홀짝 맞추기 "
					+ "4. 1부터 100까지의 합 "
					+ "5. 가위 바위 보 "
					+ "6. 계산기 "
					+ "7. 카우프 지수");
			int flag = scanner.nextInt();
			switch(flag) {
			case 0 : System.out.println("종료"); return;
			case 1 : 
				System.out.println("회원가입"); 
				System.out.println("아이디 입력");
				String id = scanner.next();
				member.setId(id);
			
			break;
			case 2 : 
				System.out.println("로그인");
				System.out.println("아이디 입력");
				String id2 = scanner.next();
				String returnId = member.getId();
				System.out.println("로그인된 아이디 : "+returnId);
				if(id2.equals(returnId)) {
					System.out.println("로그인 성공");
				}else {
					System.out.println("로그인 실패");
				}
				break;
			case 3 : 
				dice = new Dice();
				System.out.println("*** 주사위 홀짝 맞추기 게임 ***");
				System.out.println("기대하는 값 홀 / 짝을 입력해주세요");
				String expect = scanner.next();
				System.out.println("사용자가 입력한 값 : "+ expect);
				dice.setExpect(expect);
				int diceNumber = random.nextInt(6)+1;
				System.out.println("주사위 값 : "+diceNumber);
				dice.setDiceNumber(diceNumber);
				String result = dice.switchDice();
				System.out.println(result);				
				
				break;
			case 4 : sum(); break;
			case 5 :
				rps = new Rps();
				System.out.println("가위 : 1 , 바위 : 2 , 보 : 3을 입력하세요");
				int userValue = scanner.nextInt();
				System.out.println("사용자의 값은"+userValue+"입니다.");
				rps.setUserValue(userValue);
				int computerValue = random.nextInt(3)+1;
				System.out.println("컴퓨터의 값은"+computerValue+"입니다.");
				rps.setComputerValue(computerValue);
				String result2 = rps.game();
				System.out.println(result2);
								
				break;
			case 6 : 
				calculator = new Calculator();
				System.out.println("계산기");
				System.out.println("첫번째 수 입력");
				int a = scanner.nextInt();
				calculator.setNum1(a);
				System.out.println("두번째 수 입력");
				int b = scanner.nextInt();
				calculator.setNum2(b);
				int c = calculator.calc();
				System.out.println("두수의 합 : "+c);
				break;
				
			case 7 :
				kaup = new Kaup();
				System.out.println("키를 입력해주세요.");
				kaup.setHeight(scanner.nextDouble());
				System.out.println("몸무게를 입력해주세요.");
				kaup.setWeight(scanner.nextDouble());			
				System.out.println(kaup.calculate());
				break;
			}
		}
	}
	

	static void game() {
		System.out.println("가위 : 1 , 바위 : 2 , 보 : 3을 입력하세요");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		System.out.println("사용자의 값은"+num+"입니다.");
		Random random = new Random();
		int com = random.nextInt(3)+1;
		System.out.println("컴퓨터의 값은"+com+"입니다.");
		String result = "*** 비겼습니다 ***";
		if(num == 1) {
			switch(com) {
			case 2: result = "*** 패배 ***"; break;
			case 3: result = "*** 승리 ***"; break;
			}
		}else if(num == 2) {
			switch(com) {
			case 1: result = "*** 승리 ***"; break;
			case 3: result = "*** 패배 ***"; break;
			}
		}else if(num == 3) {
			switch(com) {
			case 1: result = "*** 패배 ***"; break;
			case 2: result = "*** 승리 ***"; break;			
			}
		
		
	}
		System.out.println(result);
}
	static void sum() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
			sum += i;
		}
		System.out.println("합 계 : " + sum);
	}
}
