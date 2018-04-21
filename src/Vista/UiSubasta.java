package Vista;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextPane;

public class UiSubasta extends JPanel {
	protected JTextField txtProducto;
	protected JComboBox comboUsuarios;
	protected JTextField txtProductoSubastado;
	protected JComboBox comboPujador;
	protected JTextField txtApuesta;
	protected JTextField txtGanador;
	protected JButton btnTerminar;
	protected JTextPane txtListaPujas;
	protected JButton btnPuja;
	protected JButton btnCrearSubasta;
	private JLabel lblMensajeError;
	private JTextField txtErrorPuja;

	/**
	 * Create the panel.
	 */
	public UiSubasta() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 14, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 1.0, 0.0, 0.0,
				Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0,
				Double.MIN_VALUE };
		setLayout(gridBagLayout);

		JLabel lblNewLabel = new JLabel("Empieza la subasta");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 8;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 1;
		add(lblNewLabel, gbc_lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Usuario:");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 3;
		add(lblNewLabel_1, gbc_lblNewLabel_1);

		comboUsuarios = new JComboBox();
		GridBagConstraints gbc_comboUsuarios = new GridBagConstraints();
		gbc_comboUsuarios.gridwidth = 3;
		gbc_comboUsuarios.insets = new Insets(0, 0, 5, 5);
		gbc_comboUsuarios.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboUsuarios.gridx = 2;
		gbc_comboUsuarios.gridy = 3;
		add(comboUsuarios, gbc_comboUsuarios);

		JLabel lblProducto = new JLabel("Producto:");
		GridBagConstraints gbc_lblProducto = new GridBagConstraints();
		gbc_lblProducto.anchor = GridBagConstraints.EAST;
		gbc_lblProducto.insets = new Insets(0, 0, 5, 5);
		gbc_lblProducto.gridx = 6;
		gbc_lblProducto.gridy = 3;
		add(lblProducto, gbc_lblProducto);

		txtProducto = new JTextField();
		GridBagConstraints gbc_txtProducto = new GridBagConstraints();
		gbc_txtProducto.gridwidth = 2;
		gbc_txtProducto.insets = new Insets(0, 0, 5, 5);
		gbc_txtProducto.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtProducto.gridx = 7;
		gbc_txtProducto.gridy = 3;
		add(txtProducto, gbc_txtProducto);
		txtProducto.setColumns(10);

		btnCrearSubasta = new JButton("Crear Subasta");
		GridBagConstraints gbc_btnCrearSubasta = new GridBagConstraints();
		gbc_btnCrearSubasta.fill = GridBagConstraints.BOTH;
		gbc_btnCrearSubasta.gridwidth = 8;
		gbc_btnCrearSubasta.insets = new Insets(0, 0, 5, 5);
		gbc_btnCrearSubasta.gridx = 1;
		gbc_btnCrearSubasta.gridy = 4;
		add(btnCrearSubasta, gbc_btnCrearSubasta);

		txtProductoSubastado = new JTextField();
		txtProductoSubastado.setEditable(false);
		GridBagConstraints gbc_txtProductoSubastado = new GridBagConstraints();
		gbc_txtProductoSubastado.gridwidth = 8;
		gbc_txtProductoSubastado.insets = new Insets(0, 0, 5, 5);
		gbc_txtProductoSubastado.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtProductoSubastado.gridx = 1;
		gbc_txtProductoSubastado.gridy = 5;
		add(txtProductoSubastado, gbc_txtProductoSubastado);
		txtProductoSubastado.setColumns(10);

		JLabel lblPujador = new JLabel("Pujador:");
		GridBagConstraints gbc_lblPujador = new GridBagConstraints();
		gbc_lblPujador.insets = new Insets(0, 0, 5, 5);
		gbc_lblPujador.gridx = 1;
		gbc_lblPujador.gridy = 7;
		add(lblPujador, gbc_lblPujador);

		comboPujador = new JComboBox();
		GridBagConstraints gbc_comboPujador = new GridBagConstraints();
		gbc_comboPujador.gridwidth = 3;
		gbc_comboPujador.insets = new Insets(0, 0, 5, 5);
		gbc_comboPujador.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboPujador.gridx = 2;
		gbc_comboPujador.gridy = 7;
		add(comboPujador, gbc_comboPujador);

		JLabel lblApuesta = new JLabel("Apuesta:");
		GridBagConstraints gbc_lblApuesta = new GridBagConstraints();
		gbc_lblApuesta.anchor = GridBagConstraints.EAST;
		gbc_lblApuesta.insets = new Insets(0, 0, 5, 5);
		gbc_lblApuesta.gridx = 6;
		gbc_lblApuesta.gridy = 7;
		add(lblApuesta, gbc_lblApuesta);

		txtApuesta = new JTextField();
		GridBagConstraints gbc_txtApuesta = new GridBagConstraints();
		gbc_txtApuesta.gridwidth = 2;
		gbc_txtApuesta.insets = new Insets(0, 0, 5, 5);
		gbc_txtApuesta.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtApuesta.gridx = 7;
		gbc_txtApuesta.gridy = 7;
		add(txtApuesta, gbc_txtApuesta);
		txtApuesta.setColumns(10);

		btnPuja = new JButton("A\u00F1adir Puja");
		GridBagConstraints gbc_btnPuja = new GridBagConstraints();
		gbc_btnPuja.fill = GridBagConstraints.BOTH;
		gbc_btnPuja.gridwidth = 8;
		gbc_btnPuja.insets = new Insets(0, 0, 5, 5);
		gbc_btnPuja.gridx = 1;
		gbc_btnPuja.gridy = 8;
		add(btnPuja, gbc_btnPuja);

		txtListaPujas = new JTextPane();
		txtListaPujas.setEditable(false);
		GridBagConstraints gbc_txtListaPujas = new GridBagConstraints();
		gbc_txtListaPujas.gridwidth = 8;
		gbc_txtListaPujas.insets = new Insets(0, 0, 5, 5);
		gbc_txtListaPujas.fill = GridBagConstraints.BOTH;
		gbc_txtListaPujas.gridx = 1;
		gbc_txtListaPujas.gridy = 9;
		add(txtListaPujas, gbc_txtListaPujas);

		btnTerminar = new JButton("Terminar");
		GridBagConstraints gbc_btnTerminar = new GridBagConstraints();
		gbc_btnTerminar.gridwidth = 8;
		gbc_btnTerminar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnTerminar.insets = new Insets(0, 0, 5, 5);
		gbc_btnTerminar.gridx = 1;
		gbc_btnTerminar.gridy = 10;
		add(btnTerminar, gbc_btnTerminar);

		JLabel lblGanador = new JLabel("Ganador:");
		GridBagConstraints gbc_lblGanador = new GridBagConstraints();
		gbc_lblGanador.insets = new Insets(0, 0, 5, 5);
		gbc_lblGanador.gridx = 1;
		gbc_lblGanador.gridy = 11;
		add(lblGanador, gbc_lblGanador);

		txtGanador = new JTextField();
		txtGanador.setEditable(false);
		GridBagConstraints gbc_txtGanador = new GridBagConstraints();
		gbc_txtGanador.gridwidth = 7;
		gbc_txtGanador.insets = new Insets(0, 0, 5, 5);
		gbc_txtGanador.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtGanador.gridx = 2;
		gbc_txtGanador.gridy = 11;
		add(txtGanador, gbc_txtGanador);
		txtGanador.setColumns(10);

		lblMensajeError = new JLabel("Mensaje Error:");
		GridBagConstraints gbc_lblMensajeError = new GridBagConstraints();
		gbc_lblMensajeError.insets = new Insets(0, 0, 5, 5);
		gbc_lblMensajeError.gridx = 1;
		gbc_lblMensajeError.gridy = 12;
		add(lblMensajeError, gbc_lblMensajeError);

		txtErrorPuja = new JTextField();
		txtErrorPuja.setEditable(false);
		GridBagConstraints gbc_txtErrorPuja = new GridBagConstraints();
		gbc_txtErrorPuja.gridwidth = 7;
		gbc_txtErrorPuja.insets = new Insets(0, 0, 5, 5);
		gbc_txtErrorPuja.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtErrorPuja.gridx = 2;
		gbc_txtErrorPuja.gridy = 12;
		add(txtErrorPuja, gbc_txtErrorPuja);
		txtErrorPuja.setColumns(10);

	}

	public JComboBox getComboUsuarios() {
		return comboUsuarios;
	}

	public void setComboUsuarios(JComboBox comboUsuarios) {
		this.comboUsuarios = comboUsuarios;
	}

	public JComboBox getComboPujador() {
		return comboPujador;
	}

	public void setComboPujador(JComboBox comboPujador) {
		this.comboPujador = comboPujador;
	}

	public JTextField getTxtErrorPuja() {
		return txtErrorPuja;
	}

	public JTextField getTxtProducto() {
		return txtProducto;
	}

	public JTextField getTxtProductoSubastado() {
		return txtProductoSubastado;
	}

	public JTextField getTxtApuesta() {
		return txtApuesta;
	}

	public JTextField getTxtGanador() {
		return txtGanador;
	}

	public JButton getBtnTerminar() {
		return btnTerminar;
	}

	public JTextPane getTxtListaPujas() {
		return txtListaPujas;
	}

	public JButton getBtnPuja() {
		return btnPuja;
	}

	public JButton getBtnCrearSubasta() {
		return btnCrearSubasta;
	}

}
