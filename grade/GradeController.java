package com.jse.grade;

import javax.swing.JOptionPane;
import com.jse.util.Constants;
import com.jse.member.Member;
import com.sun.corba.se.impl.orbutil.closure.Constant;

public class GradeController {
	public static void main(String[] args) {

		GradeService gradeService = new GradeServiceImpl();
		Grade grade = null;

		while (true) {

			switch (JOptionPane.showInputDialog(Constants.GRADE_MENU)) {
			case "0":
				return;
			case "1":

				for (int i = 0; i < 3; i++) {
					String[] values = JOptionPane.showInputDialog(Constants.GRADE_INPUT).split(",");
					grade = new Grade();
					grade.setName(values[0]);
					grade.setKorean(Integer.parseInt(values[1]));
					grade.setEnglish(Integer.parseInt(values[2]));
					grade.setMath(Integer.parseInt(values[3]));
					gradeService.add(grade);

				}
				break;

			case "2":
								
				JOptionPane.showMessageDialog(null, gradeService.getGrades());
				
				break;

			case "3":
				

				break;

//			case "4": 
//				System.out.println("회원 가입");
//				for(int i=0; i<3; i++) {
//					members[i] = join(scanner);
//				}
//				break;
//				
//			case "5":
//				for(int i=0; i<3; i++)
//				System.out.println(String.format("ID: %s\nPW: %s\n이름: %s\n나이: %d", 
//						members[i].getUserid(),members[i].getPasswd(),members[i].getName(),members[i].getAge()));
//				
//				break;
//			}
//			
//				
//								
//			}
//			
//		
//	}
//	public static Grade input(Scanner scanner) {
//		System.out.println("이름, 국어 , 영어, 수학을 입력해주세요.");
//		return new Grade(scanner.next(),scanner.nextInt(),
//				scanner.nextInt(),scanner.nextInt());
//				
			}

		}
	}
}