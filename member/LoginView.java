package com.jse.member;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class LoginView extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	JButton saveButton, cancelButton;
	JPanel panel;
	JLabel[] labels;
	JTextField[] textFields;


	public void open() {
						
		this.setSize(500, 500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

		panel = new JPanel();
		this.add(panel);
		labels = new JLabel[5];
		textFields = new JTextField[2];
		String[] names = {"아이디","패스워드"};
		for(int i=0; i<names.length; i++) {
			labels[i] = new JLabel(names[i]);
			panel.add(labels[i]);
			textFields[i] = new JTextField();
			panel.add(textFields[i]);
		}
		

		saveButton = new JButton("로그인");
		cancelButton = new JButton("취 소");
		saveButton.addActionListener(this);
		cancelButton.addActionListener(this);

		panel.add(saveButton);
		panel.add(cancelButton);

		labels[0].setBounds(40, 60, 40, 40);
		labels[1].setBounds(40, 140, 60, 40);
		textFields[0].setBounds(130, 65, 200, 30);
		textFields[1].setBounds(130, 145, 200, 30);
		saveButton.setBounds(130, 330, 80, 30);
		cancelButton.setBounds(240, 330, 80, 30);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == saveButton) {
			textFields[0].setText("Hong,You,Lee,Shin,Leedo");
			textFields[1].setText("1,1,1,1,1");
			
			String data = String.format("%s / %s",
					 textFields[0].getText(),
					 textFields[1].getText());

			

		} else if (e.getSource() == cancelButton) {

		}

	}

	

}
