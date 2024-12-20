package ec.edu.pucesm.clases;

public class Cliente {

	private String cedula;
	private String nombre;
	private String apellido;
	private String email;
	private String telefono;
	private String direccion;
	
	public Cliente(String cedula, String nombre, String apellido, String direccion, String telefono, String email) {
	    this.cedula = cedula;
	    this.nombre = nombre;
	    this.apellido = apellido;
	    this.direccion = direccion;
	    this.telefono = telefono;
	    this.email = email;
	}


	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

}
