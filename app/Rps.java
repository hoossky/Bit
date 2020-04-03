package com.jse.app;

public class Rps {
	private int userValue; 
	private int computerValue;
	
	public void setUserValue(int userValue) {
		this.userValue = userValue;
	}
	public int getUserValue() {
		return userValue;
	}
	
	public void setComputerValue(int computerValue) {
		this.computerValue = computerValue;
	}
	public int getComputerValue() {
		return computerValue;
	}
	public String game() {
							
		String result2 = "*** 비겼습니다 ***";
		if(userValue == 1) {
			switch(computerValue) {
			case 2: result2 = "*** 패배 ***"; break;
			case 3: result2 = "*** 승리 ***"; break;
			}
		}else if(userValue == 2) {
			switch(computerValue) {
			case 1: result2 = "*** 승리 ***"; break;
			case 3: result2 = "*** 패배 ***"; break;
			}
		}else if(userValue == 3) {
			switch(computerValue) {
			case 1: result2 = "*** 패배 ***"; break;
			case 2: result2 = "*** 승리 ***"; break;			
			}
		}
		return result2;
	}
}