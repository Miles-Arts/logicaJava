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
	
	
	private void m2IsCapicua(int number) {
		
		String numberText = String.valueOf(number);
		String reverseNumber = new StringBuilder(numberText).reverse().toString(); 
		
	}
	
	
	public static void main (String[] args) {
		
		App app = new App();
		app.m1InvertirString("Burofy Abogados Corp");
		//String vida = "hola";
		//System.out.print();
		app.m2IsCapicua(898);
		
	}

}
