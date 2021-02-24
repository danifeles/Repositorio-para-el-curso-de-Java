package bucles;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Escribe un número: ");
		Scanner numero = new Scanner(System.in);
        int num;
        num= numero.nextInt();
		do {
		    System.out.println(num);
		    num--;
		
		} while(num>=0);
	}
}
