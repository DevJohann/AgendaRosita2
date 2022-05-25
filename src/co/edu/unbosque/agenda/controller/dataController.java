package co.edu.unbosque.agenda.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.agenda.view.HistoryView;
import co.edu.unbosque.agenda.view.dataView;

public class dataController {
	public dataController(dataView dataView) {
		//SendDataButton action
		dataView.getSendDataButtonDataView().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dataView.setFooterLabelDataView("Enviado con éxito");
				dataView.setVisibleHistoryButton(true);
			}
		});
		//HistoryButton section
		dataView.getHistoryButtonDataView().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dataView.getMainFrameDataView().getContentPane().removeAll();
				dataView.getMainFrameDataView().dispose();
				new HistoryController(new HistoryView(), dataView);
			}
		});
	}
}
