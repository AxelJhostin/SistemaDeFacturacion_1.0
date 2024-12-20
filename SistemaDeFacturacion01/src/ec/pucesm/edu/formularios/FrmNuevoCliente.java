package ec.pucesm.edu.formularios;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import ec.edu.pucesm.clases.Cliente;

public class FrmNuevoCliente extends JDialog {

    private static final long serialVersionUID = 1L;
    private final JPanel contentPanel = new JPanel();
    private JTextField txtCedula;
    private JTextField txtNombre;
    private JTextField txtApellido;
    private JTextField txtDireccion;
    private JTextField txtTelefono;
    private JTextField txtEmail;
    private FrmListaClientes listaClientes;
    private Cliente cliente;

    /**
     * @wbp.parser.constructor
     */
    public FrmNuevoCliente(FrmListaClientes listaClientes) {
        this(listaClientes, null);
    }


    public FrmNuevoCliente(FrmListaClientes listaClientes, Cliente cliente) {
        this.listaClientes = listaClientes;
        this.cliente = cliente;
        
        setTitle(cliente == null ? "Agregar Cliente" : "Editar Cliente");
        setBounds(100, 100, 269, 300);
        getContentPane().setLayout(new BorderLayout());
        contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        getContentPane().add(contentPanel, BorderLayout.CENTER);
        contentPanel.setLayout(null);
        

        JLabel lblCedula = new JLabel("Cedula");
        lblCedula.setBounds(20, 22, 46, 14);
        contentPanel.add(lblCedula);

        txtCedula = new JTextField();
        txtCedula.setBounds(76, 22, 136, 20);
        contentPanel.add(txtCedula);
        
        JLabel lblNombre = new JLabel("Nombre");
        lblNombre.setBounds(20, 47, 46, 14);
        contentPanel.add(lblNombre);
        
        txtNombre = new JTextField();
        txtNombre.setBounds(76, 47, 136, 20);
        contentPanel.add(txtNombre);

        JLabel lblApellido = new JLabel("Apellido");
        lblApellido.setBounds(20, 72, 46, 14);
        contentPanel.add(lblApellido);

        txtApellido = new JTextField();
        txtApellido.setBounds(76, 72, 136, 20);
        contentPanel.add(txtApellido);

        JLabel lblDireccion = new JLabel("Direccion");
        lblDireccion.setBounds(20, 97, 46, 14);
        contentPanel.add(lblDireccion);

        txtDireccion = new JTextField();
        txtDireccion.setBounds(76, 97, 136, 20);
        contentPanel.add(txtDireccion);

        JLabel lblTelefono = new JLabel("Telefono");
        lblTelefono.setBounds(20, 122, 46, 14);
        contentPanel.add(lblTelefono);

        txtTelefono = new JTextField();
        txtTelefono.setBounds(76, 122, 136, 20);
        contentPanel.add(txtTelefono);

        JLabel lblEmail = new JLabel("Email");
        lblEmail.setBounds(20, 147, 46, 14);
        contentPanel.add(lblEmail);

        txtEmail = new JTextField();
        txtEmail.setBounds(76, 147, 136, 20);
        contentPanel.add(txtEmail);

        if (cliente != null) {
            txtCedula.setText(cliente.getCedula());
            txtNombre.setText(cliente.getNombre());
            txtApellido.setText(cliente.getApellido());
            txtDireccion.setText(cliente.getDireccion());
            txtTelefono.setText(cliente.getTelefono());
            txtEmail.setText(cliente.getEmail());
        }

        JPanel buttonPane = new JPanel();
        buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
        getContentPane().add(buttonPane, BorderLayout.SOUTH);
        
        JButton btnGuardar = new JButton("Guardar");
        btnGuardar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Cliente nuevoCliente = new Cliente(
                        txtCedula.getText(),
                        txtNombre.getText(),
                        txtApellido.getText(),
                        txtDireccion.getText(),
                        txtTelefono.getText(),
                        txtEmail.getText()
                );
                
                if (cliente != null) {
                    listaClientes.actualizarDatosEnTabla(nuevoCliente);
                } else {
                    listaClientes.cargarDatosEnTabla(nuevoCliente);
                }
                listaClientes.resetVentanaNuevoCliente(); 
                dispose();
            }
        });
        buttonPane.add(btnGuardar);
        
        JButton btnCancelar = new JButton("Cancelar");
        btnCancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listaClientes.resetVentanaNuevoCliente(); 
                dispose();
            }
        });
        buttonPane.add(btnCancelar);

        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                listaClientes.resetVentanaNuevoCliente();
            }
        });
    }
}

