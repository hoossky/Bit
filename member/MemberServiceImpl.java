package com.jse.member;

public class MemberServiceImpl implements MemberService {
	
	private Member[] members;
	private int count;
	public MemberServiceImpl() {
		members = new Member[5];
	}
	@Override
	public void setMembers(Member[] members) {
		this.members = members;
	}
	@Override
	public Member[] getMembers() { //Member[] members 리턴
		return members;
	}
	@Override
	public void add(Member member) {
		
		members[count] = member;
		count++;
	}
}