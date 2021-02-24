package arrays;

import java.util.Scanner;

public class ClaseArray1 {

    @SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
    System.out.println("Escribe tres nombres: ");
	Scanner nombre = new Scanner(System.in);
    
    int[] array1= new int[10];
	String[] frases= new String[5];
	int[] array2= {10,20,30};
	
	String n1=nombre.nextLine();
	String n2=nombre.nextLine();
	String n3=nombre.nextLine();
	
	frases[0] = n1;
	frases[1] = n2;
	frases[2] = n3;
	
    System.out.println(frases[0]+" "+frases[1]+" "+frases[2]);

	}

}

/* String[] frases = new String[5];


Scanner entrada = new Scanner(System.in);

//Pedir las tres frases por teclado
for (int posicion = 0; posicion <= 2; posicion++) {
	frases[posicion] = entrada.nextLine();
}

//Imprimirlas
for (int posicion = 0; posicion <= 2; posicion++) {
	System.out.println(frases[posicion]);
}

entrada.close();
*/
