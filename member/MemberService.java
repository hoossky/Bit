package com.jse.member;

public class MemberService {
	private Member[] members;
	public MemberService() {
		members = new Member[10];
	}
	public void setMembers(Member[] members) {
		this.members = members;
	}
	public Member[] getMembers() {
		return members;
	}
}
