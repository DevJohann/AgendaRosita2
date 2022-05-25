package co.edu.unbosque.agenda.view;

import java.awt.Font;

import javax.swing.*;

public class HistoryView {
	JFrame mainFrameHistoryView;
	JButton backButtonHistoryView = new JButton("Volver");
	JLabel mainLabelHistoryView = new JLabel("Mensaje");
	JLabel titleLabelHistoryView = new JLabel("Asunto:  ");
	JLabel titleContentHV = new JLabel();
	JLabel descLabelHistoryView = new JLabel("Descripción:  ");
	JLabel descContentHV = new JLabel();
	public HistoryView() {
		//JFrame settings
		mainFrameHistoryView = new JFrame();
		mainFrameHistoryView.setBounds(500, 100, 400, 500);
		mainFrameHistoryView.setLayout(null);
		mainFrameHistoryView.setVisible(true);
		
		//mainLabel section
		mainLabelHistoryView.setBounds(150, 30, 400, 40);
		mainLabelHistoryView.setFont(new Font("Serif", Font.BOLD, 24));
		mainFrameHistoryView.add(mainLabelHistoryView);
		
		//BackButton section
		backButtonHistoryView.setBounds(20, 420, 100, 25);
		mainFrameHistoryView.add(backButtonHistoryView);
		
		//titleLabel section
		titleLabelHistoryView.setBounds(30, 80, 400, 40);
		titleLabelHistoryView.setFont(new Font("Serif", Font.BOLD, 16));
		mainFrameHistoryView.add(titleLabelHistoryView);
		
		//titleContent section
		titleContentHV.setBounds(90, 80, 400, 40);
		//titleContentHV.setFont(new Font("Serif", Font.BOLD, 16));
		mainFrameHistoryView.add(titleContentHV);
		
		//descLabel section
		descLabelHistoryView.setBounds(30, 120, 400, 120);
		descLabelHistoryView.setFont(new Font("Serif", Font.BOLD, 16));
		mainFrameHistoryView.add(descLabelHistoryView);
		
		//descContent section
		descContentHV.setBounds(30, 140, 400, 120);
		//descContentHV.setFont(new Font("Serif", Font.BOLD, 16));
		mainFrameHistoryView.add(descContentHV);
	}
	public JButton getBackButtonHistoryView() {
		return this.backButtonHistoryView;
	}
	public JFrame getMainFrameHistoryView() {
		return mainFrameHistoryView;
	}
	public void setTitleContentHV(String value) {
		this.titleContentHV.setText(value);
	}
	public void setDescContentHV(String value) {
		this.descContentHV.setText(value);
	}
	
}
