package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEjecutar implements ActionListener{
	
	private ParaUi paraui;

	public ActionEjecutar(ParaUi paraui) {
		super();
		this.paraui = paraui;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		paraui.finalizarSubasta();
		paraui.actualizarFull();
	}
}
