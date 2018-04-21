package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionAgregar implements ActionListener {

	private ParaUi paraui;

	public ActionAgregar(ParaUi paraui) {
		super();
		this.paraui = paraui;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (paraui.comprobarUsuarioRepe() || paraui.comprobarTxtVacio()) {
			paraui.mensajeError();
		} else {
			paraui.agregarUsuarioPuja();
			paraui.actualizarListaUsuarios();
		}
	}
}
