package com.jse.card;
import java.util.Scanner;
public class CardController {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CardService service = new CardService();
		while(true) {
			System.out.println("0. EXIT 1. 카드 3장 받기 2. 출력 ");
			switch(scanner.nextInt()) {
			case 0 : return;
			case 1 : System.out.println("카드 3장 받기");
			for(int i=0; i<3; i++) {
				System.out.println("모양, 숫자 입력");
				service.add(new Card(scanner.next(),
						scanner.nextInt()));	
			}
			
			break;
			case 2 :
				Card[] cards = service.getCards();
				for(int i = 0; i<3; i++) {
					System.out.println(String.format("카드 모양 %s 카드 넘버 %d ", 
							cards[i].getKind(), cards[i].getNumber()));
				}
				break;
			}
		}
	}

}
