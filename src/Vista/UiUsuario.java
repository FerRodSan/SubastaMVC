package Vista;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class UiUsuario extends JPanel {
	protected JButton btnAnadir;
	protected JTextField txtNombre;
	protected JTextField txtCredito;
	protected JTextPane txtListaUsuario;
	private JLabel lblNewLabel_2;
	private JTextField txtErrorUsuario;

	/**
	 * Create the panel.
	 */
	public UiUsuario() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		JLabel lblNewLabel = new JLabel("A\u00F1adir participantes a la subasta");
		lblNewLabel.setFont(new Font("Impact", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel.gridwidth = 5;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 2;
		gbc_lblNewLabel.gridy = 1;
		add(lblNewLabel, gbc_lblNewLabel);

		JLabel lblNombre = new JLabel("Nombre:");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.gridwidth = 2;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 1;
		gbc_lblNombre.gridy = 3;
		add(lblNombre, gbc_lblNombre);

		txtNombre = new JTextField();
		GridBagConstraints gbc_txtNombre = new GridBagConstraints();
		gbc_txtNombre.gridwidth = 4;
		gbc_txtNombre.insets = new Insets(0, 0, 5, 5);
		gbc_txtNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombre.gridx = 3;
		gbc_txtNombre.gridy = 3;
		add(txtNombre, gbc_txtNombre);
		txtNombre.setColumns(10);

		JLabel lblCredito = new JLabel("Credito:");
		GridBagConstraints gbc_lblCredito = new GridBagConstraints();
		gbc_lblCredito.gridwidth = 2;
		gbc_lblCredito.insets = new Insets(0, 0, 5, 5);
		gbc_lblCredito.gridx = 1;
		gbc_lblCredito.gridy = 5;
		add(lblCredito, gbc_lblCredito);

		txtCredito = new JTextField();
		GridBagConstraints gbc_txtCredito = new GridBagConstraints();
		gbc_txtCredito.gridwidth = 4;
		gbc_txtCredito.insets = new Insets(0, 0, 5, 5);
		gbc_txtCredito.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCredito.gridx = 3;
		gbc_txtCredito.gridy = 5;
		add(txtCredito, gbc_txtCredito);
		txtCredito.setColumns(10);

		btnAnadir = new JButton("A\u00F1adir Usuario");
		btnAnadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		GridBagConstraints gbc_btnAnadir = new GridBagConstraints();
		gbc_btnAnadir.fill = GridBagConstraints.BOTH;
		gbc_btnAnadir.gridwidth = 4;
		gbc_btnAnadir.insets = new Insets(0, 0, 5, 5);
		gbc_btnAnadir.gridx = 3;
		gbc_btnAnadir.gridy = 6;
		add(btnAnadir, gbc_btnAnadir);

		JLabel lblNewLabel_1 = new JLabel("Lista Usuarios");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewLabel_1.gridwidth = 2;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 8;
		add(lblNewLabel_1, gbc_lblNewLabel_1);

		txtListaUsuario = new JTextPane();
		txtListaUsuario.setEditable(false);
		GridBagConstraints gbc_txtListaPujadores = new GridBagConstraints();
		gbc_txtListaPujadores.gridwidth = 4;
		gbc_txtListaPujadores.insets = new Insets(0, 0, 5, 5);
		gbc_txtListaPujadores.fill = GridBagConstraints.BOTH;
		gbc_txtListaPujadores.gridx = 3;
		gbc_txtListaPujadores.gridy = 8;
		add(txtListaUsuario, gbc_txtListaPujadores);
		
		lblNewLabel_2 = new JLabel("Mensaje Error");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.gridwidth = 2;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 1;
		gbc_lblNewLabel_2.gridy = 9;
		add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		txtErrorUsuario = new JTextField();
		txtErrorUsuario.setEditable(false);
		GridBagConstraints gbc_txtErrorUsuario = new GridBagConstraints();
		gbc_txtErrorUsuario.gridwidth = 4;
		gbc_txtErrorUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_txtErrorUsuario.fill = GridBagConstraints.BOTH;
		gbc_txtErrorUsuario.gridx = 3;
		gbc_txtErrorUsuario.gridy = 9;
		add(txtErrorUsuario, gbc_txtErrorUsuario);
		txtErrorUsuario.setColumns(10);

	}

	public JButton getbtnAnadir() {
		return btnAnadir;
	}

	public JTextField getTxtNombre() {
		return txtNombre;
	}

	public void setTxtNombre(JTextField txtNombre) {
		this.txtNombre = txtNombre;
	}

	public JTextField getTxtCredito() {
		return txtCredito;
	}

	public JTextField getTxtErrorUsuario() {
		return txtErrorUsuario;
	}

	public void setTxtCredito(JTextField txtCredito) {
		this.txtCredito = txtCredito;
	}

	public JTextPane getTxtListaUsuario() {
		return txtListaUsuario;
	}

	public void setTxtListaUsuario(JTextPane txtListaPujadores) {
		this.txtListaUsuario = txtListaPujadores;
	}

}
