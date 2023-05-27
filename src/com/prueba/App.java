package com.prueba;

public class App {
	
	//invertir una cadena
	private void  m1InvertirString(String text) {
		 
		String[] array = text.split("");
		StringBuilder newText = new StringBuilder();
		
		
		for(int i = array.length; i > 0; i--) {
		
			newText.append(array[i - 1]);
			
	} System.out.println(newText);
	
	}
	
	public static void main (String[] args) {
		
		App app = new App();
		app.m1InvertirString("Burofy Abogados Corp");
		//String vida = "hola";
		//System.out.print();
		
		
	}

}
