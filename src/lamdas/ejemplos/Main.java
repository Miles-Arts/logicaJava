package lamdas.ejemplos;

public class Main {
	
	public static void imprimir(Comando cmd) {
		
		System.out.println(cmd.nombre() + ": " + cmd.descripcion());
	}
	
	public static void main(String[] args) {
		
		Comando ayuda = new AyudaComando();
		
		imprimir(ayuda);
		
		//ayuda.
		
	}

}
