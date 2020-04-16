package com.jse.card;
import java.util.Scanner;
public class CardController {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CardServiceImpl service = new CardServiceImpl();
		Card card = null;
		while(true) {
			System.out.println("0. EXIT 1. 카드 3장 받기 2. 출력 ");
			switch(scanner.nextInt()) {
			case 0 : return;
			case 1 : System.out.println("종류와 숫자 입력");
			for(int i=0; i<3; i++) {
				card = new Card();
				card.setKind(scanner.next());
				card.setNumber(scanner.nextInt());
				service.add(card);	
			}
			
			break;
			case 2 :
				Card[] cards = service.list();
				for(int i = 0; i<3; i++) {
					System.out.println(String.format("카드 모양 %s 카드 넘버 %d ", 
							cards[i].getKind(), cards[i].getNumber()));
				}
				break;
			}
		}
	}

}
