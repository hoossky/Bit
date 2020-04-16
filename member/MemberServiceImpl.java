package com.jse.member;

public class MemberServiceImpl implements MemberService {

	private Member[] members;
	private int count;

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
		Member[] searchNames = null;
		int searchCount = count(name);
		if (searchCount != 0) {
			searchNames = new Member[searchCount];
			int j = 0;
			for (int i = 0; i < count; i++) {
				if (name.equals(members[i].getName())) {

					searchNames[j] = members[i];
					j++;
					if (searchCount == j) {
						break;
					}
				}

			}
		}
		return searchNames;
	}
	
//	@Override
	public Member[] searchByGender(String gender) {
//		
//		Member[] returnGender = null;
//		char ch = .charAt(7);
//		String result = "";
//		switch (ch) {
//		case '1':case '3': result = "남성"; break;
//		case '2':case '4': result = "여성"; break;
//		case '5':case '6': result = "외국인"; break;
//
//		}
//		
//
		return null;
	}

	@Override
	public Member detail(String userid) {

		Member detailUserid = null;

		for (int i = 0; i < count; i++) {
			if (userid.equals(members[i].getUserid())) {

				detailUserid = members[i];

				break;
			}
		}

		return detailUserid;
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

			}
		}

		return returnCount;
	}

	@Override
	public Member login(Member member) {

		Member m = null;

		for (int i = 0; i < count; i++) {
			if (member.getUserid().equals(members[i].getUserid())
					&& member.getPasswd().equals(members[i].getPasswd())) {

				m = members[i];
				break;

			}
		}
		return m;

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
					&&  
					member.getPasswd().equals(members[i].getPasswd())) {
				members[i] = members[count-1];
				members[count-1] = null;
				count --;
			}
		}

	}


}