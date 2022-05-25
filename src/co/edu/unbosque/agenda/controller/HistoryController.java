package co.edu.unbosque.agenda.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.agenda.view.HistoryView;
import co.edu.unbosque.agenda.view.dataView;

public class HistoryController {
	public HistoryController(HistoryView historyView, dataView dataView) {
		//title
		historyView.setTitleContentHV(dataView.getTitleFieldDataView().getText());
		
		//Description
		historyView.setDescContentHV(dataView.getDescFieldDataView().getText());
		//BackButton action
		historyView.getBackButtonHistoryView().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				historyView.getMainFrameHistoryView().getContentPane();
				historyView.getMainFrameHistoryView().dispose();
				new dataController(new dataView());
			}
		});
	}
}
