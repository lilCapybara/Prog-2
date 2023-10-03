package ej2;
public class Main {


public static void main(String[] args) {
	// TODO Auto-generated method stub

	//CREANDO UNA AGENDA
	Agenda A1 = new Agenda("tato");

	//CREANDO UNA REUNION
	Reunion R1 = new Reunion("sheraton", "economia", 35);

	//CREANDO PARTICIPANTES
	Participante N1 = new Participante("mateo", "mauro", 22353453, "sdf@ds.com", false);
	Participante N2 = new Participante("luciano", "mauro", 64563453, "aaf@ds.com", true);


	//AGREGANDO LA REUNION A LA AGENDA
	A1.addReunion(R1);

	//AGREGANDO LOS PARTICIPANTES A LA REUNION
	R1.addParticipantes(N1);
	R1.addParticipantes(N2);

	System.out.println();
	System.out.println(N2.getTelefono());
}

}
