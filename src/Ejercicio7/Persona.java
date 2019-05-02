package Ejercicio7;

public class Persona {
	String nombre;
	String apellidos;
	String email;
	String usuario;
	String contraseña;
	
	public Persona(String nombre, String email, String usuario, String contraseña) {
		super();
		this.nombre = nombre;
		this.email = email;
		this.usuario = usuario;
		this.contraseña = contraseña;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre  + ", email=" + email + ", usuario=" + usuario
				+ ", contraseña=" + contraseña + "]\n";
	}

}
