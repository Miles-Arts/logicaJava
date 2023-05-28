package com.prueba;

public class m1InvertirString {

	private void InvertirString(String text) {
		
//		String[] array =  text.split("");
//		StringBuilder newText = new StringBuilder();
//	
//		for (int i = array.length; i > 0; i --) {
//			
//			newText.append(array[i - 1]);
//			
//		}
//		
//		System.out.println(newText);
		
		String newtext = new StringBuilder(text).reverse().toString();
		System.out.println(newtext);
		
	}
	
		public static void main (String[] args) {
			
			m1InvertirString m1InvertirString = new m1InvertirString();
		
		
			m1InvertirString.InvertirString("AprendoJavaFacilConDedicacion");
		
		}
}
