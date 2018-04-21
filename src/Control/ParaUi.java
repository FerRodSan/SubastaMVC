package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

import org.w3c.dom.Text;

import Modelo.ListaUsuario;
import Modelo.Puja;
import Modelo.Subasta;
import Modelo.Usuario;
import Vista.Ui;

public class ParaUi extends Ui implements ParaUiable {

	private ActionAgregar agregar;
	private ActionPujar pujar;
	private ActionCrearSubasta creacion;
	private ActionEjecutar ejecutar;
	private Subasta subasta;
	private ListaUsuario listausuario;

	public ParaUi() {
		super();
		this.listausuario = new ListaUsuario();
		this.agregar = new ActionAgregar(this);
		this.pujar = new ActionPujar(this);
		this.creacion = new ActionCrearSubasta(this);
		this.ejecutar = new ActionEjecutar(this);
		setListeners();
	}

	@Override
	public void actualizarListaPujadoresSubasta() {
		this.getListaPuja().setText("");
		for (Puja pujador : subasta.getListaPujas()) {
			this.getListaPuja().setText(this.getListaPuja().getText() + pujador.toString() + "\n");
		}
	}

	public void actualizarListaUsuarios() {
		this.getListaUsuarios().setText("");
		for (Usuario usuario : listausuario.getLista()) {
			this.getListaUsuarios().setText(this.getListaUsuarios().getText() + usuario.toString() + "\n");
		}
		agregarComboUsuarios(listausuario.getLista());
	}

	@Override
	public void mostrarGanador(Usuario mayorPostor) {
		this.getMensaje().setText(mayorPostor.toString());
	}

	@Override
	public void agregarUsuarioPuja() {
		String nombre = String.valueOf(this.getNombreUsuario().getText());
		int credito = Integer.valueOf(String.valueOf(this.getCreditoUsuario().getText()));
		listausuario.agregarUsuario(nombre, credito);
		this.getNombreUsuario().setText("");
		this.getCreditoUsuario().setText("");
	}

	@Override
	public boolean comprobarTxtVacio() {
		if (this.getNombreUsuario().getText().isEmpty() || this.getCreditoUsuario().getText().isEmpty())
			return true;
		if (Integer.valueOf(String.valueOf(this.getCreditoUsuario().getText())) < 0)
			return true;
		return false;
	}

	private void setListeners() {
		this.getbtnIrAusuario().addActionListener(agregar);
		this.getBtnIrCrearSubasta().addActionListener(creacion);
		this.getBtnIrPujar().addActionListener(pujar);
		this.getBtnIrTerminar().addActionListener(ejecutar);
	}

	public void agregarComboUsuarios(ArrayList<Usuario> lista) {
		for (Usuario usuario : lista) {
			this.getComboUsu().addItem(usuario);
		}
	}

	public void actualizarFull() {
		subasta.getListaPujas().clear();
		this.getListaPuja().setText("");
		this.getComboPuj().removeAllItems();
		this.getMensajeProducto().setText("");
		this.getProducto().setText("");
	}

	public void actualizarComboPujadores() {
		for (Usuario usuario : listausuario.getLista()) {
			if (!usuario.equals((Usuario) this.getComboUsu().getSelectedItem())) {
				this.getComboPuj().addItem(usuario);
			}
		}
	}

	public void subastar() {
		Usuario subastador = (Usuario) this.getComboUsu().getSelectedItem();
		String producto = this.getProducto().getText();
		subasta = new Subasta(subastador, producto);
	}

	public void ponerProductoMensaje() {
		this.getMensajeProducto().setText("el subastador es " + this.getComboUsu().getSelectedItem()
				+ " y el producto es " + this.getProducto().getText());
	}

	public void crearPuja() {
		Usuario pujador = (Usuario) this.getComboPuj().getSelectedItem();
		int apuesta = Integer.valueOf(this.getApuesta().getText());
		Puja pujaNueva = new Puja(pujador, apuesta);
		subasta.getListaPujas().add(pujaNueva);
		this.getApuesta().setText("");
		this.getMensaje().setText("");
	}

	public void finalizarSubasta() {
		int mayorApuesta = 0;
		if (subasta.isEstado()) {
			for (Puja pujador : subasta.getListaPujas()) {
				if (pujador.getDineroPuja() > subasta.getPujaMayor().getDineroPuja()) {
					subasta.setPujaMayor(pujador);
				}
			}
			Usuario ganador = subasta.getPujaMayor().getPujador();
			mayorApuesta = subasta.getPujaMayor().getDineroPuja();
			ganador.decrementarCredito(mayorApuesta);
			subasta.getSubastador().incrementarCredito(mayorApuesta);
			subasta.setEstado(false);
			mostrarGanador(ganador);
		} else {
			mensajeError();
		}
	}

	public boolean comprobarUsuarioRepe() {
		for (Usuario usuario : listausuario.getLista()) {
			if (this.getNombreUsuario().equals(usuario.getNombre()))
				return true;
		}
		return false;
	}

	public void mensajeError() {
		this.getTxtMensajeErrorUsuario().setText("tienes un error cualquiera");

	}

	public boolean productoVacio() {
		if (this.getProducto().getText().isEmpty()) {
			return true;
		}
		return false;
	}

	public boolean comprobarPuja() {
		Usuario pujador = (Usuario) this.getComboPuj().getSelectedItem();
		if (Integer.valueOf(this.getApuesta().getText()) > pujador.getCredito())
			return true;

		return false;
	}
}
