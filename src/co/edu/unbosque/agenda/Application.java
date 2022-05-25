package co.edu.unbosque.agenda;

import co.edu.unbosque.agenda.controller.MainController;
import co.edu.unbosque.agenda.view.MainView;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainController(new MainView());
	}

}
