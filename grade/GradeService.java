package com.jse.grade;

public interface GradeService {
	public Grade[] getGrades();
	public void setGrades(Grade[]grades);
	public void add(Grade grade);
	public void setCount(int count);
	public int getCount();
	public int total(Grade grade);
	public int average(Grade grade);
	public String record(Grade grade);
	public String printGrades();
	public String ranking();
}
