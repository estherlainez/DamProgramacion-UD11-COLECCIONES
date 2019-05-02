package Ejercicio7;

public class Persona {
	String nombre;
	String apellidos;
	String email;
	String usuario;
	String contrase�a;
	
	public Persona(String nombre, String email, String usuario, String contrase�a) {
		super();
		this.nombre = nombre;
		this.email = email;
		this.usuario = usuario;
		this.contrase�a = contrase�a;
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
	public String getContrase�a() {
		return contrase�a;
	}
	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre  + ", email=" + email + ", usuario=" + usuario
				+ ", contrase�a=" + contrase�a + "]\n";
	}

}
