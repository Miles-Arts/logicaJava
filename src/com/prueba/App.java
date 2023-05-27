package com.prueba;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
	
	//Set no acepta valores duplicados
	public void m8GetOnlyNotDuplicateList(List<Integer> list) {
		
		Set<Integer> set = new HashSet<>(list);
		set.forEach(System.out::println);
		
	}
	
	//Revisar si hay vocales en un texto
	/**
	 * @param text
	 */
	public void m9CheckIfVowelIfPresent(String text) {
		
		
		/*
		 * String[] array = text.split(""); Boolean isPresente = false;
		 * 
		 * for(String s : array) { if(s.equals("a") || s.equals("e") || s.equals("i") ||
		 * s.equals("o") || s.equals("u")) { isPresente = true; break; } }
		 * System.out.println("have Vowel = " + isPresente);
		 */
		
		/*
		 * Boolean result = text.matches(".*[aeiou].*"); System.out.println(result);
		 * 
		 * Arrays.asList(text.split("")).stream().map( s -> {
		 * 
		 * boolean rpta = false;
		 * 
		 * if(s.equals("a") || s.equals("e") || s.equals("i") || s.equals("o") ||
		 * s.equals("u")) { rpta = true; } return rpta; });
		 */
		
		 boolean  rpta = Arrays.asList(text.split("")).stream().anyMatch( s -> s.equals("a") || s.equals("e") || s.equals("i") || s.equals("o") ||
				  s.equals("u")) ;
		 System.out.println(rpta);
  }

	//
	public boolean m10Palindromo(String text) {
		
		boolean resultado  = true;
		int length = text.length();
		
		for(int i = 0; i < length/2; i++ ) {
			
			if(text.charAt(i) != text.charAt(length - i - 1)) {
			resultado = false;
			break;
		}
	} 
		return resultado;
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
		//app.m7RandomOrderString("Aprendo JAVA");
		//app.m8GetOnlyNotDuplicateList(Arrays.asList(1,1,13,4,1,87,7,7,7,99));
		//app.m9CheckIfVowelIfPresent("Hola gente");
		System.out.println(app.m10Palindromo("oto oto"));
		
	}

	//RECURSIÓN RE-UTILIZAR EL CODE
	
}
