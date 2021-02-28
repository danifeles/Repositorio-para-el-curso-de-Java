package Java;

import java.util.Scanner;

public class Asteriscos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner nombre= new Scanner(System.in);
		System.out.print("Escribe un nombre: ");
		String nombre1=nombre.nextLine();
		System.out.print("Escribe un caracter: ");
		String caracter=nombre.nextLine();
		int longitud=nombre1.length();
		int cont=0;
		
		while(cont<longitud) {
		System.out.print(caracter);
		cont++;
		}
		
	}

}
