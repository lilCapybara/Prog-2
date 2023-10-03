package ej2;

public class Reunion {
	private String lugar;
	private String tema;
	private double duracion;
	private Participante[] participantes;
	
	//METODO CONSTRUCTOR
	public Reunion(String lugar, String tema, double duracion) {
		this.lugar = lugar;
		this.tema = tema;
		this.duracion = duracion;
		this.participantes = new Participante[0];
	}
	//METODOS GET AND SET
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public String getTema() {
		return tema;
	}
	public void setTema(String tema) {
		this.tema = tema;
	}
	public double getDuracion() {
		return duracion;
	}
	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}
	public Participante[] getParticipantes() {
		return participantes;
	}
	
	
	//METODO PARA AGREGAR PARTICIPANTES
	public void addParticipantes(Participante newParticipante) {
		int posicion = -1;
		for(int i = 0; i < this.participantes.length; i++) {
			if(this.participantes[i] == null) {
				posicion = i;
			}
		}
		if (posicion != -1) {
			this.participantes[posicion] = newParticipante;
		}
	}
}
