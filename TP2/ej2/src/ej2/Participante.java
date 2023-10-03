package ej2;
public class Participante {
	private String nombre;
	private String apellido;
	private int telefono;private String mail;
	private boolean asistente;

	//METODO CONSTRUCTOR
	public Participante(String nombre, String apellido, int telefono, String mail, boolean asistente) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.mail = mail;
		this.asistente = asistente;
	}

	//METODOS GET AND SET
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public boolean isAsistente() {
		return asistente;
	}
	public void setAsistente(boolean asistente) {
		this.asistente = asistente;
	}

	
	
	
}
