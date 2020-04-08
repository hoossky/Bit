package com.jse.inheritance;
import java.util.Scanner;
import javax.swing.JOptionPane;

import jdk.nashorn.internal.scripts.JO;
public class Engine {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		PhoneService service = new PhoneService();
		String message = "";
		while(true) {
			
			System.out.println();
				
			switch(JOptionPane.showInputDialog("0. 종료 \n1. 집 전화 입력 2. 집 전화 출력 "
					+"3. 휴대 전화 입력 4. 휴대 전화 출력 \n"
					+"5. 아이폰 입력 6. 아이폰 출력 "
					+"7. 갤럭시 입력 8. 갤럭시 출력 ")) {
			
				case "0": return;
				case "1":
				for(int i=0; i<3; i++) {
				String[] values = JOptionPane.showInputDialog(" 입력 : 집 전화 번호, 이름, 제조사 ").split(",");
				service.add(new Phone(values[0],values[1],values[2]));	
				}
				break;
			
				case "2": 
				Phone[] phones = service.getPhones();
				for(int i=0; i<3; i++) {
					message += String.format(" 출력 : %s, %s, %s\n", 
							phones[i].getPhoneNumber(),phones[i].getName(),phones[i].getCompany());	
				}
				JOptionPane.showMessageDialog(null, message);
				break;
			
				case "3" : 
					for(int i=0; i<3; i++) {
					String[] values = JOptionPane.showInputDialog(" 입력 : 휴대 전화 번호, 이름, 제조사 ").split(",");
					service.add(new CellPhone(values[0],values[1],values[2],true));
					}
					
					break;
				case "4" :
					CellPhone[] cellPhones = service.getCellPhones();
					
					for(int i=0; i<3; i++) {
						message += String.format(" 출력 : %s, %s, %s, %s\n", 
							cellPhones[i].getPhoneNumber(),
							cellPhones[i].getName(),
							cellPhones[i].getCompany(),
							cellPhones[i].getMove());
					}
					JOptionPane.showMessageDialog(null, message);
					
					break;
				case "5" :
					for(int i=0; i<3; i++) {
					String[] values = JOptionPane.showInputDialog(" 입력 : 휴대 전화 번호, 이름, 제조사, 구글검색 ").split(",");
					service.add(new Iphone(values[0],values[1],values[2],true, values[3]));
					
					}
					
					break;
				case "6" :
					Iphone[] iphones = service.getIphones();
					for(int i=0; i<3; i++) {
						message += String.format(" 번호 : %s, 이름 : %s, 제조사 : %s, %s, 구글검색 : %s\n", 
							iphones[i].getPhoneNumber(),
							iphones[i].getName(),
							iphones[i].getCompany(),
							iphones[i].getMove(),
							iphones[i].getSearch());
					}
					JOptionPane.showMessageDialog(null, message);
					break;
			
				case "7" :
					for(int i=0; i<3; i++) {
						String[] values = JOptionPane.showInputDialog(" 입력 : 휴대 전화 번호, 이름, 제조사,\n 구글검색, 사이즈 ").split(",");
						service.add(new GalaxyNote(values[0],values[1],values[2],true,values[3],values[4]));
					}
					
					break;
					
				case "8" : 
					GalaxyNote[] galaxyNotes = service.getGalaxyNotes();
					for(int i=0; i<3; i++) {
						message += String.format("번호 : %s, 이름 : %s, 제조사 : %s,\n%s, 구글검색 : %s, 사이즈 : %s\n ",
								galaxyNotes[i].getPhoneNumber(),
								galaxyNotes[i].getName(),
								galaxyNotes[i].getCompany(),
								galaxyNotes[i].getMove(),
								galaxyNotes[i].getSearch(),
								galaxyNotes[i].getBigSize());
						
					}
					JOptionPane.showMessageDialog(null, message);
					break;
					
			}
		}
	}

}
