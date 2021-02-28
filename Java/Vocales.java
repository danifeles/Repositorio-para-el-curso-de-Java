package Java;

import java.util.Scanner;

public class Vocales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner consola = new Scanner(System.in);
		String frase = consola.nextLine();
		
		
		for(int i = 0; i < frase.length(); i++) {
			
			
			if(frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i' || frase.charAt(i) == 'o' || 
					frase.charAt(i) == 'u') {
				
				continue;
			}else {
				
				System.out.print(frase.charAt(i));
			}
			
		}
	
	}
	
}
