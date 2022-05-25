package co.edu.unbosque.agenda.view;

import java.awt.Font;

import javax.swing.*;

public class MainView {
	JFrame mainFrameMainView;
	JLabel mainLabelMainView = new JLabel("Agenda de rosita 2.0");
	JButton inButtonMainView = new JButton("Ingresar");
	JButton outButtonMainView = new JButton("Salir");
	
	public MainView() {
		//JFrame settings
		mainFrameMainView = new JFrame();
		mainFrameMainView.setBounds(500, 100, 400, 500);
		mainFrameMainView.setLayout(null);
		mainFrameMainView.setVisible(true);
		
		//MainLabel section
		mainLabelMainView.setBounds(90, 30, 400, 40);
		mainLabelMainView.setFont(new Font("Serif", Font.BOLD, 24));
		mainFrameMainView.add(mainLabelMainView);
		
		//inButton section
		inButtonMainView.setBounds(130, 180, 120, 40);
		mainFrameMainView.add(inButtonMainView);
		
		//outButton section
		outButtonMainView.setBounds(130, 240, 120, 40);
		mainFrameMainView.add(outButtonMainView);
	}
	
	public JButton getInButtonMainView() {
		return this.inButtonMainView;
	}
	public JButton getOutButtonMainView() {
		return this.outButtonMainView;
	}
	public JFrame getMainFrameMainView() {
		return this.mainFrameMainView;
	}
}
