package lamdas.ejemplos;

public class AyudaComando implements Comando{

	@Override
	public String nombre() {
		
		return "ayuda";
	}

	@Override
	public String descripcion() {

		return "Parámetros y forma de usar";
	}

}
