package com.prueba;

public class App1 {

	
	
		private void m1InvertirString(String text) {
		
			String[] array =  text.split("");
			StringBuilder newText = new StringBuilder();
		
			for (int i = array.length; i > 0; i --) {
				
				newText.append(array[i - 1]);
				
			}
			
			System.out.println(newText);
			
		}
	
	
		public static void main (String[] args) {
		
			App1 app1 = new App1();
		
		
			app1.m1InvertirString("AprendoJavaFacilConDedicacion");
			//String vida = "hola";
			//System.out.print();
			//app1.m2IsCapicua(999919999);
			//app1.m3CountCharacterTimes("OXIMORON");
			//app1.m4RepeatCharacter("OXIMORON");
			//app1.m5MultipleDf2(11);
			//app1.m6IsLeapYeard(2018);
			//app1.m7RandomOrderString("Aprendo JAVA");
			//app1.m8GetOnlyNotDuplicateList(Arrays.asList(1,1,13,4,1,87,7,7,7,99));
			//app1.m9CheckIfVowelIfPresent("Hola gente");
			//System.out.println(app1.m10Palindromo("oto oto"));
		
		}
}
