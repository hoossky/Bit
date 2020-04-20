package com.jse.member;

public class MemberServiceImpl implements MemberService {

	private Member[] members;
	private int count;

	public MemberServiceImpl() {
		members = new Member[5];
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
		Member[] returnName = null;
		int searchCoint = count(name);
		if (searchCoint != 0) {
			returnName = new Member[searchCoint];
			int j = 0;
			for (int i = 0; i < count; i++) {
				if (name.equals(members[i].getName())) {
					returnName[j] = members[i];
					j++;
					if(searchCoint ==j ) {
						
						break;
					}

				}
			}
		}

		return returnName;
	}

	@Override
	public Member[] searchByGender(String gender) {
		Member[] returnGender = null;

		return returnGender;
	}

	@Override
	public Member detail(String userid) {
		Member returnDetail = null;

		for (int i = 0; i < count; i++) {
			if (userid.equals(members[i].getUserid())) {

				returnDetail = members[i];

				break;

			}
		}
		return returnDetail;
	}

	@Override
	public int count() {

		return count;
	}

	@Override
	public int count(String name) {
		int returnCount = 0;

		for (int i = 0; i < count; i++) {

			if (name.equals(members[i].getName())) {
				returnCount++;
				break;
			}
		}

		return returnCount;
	}

	@Override
	public Member login(Member member) {

		Member returnLogin = null;

		for (int i = 0; i < count; i++) {
			if (member.getUserid().equals(members[i].getUserid())

					&& member.getPasswd().equals(members[i].getPasswd())) {

				returnLogin = members[i];
				break;
			}

		}

		return returnLogin;
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
				count--;

			}
		}
	}

}