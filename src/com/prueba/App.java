package com.prueba;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

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
			
			//counter[text.charAt(i)] = counter[text.charAt(i)] + 1;
			counter[text.charAt(i)] ++;
			
		} for(i = 0; i < 256; i++) {
			
			if (counter[i] != 0 ) {
				
				System.out.println((char)i +  ": " + counter[i]);
				
			}
		}	
	}
	
	
	//Mostrar los repetidos
	private void m4RepeatCharacter(String text) {
		
		//int, Inicializado con 256
		int i, length, counter[] = new int[256];
		
		length = text.length();
		
		for(i = 0; i < length; i++) {
			
			//counter[text.charAt(i)] = counter[text.charAt(i)] + 1;
			counter[text.charAt(i)] ++;
			
		} for(i = 0; i < 256; i++) {
			
			if (counter[i] > 1 ) {
				
				System.out.println((char)i +  ": " + counter[i]);
				
			}
		}	
	}
	
	//Saber sí un numero es multiplo de sí mismo
	public void m5MultipleDf2(int number) {
		
		if(number % 2 == 0) {
			System.out.println("Es multiplo: " + number);
		} else {
			System.out.println("Not is multiplo  " + number);
		}
		
	}
	
	
	//ver si es año BISIESTO
	public void m6IsLeapYeard(int year) {
		
		Boolean isLeapYear =  LocalDate.of(year, 1, 1).isLeapYear();
		
		System.out.println("Este año es bisiesto: " + isLeapYear);
		 
	}
	
	
	public void m7RandomOrderString(String text) {
	
		String[] array = text.split("");
		List<String> list = Arrays.asList(array);
		Collections.shuffle(list);
		list.forEach(System.out::print);
		
	}
	
	
	public static void main (String[] args) {
		
		App app = new App();
		//app.m1InvertirString("Burofy Abogados Corp");
		//String vida = "hola";
		//System.out.print();
		//app.m2IsCapicua(999919999);
		//app.m3CountCharacterTimes("OXIMORON");
		//app.m4RepeatCharacter("OXIMORON");
		//app.m5MultipleDf2(11);
		//app.m6IsLeapYeard(2018);
		app.m7RandomOrderString("Aprendo JAVA");
	}

	//RECURSIÓN RE-UTILIZAR EL CODE
	
}
