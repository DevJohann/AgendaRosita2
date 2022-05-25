package co.edu.unbosque.agenda.view;

import java.awt.Font;

import javax.swing.*;

public class dataView {
	JFrame mainFrameDataView;
	JLabel mainLabelDataView = new JLabel("Ingrese los datos");
	JLabel titleLabelDataView = new JLabel("Título: ");
	JLabel descLabelDataView = new JLabel("Descripción: ");
	JLabel footerLabelDataView = new JLabel();
	JTextArea descFieldDataView = new JTextArea();
	JTextField titleFieldDataView = new JTextField();
	JButton sendDataButtonDataView = new JButton("Enviar");
	JButton historyButtonDataView = new JButton("Ver mensaje");
	public dataView() {
		//MainFrame settings
		mainFrameDataView = new JFrame();
		mainFrameDataView.setBounds(500, 100, 400, 500);
		mainFrameDataView.setLayout(null);
		mainFrameDataView.setVisible(true);
		
		//MainLabel section
		mainLabelDataView.setBounds(100, 30, 400, 40);
		mainLabelDataView.setFont(new Font("Serif", Font.BOLD, 24));
		mainFrameDataView.add(mainLabelDataView);
		
		//titleLabel section
		titleLabelDataView.setBounds(30, 100, 400, 40);
		titleLabelDataView.setFont(new Font("Serif", Font.BOLD, 16));
		mainFrameDataView.add(titleLabelDataView);
		
		//titleField section
		titleFieldDataView.setBounds(90, 111, 240, 20);
		mainFrameDataView.add(titleFieldDataView);
		
		//descLabel section
		descLabelDataView.setBounds(30, 140, 400, 40);
		descLabelDataView.setFont(new Font("Serif", Font.BOLD, 16));
		mainFrameDataView.add(descLabelDataView);
		
		//descField section
		descFieldDataView.setBounds(30, 180, 300, 150);
		mainFrameDataView.add(descFieldDataView);
		
		//sendDataButton section
		sendDataButtonDataView.setBounds(70, 360, 110, 30);
		mainFrameDataView.add(sendDataButtonDataView);
		
		//footerLabel section
		footerLabelDataView.setBounds(140, 400, 400, 40);
		footerLabelDataView.setFont(new Font("Serif", Font.BOLD, 16));
		mainFrameDataView.add(footerLabelDataView);
		
		//historyButton section
		
		historyButtonDataView.setBounds(200, 360, 110, 30);
		mainFrameDataView.add(historyButtonDataView);
	}
	public JButton getSendDataButtonDataView() {
		return sendDataButtonDataView;
	}
	public JTextArea getDescFieldDataView() {
		return descFieldDataView;
	}
	public JTextField getTitleFieldDataView() {
		return titleFieldDataView;
	}
	public JLabel getFooterLabelDataView() {
		return footerLabelDataView;
	}
	public void setFooterLabelDataView(String value) {
		this.footerLabelDataView.setText(value); 
	}
	public void setVisibleHistoryButton(boolean value) {
		this.historyButtonDataView.setVisible(value);
	}
	public JButton getHistoryButtonDataView() {
		return this.historyButtonDataView;
	}
	public JFrame getMainFrameDataView() {
		return this.mainFrameDataView;
	}
	
}
