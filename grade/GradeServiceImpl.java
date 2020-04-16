package com.jse.grade;

public class GradeServiceImpl implements GradeService {

	private Grade[] grades;
	private int count;

	public GradeServiceImpl() {
		grades = new Grade[5];
		count = 0;
	}

	@Override
	public void add(Grade grade) {
		grades[count] = grade;
		count++;
	}

	@Override
	public int Count() {

		return count;
	}

	@Override
	public Grade[] list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Grade detail(Grade grade) {
		Grade returnGrade = new Grade();
		
		for(int i = 0; i<grades.length; i++) {
			if(grade == grades[i]) {
				
			}
		
		}
		
		return returnGrade;
	}

	@Override
	public int total(Grade grade) {
		return grade.getKorean() + grade.getEnglish() + grade.getMath();

	}

	@Override
	public int average(Grade grade) {
		return total(grade) / 3;

	}

	@Override
	public String record(Grade grade) {
		String result = "";
		int average = average(grade);

		if (average >= 90) {
			result = "A 학점입니다.";
		} else if (average >= 80) {
			result = "B 학점입니다.";
		} else if (average >= 70) {
			result = "C 학점입니다.";
		} else if (average >= 60) {
			result = "D 학점입니다.";
		} else if (average >= 50) {
			result = "E 학점입니다.";
		} else {
			result = "F 학점입니다.";
		}

		return result;
	}

//	@Override
//	public String printGrades() {
//		String result = "";
//		Grade[] grades = getGrades();
//		for (int i = 0; i < 3; i++) {
//			result += String.format("[%s : 총점 %d 점, 평균 %d 점,학점 : %s]\n", grades[i].getName(), total(grades[i]),
//					average(grades[i]), record(grades[i]));
//		}
//		return result;
//	}

	@Override
	public String ranking() {
		grades = list();
		int a = total(grades[0]);
		int y = total(grades[1]);
		int z = total(grades[2]);
		if (a > y && a > z) {
			if (y > z) {
				System.out.println(
						"1등 :" + grades[0].getName() + " 2등:" + grades[1].getName() + " 3등:" + grades[2].getName());
			} else if (z > y) {
				System.out.println(
						"1등 :" + grades[0].getName() + " 2등:" + grades[2].getName() + " 3등:" + grades[1].getName());
			}
		} else if (y > a && y > z) {
			if (a > z) {
				System.out.println(
						"1등 :" + grades[1].getName() + " 2등:" + grades[0].getName() + " 3등:" + grades[2].getName());
			} else if (z > a) {
				System.out.println(
						"1등 :" + grades[1].getName() + " 2등:" + grades[2].getName() + " 3등:" + grades[0].getName());
			}
		} else if (z > y && z > a) {
			if (y > a) {
				System.out.println(
						"1등 :" + grades[2].getName() + " 2등:" + grades[1].getName() + " 3등:" + grades[0].getName());
			} else if (a > y) {
				System.out.println(
						"1등 :" + grades[2].getName() + " 2등:" + grades[0].getName() + " 3등:" + grades[1].getName());
			}
		}
		return null;
	}

	@Override
	public void update(Grade grade) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Grade grade) {
		// TODO Auto-generated method stub

	}

}
