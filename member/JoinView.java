package com.jse.member;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import sun.security.util.Length;

public class JoinView extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	JButton saveButton, listButton, loginButton;
	JPanel panel;
	
	JLabel[] labels;
	JTextField[] textFields;
	JLabel areaLabel;
	JTextArea textArea;

	MemberService memberService;

	public JoinView() {
		memberService = new MemberServiceImpl();
	}

	public void open() {

		this.setSize(500, 500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

		panel = new JPanel();
		this.add(panel);
		labels = new JLabel[6];
		textFields = new JTextField[6];
		textArea = new JTextArea();
		String[] names = { "이름", "아이디", "패스워드", "SSN", "주소","검색 결과" };
		for (int i = 0; i < names.length; i++) {
			labels[i] = new JLabel(names[i]);
			panel.add(labels[i]);
			textFields[i] = new JTextField();
			panel.add(textFields[i]);
		}

		saveButton = new JButton("저 장");
		listButton = new JButton("목 록");
		loginButton = new JButton("로그인");
		saveButton.addActionListener(this);
		listButton.addActionListener(this);
		loginButton.addActionListener(this);

		panel.add(saveButton);
		panel.add(listButton);
		panel.add(loginButton);

		labels[0].setBounds(40, 10, 40, 40);
		labels[1].setBounds(40, 50, 40, 40);
		labels[2].setBounds(40, 90, 60, 40);
		labels[3].setBounds(40, 130, 40, 40);
		labels[4].setBounds(40, 170, 60, 40);
		labels[5].setBounds(40,210,60,40);
		textFields[0].setBounds(120,10,200,30);
		textFields[1].setBounds(120,50,200,30);
		textFields[2].setBounds(120,90,200,30);
		textFields[3].setBounds(120,130,280,30);
		textFields[4].setBounds(120,180,280,30);
		textFields[5].setBounds(120,220,280,150);
		saveButton.setBounds(120, 380, 80, 30);
		listButton.setBounds(220, 380, 80, 30);
		loginButton.setBounds(320, 380, 80, 30);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == saveButton) {
			textFields[0].setText("홍길동,유관순,이순신,신사임당,이도");
			textFields[1].setText("Hong,You,Lee,Shin,Leedo");
			textFields[2].setText("1,1,1,1,1");
			textFields[3].setText("900101-1,960101-2,980101-1,011010-4,020606-3");
			textFields[4].setText("서울,대전,대구,부산,제주");


			String data = String.format("%s /%s /%s /%s /%s",
					textFields[0].getText(),
					textFields[1].getText(),
					textFields[2].getText(),
					textFields[3].getText(),
					textFields[4].getText());

			String[] arr = data.split("/");
			Member[] members = new Member[5];
			String[] names = arr[0].split(",");
			String[] userids = arr[1].split(",");
			String[] passwds = arr[2].split(",");
			String[] ssns = arr[3].split(",");
			String[] adresss = arr[4].split(",");
			
			for (int i = 0; i < 5; i++) {
				members[i] = new Member();
				members[i].setName(names[i]);
				members[i].setUserid(userids[i]);
				members[i].setPasswd(passwds[i]);
				members[i].setSsn(ssns[i]);
				members[i].setAddress(adresss[i]);
				memberService.add(members[i]);
				
				}
//				System.out.println();
//				String[] t = arr[i].split(",");
//				for (int j = 0; j < arr.length; j++) {
//					mtx[i][j] = "";
//					System.out.println();
//				}
			

//			for(int i=0;i< arr.length; i++) {
//				for(int j=0; j< mtx[i].length; j++) {
//					System.out.println(mtx[i][j]);
//				}
//				System.out.println();
//			}

//			memberService = new MemberServiceImpl(); 
//			for (int i = 0; i < names.length; i++) {
//				Member member = new Member();
//				member.setName(names[i]);
//				member.setUserid(userids[i]);
//				member.setPasswd(passwds[i]);
//				member.setSsn(ssns[i]);
//				memberService.add(member);
////				System.out.println(member);
//			}
//
//			Member[] members = memberService.getMembers();
//			for(int i=0; i < members.length; i++) {
//			System.out.println(members[i]);
//			}

		} else if (e.getSource() == listButton) {
			JOptionPane.showMessageDialog(this, "클릭");
				
			Member[] members = memberService.getMembers();
			for (int i = 0; i < members.length; i++) {
			System.out.println("서비스로 들어온 멤버");
			System.out.println(members[i]); // 상속의 개념, lombok
											// for 문 안에 엘리먼트가 값을 갖고 있다
											// members로 찍으면 주소가 뜸
			}
			textFields[0].setText("");
			textFields[1].setText("Hong,You,Lee,Shin,Leedo");
			textFields[2].setText("1,1,1,1,1");
			textFields[3].setText("");
			textFields[4].setText("");
			textFields[5].setText("");
			
		}

	}
}
