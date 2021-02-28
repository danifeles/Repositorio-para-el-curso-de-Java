package Java;

import java.util.Scanner;

public class VocalesConMayusculas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner consola = new Scanner(System.in);
		String frase1 = consola.nextLine();
		String frase=frase1.toLowerCase();
		
		for(int i = 0; i < frase.length(); i++) {
			
			char letra = frase.charAt(i);
			
			if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || 
					letra == 'u') {
				
				continue;
			}else {
				
				System.out.print(frase.charAt(i));
			}
			
		}
		
	}

}
