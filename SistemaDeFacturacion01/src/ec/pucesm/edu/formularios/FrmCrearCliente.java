package ec.pucesm.edu.formularios;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class FrmCrearCliente extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JTextField txtCedula;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtCiudad;
	private JTextField txtTelefono;
	private JTextField txtEmail;

	
	public FrmCrearCliente() {
		setTitle("Crear Usuario");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cedula:");
		lblNewLabel.setFont(new Font("Uni Neue Bold", Font.PLAIN, 14));
		lblNewLabel.setBounds(27, 21, 75, 20);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		lblNewLabel_1.setFont(new Font("Uni Neue Bold", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(27, 52, 75, 20);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setFont(new Font("Uni Neue Bold", Font.PLAIN, 14));
		lblApellido.setBounds(27, 83, 75, 20);
		getContentPane().add(lblApellido);
		
		JLabel lblCiudad = new JLabel("Ciudad:");
		lblCiudad.setFont(new Font("Uni Neue Bold", Font.PLAIN, 14));
		lblCiudad.setBounds(27, 114, 75, 20);
		getContentPane().add(lblCiudad);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setFont(new Font("Uni Neue Bold", Font.PLAIN, 14));
		lblTelefono.setBounds(27, 145, 75, 20);
		getContentPane().add(lblTelefono);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Uni Neue Bold", Font.PLAIN, 14));
		lblEmail.setBounds(27, 176, 75, 20);
		getContentPane().add(lblEmail);
		
		txtCedula = new JTextField();
		txtCedula.setBounds(101, 22, 220, 20);
		getContentPane().add(txtCedula);
		txtCedula.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(101, 53, 220, 20);
		getContentPane().add(txtNombre);
		
		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		txtApellido.setBounds(101, 84, 220, 20);
		getContentPane().add(txtApellido);
		
		txtCiudad = new JTextField();
		txtCiudad.setColumns(10);
		txtCiudad.setBounds(101, 115, 220, 20);
		getContentPane().add(txtCiudad);
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(101, 146, 220, 20);
		getContentPane().add(txtTelefono);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(101, 177, 220, 20);
		getContentPane().add(txtEmail);
		
		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.setBounds(27, 218, 89, 23);
		getContentPane().add(btnNuevo);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(133, 218, 89, 23);
		getContentPane().add(btnGuardar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(232, 218, 89, 23);
		getContentPane().add(btnSalir);

	}
}
