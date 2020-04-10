package com.jse.member;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class JoinView extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	JButton saveButton, cancelButton;
	JPanel panel;
	
	JLabel[] labels;
	JTextField[] textFields;
	
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
		labels = new JLabel[5];
		textFields = new JTextField[5];
		String[] names = {"이름","아이디","패스워드","주민번호","추가사항"};
		for(int i=0; i < names.length; i++) {
			labels[i] = new JLabel(names[i]);
			panel.add(labels[i]);
			textFields[i] = new JTextField();
			panel.add(textFields[i]);
		}
		

		saveButton = new JButton("저 장");
		cancelButton = new JButton("취 소");
		saveButton.addActionListener(this);
		cancelButton.addActionListener(this);

		panel.add(saveButton);
		panel.add(cancelButton);

		labels[0].setBounds(40, 10, 40, 40);
		labels[1].setBounds(40, 50, 40, 40);
		labels[2].setBounds(40, 90, 60, 40);
		labels[3].setBounds(40, 130, 40, 40);
		labels[4].setBounds(40, 170, 60, 40);
		textFields[0].setBounds(130, 15, 200, 30);
		textFields[1].setBounds(130, 55, 200, 30);
		textFields[2].setBounds(130, 95, 200, 30);
		textFields[3].setBounds(130, 135, 280, 30);
		textFields[4].setBounds(130, 185, 280, 120);
		saveButton.setBounds(130, 330, 80, 30);
		cancelButton.setBounds(240, 330, 80, 30);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == saveButton) {
			textFields[0].setText("홍길동, 유관순, 이순신, 신사임당, 이도");
			textFields[1].setText("Hong, You, Lee, Shin, Leedo");
			textFields[2].setText("1,1,1,1,1");
			textFields[3].setText("900101-1,960101-2,980101-1,011010-4,020606-3");

			JOptionPane.showMessageDialog(this, 
					String.format("%s / %s / %s / %s", 
							textFields[0].getText(),
							textFields[1].getText(),
							textFields[2].getText(),
							textFields[3].getText()));
			
			
			String[] data = String.format("%s / %s / %s / %s", 
					textFields[0].getText(),
					textFields[1].getText(),
					textFields[2].getText(),
					textFields[3].getText()).split("/");
			
			String[] names = data[0].split(",");
					// 각 스플릿을 통해 담는다.
			Member[] members = memberService.getMembers();
			for(int i=0; i < members.length; i++) {
			System.out.println(members[i].toString());
			}
		} else if (e.getSource() == cancelButton) {

		}

	}

	

}
