package co.edu.unbosque.agenda.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.agenda.view.MainView;
import co.edu.unbosque.agenda.view.dataView;

public class MainController {
	public MainController(MainView mainView) {
		//inButton action
		mainView.getInButtonMainView().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				mainView.getMainFrameMainView().getContentPane().removeAll();
				mainView.getMainFrameMainView().dispose();
				new dataController(new dataView());
			}
		});
		
		//outButton action
		mainView.getOutButtonMainView().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				mainView.getMainFrameMainView().dispose();
			}
		});
	}
}
