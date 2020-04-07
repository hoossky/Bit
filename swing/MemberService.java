package com.jse.swing;

public class MemberService {
	private MemberBean[] members;
	public MemberService() {
		members = new MemberBean[10];
	}
	public void setMembers(MemberBean[] members) {
		this.members = members;
	}
	public MemberBean[] getMembers() {
		return members;
	}
}
