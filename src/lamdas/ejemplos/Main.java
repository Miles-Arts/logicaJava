package lamdas.ejemplos;

import java.util.Random;

public class Main {
	
	public static void imprimir(Comando cmd) {
		
		System.out.println(cmd.nombre() + ": " + cmd.descripcion());
	}
	
	public static void main(String[] args) {
		
		Comando ayuda = new AyudaComando();
		
								//Clase anónima
		Comando opciones = new Comando() {

			@Override
			public String nombre() {
				
				return "opciones";
			}

			@Override
			public String descripcion() {
			
				return "Opciones programa";
			}
		};
		
		
		AbstractComando login =  new AbstractComando() {

			@Override
			public String nombre() {
				
				return "Juan";
			}

			@Override
			public String descripcion() {
				
				return "Ingeniero";
			}

			@Override
			public boolean deprecado() {
				
				return true;
			}
			
		};
		
		Random rand = new Random() {
			
			@Override
			public double nextDouble() {
				// TODO Auto-generated method stub
				return super.nextDouble();
			}
		};
		
		imprimir(ayuda);
		imprimir(opciones);
		
	}
}
