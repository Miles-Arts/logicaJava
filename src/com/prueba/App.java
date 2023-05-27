package com.prueba;

public class App {
	
	//invertir una cadena
	private void  m1InvertirString(String text) {
		 
		/*String[] array = text.split("");
		StringBuilder newText = new StringBuilder();
		
		
		for(int i = array.length; i > 0; i--) {
		
			newText.append(array[i - 1]);
			
	} System.out.println(newText);*/
		
		//Desde Java 6  método reverse
		String newText = new StringBuilder(text).reverse().toString();	
	
		 System.out.println(newText);
		
	}
	
	//numero que es igual de izquierda a derecha
	private void m2IsCapicua(int number) {
		
		String numberText = String.valueOf(number);
		String reverseNumber = new StringBuilder(numberText).reverse().toString(); 
		
		if (numberText.equals(reverseNumber)) {
			
			System.out.println("Is capicua " + reverseNumber);	
		} else {
			System.out.println("Not capicua " + reverseNumber);	
		}
	}
	
	//Contar la cantidad de caracteres que tengamos como coincidencias
	// palabra  "OXIMORON"
	//O = 3; x = 1; I = 1; M = 1; R = 1; N = 1 
	private void m3CountCharacterTimes(String text) {
		
		//int, Inicializado con 256
		int i, length, counter[] = new int[256];
		
		length = text.length();
		
		for(i = 0; i < length; i++) {
			
			counter[text.charAt(i)] = counter[text.charAt(i)] + 1;
		}
		
	}
	
	
	public static void main (String[] args) {
		
		App app = new App();
		app.m1InvertirString("Burofy Abogados Corp");
		//String vida = "hola";
		//System.out.print();
		app.m2IsCapicua(999919999);
		app.m3CountCharacterTimes("OXIMORON");
		
	}

}
