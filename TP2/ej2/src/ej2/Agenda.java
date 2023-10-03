package ej2;

public class Agenda {
	private String duenio;
	private Reunion[] reuniones;
	
	
	//METODO CONSTRUCTOR
	public Agenda(String duenio) {
		this.duenio = duenio;
		this.reuniones = new Reunion[0];
	}
	
	//METODOS GET AND SET
	public String getDuenio() {
		return duenio;
	}

	public void setDuenio(String duenio) {
		this.duenio = duenio;
	}

	public Reunion[] getReuniones() {
		return reuniones;
	}


	//METODO PARA AGREGAR UNA REUNION
	public void addReunion(Reunion newReunion) {
		int posicion = -1;
		for(int i = 0; i < this.reuniones.length; i++) {
			if (this.reuniones[i] == null) {
				posicion = i;
			}
		}
		if (posicion != -1) {
			reuniones[posicion] = newReunion;
		}
	}
}
