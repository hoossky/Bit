package com.jse.member;

public class MemberServiceImpl implements MemberService {

	private Member[] members;
	int count;

	public MemberServiceImpl() {
		members = new Member[5];
		count = 0;
	}

	@Override
	public void add(Member member) {
		members[count] = member;
		count++;

	}

	@Override
	public Member[] list() {

		return members;
	}

	@Override
	public Member[] searchByName(String name) {
		Member[] returnNames = null;
		int searchCount = count(name);
		if (searchCount != 0) {
			returnNames = new Member[searchCount];
			int j = 0;
			for (int i = 0; i < count; i++) {
				if (name.equals(members[i].getName())) {
					returnNames[j] = members[i]; // 질문*************************
					j++;
					if (searchCount == j) {
						break;
					}
				}
			}
		}
		return returnNames;
	}

	@Override
	public Member[] searchByGender(String gender) {
		Member[] returnGenders = null;
		
		return returnGenders;
	}

	@Override
	public Member detail(String userid) {
		Member returndetail = null;
		for (int i = 0; i < count; i++) {
			if (userid.equals(members[i].getUserid())) {

				returndetail = members[i];
				break;
			}

		}
		return returndetail;
	}

	@Override
	public int count() {

		return count;
	}

	@Override
	public int count(String name) {
		int returncount = 0;
		for (int i = 0; i < count; i++) {
			if (name.equals(members[i].getName())) {
				returncount++;
			}
		}
		return returncount;
	}

	@Override
	public Member login(Member member) {
		Member returnlogin = null;
		for (int i = 0; i < count; i++) {
			if (member.getUserid().equals(members[i].getUserid())
					&& member.getPasswd().equals(members[i].getPasswd())) {

				returnlogin = members[i];
				break;

			}
		}
		return returnlogin;
	}

	@Override
	public void update(Member member) {

		for (int i = 0; i < count; i++) {
			if (member.getUserid().equals(members[i].getUserid())) {
				members[i].setPasswd(member.getPasswd());
				break;

			}
		}

	}

	@Override
	public void delete(Member member) {

		for (int i = 0; i < count; i++) {
			if (member.getUserid().equals(members[i].getUserid())
					&& member.getPasswd().equals(members[i].getPasswd())) {

				members[i] = members[count - 1];
				members[count - 1] = null;
				i--;
			}
		}

	}

}